package ga.scmc.items;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.item.Item;

public class ItemCreepResin extends Item {

	public ItemCreepResin() {
		setUnlocalizedName("zergCreepResin");
		setRegistryName("zerg_creep_resin");
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}
}