package com.hypeirochus.scmc.items.metaitems;

import java.util.List;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.enums.EnumMetaItem.ProtossUpgradeType;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * @author Ocelot5836
 */
public class ItemProtossUpgrade extends Item {

	public ItemProtossUpgrade() {
		setUnlocalizedName("protoss.upgrade");
		setRegistryName("protoss.upgrade");
		setHasSubtypes(true);
		setMaxStackSize(1);
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}

	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		for (int i = 0; i < ProtossUpgradeType.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for (int i = 0; i < ProtossUpgradeType.values().length; i++) {
			if (stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + ProtossUpgradeType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + ProtossUpgradeType.SPEED.getName();
	}
}