package ga.scmc.creativetabs;

import ga.scmc.handlers.ItemHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class StarcraftCreativeTabMisc extends CreativeTabs{

	public StarcraftCreativeTabMisc() {
		super("misc");
		setBackgroundImageName("item_search.png");
	}

	@Override
	public Item getTabIconItem() {
		return ItemHandler.ENERGY;
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}
}
