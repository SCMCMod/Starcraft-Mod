package ga.scmc.creativetabs;

import ga.scmc.handlers.ItemHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class StarcraftCreativeTabZerg extends CreativeTabs {

	public StarcraftCreativeTabZerg() {
		super("zerg");
		setBackgroundImageName("item_search_zerg.png");
	}

	@Override
	public Item getTabIconItem() {
		return ItemHandler.ICON_ZERG;
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}
}