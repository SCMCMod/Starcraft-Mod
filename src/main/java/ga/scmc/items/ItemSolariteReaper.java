package ga.scmc.items;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.material.WeaponMaterials;
import net.minecraft.item.ItemSword;

public class ItemSolariteReaper extends ItemSword {

	public ItemSolariteReaper() {
		super(WeaponMaterials.PSIBLADE_MATERIAL);
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
		setFull3D();
		setUnlocalizedName("solariteReaper");
		setRegistryName("solariteReaper");
		setMaxStackSize(1);
	}
}
