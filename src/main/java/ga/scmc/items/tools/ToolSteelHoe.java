package ga.scmc.items.tools;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.item.ItemHoe;

public class ToolSteelHoe extends ItemHoe {

	public ToolSteelHoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName("steelHoe");
		setRegistryName("steel_hoe");
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}