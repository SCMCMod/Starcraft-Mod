package ga.scmc.items.tools;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ToolCopperPickaxe extends ItemPickaxe {

	public ToolCopperPickaxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName("copperPickaxe");
		setRegistryName("copper_pickaxe");
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}