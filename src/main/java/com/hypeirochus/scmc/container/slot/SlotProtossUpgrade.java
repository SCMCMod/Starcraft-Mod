package com.hypeirochus.scmc.container.slot;

import com.hypeirochus.scmc.items.ItemProtossUpgrade;

import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

/**
 * @author Ocelot5836
 */
public class SlotProtossUpgrade extends SlotItemHandler {

	private ItemStack[] validUpgrades;

	public SlotProtossUpgrade(IItemHandler itemHandler, int index, int xPosition, int yPosition, ItemStack... validUpgrades) {
		super(itemHandler, index, xPosition, yPosition);
		this.validUpgrades = validUpgrades;
	}

	@Override
	public boolean isItemValid(ItemStack stack) {
		for (int i = 0; i < validUpgrades.length; i++) {
			if (stack.getItem() == validUpgrades[i].getItem() && stack.getMetadata() == validUpgrades[i].getMetadata()) {
				return true;
			}
		}
		return stack.getItem() instanceof ItemProtossUpgrade;
	}
}