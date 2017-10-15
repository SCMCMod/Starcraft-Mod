package ga.scmc.items.weapons;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.item.ItemSword;

public class WeaponSteelSword extends ItemSword {

	public WeaponSteelSword(ToolMaterial material) {
		super(material);
		setUnlocalizedName("steelSword");
		setRegistryName("steel_sword");
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}