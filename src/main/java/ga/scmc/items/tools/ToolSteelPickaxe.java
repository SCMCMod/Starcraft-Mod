package ga.scmc.items.tools;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ToolSteelPickaxe extends ItemPickaxe {

	public ToolSteelPickaxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName("steelPickaxe");
		setRegistryName("steel_pickaxe");
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}