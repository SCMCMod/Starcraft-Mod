package io.github.scmcmod.creativetabs;

import io.github.scmcmod.enums.MetaHandler;
import io.github.scmcmod.handlers.ItemHandler;
import io.github.scmcmod.init.StarCraftBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SCCreativeTabs {

	public static final CreativeTabs PROTOSS = new Tab("protoss", "tab_protoss") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(ItemHandler.ICON, 1, MetaHandler.IconType.PROTOSS.getID());
		}
	};

	public static final CreativeTabs TERRAN = new Tab("terran", "tab_terran") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(ItemHandler.ICON, 1, MetaHandler.IconType.TERRAN.getID());
		}
	};

	public static final CreativeTabs ZERG = new Tab("zerg", "tab_zerg") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(ItemHandler.ICON, 1, MetaHandler.IconType.ZERG.getID());
		}
	};
	public static final CreativeTabs MISC = new Tab("misc") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(ItemHandler.ENERGY, 1, 0);
		}
	};
	public static final CreativeTabs FLORA = new Tab("flora") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(StarCraftBlocks.FLORA_ZERUS_GLOW_POD, 1, 0);
		}
	};
	public static final CreativeTabs BOOKS = new Tab("books") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(ItemHandler.LOG, 1, 0);
		}
	};
}