package com.moonrez.hybrid_flowers.misc;

import com.moonrez.hybrid_flowers.block.ModBlocks;
import com.moonrez.hybrid_flowers.item.ModItems;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeModeTab
{
	public static final CreativeModeTab HYBRID_FLOWERS_TAB = new CreativeModeTab("hybrid_flowers_tab")
	{
		@Override
		public ItemStack makeIcon()
		{
			return new ItemStack(ModBlocks.HYBRID_TULIP_RAINBOW.get().asItem());
		}
		
		// this sorts the inventory tab
		@Override
		public void fillItemList(NonNullList<ItemStack> pItems)
		{
			super.fillItemList(pItems);
			
			// sort alphabetically, I guess?
			// using a basic bubble sort
			int iterations = pItems.size() - 1;
			boolean wasChange = true;
			for (int i = 0; i < iterations && wasChange; i++)
			{
				wasChange = false;
				for (int j = 0; j < iterations - i; j++)
				{
					String item1 = pItems.get(j).getItem().getRegistryName().toString();
					String item2 = pItems.get(j + 1).getItem().getRegistryName().toString();
					
					if (item1.compareTo(item2) > 0)
					{
						// swap
						ItemStack temp = pItems.get(j);
						pItems.set(j,pItems.get(j+1));
						pItems.set(j+1,temp);
						
						wasChange = true;
					}
				}
			}
		}
	};
}
