package com.moonrez.hybrid_flowers.logic;

import com.google.gson.stream.JsonReader;
import com.moonrez.hybrid_flowers.HybridFlowers;
import com.moonrez.hybrid_flowers.misc.CommonConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import com.google.gson.*;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Vector;

@Mod.EventBusSubscriber(modid = HybridFlowers.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EventHandler
{
	// there is no "onBeePollinate" event, so I have to do this instead :(
	// checking every tick to see if it's finished pollinating
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingUpdateEvent event)
	{
		
		// first, make sure we've got a bee
		if (!event.getEntity().getLevel().isClientSide() // ignore if we're on the client side
				&& event.getEntity() instanceof Bee)
		{
			Bee bee = (Bee) event.getEntity();
			
			if (bee.hasNectar()) // no nectar = no pollination yet
			{
				Item spawnedItem = null;
				
				// getting the NBT data for this bee so we can check pollination status
				CompoundTag nbt = bee.serializeNBT();
				
				// checking if bee has honey and hasn't pollinated anything
				// that should be when it finishes pollinating
				if (nbt.getInt("CropsGrownSincePollination") < 1)
				{
					// incrementing the value so this only triggers once
					nbt.putInt("CropsGrownSincePollination", 1);
					bee.deserializeNBT(nbt);
					
					BlockPos pos = bee.getSavedFlowerPos(); // gets position of last flower pollinated
					if (pos != null) // should never be null, but may as well be safe
					{
						BlockState blockAt = bee.getLevel().getBlockState(pos);
						
						// spelled improperly for ease of programming
						String[] validTags = {"alliums", "bluets", "cornflowers", "dandelions", "daisys",
								"lilys", "orchids", "poppys", "tulips" };
						boolean tagFound = false; // loop escape
						for(int i = 0; i < validTags.length && !tagFound; i++)
						{
							TagKey<Block> tag = BlockTags.create(new ResourceLocation("hybrid_flowers", validTags[i]));
							
							if (blockAt.is(tag)) // we have ourselves a valid flower
							{
								// spawn seeds
								onFlowerFound(validTags[i], bee, pos, tag);
								tagFound = true;
							}
						}
					} // end if flower
				} // end if pollinate this tick
			} // end if bee has nectar
		} // end if bee
	}
	
	private static void onFlowerFound(String flowerCategory, Bee bee, BlockPos pos, TagKey<Block> tag)
	{
		Level level = bee.getLevel();
		// list of possible partners for the pollinated flower, including itself
		Vector<BlockState> parents = new Vector<BlockState>();
		TagKey<Block> cropTag = BlockTags.create(new ResourceLocation("minecraft", "crops"));
		
		final int blockRadius = CommonConfig.FLOWER_BREED_RADIUS.get();
		// search nearby blocks for more flowers of the same tag
		for (int x = -blockRadius; x < blockRadius; x++)
		{
			for (int y = blockRadius; y > -blockRadius; y--)
			{
				for (int z = -blockRadius; z < blockRadius; z++)
				{
					BlockPos destPos = new BlockPos(pos.getX() + x, pos.getY() + y, pos.getZ() + z);
					BlockState foundBlock = level.getBlockState(destPos);
					if (foundBlock.is(tag))
					{
						// if it's a crop, make sure it's in its final stage of growth (flowering)
						if (foundBlock.is(cropTag))
						{
							if (((CropBlock) foundBlock.getBlock()).isMaxAge(foundBlock))
							{
								parents.add(foundBlock);
							}
						} else // normal flower
						{
							// add block to list of possible parents (can be self)
							parents.add(foundBlock);
						}
					}
				}
			}
		} // end block search
		
		
		if (parents.size() > 0)
		{
			// load appropriate json file
			String filename = new String("hybrid_flowers_data/" + flowerCategory + ".json");
			InputStream is = EventHandler.class.getClassLoader().getResourceAsStream(filename);
			if (is != null)
			{
				// gson is so much worse than javax.json but I don't want to mess with gradle
				// gson is already a dependency of Minecraft and javax.json isn't
				// like, there are better ways to serialize a java class than json
				// and who wants to make an entire class just to read a json?
				InputStreamReader inputStreamReader = new InputStreamReader(is);
				JsonReader reader = new JsonReader(inputStreamReader);
				JsonElement json = JsonParser.parseReader(reader);
				
				
				BlockState parent1 = bee.getLevel().getBlockState(pos); // the pollinated flower
				
				// spawn first seed
				spawnSeed(bee,parents,parent1,json);
				// spawn second seed if >= x nearby flowers
				if(parents.size() >= CommonConfig.DOUBLE_SEED_THRESHOLD.get())
				{
					spawnSeed(bee,parents,parent1,json);
				}
				// spawn third seed if >= x nearby flowers
				if(parents.size() >=  CommonConfig.TRIPLE_SEED_THRESHOLD.get())
				{
					spawnSeed(bee,parents,parent1,json);
				}
				
			}
		} // end if parent
	}
	
	private static void spawnSeed(Bee bee, Vector<BlockState> parents, BlockState parent1, JsonElement json)
	{
		// choose a random partner from list
		Random rand = new Random();
		BlockState parent2 = parents.get(rand.nextInt(parents.size()));
		
		
		JsonArray pairs = json.getAsJsonObject().getAsJsonArray("hybrid_pairs");
		boolean pairFound = false;
		for (int i = 0; !pairFound && i < pairs.size(); i++)
		{
			// the pairs are stored as block tags in the hybrid_flowers namespace
			JsonObject currentPair = pairs.get(i).getAsJsonObject();
			TagKey<Block> tagParent1 = BlockTags.create(new ResourceLocation("hybrid_flowers",
					currentPair.get("parent1").getAsString()));
			TagKey<Block> tagParent2 = BlockTags.create(new ResourceLocation("hybrid_flowers",
					currentPair.get("parent2").getAsString()));
			
			if ((parent1.is(tagParent1) && parent2.is(tagParent2))
					|| (parent1.is(tagParent2) && parent2.is(tagParent1)))
			{
				pairFound = true;
				
				JsonArray children = currentPair.get("children").getAsJsonArray();
				
				// the drops are weighted, so do some boring math to find out which drop is chosen
				int numDrops = children.size();
				int weightTotal = 0;
				// sum up all the weights
				for (int j = 0; j < numDrops; j++)
				{
					weightTotal += children.get(j).getAsJsonObject().get("weight").getAsInt();
				}
				// pick a random one
				int chosenWeight = rand.nextInt(weightTotal) + 1;
				// count up until the weight is reached
				weightTotal = 0;
				boolean found = false;
				for (int j = 0; !found && j < numDrops; j++)
				{
					JsonObject childPair = children.get(j).getAsJsonObject();
					weightTotal += childPair.get("weight").getAsInt();
					if (weightTotal >= chosenWeight)
					{
						// weight found!
						found = true;
						
						String chosenSeed = childPair.get("name").getAsString();
						
						// ResourceLocation is the internal ID of the item
						// ForgeRegistries.ITEMS.getValue returns the item with the specified ID
						Item spawnedItem = ForgeRegistries.ITEMS.getValue(new ResourceLocation(chosenSeed));
						// could be null if the item's not found
						if (spawnedItem != null)
						{
							bee.spawnAtLocation(spawnedItem);
						}
					}
				}
			} // end if tag found
		} // end for pairs in json
	}
}
