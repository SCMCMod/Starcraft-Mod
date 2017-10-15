package ga.scmc.items.tools;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ToolTitaniumPickaxe extends ItemPickaxe {

	public ToolTitaniumPickaxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName("titaniumPickaxe");
		setRegistryName("titanium_pickaxe");
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}