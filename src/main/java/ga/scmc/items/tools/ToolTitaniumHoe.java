package ga.scmc.items.tools;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.item.ItemHoe;

public class ToolTitaniumHoe extends ItemHoe {

	public ToolTitaniumHoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName("titaniumHoe");
		setRegistryName("titanium_hoe");
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}