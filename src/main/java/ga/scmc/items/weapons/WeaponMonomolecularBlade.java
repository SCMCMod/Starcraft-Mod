package ga.scmc.items.weapons;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.item.ItemSword;

public class WeaponMonomolecularBlade extends ItemSword {

	public WeaponMonomolecularBlade(ToolMaterial material) {
		super(material);
		setUnlocalizedName("monomolecularBlade");
		setRegistryName("monomolecular_blade");
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}