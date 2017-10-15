package ga.scmc.items.tools;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.item.ItemSpade;

public class ToolTitaniumShovel extends ItemSpade {

	public ToolTitaniumShovel(ToolMaterial material) {
		super(material);
		setUnlocalizedName("titaniumShovel");
		setRegistryName("titanium_shovel");
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}