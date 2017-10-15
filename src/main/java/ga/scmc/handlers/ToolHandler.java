package ga.scmc.handlers;

import ga.scmc.items.tools.ToolCopperAxe;
import ga.scmc.items.tools.ToolCopperHoe;
import ga.scmc.items.tools.ToolCopperPickaxe;
import ga.scmc.items.tools.ToolCopperShovel;
import ga.scmc.items.tools.ToolSteelAxe;
import ga.scmc.items.tools.ToolSteelHoe;
import ga.scmc.items.tools.ToolSteelPickaxe;
import ga.scmc.items.tools.ToolSteelShovel;
import ga.scmc.items.tools.ToolTitaniumAxe;
import ga.scmc.items.tools.ToolTitaniumHoe;
import ga.scmc.items.tools.ToolTitaniumPickaxe;
import ga.scmc.items.tools.ToolTitaniumShovel;
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

	public static final ToolMaterial BLUEMINERAL = EnumHelper.addToolMaterial("BLUEMINERAL", 2, 288, 4.7F, 1.5F, 10);
	public static final ToolMaterial COPPER = EnumHelper.addToolMaterial("COPPER", 1, 190, 4.5F, 1.0F, 10);
	public static Item COPPER_AXE;
	public static Item COPPER_HOE;
	public static Item COPPER_PICKAXE;
	public static Item COPPER_SHOVEL;
	public static final ToolMaterial KERATIN = EnumHelper.addToolMaterial("KERATIN", 2, 564, 5.8F, 2.5F, 10);
	public static final ToolMaterial NEOSTEEL = EnumHelper.addToolMaterial("NEOSTEEL", 2, 867, 6.5F, 3.5F, 10);

	public static final ToolMaterial ORANGEMINERAL = EnumHelper.addToolMaterial("ORANGEMINERAL", 2, 362, 5.0F, 1.8F, 10);
	public static final ToolMaterial STEEL = EnumHelper.addToolMaterial("STEEL", 2, 753, 6.5F, 3.0F, 10);
	public static Item STEEL_AXE;
	public static Item STEEL_HOE;

	public static Item STEEL_PICKAXE;
	public static Item STEEL_SHOVEL;
	public static final ToolMaterial TITANIUM = EnumHelper.addToolMaterial("TITANIUM", 2, 502, 5.5F, 2.0F, 10);
	public static Item TITANIUM_AXE;

	public static Item TITANIUM_HOE;
	public static Item TITANIUM_PICKAXE;
	public static Item TITANIUM_SHOVEL;
	public static final ToolMaterial VANADIUM = EnumHelper.addToolMaterial("VANADIUM", 3, 966, 7.3F, 4.0F, 10);

	public static void init() {
		COPPER_PICKAXE = new ToolCopperPickaxe(COPPER);
		COPPER_AXE = new ToolCopperAxe(COPPER);
		COPPER_SHOVEL = new ToolCopperShovel(COPPER);
		COPPER_HOE = new ToolCopperHoe(COPPER);

		TITANIUM_PICKAXE = new ToolTitaniumPickaxe(TITANIUM);
		TITANIUM_AXE = new ToolTitaniumAxe(TITANIUM);
		TITANIUM_SHOVEL = new ToolTitaniumShovel(TITANIUM);
		TITANIUM_HOE = new ToolTitaniumHoe(TITANIUM);

		STEEL_PICKAXE = new ToolSteelPickaxe(STEEL);
		STEEL_AXE = new ToolSteelAxe(STEEL);
		STEEL_SHOVEL = new ToolSteelShovel(STEEL);
		STEEL_HOE = new ToolSteelHoe(STEEL);
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