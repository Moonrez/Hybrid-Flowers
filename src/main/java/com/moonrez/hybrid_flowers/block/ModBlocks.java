package com.moonrez.hybrid_flowers.block;

import com.moonrez.hybrid_flowers.HybridFlowers;
import com.moonrez.hybrid_flowers.misc.ModCreativeModeTab;
import com.moonrez.hybrid_flowers.item.ModItems;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks
{
	public static final DeferredRegister<Block> BLOCKS =
			DeferredRegister.create(ForgeRegistries.BLOCKS, HybridFlowers.MOD_ID);
	
	// vanilla blocks
	public static final RegistryObject<Block> GROWING_HYBRID_ALLIUM_PURPLE = registerBlockWithoutBlockItem("growing_hybrid_allium_purple",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_allium_purple" ));
	public static final RegistryObject<Block> GROWING_HYBRID_BLUET_WHITE = registerBlockWithoutBlockItem("growing_hybrid_bluet_white",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_bluet_white" ));
	public static final RegistryObject<Block> GROWING_HYBRID_CORNFLOWER_BLUE = registerBlockWithoutBlockItem("growing_hybrid_cornflower_blue",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_cornflower_blue" ));
	public static final RegistryObject<Block> GROWING_HYBRID_DAISY_WHITE = registerBlockWithoutBlockItem("growing_hybrid_daisy_white",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_daisy_white" ));
	public static final RegistryObject<Block> GROWING_HYBRID_DANDELION_YELLOW = registerBlockWithoutBlockItem("growing_hybrid_dandelion_yellow",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_dandelion_yellow" ));
	public static final RegistryObject<Block> GROWING_HYBRID_LILY_WHITE = registerBlockWithoutBlockItem("growing_hybrid_lily_white",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_lily_white" ));
	public static final RegistryObject<Block> GROWING_HYBRID_ORCHID_BLUE = registerBlockWithoutBlockItem("growing_hybrid_orchid_blue",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_orchid_blue" ));
	public static final RegistryObject<Block> GROWING_HYBRID_POPPY_RED = registerBlockWithoutBlockItem("growing_hybrid_poppy_red",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_poppy_red" ));
	
	public static final RegistryObject<Block> GROWING_HYBRID_TULIP_RED = registerBlockWithoutBlockItem("growing_hybrid_tulip_red",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_tulip_red" ));
	public static final RegistryObject<Block> GROWING_HYBRID_TULIP_ORANGE = registerBlockWithoutBlockItem("growing_hybrid_tulip_orange",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_tulip_orange" ));
	public static final RegistryObject<Block> GROWING_HYBRID_TULIP_PINK = registerBlockWithoutBlockItem("growing_hybrid_tulip_pink",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_tulip_pink" ));
	public static final RegistryObject<Block> GROWING_HYBRID_TULIP_WHITE = registerBlockWithoutBlockItem("growing_hybrid_tulip_white",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_tulip_white" ));
	
	
	// alliums
	public static final RegistryObject<Block> HYBRID_ALLIUM_BLUE = registerBlock("hybrid_allium_blue",
			()-> new FlowerBlock(MobEffects.FIRE_RESISTANCE, 4, BlockBehaviour.Properties.copy(Blocks.ALLIUM)));
	public static final RegistryObject<Block> POTTED_HYBRID_ALLIUM_BLUE = registerBlockWithoutBlockItem("potted_hybrid_allium_blue",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_ALLIUM_BLUE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM)));
	public static final RegistryObject<Block> GROWING_HYBRID_ALLIUM_BLUE = registerBlockWithoutBlockItem("growing_hybrid_allium_blue",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_allium_blue" ));
	
	public static final RegistryObject<Block> HYBRID_ALLIUM_PINK = registerBlock("hybrid_allium_pink",
			()-> new FlowerBlock(MobEffects.FIRE_RESISTANCE, 4,BlockBehaviour.Properties.copy(Blocks.ALLIUM)));
	public static final RegistryObject<Block> POTTED_HYBRID_ALLIUM_PINK = registerBlockWithoutBlockItem("potted_hybrid_allium_pink",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_ALLIUM_PINK, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM)));
	public static final RegistryObject<Block> GROWING_HYBRID_ALLIUM_PINK = registerBlockWithoutBlockItem("growing_hybrid_allium_pink",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_allium_pink" ));
	
	public static final RegistryObject<Block> HYBRID_ALLIUM_WHITE = registerBlock("hybrid_allium_white",
			()-> new FlowerBlock(MobEffects.FIRE_RESISTANCE, 4,BlockBehaviour.Properties.copy(Blocks.ALLIUM)));
	public static final RegistryObject<Block> POTTED_HYBRID_ALLIUM_WHITE = registerBlockWithoutBlockItem("potted_hybrid_allium_white",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_ALLIUM_WHITE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM)));
	public static final RegistryObject<Block> GROWING_HYBRID_ALLIUM_WHITE = registerBlockWithoutBlockItem("growing_hybrid_allium_white",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_allium_white" ));
	
	public static final RegistryObject<Block> HYBRID_ALLIUM_YELLOW = registerBlock("hybrid_allium_yellow",
			()-> new FlowerBlock(MobEffects.FIRE_RESISTANCE, 4, BlockBehaviour.Properties.copy(Blocks.ALLIUM)));
	public static final RegistryObject<Block> POTTED_HYBRID_ALLIUM_YELLOW = registerBlockWithoutBlockItem("potted_hybrid_allium_yellow",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_ALLIUM_YELLOW, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM)));
	public static final RegistryObject<Block> GROWING_HYBRID_ALLIUM_YELLOW = registerBlockWithoutBlockItem("growing_hybrid_allium_yellow",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_allium_yellow" ));
	
	// bluets
	public static final RegistryObject<Block> HYBRID_BLUET_BLUE = registerBlock("hybrid_bluet_blue",
			()-> new FlowerBlock(MobEffects.BLINDNESS, 8, BlockBehaviour.Properties.copy(Blocks.AZURE_BLUET)));
	public static final RegistryObject<Block> POTTED_HYBRID_BLUET_BLUE = registerBlockWithoutBlockItem("potted_hybrid_bluet_blue",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_BLUET_BLUE, BlockBehaviour.Properties.copy(Blocks.AZURE_BLUET)));
	public static final RegistryObject<Block> GROWING_HYBRID_BLUET_BLUE = registerBlockWithoutBlockItem("growing_hybrid_bluet_blue",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_bluet_blue" ));
	
	public static final RegistryObject<Block> HYBRID_BLUET_PURPLE = registerBlock("hybrid_bluet_purple",
			()-> new FlowerBlock(MobEffects.BLINDNESS, 8, BlockBehaviour.Properties.copy(Blocks.AZURE_BLUET)));
	public static final RegistryObject<Block> POTTED_HYBRID_BLUET_PURPLE = registerBlockWithoutBlockItem("potted_hybrid_bluet_purple",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_BLUET_PURPLE, BlockBehaviour.Properties.copy(Blocks.AZURE_BLUET)));
	public static final RegistryObject<Block> GROWING_HYBRID_BLUET_PURPLE = registerBlockWithoutBlockItem("growing_hybrid_bluet_purple",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_bluet_purple" ));
	
	public static final RegistryObject<Block> HYBRID_BLUET_PINK = registerBlock("hybrid_bluet_pink",
			()-> new FlowerBlock(MobEffects.BLINDNESS, 8, BlockBehaviour.Properties.copy(Blocks.AZURE_BLUET)));
	public static final RegistryObject<Block> POTTED_HYBRID_BLUET_PINK = registerBlockWithoutBlockItem("potted_hybrid_bluet_pink",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_BLUET_PINK, BlockBehaviour.Properties.copy(Blocks.AZURE_BLUET)));
	public static final RegistryObject<Block> GROWING_HYBRID_BLUET_PINK = registerBlockWithoutBlockItem("growing_hybrid_bluet_pink",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_bluet_pink" ));
	
	// cornflowers
	public static final RegistryObject<Block> HYBRID_CORNFLOWER_RED = registerBlock("hybrid_cornflower_red",
			()-> new FlowerBlock(MobEffects.JUMP, 6,  BlockBehaviour.Properties.copy(Blocks.CORNFLOWER)));
	public static final RegistryObject<Block> POTTED_HYBRID_CORNFLOWER_RED = registerBlockWithoutBlockItem("potted_hybrid_cornflower_red",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_CORNFLOWER_RED, BlockBehaviour.Properties.copy(Blocks.POTTED_CORNFLOWER)));
	public static final RegistryObject<Block> GROWING_HYBRID_CORNFLOWER_RED = registerBlockWithoutBlockItem("growing_hybrid_cornflower_red",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_cornflower_red" ));
	
	public static final RegistryObject<Block> HYBRID_CORNFLOWER_MAGENTA = registerBlock("hybrid_cornflower_magenta",
			()-> new FlowerBlock(MobEffects.JUMP, 6,  BlockBehaviour.Properties.copy(Blocks.CORNFLOWER)));
	public static final RegistryObject<Block> POTTED_HYBRID_CORNFLOWER_MAGENTA = registerBlockWithoutBlockItem("potted_hybrid_cornflower_magenta",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_CORNFLOWER_MAGENTA, BlockBehaviour.Properties.copy(Blocks.POTTED_CORNFLOWER)));
	public static final RegistryObject<Block> GROWING_HYBRID_CORNFLOWER_MAGENTA = registerBlockWithoutBlockItem("growing_hybrid_cornflower_magenta",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_cornflower_magenta" ));
	
	public static final RegistryObject<Block> HYBRID_CORNFLOWER_PINK = registerBlock("hybrid_cornflower_pink",
			()-> new FlowerBlock(MobEffects.JUMP, 6,  BlockBehaviour.Properties.copy(Blocks.CORNFLOWER)));
	public static final RegistryObject<Block> POTTED_HYBRID_CORNFLOWER_PINK = registerBlockWithoutBlockItem("potted_hybrid_cornflower_pink",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_CORNFLOWER_PINK, BlockBehaviour.Properties.copy(Blocks.POTTED_CORNFLOWER)));
	public static final RegistryObject<Block> GROWING_HYBRID_CORNFLOWER_PINK = registerBlockWithoutBlockItem("growing_hybrid_cornflower_pink",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_cornflower_pink" ));
	
	public static final RegistryObject<Block> HYBRID_CORNFLOWER_WHITE = registerBlock("hybrid_cornflower_white",
			()-> new FlowerBlock(MobEffects.JUMP, 6,  BlockBehaviour.Properties.copy(Blocks.CORNFLOWER)));
	public static final RegistryObject<Block> POTTED_HYBRID_CORNFLOWER_WHITE = registerBlockWithoutBlockItem("potted_hybrid_cornflower_white",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_CORNFLOWER_WHITE, BlockBehaviour.Properties.copy(Blocks.POTTED_CORNFLOWER)));
	public static final RegistryObject<Block> GROWING_HYBRID_CORNFLOWER_WHITE = registerBlockWithoutBlockItem("growing_hybrid_cornflower_white",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_cornflower_white" ));
	
	public static final RegistryObject<Block> HYBRID_CORNFLOWER_PURPLE = registerBlock("hybrid_cornflower_purple",
			()-> new FlowerBlock(MobEffects.JUMP, 6,  BlockBehaviour.Properties.copy(Blocks.CORNFLOWER)));
	public static final RegistryObject<Block> POTTED_HYBRID_CORNFLOWER_PURPLE = registerBlockWithoutBlockItem("potted_hybrid_cornflower_purple",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_CORNFLOWER_PURPLE, BlockBehaviour.Properties.copy(Blocks.POTTED_CORNFLOWER)));
	public static final RegistryObject<Block> GROWING_HYBRID_CORNFLOWER_PURPLE = registerBlockWithoutBlockItem("growing_hybrid_cornflower_purple",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_cornflower_purple" ));
	
	public static final RegistryObject<Block> HYBRID_CORNFLOWER_BLACK = registerBlock("hybrid_cornflower_black",
			()-> new FlowerBlock(MobEffects.JUMP, 6,  BlockBehaviour.Properties.copy(Blocks.CORNFLOWER)));
	public static final RegistryObject<Block> POTTED_HYBRID_CORNFLOWER_BLACK = registerBlockWithoutBlockItem("potted_hybrid_cornflower_black",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_CORNFLOWER_BLACK, BlockBehaviour.Properties.copy(Blocks.POTTED_CORNFLOWER)));
	public static final RegistryObject<Block> GROWING_HYBRID_CORNFLOWER_BLACK = registerBlockWithoutBlockItem("growing_hybrid_cornflower_black",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_cornflower_black" ));
	
	
	// daisys (yes, I know this is spelled wrong, but it's for ease of programming to just add an 's')
	public static final RegistryObject<Block> HYBRID_DAISY_YELLOW = registerBlock("hybrid_daisy_yellow",
			()-> new FlowerBlock(MobEffects.REGENERATION, 8, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY)));
	public static final RegistryObject<Block> POTTED_HYBRID_DAISY_YELLOW = registerBlockWithoutBlockItem("potted_hybrid_daisy_yellow",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_DAISY_YELLOW, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY)));
	public static final RegistryObject<Block> GROWING_HYBRID_DAISY_YELLOW = registerBlockWithoutBlockItem("growing_hybrid_daisy_yellow",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_daisy_yellow" ));
	
	public static final RegistryObject<Block> HYBRID_DAISY_MAGENTA = registerBlock("hybrid_daisy_magenta",
			()-> new FlowerBlock(MobEffects.REGENERATION, 8, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY)));
	public static final RegistryObject<Block> POTTED_HYBRID_DAISY_MAGENTA = registerBlockWithoutBlockItem("potted_hybrid_daisy_magenta",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_DAISY_MAGENTA, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY)));
	public static final RegistryObject<Block> GROWING_HYBRID_DAISY_MAGENTA = registerBlockWithoutBlockItem("growing_hybrid_daisy_magenta",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_daisy_magenta" ));
	
	public static final RegistryObject<Block> HYBRID_DAISY_PINK = registerBlock("hybrid_daisy_pink",
			()-> new FlowerBlock(MobEffects.REGENERATION, 8, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY)));
	public static final RegistryObject<Block> POTTED_HYBRID_DAISY_PINK = registerBlockWithoutBlockItem("potted_hybrid_daisy_pink",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_DAISY_PINK, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY)));
	public static final RegistryObject<Block> GROWING_HYBRID_DAISY_PINK = registerBlockWithoutBlockItem("growing_hybrid_daisy_pink",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_daisy_pink" ));
	
	public static final RegistryObject<Block> HYBRID_DAISY_BLUE = registerBlock("hybrid_daisy_blue",
			()-> new FlowerBlock(MobEffects.REGENERATION, 8, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY)));
	public static final RegistryObject<Block> POTTED_HYBRID_DAISY_BLUE = registerBlockWithoutBlockItem("potted_hybrid_daisy_blue",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_DAISY_BLUE, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY)));
	public static final RegistryObject<Block> GROWING_HYBRID_DAISY_BLUE = registerBlockWithoutBlockItem("growing_hybrid_daisy_blue",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_daisy_blue" ));
	
	
	// dandelions
	public static final RegistryObject<Block> HYBRID_DANDELION_PINK = registerBlock("hybrid_dandelion_pink",
			()-> new FlowerBlock(MobEffects.SATURATION, 7, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
	public static final RegistryObject<Block> POTTED_HYBRID_DANDELION_PINK = registerBlockWithoutBlockItem("potted_hybrid_dandelion_pink",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_DANDELION_PINK, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
	public static final RegistryObject<Block> GROWING_HYBRID_DANDELION_PINK = registerBlockWithoutBlockItem("growing_hybrid_dandelion_pink",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_dandelion_pink" ));
	
	public static final RegistryObject<Block> HYBRID_DANDELION_WHITE = registerBlock("hybrid_dandelion_white",
			()-> new FlowerBlock(MobEffects.SATURATION, 7, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
	public static final RegistryObject<Block> POTTED_HYBRID_DANDELION_WHITE = registerBlockWithoutBlockItem("potted_hybrid_dandelion_white",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_DANDELION_WHITE, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
	public static final RegistryObject<Block> GROWING_HYBRID_DANDELION_WHITE = registerBlockWithoutBlockItem("growing_hybrid_dandelion_white",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_dandelion_white" ));
	
	
	// lilies
	public static final RegistryObject<Block> HYBRID_LILY_PINK = registerBlock("hybrid_lily_pink",
			()-> new FlowerBlock(MobEffects.POISON, 12, BlockBehaviour.Properties.copy(Blocks.LILY_OF_THE_VALLEY)));
	public static final RegistryObject<Block> POTTED_HYBRID_LILY_PINK = registerBlockWithoutBlockItem("potted_hybrid_lily_pink",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_LILY_PINK, BlockBehaviour.Properties.copy(Blocks.POTTED_LILY_OF_THE_VALLEY)));
	public static final RegistryObject<Block> GROWING_HYBRID_LILY_PINK = registerBlockWithoutBlockItem("growing_hybrid_lily_pink",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_lily_pink" ));
	
	
	// orchids
	public static final RegistryObject<Block> HYBRID_ORCHID_RED = registerBlock("hybrid_orchid_red",
			()-> new FlowerBlock(MobEffects.SATURATION, 7,BlockBehaviour.Properties.copy(Blocks.BLUE_ORCHID)));
	public static final RegistryObject<Block> POTTED_HYBRID_ORCHID_RED = registerBlockWithoutBlockItem("potted_hybrid_orchid_red",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_ORCHID_RED, BlockBehaviour.Properties.copy(Blocks.POTTED_BLUE_ORCHID)));
	public static final RegistryObject<Block> GROWING_HYBRID_ORCHID_RED = registerBlockWithoutBlockItem("growing_hybrid_orchid_red",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_orchid_red" ));
	
	public static final RegistryObject<Block> HYBRID_ORCHID_ORANGE = registerBlock("hybrid_orchid_orange",
			()-> new FlowerBlock(MobEffects.SATURATION, 7,BlockBehaviour.Properties.copy(Blocks.BLUE_ORCHID)));
	public static final RegistryObject<Block> POTTED_HYBRID_ORCHID_ORANGE = registerBlockWithoutBlockItem("potted_hybrid_orchid_orange",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_ORCHID_ORANGE, BlockBehaviour.Properties.copy(Blocks.POTTED_BLUE_ORCHID)));
	public static final RegistryObject<Block> GROWING_HYBRID_ORCHID_ORANGE = registerBlockWithoutBlockItem("growing_hybrid_orchid_orange",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_orchid_orange" ));
	
	public static final RegistryObject<Block> HYBRID_ORCHID_YELLOW = registerBlock("hybrid_orchid_yellow",
			()-> new FlowerBlock(MobEffects.SATURATION, 7,BlockBehaviour.Properties.copy(Blocks.BLUE_ORCHID)));
	public static final RegistryObject<Block> POTTED_HYBRID_ORCHID_YELLOW = registerBlockWithoutBlockItem("potted_hybrid_orchid_yellow",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_ORCHID_YELLOW, BlockBehaviour.Properties.copy(Blocks.POTTED_BLUE_ORCHID)));
	public static final RegistryObject<Block> GROWING_HYBRID_ORCHID_YELLOW = registerBlockWithoutBlockItem("growing_hybrid_orchid_yellow",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_orchid_yellow" ));
	
	public static final RegistryObject<Block> HYBRID_ORCHID_WHITE = registerBlock("hybrid_orchid_white",
			()-> new FlowerBlock(MobEffects.SATURATION, 7, BlockBehaviour.Properties.copy(Blocks.BLUE_ORCHID)));
	public static final RegistryObject<Block> POTTED_HYBRID_ORCHID_WHITE = registerBlockWithoutBlockItem("potted_hybrid_orchid_white",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_ORCHID_WHITE, BlockBehaviour.Properties.copy(Blocks.POTTED_BLUE_ORCHID)));
	public static final RegistryObject<Block> GROWING_HYBRID_ORCHID_WHITE = registerBlockWithoutBlockItem("growing_hybrid_orchid_white",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_orchid_white" ));
	
	public static final RegistryObject<Block> HYBRID_ORCHID_BLACK = registerBlock("hybrid_orchid_black",
			()-> new FlowerBlock(MobEffects.SATURATION, 7, BlockBehaviour.Properties.copy(Blocks.BLUE_ORCHID)));
	public static final RegistryObject<Block> POTTED_HYBRID_ORCHID_BLACK = registerBlockWithoutBlockItem("potted_hybrid_orchid_black",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_ORCHID_BLACK, BlockBehaviour.Properties.copy(Blocks.POTTED_BLUE_ORCHID)));
	public static final RegistryObject<Block> GROWING_HYBRID_ORCHID_BLACK = registerBlockWithoutBlockItem("growing_hybrid_orchid_black",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_orchid_black" ));
	
	public static final RegistryObject<Block> HYBRID_ORCHID_PURPLE = registerBlock("hybrid_orchid_purple",
			()-> new  FlowerBlock(MobEffects.SATURATION, 7,BlockBehaviour.Properties.copy(Blocks.BLUE_ORCHID)));
	public static final RegistryObject<Block> POTTED_HYBRID_ORCHID_PURPLE = registerBlockWithoutBlockItem("potted_hybrid_orchid_purple",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_ORCHID_PURPLE, BlockBehaviour.Properties.copy(Blocks.POTTED_BLUE_ORCHID)));
	public static final RegistryObject<Block> GROWING_HYBRID_ORCHID_PURPLE = registerBlockWithoutBlockItem("growing_hybrid_orchid_purple",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_orchid_purple" ));
	
	public static final RegistryObject<Block> HYBRID_ORCHID_MAGENTA = registerBlock("hybrid_orchid_magenta",
			()-> new FlowerBlock(MobEffects.SATURATION, 7, BlockBehaviour.Properties.copy(Blocks.BLUE_ORCHID)));
	public static final RegistryObject<Block> POTTED_HYBRID_ORCHID_MAGENTA = registerBlockWithoutBlockItem("potted_hybrid_orchid_magenta",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_ORCHID_MAGENTA, BlockBehaviour.Properties.copy(Blocks.POTTED_BLUE_ORCHID)));
	public static final RegistryObject<Block> GROWING_HYBRID_ORCHID_MAGENTA = registerBlockWithoutBlockItem("growing_hybrid_orchid_magenta",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_orchid_magenta" ));
	
	public static final RegistryObject<Block> HYBRID_ORCHID_PINK = registerBlock("hybrid_orchid_pink",
			()-> new FlowerBlock(MobEffects.SATURATION, 7, BlockBehaviour.Properties.copy(Blocks.BLUE_ORCHID)));
	public static final RegistryObject<Block> POTTED_HYBRID_ORCHID_PINK = registerBlockWithoutBlockItem("potted_hybrid_orchid_pink",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_ORCHID_PINK, BlockBehaviour.Properties.copy(Blocks.POTTED_BLUE_ORCHID)));
	public static final RegistryObject<Block> GROWING_HYBRID_ORCHID_PINK = registerBlockWithoutBlockItem("growing_hybrid_orchid_pink",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_orchid_pink" ));
	
	public static final RegistryObject<Block> HYBRID_ORCHID_GREEN = registerBlock("hybrid_orchid_green",
			()-> new FlowerBlock(MobEffects.SATURATION, 7, BlockBehaviour.Properties.copy(Blocks.BLUE_ORCHID)));
	public static final RegistryObject<Block> POTTED_HYBRID_ORCHID_GREEN = registerBlockWithoutBlockItem("potted_hybrid_orchid_green",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_ORCHID_GREEN, BlockBehaviour.Properties.copy(Blocks.POTTED_BLUE_ORCHID)));
	public static final RegistryObject<Block> GROWING_HYBRID_ORCHID_GREEN = registerBlockWithoutBlockItem("growing_hybrid_orchid_green",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_orchid_green" ));
	
	
	public static final RegistryObject<Block> HYBRID_ORCHID_MAGENTA_WHITE = registerBlock("hybrid_orchid_magenta_white",
			()-> new FlowerBlock(MobEffects.SATURATION, 7, BlockBehaviour.Properties.copy(Blocks.BLUE_ORCHID)));
	public static final RegistryObject<Block> POTTED_HYBRID_ORCHID_MAGENTA_WHITE = registerBlockWithoutBlockItem("potted_hybrid_orchid_magenta_white",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_ORCHID_MAGENTA_WHITE, BlockBehaviour.Properties.copy(Blocks.POTTED_BLUE_ORCHID)));
	public static final RegistryObject<Block> GROWING_HYBRID_ORCHID_MAGENTA_WHITE = registerBlockWithoutBlockItem("growing_hybrid_orchid_magenta_white",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_orchid_magenta_white" ));
	
	public static final RegistryObject<Block> HYBRID_ORCHID_PINK_YELLOW = registerBlock("hybrid_orchid_pink_yellow",
			()-> new FlowerBlock(MobEffects.SATURATION, 7, BlockBehaviour.Properties.copy(Blocks.BLUE_ORCHID)));
	public static final RegistryObject<Block> POTTED_HYBRID_ORCHID_PINK_YELLOW = registerBlockWithoutBlockItem("potted_hybrid_orchid_pink_yellow",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_ORCHID_PINK_YELLOW, BlockBehaviour.Properties.copy(Blocks.POTTED_BLUE_ORCHID)));
	public static final RegistryObject<Block> GROWING_HYBRID_ORCHID_PINK_YELLOW = registerBlockWithoutBlockItem("growing_hybrid_orchid_pink_yellow",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_orchid_pink_yellow" ));
	
	
	// poppies
	public static final RegistryObject<Block> HYBRID_POPPY_ORANGE = registerBlock("hybrid_poppy_orange",
			()-> new  FlowerBlock(MobEffects.NIGHT_VISION, 5, BlockBehaviour.Properties.copy(Blocks.POPPY)));
	public static final RegistryObject<Block> POTTED_HYBRID_POPPY_ORANGE = registerBlockWithoutBlockItem("potted_hybrid_poppy_orange",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_POPPY_ORANGE, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
	public static final RegistryObject<Block> GROWING_HYBRID_POPPY_ORANGE = registerBlockWithoutBlockItem("growing_hybrid_poppy_orange",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_poppy_orange" ));
	
	public static final RegistryObject<Block> HYBRID_POPPY_YELLOW = registerBlock("hybrid_poppy_yellow",
			()-> new  FlowerBlock(MobEffects.NIGHT_VISION, 5, BlockBehaviour.Properties.copy(Blocks.POPPY)));
	public static final RegistryObject<Block> POTTED_HYBRID_POPPY_YELLOW = registerBlockWithoutBlockItem("potted_hybrid_poppy_yellow",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_POPPY_YELLOW, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
	public static final RegistryObject<Block> GROWING_HYBRID_POPPY_YELLOW = registerBlockWithoutBlockItem("growing_hybrid_poppy_yellow",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_poppy_yellow" ));
	
	public static final RegistryObject<Block> HYBRID_POPPY_WHITE = registerBlock("hybrid_poppy_white",
			()-> new  FlowerBlock(MobEffects.NIGHT_VISION, 5, BlockBehaviour.Properties.copy(Blocks.POPPY)));
	public static final RegistryObject<Block> POTTED_HYBRID_POPPY_WHITE = registerBlockWithoutBlockItem("potted_hybrid_poppy_white",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_POPPY_WHITE, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
	public static final RegistryObject<Block> GROWING_HYBRID_POPPY_WHITE = registerBlockWithoutBlockItem("growing_hybrid_poppy_white",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_poppy_white" ));
	
	public static final RegistryObject<Block> HYBRID_POPPY_BLACK = registerBlock("hybrid_poppy_black",
			()-> new  FlowerBlock(MobEffects.NIGHT_VISION, 5, BlockBehaviour.Properties.copy(Blocks.POPPY)));
	public static final RegistryObject<Block> POTTED_HYBRID_POPPY_BLACK = registerBlockWithoutBlockItem("potted_hybrid_poppy_black",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_POPPY_BLACK, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
	public static final RegistryObject<Block> GROWING_HYBRID_POPPY_BLACK = registerBlockWithoutBlockItem("growing_hybrid_poppy_black",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_poppy_black" ));
	
	public static final RegistryObject<Block> HYBRID_POPPY_PURPLE = registerBlock("hybrid_poppy_purple",
			()-> new  FlowerBlock(MobEffects.NIGHT_VISION, 5, BlockBehaviour.Properties.copy(Blocks.POPPY)));
	public static final RegistryObject<Block> POTTED_HYBRID_POPPY_PURPLE = registerBlockWithoutBlockItem("potted_hybrid_poppy_purple",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_POPPY_PURPLE, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
	public static final RegistryObject<Block> GROWING_HYBRID_POPPY_PURPLE = registerBlockWithoutBlockItem("growing_hybrid_poppy_purple",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_poppy_purple" ));
	
	public static final RegistryObject<Block> HYBRID_POPPY_MAGENTA = registerBlock("hybrid_poppy_magenta",
			()-> new  FlowerBlock(MobEffects.NIGHT_VISION, 5, BlockBehaviour.Properties.copy(Blocks.POPPY)));
	public static final RegistryObject<Block> POTTED_HYBRID_POPPY_MAGENTA = registerBlockWithoutBlockItem("potted_hybrid_poppy_magenta",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_POPPY_MAGENTA, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
	public static final RegistryObject<Block> GROWING_HYBRID_POPPY_MAGENTA = registerBlockWithoutBlockItem("growing_hybrid_poppy_magenta",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_poppy_magenta" ));
	
	public static final RegistryObject<Block> HYBRID_POPPY_PINK = registerBlock("hybrid_poppy_pink",
			()-> new  FlowerBlock(MobEffects.NIGHT_VISION, 5, BlockBehaviour.Properties.copy(Blocks.POPPY)));
	public static final RegistryObject<Block> POTTED_HYBRID_POPPY_PINK = registerBlockWithoutBlockItem("potted_hybrid_poppy_pink",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_POPPY_PINK, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
	public static final RegistryObject<Block> GROWING_HYBRID_POPPY_PINK = registerBlockWithoutBlockItem("growing_hybrid_poppy_pink",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_poppy_pink" ));
	
	public static final RegistryObject<Block> HYBRID_POPPY_CYAN = registerBlock("hybrid_poppy_cyan",
			()-> new  FlowerBlock(MobEffects.NIGHT_VISION, 5, BlockBehaviour.Properties.copy(Blocks.POPPY)));
	public static final RegistryObject<Block> POTTED_HYBRID_POPPY_CYAN = registerBlockWithoutBlockItem("potted_hybrid_poppy_cyan",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_POPPY_CYAN, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
	public static final RegistryObject<Block> GROWING_HYBRID_POPPY_CYAN = registerBlockWithoutBlockItem("growing_hybrid_poppy_cyan",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_poppy_cyan" ));
	
	public static final RegistryObject<Block> HYBRID_POPPY_BLUE = registerBlock("hybrid_poppy_blue",
			()-> new  FlowerBlock(MobEffects.NIGHT_VISION, 5, BlockBehaviour.Properties.copy(Blocks.POPPY)));
	public static final RegistryObject<Block> POTTED_HYBRID_POPPY_BLUE = registerBlockWithoutBlockItem("potted_hybrid_poppy_blue",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_POPPY_BLUE, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
	public static final RegistryObject<Block> GROWING_HYBRID_POPPY_BLUE = registerBlockWithoutBlockItem("growing_hybrid_poppy_blue",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_poppy_blue" ));
	
	
	// tulips
	public static final RegistryObject<Block> HYBRID_TULIP_YELLOW = registerBlock("hybrid_tulip_yellow",
			()-> new FlowerBlock( MobEffects.WEAKNESS, 9, BlockBehaviour.Properties.copy(Blocks.RED_TULIP)));
	public static final RegistryObject<Block> POTTED_HYBRID_TULIP_YELLOW = registerBlockWithoutBlockItem("potted_hybrid_tulip_yellow",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_TULIP_YELLOW, BlockBehaviour.Properties.copy(Blocks.POTTED_RED_TULIP)));
	public static final RegistryObject<Block> GROWING_HYBRID_TULIP_YELLOW = registerBlockWithoutBlockItem("growing_hybrid_tulip_yellow",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_tulip_yellow" ));
	
	public static final RegistryObject<Block> HYBRID_TULIP_MAGENTA = registerBlock("hybrid_tulip_magenta",
			()-> new FlowerBlock(MobEffects.WEAKNESS, 9, BlockBehaviour.Properties.copy(Blocks.RED_TULIP)));
	public static final RegistryObject<Block> POTTED_HYBRID_TULIP_MAGENTA = registerBlockWithoutBlockItem("potted_hybrid_tulip_magenta",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_TULIP_MAGENTA, BlockBehaviour.Properties.copy(Blocks.POTTED_RED_TULIP)));
	public static final RegistryObject<Block> GROWING_HYBRID_TULIP_MAGENTA = registerBlockWithoutBlockItem("growing_hybrid_tulip_magenta",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_tulip_magenta" ));
	
	public static final RegistryObject<Block> HYBRID_TULIP_PURPLE = registerBlock("hybrid_tulip_purple",
			()-> new FlowerBlock( MobEffects.WEAKNESS, 9, BlockBehaviour.Properties.copy(Blocks.RED_TULIP)));
	public static final RegistryObject<Block> POTTED_HYBRID_TULIP_PURPLE = registerBlockWithoutBlockItem("potted_hybrid_tulip_purple",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_TULIP_PURPLE, BlockBehaviour.Properties.copy(Blocks.POTTED_RED_TULIP)));
	public static final RegistryObject<Block> GROWING_HYBRID_TULIP_PURPLE = registerBlockWithoutBlockItem("growing_hybrid_tulip_purple",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_tulip_purple" ));
	
	public static final RegistryObject<Block> HYBRID_TULIP_BLACK = registerBlock("hybrid_tulip_black",
			()-> new FlowerBlock( MobEffects.WEAKNESS, 9, BlockBehaviour.Properties.copy(Blocks.RED_TULIP).noOcclusion()));
	public static final RegistryObject<Block> POTTED_HYBRID_TULIP_BLACK = registerBlockWithoutBlockItem("potted_hybrid_tulip_black",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_TULIP_BLACK, BlockBehaviour.Properties.copy(Blocks.POTTED_RED_TULIP)));
	public static final RegistryObject<Block> GROWING_HYBRID_TULIP_BLACK = registerBlockWithoutBlockItem("growing_hybrid_tulip_black",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_tulip_black" ));
	
	// fancy tulips
	public static final RegistryObject<Block> HYBRID_TULIP_GREEN_PINK = registerBlock("hybrid_tulip_green_pink",
			()-> new FlowerBlock( MobEffects.WEAKNESS, 9, BlockBehaviour.Properties.copy(Blocks.RED_TULIP).noOcclusion()));
	public static final RegistryObject<Block> POTTED_HYBRID_TULIP_GREEN_PINK = registerBlockWithoutBlockItem("potted_hybrid_tulip_green_pink",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_TULIP_GREEN_PINK, BlockBehaviour.Properties.copy(Blocks.POTTED_RED_TULIP)));
	public static final RegistryObject<Block> GROWING_HYBRID_TULIP_GREEN_PINK = registerBlockWithoutBlockItem("growing_hybrid_tulip_green_pink",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_tulip_green_pink" ));
	
	public static final RegistryObject<Block> HYBRID_TULIP_GREEN_WHITE = registerBlock("hybrid_tulip_green_white",
			()-> new FlowerBlock( MobEffects.WEAKNESS, 9, BlockBehaviour.Properties.copy(Blocks.RED_TULIP).noOcclusion()));
	public static final RegistryObject<Block> POTTED_HYBRID_TULIP_GREEN_WHITE = registerBlockWithoutBlockItem("potted_hybrid_tulip_green_white",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_TULIP_GREEN_WHITE, BlockBehaviour.Properties.copy(Blocks.POTTED_RED_TULIP)));
	public static final RegistryObject<Block> GROWING_HYBRID_TULIP_GREEN_WHITE = registerBlockWithoutBlockItem("growing_hybrid_tulip_green_white",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_tulip_green_white" ));
	
	public static final RegistryObject<Block> HYBRID_TULIP_MAGENTA_ORANGE = registerBlock("hybrid_tulip_magenta_orange",
			()-> new FlowerBlock( MobEffects.WEAKNESS, 9, BlockBehaviour.Properties.copy(Blocks.RED_TULIP).noOcclusion()));
	public static final RegistryObject<Block> POTTED_HYBRID_TULIP_MAGENTA_ORANGE = registerBlockWithoutBlockItem("potted_hybrid_tulip_magenta_orange",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_TULIP_MAGENTA_ORANGE, BlockBehaviour.Properties.copy(Blocks.POTTED_RED_TULIP)));
	public static final RegistryObject<Block> GROWING_HYBRID_TULIP_MAGENTA_ORANGE = registerBlockWithoutBlockItem("growing_hybrid_tulip_magenta_orange",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_tulip_magenta_orange" ));
	
	public static final RegistryObject<Block> HYBRID_TULIP_ORANGE_YELLOW = registerBlock("hybrid_tulip_orange_yellow",
			()-> new FlowerBlock( MobEffects.WEAKNESS, 9, BlockBehaviour.Properties.copy(Blocks.RED_TULIP).noOcclusion()));
	public static final RegistryObject<Block> POTTED_HYBRID_TULIP_ORANGE_YELLOW = registerBlockWithoutBlockItem("potted_hybrid_tulip_orange_yellow",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_TULIP_ORANGE_YELLOW, BlockBehaviour.Properties.copy(Blocks.POTTED_RED_TULIP)));
	public static final RegistryObject<Block> GROWING_HYBRID_TULIP_ORANGE_YELLOW = registerBlockWithoutBlockItem("growing_hybrid_tulip_orange_yellow",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_tulip_orange_yellow" ));
	
	public static final RegistryObject<Block> HYBRID_TULIP_PURPLE_YELLOW = registerBlock("hybrid_tulip_purple_yellow",
			()-> new FlowerBlock( MobEffects.WEAKNESS, 9, BlockBehaviour.Properties.copy(Blocks.RED_TULIP).noOcclusion()));
	public static final RegistryObject<Block> POTTED_HYBRID_TULIP_PURPLE_YELLOW = registerBlockWithoutBlockItem("potted_hybrid_tulip_purple_yellow",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_TULIP_PURPLE_YELLOW, BlockBehaviour.Properties.copy(Blocks.POTTED_RED_TULIP)));
	public static final RegistryObject<Block> GROWING_HYBRID_TULIP_PURPLE_YELLOW = registerBlockWithoutBlockItem("growing_hybrid_tulip_purple_yellow",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_tulip_purple_yellow" ));
	
	public static final RegistryObject<Block> HYBRID_TULIP_RAINBOW = registerBlock("hybrid_tulip_rainbow",
			()-> new FlowerBlock( MobEffects.WEAKNESS, 9, BlockBehaviour.Properties.copy(Blocks.RED_TULIP).noOcclusion()));
	public static final RegistryObject<Block> POTTED_HYBRID_TULIP_RAINBOW = registerBlockWithoutBlockItem("potted_hybrid_tulip_rainbow",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_TULIP_RAINBOW, BlockBehaviour.Properties.copy(Blocks.POTTED_RED_TULIP)));
	public static final RegistryObject<Block> GROWING_HYBRID_TULIP_RAINBOW = registerBlockWithoutBlockItem("growing_hybrid_tulip_rainbow",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_tulip_rainbow" ));
	
	public static final RegistryObject<Block> HYBRID_TULIP_RED_WHITE = registerBlock("hybrid_tulip_red_white",
			()-> new FlowerBlock( MobEffects.WEAKNESS, 9, BlockBehaviour.Properties.copy(Blocks.RED_TULIP).noOcclusion()));
	public static final RegistryObject<Block> POTTED_HYBRID_TULIP_RED_WHITE = registerBlockWithoutBlockItem("potted_hybrid_tulip_red_white",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_TULIP_RED_WHITE, BlockBehaviour.Properties.copy(Blocks.POTTED_RED_TULIP)));
	public static final RegistryObject<Block> GROWING_HYBRID_TULIP_RED_WHITE = registerBlockWithoutBlockItem("growing_hybrid_tulip_red_white",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_tulip_red_white" ));
	
	public static final RegistryObject<Block> HYBRID_TULIP_WHITE_PINK = registerBlock("hybrid_tulip_white_pink",
			()-> new FlowerBlock( MobEffects.WEAKNESS, 9, BlockBehaviour.Properties.copy(Blocks.RED_TULIP).noOcclusion()));
	public static final RegistryObject<Block> POTTED_HYBRID_TULIP_WHITE_PINK = registerBlockWithoutBlockItem("potted_hybrid_tulip_white_pink",
			()-> new FlowerPotBlock(null,ModBlocks.HYBRID_TULIP_WHITE_PINK, BlockBehaviour.Properties.copy(Blocks.POTTED_RED_TULIP)));
	public static final RegistryObject<Block> GROWING_HYBRID_TULIP_WHITE_PINK = registerBlockWithoutBlockItem("growing_hybrid_tulip_white_pink",
			()-> new FlowerPlantBlock( BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion(), "seeds_hybrid_tulip_white_pink" ));
	
	
	
	
	
	
	private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
	{
		RegistryObject<T> ret = BLOCKS.register(name,block);
		registerBlockItem(name,ret,ModCreativeModeTab.HYBRID_FLOWERS_TAB);
		return ret;
	}
	
	private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block)
	{
		return BLOCKS.register(name,block);
	}
	
	
	private static <T extends Block> RegistryObject<Item> registerBlockItem(String name,
	                RegistryObject<T> block, CreativeModeTab tab)
	{
		return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
	
	
	public static void register(IEventBus eventBus)
	{
		BLOCKS.register(eventBus);
	}
}
