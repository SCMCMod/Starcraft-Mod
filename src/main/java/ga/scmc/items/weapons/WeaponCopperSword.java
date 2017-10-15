package ga.scmc.items.weapons;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.item.ItemSword;

public class WeaponCopperSword extends ItemSword {
	public WeaponCopperSword(ToolMaterial material) {
		super(material);
		setUnlocalizedName("copperSword");
		setRegistryName("copper_sword");
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
