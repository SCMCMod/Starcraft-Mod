package ga.scmc.items;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemSolariteReaper extends ItemSword {

	public ItemSolariteReaper() {
		super(ToolMaterial.DIAMOND);
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
		setFull3D();
		setUnlocalizedName("solariteReaper");
		setRegistryName("solariteReaper");
		setMaxStackSize(1);
	}
}
