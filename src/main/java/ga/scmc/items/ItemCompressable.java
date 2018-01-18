package ga.scmc.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemCompressable extends Item implements IItemCompressable {

	private final ItemStack stack;

	public ItemCompressable(ItemStack stack) {
		this.stack = stack;
	}

	@Override
	public ItemStack getCompressedForm(int metadata) {
		if (metadata == 0)
			return stack;
		return null;
	}
}