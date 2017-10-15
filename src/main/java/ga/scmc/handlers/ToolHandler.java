package ga.scmc.handlers;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.items.tools.ToolAxe;
import ga.scmc.items.tools.ToolHoe;
import ga.scmc.items.tools.ToolPickaxe;
import ga.scmc.items.tools.ToolShovel;
import ga.scmc.lib.LogHelper;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
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
	
	
	public static final ToolMaterial COPPER = EnumHelper.addToolMaterial("COPPER", 1, 190, 4.5F, 1.0F, 10);
	public static final ToolMaterial TITANIUM = EnumHelper.addToolMaterial("TITANIUM", 2, 502, 5.5F, 2.0F, 10);
	public static final ToolMaterial STEEL = EnumHelper.addToolMaterial("STEEL", 2, 753, 6.5F, 3.0F, 10);
	public static final ToolMaterial VANADIUM = EnumHelper.addToolMaterial("VANADIUM", 3, 966, 7.3F, 4.0F, 10);

	public static void init() {
		COPPER_PICKAXE = new ToolPickaxe(COPPER).setUnlocalizedName("copperPickaxe").setRegistryName("copper_pickaxe").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		COPPER_AXE = new ToolAxe(COPPER, 8, -3.2f).setUnlocalizedName("copperAxe").setRegistryName("copper_axe").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		COPPER_SHOVEL = new ToolShovel(COPPER).setUnlocalizedName("copperShovel").setRegistryName("copper_shovel").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		COPPER_HOE = new ToolHoe(COPPER).setUnlocalizedName("copperHoe").setRegistryName("copper_hoe").setCreativeTab(StarcraftCreativeTabs.TERRAN);

		TITANIUM_PICKAXE = new ToolPickaxe(TITANIUM).setUnlocalizedName("titaniumPickaxe").setRegistryName("titanium_pickaxe").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		TITANIUM_AXE = new ToolAxe(TITANIUM, 8, -3.2f).setUnlocalizedName("titaniumAxe").setRegistryName("titanium_axe").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		TITANIUM_SHOVEL = new ToolShovel(TITANIUM).setUnlocalizedName("titaniumShovel").setRegistryName("titanium_shovel").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		TITANIUM_HOE = new ToolHoe(TITANIUM).setUnlocalizedName("titaniumHoe").setRegistryName("titanium_hoe").setCreativeTab(StarcraftCreativeTabs.TERRAN);

		STEEL_PICKAXE = new ToolPickaxe(STEEL).setUnlocalizedName("steelPickaxe").setRegistryName("steel_pickaxe").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		STEEL_AXE = new ToolAxe(STEEL, 7, -3.1f).setUnlocalizedName("steelAxe").setRegistryName("steel_axe").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		STEEL_SHOVEL = new ToolShovel(STEEL).setUnlocalizedName("steelShovel").setRegistryName("steel_shovel").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		STEEL_HOE = new ToolHoe(STEEL).setUnlocalizedName("steelHoe").setRegistryName("steel_hoe").setCreativeTab(StarcraftCreativeTabs.TERRAN);
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
		if(ConfigurationHandler.BOOL_DEBUG_MODE_ENABLED == true) {
			LogHelper.logger.info("Registered Tool: " + item.getUnlocalizedName().substring(5));
		}
	}
}