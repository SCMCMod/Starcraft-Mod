package ga.scmc.items.metaitems;

import java.util.List;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.handlers.ItemEnumHandler.BulletType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBullet extends Item {

	/**
	 * Default constructor just sets the unlocalized name and the registry name
	 * @param unlocalizedName
	 */
	public ItemBullet() {
		setUnlocalizedName("bulletC14");
		setRegistryName("bullet_c14");
		setHasSubtypes(true); // This just says the item has metadata
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}

	/**
	 * Adds all the different versions of the item
	 */
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		for(int i = 0; i < BulletType.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}

	/**
	 * Gets the correct unlocalized name using the {@link BulletType} enum
	 */
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for(int i = 0; i < BulletType.values().length; i++) {
			if(stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + BulletType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + BulletType.C14.getName();
	}
}