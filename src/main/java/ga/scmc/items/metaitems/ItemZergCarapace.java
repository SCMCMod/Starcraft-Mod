package ga.scmc.items.metaitems;

import java.util.List;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.enums.EnumMetaItem.CarapaceType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemZergCarapace extends Item {

	/**
	 * Default constructor just sets the unlocalized name and the registry name
	 */
	public ItemZergCarapace() {
		setUnlocalizedName("zergICarapace");
		setRegistryName("zerg_icarapace");
		setHasSubtypes(true); // This just says the item has metadata
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}

	/**
	 * Adds all the different versions of the item
	 */
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		for(int i = 0; i < CarapaceType.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}

	/**
	 * Gets the correct unlocalized name using the {@link CarapaceTypeType} enum
	 */
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for(int i = 0; i < CarapaceType.values().length; i++) {
			if(stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + CarapaceType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + CarapaceType.T1.getName();
	}
}