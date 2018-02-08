package ga.scmc.items.metaitems;

import java.util.List;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.enums.EnumMetaItem.FlamethrowerPartType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemFlamethrowerParts extends Item {

	/**
	 * Default constructor just sets the unlocalized name and the registry name
	 */
	public ItemFlamethrowerParts() {
		setUnlocalizedName("flamethrower.part");
		setRegistryName("flamethrower.part");
		setHasSubtypes(true);
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}

	/**
	 * Adds all the different versions of the item
	 */
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		for (int i = 0; i < FlamethrowerPartType.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}

	/**
	 * Gets the correct unlocalized name using the FlamethrowerPartTypeType enum
	 * (wait, what?)
	 */
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for (int i = 0; i < FlamethrowerPartType.values().length; i++) {
			if (stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + FlamethrowerPartType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + FlamethrowerPartType.NOZZLE.getName();
	}
}