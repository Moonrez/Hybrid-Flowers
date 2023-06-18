package com.moonrez.hybrid_flowers;

import com.mojang.logging.LogUtils;
import com.moonrez.hybrid_flowers.block.ModBlocks;
import com.moonrez.hybrid_flowers.item.ModItems;
import com.moonrez.hybrid_flowers.misc.CommonConfig;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(HybridFlowers.MOD_ID)
public class HybridFlowers
{
    public static final String MOD_ID = "hybrid_flowers";

    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public HybridFlowers()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        
        eventBus.addListener(this::setup);
        
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CommonConfig.SPEC,"hybrid_flowers-common.toml");
        
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
    

    private void setup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(()->
        {
            // alliums
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_ALLIUM_PINK.getId(), ModBlocks.POTTED_HYBRID_ALLIUM_PINK);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_ALLIUM_YELLOW.getId(), ModBlocks.POTTED_HYBRID_ALLIUM_YELLOW);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_ALLIUM_BLUE.getId(), ModBlocks.POTTED_HYBRID_ALLIUM_BLUE);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_ALLIUM_WHITE.getId(), ModBlocks.POTTED_HYBRID_ALLIUM_WHITE);
            
            // bluets
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_BLUET_BLUE.getId(), ModBlocks.POTTED_HYBRID_BLUET_BLUE);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_BLUET_PURPLE.getId(), ModBlocks.POTTED_HYBRID_BLUET_PURPLE);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_BLUET_PINK.getId(), ModBlocks.POTTED_HYBRID_BLUET_PINK);
            
            // cornflowers
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_CORNFLOWER_RED.getId(), ModBlocks.POTTED_HYBRID_CORNFLOWER_RED);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_CORNFLOWER_MAGENTA.getId(), ModBlocks.POTTED_HYBRID_CORNFLOWER_MAGENTA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_CORNFLOWER_PINK.getId(), ModBlocks.POTTED_HYBRID_CORNFLOWER_PINK);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_CORNFLOWER_WHITE.getId(), ModBlocks.POTTED_HYBRID_CORNFLOWER_WHITE);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_CORNFLOWER_PURPLE.getId(), ModBlocks.POTTED_HYBRID_CORNFLOWER_PURPLE);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_CORNFLOWER_BLACK.getId(), ModBlocks.POTTED_HYBRID_CORNFLOWER_BLACK);
            
            // daisies
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_DAISY_YELLOW.getId(), ModBlocks.POTTED_HYBRID_DAISY_YELLOW);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_DAISY_MAGENTA.getId(), ModBlocks.POTTED_HYBRID_DAISY_MAGENTA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_DAISY_PINK.getId(), ModBlocks.POTTED_HYBRID_DAISY_PINK);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_DAISY_BLUE.getId(), ModBlocks.POTTED_HYBRID_DAISY_BLUE);
            
            // dandelions
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_DANDELION_PINK.getId(), ModBlocks.POTTED_HYBRID_DANDELION_PINK);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_DANDELION_WHITE.getId(), ModBlocks.POTTED_HYBRID_DANDELION_WHITE);
            
            // lilies
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_LILY_PINK.getId(), ModBlocks.POTTED_HYBRID_LILY_PINK);
            
            // orchids
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_ORCHID_RED.getId(), ModBlocks.POTTED_HYBRID_ORCHID_RED);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_ORCHID_ORANGE.getId(), ModBlocks.POTTED_HYBRID_ORCHID_ORANGE);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_ORCHID_YELLOW.getId(), ModBlocks.POTTED_HYBRID_ORCHID_YELLOW);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_ORCHID_WHITE.getId(), ModBlocks.POTTED_HYBRID_ORCHID_WHITE);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_ORCHID_BLACK.getId(), ModBlocks.POTTED_HYBRID_ORCHID_BLACK);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_ORCHID_PURPLE.getId(), ModBlocks.POTTED_HYBRID_ORCHID_PURPLE);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_ORCHID_MAGENTA.getId(), ModBlocks.POTTED_HYBRID_ORCHID_MAGENTA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_ORCHID_PINK.getId(), ModBlocks.POTTED_HYBRID_ORCHID_PINK);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_ORCHID_GREEN.getId(), ModBlocks.POTTED_HYBRID_ORCHID_GREEN);
            
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_ORCHID_MAGENTA_WHITE.getId(), ModBlocks.POTTED_HYBRID_ORCHID_MAGENTA_WHITE);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_ORCHID_PINK_YELLOW.getId(), ModBlocks.POTTED_HYBRID_ORCHID_PINK_YELLOW);
            
            // poppies
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_POPPY_ORANGE.getId(), ModBlocks.POTTED_HYBRID_POPPY_ORANGE);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_POPPY_YELLOW.getId(), ModBlocks.POTTED_HYBRID_POPPY_YELLOW);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_POPPY_WHITE.getId(), ModBlocks.POTTED_HYBRID_POPPY_WHITE);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_POPPY_BLACK.getId(), ModBlocks.POTTED_HYBRID_POPPY_BLACK);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_POPPY_PURPLE.getId(), ModBlocks.POTTED_HYBRID_POPPY_PURPLE);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_POPPY_MAGENTA.getId(), ModBlocks.POTTED_HYBRID_POPPY_MAGENTA);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_POPPY_PINK.getId(), ModBlocks.POTTED_HYBRID_POPPY_PINK);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_POPPY_CYAN.getId(), ModBlocks.POTTED_HYBRID_POPPY_CYAN);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_POPPY_BLUE.getId(), ModBlocks.POTTED_HYBRID_POPPY_BLUE);
            
            // tulips
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_TULIP_PURPLE.getId(), ModBlocks.POTTED_HYBRID_TULIP_PURPLE);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_TULIP_BLACK.getId(), ModBlocks.POTTED_HYBRID_TULIP_BLACK);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_TULIP_YELLOW.getId(), ModBlocks.POTTED_HYBRID_TULIP_YELLOW);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_TULIP_MAGENTA.getId(), ModBlocks.POTTED_HYBRID_TULIP_MAGENTA);
            
            // fancy tulips
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_TULIP_GREEN_PINK.getId(), ModBlocks.POTTED_HYBRID_TULIP_GREEN_PINK);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_TULIP_GREEN_WHITE.getId(), ModBlocks.POTTED_HYBRID_TULIP_GREEN_WHITE);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_TULIP_MAGENTA_ORANGE.getId(), ModBlocks.POTTED_HYBRID_TULIP_MAGENTA_ORANGE);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_TULIP_ORANGE_YELLOW.getId(), ModBlocks.POTTED_HYBRID_TULIP_ORANGE_YELLOW);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_TULIP_PURPLE_YELLOW.getId(), ModBlocks.POTTED_HYBRID_TULIP_PURPLE_YELLOW);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_TULIP_RAINBOW.getId(), ModBlocks.POTTED_HYBRID_TULIP_RAINBOW);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_TULIP_RED_WHITE.getId(), ModBlocks.POTTED_HYBRID_TULIP_RED_WHITE);
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.HYBRID_TULIP_WHITE_PINK.getId(), ModBlocks.POTTED_HYBRID_TULIP_WHITE_PINK);
        });
    }
}
