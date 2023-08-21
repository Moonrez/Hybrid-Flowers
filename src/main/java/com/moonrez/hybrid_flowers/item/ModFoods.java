package com.moonrez.hybrid_flowers.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods
{
	// I have no idea how the saturationMod values correlate to actual saturation. I think it's some sort of multiplier.
	public static final FoodProperties POPPYSEED_BAGEL =
			(new FoodProperties.Builder().nutrition(5).saturationMod(0.65f).build());
	public static final FoodProperties POPPYSEED_MUFFIN =
			(new FoodProperties.Builder().nutrition(6).saturationMod(0.9f).build());
}
