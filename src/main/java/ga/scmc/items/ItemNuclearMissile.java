package ga.scmc.items;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.item.Item;

/**
 * @since 5.1
 * @author Ocelot5836
 */
public class ItemNuclearMissile extends Item {

	public ItemNuclearMissile() {
		super();
		setUnlocalizedName("nuclearMissile");
		setRegistryName("nuclear_missile");
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}
}