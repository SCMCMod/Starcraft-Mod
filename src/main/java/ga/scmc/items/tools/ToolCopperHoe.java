package ga.scmc.items.tools;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.item.ItemHoe;

public class ToolCopperHoe extends ItemHoe {

	public ToolCopperHoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName("copperHoe");
		setRegistryName("copper_hoe");
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}