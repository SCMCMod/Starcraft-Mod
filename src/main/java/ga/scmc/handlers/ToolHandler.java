package ga.scmc.handlers;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.items.tools.ToolAxe;
import ga.scmc.items.tools.ToolHoe;
import ga.scmc.items.tools.ToolPickaxe;
import ga.scmc.items.tools.ToolShovel;
import ga.scmc.material.ToolMaterials;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Handles the tool registration and renders.
 */
public class ToolHandler {

	public static Item COPPER_AXE;
	public static Item COPPER_HOE;
	public static Item COPPER_PICKAXE;
	public static Item COPPER_SHOVEL;
	
	public static Item STEEL_AXE;
	public static Item STEEL_HOE;
	public static Item STEEL_PICKAXE;
	public static Item STEEL_SHOVEL;
	
	public static Item TITANIUM_AXE;
	public static Item TITANIUM_HOE;
	public static Item TITANIUM_PICKAXE;
	public static Item TITANIUM_SHOVEL;

	public static void init() {
		COPPER_PICKAXE = new ToolPickaxe(ToolMaterials.COPPER).setUnlocalizedName("copperPickaxe").setRegistryName("copper_pickaxe").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		COPPER_AXE = new ToolAxe(ToolMaterials.COPPER, 8, -3.2f).setUnlocalizedName("copperAxe").setRegistryName("copper_axe").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		COPPER_SHOVEL = new ToolShovel(ToolMaterials.COPPER).setUnlocalizedName("copperShovel").setRegistryName("copper_shovel").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		COPPER_HOE = new ToolHoe(ToolMaterials.COPPER).setUnlocalizedName("copperHoe").setRegistryName("copper_hoe").setCreativeTab(StarcraftCreativeTabs.TERRAN);

		TITANIUM_PICKAXE = new ToolPickaxe(ToolMaterials.TITANIUM).setUnlocalizedName("titaniumPickaxe").setRegistryName("titanium_pickaxe").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		TITANIUM_AXE = new ToolAxe(ToolMaterials.TITANIUM, 8, -3.2f).setUnlocalizedName("titaniumAxe").setRegistryName("titanium_axe").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		TITANIUM_SHOVEL = new ToolShovel(ToolMaterials.TITANIUM).setUnlocalizedName("titaniumShovel").setRegistryName("titanium_shovel").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		TITANIUM_HOE = new ToolHoe(ToolMaterials.TITANIUM).setUnlocalizedName("titaniumHoe").setRegistryName("titanium_hoe").setCreativeTab(StarcraftCreativeTabs.TERRAN);

		STEEL_PICKAXE = new ToolPickaxe(ToolMaterials.STEEL).setUnlocalizedName("steelPickaxe").setRegistryName("steel_pickaxe").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		STEEL_AXE = new ToolAxe(ToolMaterials.STEEL, 7, -3.1f).setUnlocalizedName("steelAxe").setRegistryName("steel_axe").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		STEEL_SHOVEL = new ToolShovel(ToolMaterials.STEEL).setUnlocalizedName("steelShovel").setRegistryName("steel_shovel").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		STEEL_HOE = new ToolHoe(ToolMaterials.STEEL).setUnlocalizedName("steelHoe").setRegistryName("steel_hoe").setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}

	public static void register() {
		registerItem(COPPER_PICKAXE);
		registerItem(COPPER_AXE);
		registerItem(COPPER_SHOVEL);
		registerItem(COPPER_HOE);

		registerItem(TITANIUM_PICKAXE);
		registerItem(TITANIUM_AXE);
		registerItem(TITANIUM_SHOVEL);
		registerItem(TITANIUM_HOE);

		registerItem(STEEL_PICKAXE);
		registerItem(STEEL_AXE);
		registerItem(STEEL_SHOVEL);
		registerItem(STEEL_HOE);
	}

	public static void registerItem(Item item) {
		GameRegistry.register(item);
	}
}