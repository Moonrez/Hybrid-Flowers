package com.moonrez.hybrid_flowers.item;

import com.moonrez.hybrid_flowers.HybridFlowers;
import com.moonrez.hybrid_flowers.block.ModBlocks;
import com.moonrez.hybrid_flowers.misc.ModCreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HybridFlowers.MOD_ID);
    
    // FOOD
    public static final RegistryObject<Item> POPPYSEED_BAGEL = ITEMS.register("poppyseed_bagel",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB).food(ModFoods.POPPYSEED_BAGEL)));
    public static final RegistryObject<Item> POPPYSEED_MUFFIN = ITEMS.register("poppyseed_muffin",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB).food(ModFoods.POPPYSEED_MUFFIN)));
    
    // SEEDS
    // vanilla
    public static final RegistryObject<Item> SEEDS_HYBRID_ALLIUM_PURPLE = ITEMS.register("seeds_hybrid_allium_purple",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_ALLIUM_PURPLE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_BLUET_WHITE = ITEMS.register("seeds_hybrid_bluet_white",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_BLUET_WHITE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_CORNFLOWER_BLUE = ITEMS.register("seeds_hybrid_cornflower_blue",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_CORNFLOWER_BLUE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_DAISY_WHITE = ITEMS.register("seeds_hybrid_daisy_white",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_DAISY_WHITE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_DANDELION_YELLOW = ITEMS.register("seeds_hybrid_dandelion_yellow",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_DANDELION_YELLOW.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_LILY_WHITE = ITEMS.register("seeds_hybrid_lily_white",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_LILY_WHITE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_ORCHID_BLUE = ITEMS.register("seeds_hybrid_orchid_blue",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_ORCHID_BLUE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_POPPY_RED = ITEMS.register("seeds_hybrid_poppy_red",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_POPPY_RED.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    
    public static final RegistryObject<Item> SEEDS_HYBRID_TULIP_RED = ITEMS.register("seeds_hybrid_tulip_red",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_TULIP_RED.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_TULIP_ORANGE = ITEMS.register("seeds_hybrid_tulip_orange",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_TULIP_ORANGE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_TULIP_PINK = ITEMS.register("seeds_hybrid_tulip_pink",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_TULIP_PINK.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_TULIP_WHITE = ITEMS.register("seeds_hybrid_tulip_white",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_TULIP_WHITE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    
    
    // alliums
    public static final RegistryObject<Item> SEEDS_HYBRID_ALLIUM_PINK = ITEMS.register("seeds_hybrid_allium_pink",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_ALLIUM_PINK.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_ALLIUM_YELLOW = ITEMS.register("seeds_hybrid_allium_yellow",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_ALLIUM_YELLOW.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_ALLIUM_WHITE = ITEMS.register("seeds_hybrid_allium_white",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_ALLIUM_WHITE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_ALLIUM_BLUE = ITEMS.register("seeds_hybrid_allium_blue",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_ALLIUM_BLUE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    
    // bluets
    public static final RegistryObject<Item> SEEDS_HYBRID_BLUET_PURPLE = ITEMS.register("seeds_hybrid_bluet_purple",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_BLUET_PURPLE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_BLUET_BLUE = ITEMS.register("seeds_hybrid_bluet_blue",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_BLUET_BLUE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_BLUET_PINK = ITEMS.register("seeds_hybrid_bluet_pink",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_BLUET_PINK.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    
    
    // cornflowers
    public static final RegistryObject<Item> SEEDS_HYBRID_CORNFLOWER_RED = ITEMS.register("seeds_hybrid_cornflower_red",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_CORNFLOWER_RED.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_CORNFLOWER_MAGENTA = ITEMS.register("seeds_hybrid_cornflower_magenta",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_CORNFLOWER_MAGENTA.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_CORNFLOWER_PINK = ITEMS.register("seeds_hybrid_cornflower_pink",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_CORNFLOWER_PINK.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_CORNFLOWER_WHITE = ITEMS.register("seeds_hybrid_cornflower_white",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_CORNFLOWER_WHITE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_CORNFLOWER_PURPLE = ITEMS.register("seeds_hybrid_cornflower_purple",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_CORNFLOWER_PURPLE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_CORNFLOWER_BLACK = ITEMS.register("seeds_hybrid_cornflower_black",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_CORNFLOWER_BLACK.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    
    
    // daisies
    public static final RegistryObject<Item> SEEDS_HYBRID_DAISY_YELLOW = ITEMS.register("seeds_hybrid_daisy_yellow",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_DAISY_YELLOW.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_DAISY_MAGENTA = ITEMS.register("seeds_hybrid_daisy_magenta",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_DAISY_MAGENTA.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_DAISY_PINK = ITEMS.register("seeds_hybrid_daisy_pink",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_DAISY_PINK.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_DAISY_BLUE = ITEMS.register("seeds_hybrid_daisy_blue",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_DAISY_BLUE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    
    
    // dandelions
    public static final RegistryObject<Item> SEEDS_HYBRID_DANDELION_PINK = ITEMS.register("seeds_hybrid_dandelion_pink",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_DANDELION_PINK.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_DANDELION_WHITE = ITEMS.register("seeds_hybrid_dandelion_white",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_DANDELION_WHITE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    
    
    // lilies
    public static final RegistryObject<Item> SEEDS_HYBRID_LILY_PINK = ITEMS.register("seeds_hybrid_lily_pink",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_LILY_PINK.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    
    
    // orchids
    public static final RegistryObject<Item> SEEDS_HYBRID_ORCHID_RED = ITEMS.register("seeds_hybrid_orchid_red",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_ORCHID_RED.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_ORCHID_ORANGE = ITEMS.register("seeds_hybrid_orchid_orange",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_ORCHID_ORANGE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_ORCHID_YELLOW = ITEMS.register("seeds_hybrid_orchid_yellow",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_ORCHID_YELLOW.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_ORCHID_WHITE = ITEMS.register("seeds_hybrid_orchid_white",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_ORCHID_WHITE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_ORCHID_BLACK = ITEMS.register("seeds_hybrid_orchid_black",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_ORCHID_BLACK.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_ORCHID_PURPLE = ITEMS.register("seeds_hybrid_orchid_purple",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_ORCHID_PURPLE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_ORCHID_MAGENTA = ITEMS.register("seeds_hybrid_orchid_magenta",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_ORCHID_MAGENTA.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_ORCHID_PINK = ITEMS.register("seeds_hybrid_orchid_pink",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_ORCHID_PINK.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_ORCHID_GREEN = ITEMS.register("seeds_hybrid_orchid_green",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_ORCHID_GREEN.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    
    public static final RegistryObject<Item> SEEDS_HYBRID_ORCHID_MAGENTA_WHITE = ITEMS.register("seeds_hybrid_orchid_magenta_white",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_ORCHID_MAGENTA_WHITE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_ORCHID_PINK_YELLOW = ITEMS.register("seeds_hybrid_orchid_pink_yellow",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_ORCHID_PINK_YELLOW.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    
    
    // poppies
    public static final RegistryObject<Item> SEEDS_HYBRID_POPPY_ORANGE = ITEMS.register("seeds_hybrid_poppy_orange",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_POPPY_ORANGE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_POPPY_YELLOW = ITEMS.register("seeds_hybrid_poppy_yellow",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_POPPY_YELLOW.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_POPPY_WHITE = ITEMS.register("seeds_hybrid_poppy_white",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_POPPY_WHITE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_POPPY_BLACK = ITEMS.register("seeds_hybrid_poppy_black",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_POPPY_BLACK.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_POPPY_PURPLE = ITEMS.register("seeds_hybrid_poppy_purple",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_POPPY_PURPLE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_POPPY_MAGENTA = ITEMS.register("seeds_hybrid_poppy_magenta",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_POPPY_MAGENTA.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_POPPY_PINK = ITEMS.register("seeds_hybrid_poppy_pink",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_POPPY_PINK.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_POPPY_CYAN = ITEMS.register("seeds_hybrid_poppy_cyan",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_POPPY_CYAN.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_POPPY_BLUE = ITEMS.register("seeds_hybrid_poppy_blue",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_POPPY_BLUE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    
    
    // tulips
    public static final RegistryObject<Item> SEEDS_HYBRID_TULIP_PURPLE = ITEMS.register("seeds_hybrid_tulip_purple",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_TULIP_PURPLE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_TULIP_BLACK = ITEMS.register("seeds_hybrid_tulip_black",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_TULIP_BLACK.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_TULIP_YELLOW = ITEMS.register("seeds_hybrid_tulip_yellow",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_TULIP_YELLOW.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    public static final RegistryObject<Item> SEEDS_HYBRID_TULIP_MAGENTA = ITEMS.register("seeds_hybrid_tulip_magenta",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_TULIP_MAGENTA.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    
    // fancy tulips
    public static final RegistryObject<Item> SEEDS_HYBRID_TULIP_GREEN_PINK = ITEMS.register("seeds_hybrid_tulip_green_pink",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_TULIP_GREEN_PINK.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    
    public static final RegistryObject<Item> SEEDS_HYBRID_TULIP_GREEN_WHITE = ITEMS.register("seeds_hybrid_tulip_green_white",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_TULIP_GREEN_WHITE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    
    public static final RegistryObject<Item> SEEDS_HYBRID_TULIP_MAGENTA_ORANGE = ITEMS.register("seeds_hybrid_tulip_magenta_orange",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_TULIP_MAGENTA_ORANGE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    
    public static final RegistryObject<Item> SEEDS_HYBRID_TULIP_ORANGE_YELLOW = ITEMS.register("seeds_hybrid_tulip_orange_yellow",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_TULIP_ORANGE_YELLOW.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    
    public static final RegistryObject<Item> SEEDS_HYBRID_TULIP_PURPLE_YELLOW = ITEMS.register("seeds_hybrid_tulip_purple_yellow",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_TULIP_PURPLE_YELLOW.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    
    public static final RegistryObject<Item> SEEDS_HYBRID_TULIP_RAINBOW = ITEMS.register("seeds_hybrid_tulip_rainbow",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_TULIP_RAINBOW.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    
    public static final RegistryObject<Item> SEEDS_HYBRID_TULIP_RED_WHITE = ITEMS.register("seeds_hybrid_tulip_red_white",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_TULIP_RED_WHITE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    
    public static final RegistryObject<Item> SEEDS_HYBRID_TULIP_WHITE_PINK = ITEMS.register("seeds_hybrid_tulip_white_pink",
            ()-> new ItemNameBlockItem(ModBlocks.GROWING_HYBRID_TULIP_WHITE_PINK.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HYBRID_FLOWERS_TAB)));
    
    
    
    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
