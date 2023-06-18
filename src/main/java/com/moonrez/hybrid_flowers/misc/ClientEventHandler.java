package com.moonrez.hybrid_flowers.misc;

import com.moonrez.hybrid_flowers.HybridFlowers;
import com.moonrez.hybrid_flowers.block.ModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = HybridFlowers.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventHandler
{
	@SubscribeEvent
	public static void clientSetup(final FMLClientSetupEvent event)
	{
		// vanilla
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_ALLIUM_PURPLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_BLUET_WHITE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_CORNFLOWER_BLUE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_DANDELION_YELLOW.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_DAISY_WHITE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_LILY_WHITE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_ORCHID_BLUE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_POPPY_RED.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_TULIP_RED.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_TULIP_ORANGE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_TULIP_PINK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_TULIP_WHITE.get(), RenderType.cutout());
		
		
		// alliums
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_ALLIUM_PINK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_ALLIUM_PINK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_ALLIUM_PINK.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_ALLIUM_BLUE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_ALLIUM_BLUE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_ALLIUM_BLUE.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_ALLIUM_WHITE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_ALLIUM_WHITE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_ALLIUM_WHITE.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_ALLIUM_YELLOW.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_ALLIUM_YELLOW.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_ALLIUM_YELLOW.get(), RenderType.cutout());
		
		
		// bluets
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_BLUET_BLUE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_BLUET_BLUE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_BLUET_BLUE.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_BLUET_PURPLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_BLUET_PURPLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_BLUET_PURPLE.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_BLUET_PINK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_BLUET_PINK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_BLUET_PINK.get(), RenderType.cutout());
		
		
		// cornflowers
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_CORNFLOWER_RED.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_CORNFLOWER_RED.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_CORNFLOWER_RED.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_CORNFLOWER_MAGENTA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_CORNFLOWER_MAGENTA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_CORNFLOWER_MAGENTA.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_CORNFLOWER_PINK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_CORNFLOWER_PINK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_CORNFLOWER_PINK.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_CORNFLOWER_WHITE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_CORNFLOWER_WHITE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_CORNFLOWER_WHITE.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_CORNFLOWER_PURPLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_CORNFLOWER_PURPLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_CORNFLOWER_PURPLE.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_CORNFLOWER_BLACK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_CORNFLOWER_BLACK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_CORNFLOWER_BLACK.get(), RenderType.cutout());
		
		
		// daisies
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_DAISY_YELLOW.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_DAISY_YELLOW.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_DAISY_YELLOW.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_DAISY_MAGENTA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_DAISY_MAGENTA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_DAISY_MAGENTA.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_DAISY_PINK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_DAISY_PINK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_DAISY_PINK.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_DAISY_BLUE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_DAISY_BLUE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_DAISY_BLUE.get(), RenderType.cutout());
		
		
		// dandelions
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_DANDELION_PINK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_DANDELION_PINK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_DANDELION_PINK.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_DANDELION_WHITE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_DANDELION_WHITE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_DANDELION_WHITE.get(), RenderType.cutout());
		
		
		// lilies
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_LILY_PINK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_LILY_PINK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_LILY_PINK.get(), RenderType.cutout());
		
		
		// orchids
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_ORCHID_RED.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_ORCHID_RED.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_ORCHID_RED.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_ORCHID_ORANGE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_ORCHID_ORANGE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_ORCHID_ORANGE.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_ORCHID_YELLOW.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_ORCHID_YELLOW.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_ORCHID_YELLOW.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_ORCHID_WHITE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_ORCHID_WHITE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_ORCHID_WHITE.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_ORCHID_BLACK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_ORCHID_BLACK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_ORCHID_BLACK.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_ORCHID_PURPLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_ORCHID_PURPLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_ORCHID_PURPLE.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_ORCHID_MAGENTA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_ORCHID_MAGENTA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_ORCHID_MAGENTA.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_ORCHID_PINK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_ORCHID_PINK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_ORCHID_PINK.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_ORCHID_GREEN.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_ORCHID_GREEN.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_ORCHID_GREEN.get(), RenderType.cutout());
		
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_ORCHID_MAGENTA_WHITE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_ORCHID_MAGENTA_WHITE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_ORCHID_MAGENTA_WHITE.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_ORCHID_PINK_YELLOW.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_ORCHID_PINK_YELLOW.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_ORCHID_PINK_YELLOW.get(), RenderType.cutout());
		
		
		
		// poppies
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_POPPY_ORANGE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_POPPY_ORANGE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_POPPY_ORANGE.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_POPPY_YELLOW.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_POPPY_YELLOW.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_POPPY_YELLOW.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_POPPY_WHITE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_POPPY_WHITE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_POPPY_WHITE.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_POPPY_BLACK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_POPPY_BLACK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_POPPY_BLACK.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_POPPY_PURPLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_POPPY_PURPLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_POPPY_PURPLE.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_POPPY_MAGENTA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_POPPY_MAGENTA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_POPPY_MAGENTA.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_POPPY_PINK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_POPPY_PINK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_POPPY_PINK.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_POPPY_CYAN.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_POPPY_CYAN.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_POPPY_CYAN.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_POPPY_BLUE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_POPPY_BLUE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_POPPY_BLUE.get(), RenderType.cutout());
		
		
		// tulips
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_TULIP_YELLOW.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_TULIP_YELLOW.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_TULIP_YELLOW.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_TULIP_MAGENTA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_TULIP_MAGENTA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_TULIP_MAGENTA.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_TULIP_PURPLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_TULIP_PURPLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_TULIP_PURPLE.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_TULIP_BLACK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_TULIP_BLACK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_TULIP_BLACK.get(), RenderType.cutout());
		
		// fancy tulips
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_TULIP_GREEN_PINK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_TULIP_GREEN_PINK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_TULIP_GREEN_PINK.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_TULIP_GREEN_WHITE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_TULIP_GREEN_WHITE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_TULIP_GREEN_WHITE.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_TULIP_MAGENTA_ORANGE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_TULIP_MAGENTA_ORANGE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_TULIP_MAGENTA_ORANGE.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_TULIP_ORANGE_YELLOW.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_TULIP_ORANGE_YELLOW.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_TULIP_ORANGE_YELLOW.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_TULIP_PURPLE_YELLOW.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_TULIP_PURPLE_YELLOW.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_TULIP_PURPLE_YELLOW.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_TULIP_RAINBOW.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_TULIP_RAINBOW.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_TULIP_RAINBOW.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_TULIP_RED_WHITE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_TULIP_RED_WHITE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_TULIP_RED_WHITE.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYBRID_TULIP_WHITE_PINK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HYBRID_TULIP_WHITE_PINK.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.GROWING_HYBRID_TULIP_WHITE_PINK.get(), RenderType.cutout());
		
	}
}
