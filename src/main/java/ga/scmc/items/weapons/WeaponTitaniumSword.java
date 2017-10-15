package ga.scmc.items.weapons;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.item.ItemSword;

public class WeaponTitaniumSword extends ItemSword {

	public WeaponTitaniumSword(ToolMaterial material) {
		super(material);
		setUnlocalizedName("titaniumSword");
		setRegistryName("titanium_sword");
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}