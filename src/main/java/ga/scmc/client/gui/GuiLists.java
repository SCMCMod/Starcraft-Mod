package ga.scmc.client.gui;

import com.google.common.collect.ImmutableList;

import ga.scmc.client.gui.element.LarvaOption;
import ga.scmc.handlers.ArmorHandler;
import ga.scmc.handlers.BlockEnumHandler.NeosteelMetalType;
import ga.scmc.handlers.BlockEnumHandler.ParisteelMetalType;
import ga.scmc.handlers.ItemEnumHandler;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.MetaBlockHandler;
import ga.scmc.handlers.ToolHandler;
import ga.scmc.handlers.WeaponHandler;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class GuiLists {

	public static final ImmutableList<Product>[] TRADES;
	public static final ImmutableList<LarvaOption> LARVA_OPTIONS;

	static {
		TRADES = new ImmutableList[10];

		ImmutableList.Builder<Product> tab0 = ImmutableList.builder();
		tab0.add(new Product(new ItemStack(ItemHandler.C14_PARTS, 1, 0), 11, 6));
		tab0.add(new Product(new ItemStack(ItemHandler.C14_PARTS, 1, 1), 11, 6));
		tab0.add(new Product(new ItemStack(ItemHandler.C14_PARTS, 1, 2), 11, 6));
		tab0.add(new Product(new ItemStack(ItemHandler.BULLET, 1, 0), 6, 0));
		tab0.add(new Product(new ItemStack(Items.GUNPOWDER, 1, 0), 3, 0));
		tab0.add(new Product(new ItemStack(ItemHandler.INGOT, 1, 0), 1, 0));
		tab0.add(new Product(new ItemStack(ItemHandler.INGOT, 1, 1), 2, 0));
		tab0.add(new Product(new ItemStack(ItemHandler.INGOT, 1, 2), 3, 1));
		tab0.add(new Product(new ItemStack(ItemHandler.DUST, 1, ItemEnumHandler.DustType.CARBON.getID()), 1, 0));
		tab0.add(new Product(new ItemStack(ItemHandler.DUST, 1, ItemEnumHandler.DustType.IRON.getID()), 2, 0));
		tab0.add(new Product(new ItemStack(ItemHandler.DUST, 1, ItemEnumHandler.DustType.STEEL.getID()), 2, 1));
		tab0.add(new Product(new ItemStack(ItemHandler.GAS_CONTAINER, 1, ItemEnumHandler.ContainerType.TERRAN.getID()), 1, 0));
		TRADES[0] = tab0.build();

		ImmutableList.Builder<Product> tab1 = ImmutableList.builder();
		tab1.add(new Product(new ItemStack(MetaBlockHandler.GAS_COLLECTOR, 1, 1), 64, 16));
		TRADES[1] = tab1.build();

		ImmutableList.Builder<Product> tab2 = ImmutableList.builder();
		for (int i = 0; i < ParisteelMetalType.values().length; i++)
			tab2.add(new Product(new ItemStack(MetaBlockHandler.PARISTEEL_METAL, 1, i), 5, 0));
		for (int i = 0; i < NeosteelMetalType.values().length; i++)
			tab2.add(new Product(new ItemStack(MetaBlockHandler.NEOSTEEL_METAL, 1, i), 5, 0));
		TRADES[2] = tab2.build();

		ImmutableList.Builder<Product> tab3 = ImmutableList.builder();
		tab3.add(new Product(new ItemStack(ItemHandler.C14_GAUSS_RIFLE, 1, 0), 30, 15));
		tab3.add(new Product(new ItemStack(ItemHandler.FLAMETHROWER, 1, 0), 30, 15));
		tab3.add(new Product(new ItemStack(WeaponHandler.BALISONG, 1, 0), 16, 0));
		tab3.add(new Product(new ItemStack(WeaponHandler.MILITARY_KNIFE, 1, 0), 10, 1));
		tab3.add(new Product(new ItemStack(WeaponHandler.MONOMOLECULAR_BLADE, 1, 0), 32, 8));
		tab3.add(new Product(new ItemStack(WeaponHandler.COPPER_SWORD, 1, 0), 2, 0));
		tab3.add(new Product(new ItemStack(WeaponHandler.TITANIUM_SWORD, 1, 0), 3, 0));
		tab3.add(new Product(new ItemStack(WeaponHandler.STEEL_SWORD, 1, 0), 4, 0));
		TRADES[3] = tab3.build();

		ImmutableList.Builder<Product> tab4 = ImmutableList.builder();
		tab4.add(new Product(new ItemStack(ArmorHandler.COPPER_HELMET, 1, 0), 7, 0));
		tab4.add(new Product(new ItemStack(ArmorHandler.COPPER_CHESTPLATE, 1, 0), 10, 0));
		tab4.add(new Product(new ItemStack(ArmorHandler.COPPER_LEGGINGS, 1, 0), 8, 0));
		tab4.add(new Product(new ItemStack(ArmorHandler.COPPER_BOOTS, 1, 0), 6, 0));
		tab4.add(new Product(new ItemStack(ArmorHandler.TITANIUM_HELMET, 1, 0), 10, 0));
		tab4.add(new Product(new ItemStack(ArmorHandler.TITANIUM_CHESTPLATE, 1, 0), 16, 0));
		tab4.add(new Product(new ItemStack(ArmorHandler.TITANIUM_LEGGINGS, 1, 0), 14, 0));
		tab4.add(new Product(new ItemStack(ArmorHandler.TITANIUM_BOOTS, 1, 0), 8, 0));
		tab4.add(new Product(new ItemStack(ArmorHandler.STEEL_HELMET, 1, 0), 5, 0));
		tab4.add(new Product(new ItemStack(ArmorHandler.STEEL_CHESTPLATE, 1, 0), 8, 0));
		tab4.add(new Product(new ItemStack(ArmorHandler.STEEL_LEGGINGS, 1, 0), 7, 0));
		tab4.add(new Product(new ItemStack(ArmorHandler.STEEL_BOOTS, 1, 0), 5, 0));
		TRADES[4] = tab4.build();

		ImmutableList.Builder<Product> tab5 = ImmutableList.builder();
		tab5.add(new Product(new ItemStack(ToolHandler.COPPER_PICKAXE, 1, 0), 4, 0));
		tab5.add(new Product(new ItemStack(ToolHandler.COPPER_AXE, 1, 0), 4, 0));
		tab5.add(new Product(new ItemStack(ToolHandler.COPPER_SHOVEL, 1, 0), 4, 0));
		tab5.add(new Product(new ItemStack(ToolHandler.COPPER_HOE, 1, 0), 4, 0));
		tab5.add(new Product(new ItemStack(ToolHandler.TITANIUM_PICKAXE, 1, 0), 8, 0));
		tab5.add(new Product(new ItemStack(ToolHandler.TITANIUM_AXE, 1, 0), 8, 0));
		tab5.add(new Product(new ItemStack(ToolHandler.TITANIUM_SHOVEL, 1, 0), 8, 0));
		tab5.add(new Product(new ItemStack(ToolHandler.TITANIUM_HOE, 1, 0), 8, 0));
		tab5.add(new Product(new ItemStack(ToolHandler.STEEL_PICKAXE, 1, 0), 12, 2));
		tab5.add(new Product(new ItemStack(ToolHandler.STEEL_AXE, 1, 0), 12, 2));
		tab5.add(new Product(new ItemStack(ToolHandler.STEEL_SHOVEL, 1, 0), 12, 2));
		tab5.add(new Product(new ItemStack(ToolHandler.STEEL_HOE, 1, 0), 12, 2));
		TRADES[5] = tab5.build();

		ImmutableList.Builder<LarvaOption> larvaOptions = ImmutableList.builder();
		larvaOptions.add(new LarvaOption(0).setTooltip("Drone", ","));
		larvaOptions.add(new LarvaOption(1).setTooltip("Overlord", ","));
		larvaOptions.add(new LarvaOption(2).setTooltip("Zergling", ","));
		larvaOptions.add(new LarvaOption(3).setTooltip("Roach", ","));
		larvaOptions.add(new LarvaOption(4).setTooltip("Hydralisk", ","));
		larvaOptions.add(new LarvaOption(5).setTooltip("Investor", ","));
		larvaOptions.add(new LarvaOption(6).setTooltip("Swarm Host", ","));
		larvaOptions.add(new LarvaOption(7).setTooltip("Mutalisk", ","));
		LARVA_OPTIONS = larvaOptions.build();
	}

	public static class Product {

		private ItemStack stack;
		private int mineralCost;
		private int vespeneCost;

		public Product(ItemStack stack, int mineralCost, int vespeneCost) {
			this.stack = stack;
			this.mineralCost = mineralCost;
			this.vespeneCost = vespeneCost;
		}

		public ItemStack getStack() {
			return stack;
		}

		public int getMineralCost() {
			return mineralCost;
		}

		public int getVespeneCost() {
			return vespeneCost;
		}
	}
}
