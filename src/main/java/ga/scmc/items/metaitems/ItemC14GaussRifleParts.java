package ga.scmc.items.metaitems;

import java.util.List;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.enums.EnumMetaItem.C14PartType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemC14GaussRifleParts extends Item {

	/**
	 * Default constructor just sets the unlocalized name and the registry name
	 */
	public ItemC14GaussRifleParts() {
		setUnlocalizedName("partC14");
		setRegistryName("part_c14");
		setHasSubtypes(true); // This just says the item has metadata
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}

	/**
	 * Adds all the different versions of the item
	 */
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		for(int i = 0; i < C14PartType.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}

	/**
	 * Gets the correct unlocalized name using the c14PartTypeType enum (wait, what?)
	 */
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for(int i = 0; i < C14PartType.values().length; i++) {
			if(stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + C14PartType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + C14PartType.BARREL.getName();
	}
}