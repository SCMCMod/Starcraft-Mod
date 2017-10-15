package ga.scmc.items;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.item.Item;

public class ItemOrganicTissue extends Item {

	public ItemOrganicTissue() {
		super();
		setUnlocalizedName("zergOrganicTissue");
		setRegistryName("zerg_organic_tissue");
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}
}