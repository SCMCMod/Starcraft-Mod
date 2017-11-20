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
		COPPER_PICKAXE = new ToolPickaxe(ToolMaterials.COPPER).setUnlocalizedName("copper.pickaxe").setRegistryName("copper.pickaxe").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		COPPER_AXE = new ToolAxe(ToolMaterials.COPPER, 8, -3.2f).setUnlocalizedName("copper.axe").setRegistryName("copper.axe").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		COPPER_SHOVEL = new ToolShovel(ToolMaterials.COPPER).setUnlocalizedName("copper.shovel").setRegistryName("copper.shovel").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		COPPER_HOE = new ToolHoe(ToolMaterials.COPPER).setUnlocalizedName("copper.hoe").setRegistryName("copper.hoe").setCreativeTab(StarcraftCreativeTabs.TERRAN);

		TITANIUM_PICKAXE = new ToolPickaxe(ToolMaterials.TITANIUM).setUnlocalizedName("titanium.pickaxe").setRegistryName("titanium.pickaxe").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		TITANIUM_AXE = new ToolAxe(ToolMaterials.TITANIUM, 8, -3.2f).setUnlocalizedName("titanium.axe").setRegistryName("titanium.axe").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		TITANIUM_SHOVEL = new ToolShovel(ToolMaterials.TITANIUM).setUnlocalizedName("titanium.shovel").setRegistryName("titanium.shovel").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		TITANIUM_HOE = new ToolHoe(ToolMaterials.TITANIUM).setUnlocalizedName("titanium.hoe").setRegistryName("titanium.hoe").setCreativeTab(StarcraftCreativeTabs.TERRAN);

		STEEL_PICKAXE = new ToolPickaxe(ToolMaterials.STEEL).setUnlocalizedName("steel.pickaxe").setRegistryName("steel.pickaxe").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		STEEL_AXE = new ToolAxe(ToolMaterials.STEEL, 7, -3.1f).setUnlocalizedName("steel.axe").setRegistryName("steel.axe").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		STEEL_SHOVEL = new ToolShovel(ToolMaterials.STEEL).setUnlocalizedName("steel.shovel").setRegistryName("steel.shovel").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		STEEL_HOE = new ToolHoe(ToolMaterials.STEEL).setUnlocalizedName("steel.hoe").setRegistryName("steel.hoe").setCreativeTab(StarcraftCreativeTabs.TERRAN);
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