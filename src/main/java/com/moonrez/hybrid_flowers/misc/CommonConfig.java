package com.moonrez.hybrid_flowers.misc;

import net.minecraftforge.common.ForgeConfigSpec;

public class CommonConfig
{
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	
	public static final ForgeConfigSpec.ConfigValue<Integer> FLOWER_BREED_RADIUS;
	public static final ForgeConfigSpec.ConfigValue<Integer> DOUBLE_SEED_THRESHOLD;
	public static final ForgeConfigSpec.ConfigValue<Integer> TRIPLE_SEED_THRESHOLD;
	
	static
	{
		BUILDER.push("Hybrid Flowers Config");
		
		FLOWER_BREED_RADIUS = BUILDER.comment("Radius within which a pollinated flower can cross with another flower.")
				.define("Flower Breeding Radius", 5);
		DOUBLE_SEED_THRESHOLD = BUILDER.comment("When there are at least this number of flowers within the breeding radius, a bonus seed will be granted.")
				.define("Double Seed Threshold", 8);
		TRIPLE_SEED_THRESHOLD = BUILDER.comment("When there are at least this number of flowers within the breeding radius, two bonus seeds will be granted.")
				.define("Triple Seed Threshold", 16);
		
		BUILDER.pop();
		SPEC = BUILDER.build();
	}
}
