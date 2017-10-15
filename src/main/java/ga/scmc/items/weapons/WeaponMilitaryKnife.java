package ga.scmc.items.weapons;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.item.ItemSword;

public class WeaponMilitaryKnife extends ItemSword {

	public WeaponMilitaryKnife(ToolMaterial material) {
		super(material);
		setUnlocalizedName("militaryKnife");
		setRegistryName("military_knife");
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}