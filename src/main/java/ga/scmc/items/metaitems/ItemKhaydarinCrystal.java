package ga.scmc.items.metaitems;

import java.util.List;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.enums.EnumMetaItem.KhaydarinCrystalType;
import ga.scmc.handlers.MetaBlockHandler;
import ga.scmc.items.IItemCompressable;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * @author Ocelot5836
 */
public class ItemKhaydarinCrystal extends Item implements IItemCompressable {

	public ItemKhaydarinCrystal() {
		setUnlocalizedName("protoss.khaydarincrystal");
		setRegistryName("protoss.khaydarincrystal");
		setHasSubtypes(true);
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}

	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		for (int i = 0; i < KhaydarinCrystalType.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for (int i = 0; i < KhaydarinCrystalType.values().length; i++) {
			if (stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + KhaydarinCrystalType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + KhaydarinCrystalType.NORMAL.getName();
	}

	@Override
	public ItemStack getCompressedForm(int metadata) {
		if (metadata < KhaydarinCrystalType.values().length)
			return new ItemStack(MetaBlockHandler.KHAYDARIN_CRYSTAL_BLOCK, 1, 0);
		return null;
	}
}