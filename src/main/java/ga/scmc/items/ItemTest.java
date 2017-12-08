package ga.scmc.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemTest extends Item {

	public ItemTest() {
		setUnlocalizedName("test.item");
		setRegistryName("test.item");
		setCreativeTab(null);
	}
	
	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}
}