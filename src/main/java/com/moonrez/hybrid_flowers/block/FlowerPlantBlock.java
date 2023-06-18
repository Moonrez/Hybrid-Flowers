package com.moonrez.hybrid_flowers.block;

import com.moonrez.hybrid_flowers.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.registries.ForgeRegistries;

public class FlowerPlantBlock extends CropBlock
{
	public FlowerPlantBlock(Properties properties, String seedName)
	{
		super(properties);
		seedType = seedName;
	}
	
	// these are the bounds of the block when it's growing
	// basically the area you can click on and it'll give you the plant
	private static final VoxelShape[] SHAPES = new VoxelShape[]{
					Block.box(5.0D, 0.0D, 5.0D, 11.0D, 4.0D, 11.0D),
					Block.box(5.0D, 0.0D, 5.0D, 11.0D, 4.0D, 11.0D),
					Block.box(5.0D, 0.0D, 5.0D, 11.0D, 7.0D, 11.0D),
					Block.box(5.0D, 0.0D, 5.0D, 11.0D, 7.0D, 11.0D),
					Block.box(5.0D, 0.0D, 5.0D, 11.0D, 7.0D, 11.0D),
					Block.box(5.0D, 0.0D, 5.0D, 11.0D, 11.0D, 11.0D),
					Block.box(5.0D, 0.0D, 5.0D, 11.0D, 11.0D, 11.0D),
					Block.box(5.0D, 0.0D, 5.0D, 11.0D, 13.0D, 11.0D)};
	
	
	public String seedType; // name (registry ID) of the item used to plant this flower
	
	@Override
	protected ItemLike getBaseSeedId()
	{
		// ResourceLocation is the internal ID of the item
		// ForgeRegistries.ITEMS.getValue returns the item with the specified ID
		ResourceLocation rLocation = new ResourceLocation(seedType);
		return ForgeRegistries.ITEMS.getValue(rLocation);
	}
	
	@Override
	public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext)
	{
		return SHAPES[getAge(pState)];
	}
}
