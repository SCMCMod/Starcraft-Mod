package ga.scmc.items.tools;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.item.ItemSpade;

public class ToolCopperShovel extends ItemSpade {

	public ToolCopperShovel(ToolMaterial material) {
		super(material);
		setUnlocalizedName("copperShovel");
		setRegistryName("copper_shovel");
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}