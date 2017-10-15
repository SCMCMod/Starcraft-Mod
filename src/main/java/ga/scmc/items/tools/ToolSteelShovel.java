package ga.scmc.items.tools;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.item.ItemSpade;

public class ToolSteelShovel extends ItemSpade {

	public ToolSteelShovel(ToolMaterial material) {
		super(material);
		setUnlocalizedName("steelShovel");
		setRegistryName("steel_shovel");
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}