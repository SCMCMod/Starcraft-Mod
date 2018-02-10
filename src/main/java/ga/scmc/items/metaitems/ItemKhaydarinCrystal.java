package ga.scmc.items.metaitems;

import java.util.List;

import ga.scmc.blocks.metablocks.BlockPylonCrystal;
import ga.scmc.blocks.metablocks.BlockPylonCrystal.PylonCrystalType;
import ga.scmc.creativetabs.StarcraftCreativeTabs;
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
		for (int i = 0; i < BlockPylonCrystal.PylonCrystalType.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for (int i = 0; i < BlockPylonCrystal.PylonCrystalType.values().length; i++) {
			if (stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + BlockPylonCrystal.PylonCrystalType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + PylonCrystalType.PURE.getName();
	}

	@Override
	public ItemStack getCompressedForm(int metadata) {
		if (metadata < BlockPylonCrystal.PylonCrystalType.values().length)
			return new ItemStack(MetaBlockHandler.PYLON_CRYSTAL, 1, metadata);
		return null;
	}
}