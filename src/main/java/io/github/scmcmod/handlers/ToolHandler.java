package io.github.scmcmod.handlers;

import io.github.scmcmod.creativetabs.SCCreativeTabs;
import io.github.scmcmod.items.tools.ToolAxe;
import io.github.scmcmod.items.tools.ToolHoe;
import io.github.scmcmod.items.tools.ToolPickaxe;
import io.github.scmcmod.items.tools.ToolShovel;
import io.github.scmcmod.material.ToolMaterials;
import net.minecraft.item.Item;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * Handles the tool registration and renders.
 */
public class ToolHandler
{

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

	public static void init()
	{
		instantiate();
		register();
	}

	private static void instantiate()
	{
		COPPER_PICKAXE = new ToolPickaxe(ToolMaterials.COPPER).setTranslationKey("copper.pickaxe").setRegistryName("copper.pickaxe").setCreativeTab(SCCreativeTabs.TERRAN);
		COPPER_AXE = new ToolAxe(ToolMaterials.COPPER, 8, -3.2f).setTranslationKey("copper.axe").setRegistryName("copper.axe").setCreativeTab(SCCreativeTabs.TERRAN);
		COPPER_SHOVEL = new ToolShovel(ToolMaterials.COPPER).setTranslationKey("copper.shovel").setRegistryName("copper.shovel").setCreativeTab(SCCreativeTabs.TERRAN);
		COPPER_HOE = new ToolHoe(ToolMaterials.COPPER).setTranslationKey("copper.hoe").setRegistryName("copper.hoe").setCreativeTab(SCCreativeTabs.TERRAN);

		TITANIUM_PICKAXE = new ToolPickaxe(ToolMaterials.TITANIUM).setTranslationKey("titanium.pickaxe").setRegistryName("titanium.pickaxe").setCreativeTab(SCCreativeTabs.TERRAN);
		TITANIUM_AXE = new ToolAxe(ToolMaterials.TITANIUM, 8, -3.2f).setTranslationKey("titanium.axe").setRegistryName("titanium.axe").setCreativeTab(SCCreativeTabs.TERRAN);
		TITANIUM_SHOVEL = new ToolShovel(ToolMaterials.TITANIUM).setTranslationKey("titanium.shovel").setRegistryName("titanium.shovel").setCreativeTab(SCCreativeTabs.TERRAN);
		TITANIUM_HOE = new ToolHoe(ToolMaterials.TITANIUM).setTranslationKey("titanium.hoe").setRegistryName("titanium.hoe").setCreativeTab(SCCreativeTabs.TERRAN);

		STEEL_PICKAXE = new ToolPickaxe(ToolMaterials.STEEL).setTranslationKey("steel.pickaxe").setRegistryName("steel.pickaxe").setCreativeTab(SCCreativeTabs.TERRAN);
		STEEL_AXE = new ToolAxe(ToolMaterials.STEEL, 7, -3.1f).setTranslationKey("steel.axe").setRegistryName("steel.axe").setCreativeTab(SCCreativeTabs.TERRAN);
		STEEL_SHOVEL = new ToolShovel(ToolMaterials.STEEL).setTranslationKey("steel.shovel").setRegistryName("steel.shovel").setCreativeTab(SCCreativeTabs.TERRAN);
		STEEL_HOE = new ToolHoe(ToolMaterials.STEEL).setTranslationKey("steel.hoe").setRegistryName("steel.hoe").setCreativeTab(SCCreativeTabs.TERRAN);
	}

	public static void register()
	{
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

	public static void registerItem(Item item)
	{
		ItemHandler.register(item);
	}
}