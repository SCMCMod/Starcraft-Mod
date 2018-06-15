package com.hypeirochus.scmc.config;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.hypeirochus.scmc.Starcraft;
import com.hypeirochus.scmc.config.category.CategoryEntryDimensionIds;
import com.hypeirochus.scmc.config.category.CategoryEntryGeneral;
import com.hypeirochus.scmc.config.category.CategoryEntryMobSpawning;

import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * The new and improved class to handle all the config. Has a gui factory to set the configuration options with.
 * 
 * @author Ocelot5836
 */
//TODO: Rework this. We shouldn't be setting dimension ID's statically.
public class StarcraftConfig {

	public static List<Category> categories = new ArrayList<Category>();

	private static Configuration config = null;

	public static final String CATEGORY_NAME_GENERAL = registerCategory(new Category("general", CategoryEntryGeneral.class));
	public static final String CATEGORY_NAME_DIMENSION_IDS = registerCategory(new Category("dimension.ids", CategoryEntryDimensionIds.class));
	public static final String CATEGORY_NAME_MOB_OPTIONS = registerCategory(new Category("mob.options", CategoryEntryMobSpawning.class));

	public static int INT_DIMENSION_CHAR = 2;
	public static int INT_DIMENSION_SHAKURAS = 3;
	public static int INT_DIMENSION_SLAYN = 4;
	public static int INT_DIMENSION_KORHAL = 5;
	public static int INT_DIMENSION_KALDIR = 6;
	public static int INT_DIMENSION_AIUR = 7;
	public static int INT_DIMENSION_ZERUS = 8;
	public static int INT_DIMENSION_SPACE = 9;

	public static boolean BOOL_VANILLA_MOB_SPAWNING_DISABLED = false;
	public static boolean BOOL_IS_DARK_TEMPLAR_VISIBLE = false;
	public static boolean BOOL_CREEP_CAN_SPREAD = true;

	public static int INT_CREEP_SPREAD_BASE_VALUE = 1;

	public static void pre(FMLPreInitializationEvent event) {
		File configFile = new File(Loader.instance().getConfigDir(), "Starcraft.cfg");
		config = new Configuration(configFile);
		syncFromFiles();
	}

	public static void clientPre(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new ConfigEventHandler());
	}

	public static void syncFromFiles() {
		syncConfig(true, true);
	}

	public static void syncFromGui() {
		syncConfig(false, true);
	}

	public static void syncFromGuiFields() {
		syncConfig(false, false);
	}

	private static void syncConfig(boolean loadFromConfigFile, boolean readFieldsFromConfig) {
		if (loadFromConfigFile) {
			config.load();
		}

		Property propertyCreepCanSpread = config.get(CATEGORY_NAME_GENERAL, "block.creep.spread", FactorySettings.BOOL_CREEP_CAN_SPREAD);
		propertyCreepCanSpread.setLanguageKey("gui.starcraft.config.block.creep.spread.name");
		propertyCreepCanSpread.setComment(I18n.format("gui.starcraft.config.block.creep.spread.comment"));

		Property propertyCreepSpreadBaseValue = config.get(CATEGORY_NAME_GENERAL, "block.creep.spread.base", FactorySettings.INT_CREEP_SPREAD_BASE_VALUE);
		propertyCreepSpreadBaseValue.setLanguageKey("gui.starcraft.config.block.creep.spread.base.name");
		propertyCreepSpreadBaseValue.setComment(I18n.format("gui.starcraft.config.block.creep.spread.base.comment"));
		propertyCreepSpreadBaseValue.setMinValue(0);
		propertyCreepSpreadBaseValue.setMaxValue(16);

		Property propertyDimIdChar = config.get(CATEGORY_NAME_DIMENSION_IDS, "dimension.char.id", FactorySettings.INT_DIMENSION_CHAR);
		propertyDimIdChar.setLanguageKey("gui.starcraft.config.dimension.char.id.name");
		propertyDimIdChar.setComment(I18n.format("gui.starcraft.config.dimension.char.id.comment"));

		Property propertyDimIdShakuras = config.get(CATEGORY_NAME_DIMENSION_IDS, "dimension.shakuras.id", FactorySettings.INT_DIMENSION_SHAKURAS);
		propertyDimIdShakuras.setLanguageKey("gui.starcraft.config.dimension.shakuras.id.name");
		propertyDimIdShakuras.setComment(I18n.format("gui.starcraft.config.dimension.shakuras.id.comment"));

		Property propertyDimIdSlayn = config.get(CATEGORY_NAME_DIMENSION_IDS, "dimension.slayn.id", FactorySettings.INT_DIMENSION_SLAYN);
		propertyDimIdSlayn.setLanguageKey("gui.starcraft.config.dimension.slayn.id.name");
		propertyDimIdSlayn.setComment(I18n.format("gui.starcraft.config.dimension.slayn.id.comment"));

		Property propertyDimIdKorhal = config.get(CATEGORY_NAME_DIMENSION_IDS, "dimension.korhal.id", FactorySettings.INT_DIMENSION_KORHAL);
		propertyDimIdKorhal.setLanguageKey("gui.starcraft.config.dimension.korhal.id.name");
		propertyDimIdKorhal.setComment(I18n.format("gui.starcraft.config.dimension.korhal.id.comment"));

		Property propertyDimIdKaldir = config.get(CATEGORY_NAME_DIMENSION_IDS, "dimension.kaldir.id", FactorySettings.INT_DIMENSION_KALDIR);
		propertyDimIdKaldir.setLanguageKey("gui.starcraft.config.dimension.kaldir.id.name");
		propertyDimIdKaldir.setComment(I18n.format("gui.starcraft.config.dimension.kaldir.id.comment"));

		Property propertyDimIdAiur = config.get(CATEGORY_NAME_DIMENSION_IDS, "dimension.aiur.id", FactorySettings.INT_DIMENSION_AIUR);
		propertyDimIdAiur.setLanguageKey("gui.starcraft.config.dimension.aiur.id.name");
		propertyDimIdAiur.setComment(I18n.format("gui.starcraft.config.dimension.aiur.id.comment"));

		Property propertyDimIdZerus = config.get(CATEGORY_NAME_DIMENSION_IDS, "dimension.zerus.id", FactorySettings.INT_DIMENSION_ZERUS);
		propertyDimIdZerus.setLanguageKey("gui.starcraft.config.dimension.zerus.id.name");
		propertyDimIdZerus.setComment(I18n.format("gui.starcraft.config.dimension.zerus.id.comment"));

		Property propertyDimIdSpace = config.get(CATEGORY_NAME_DIMENSION_IDS, "dimension.space.id", FactorySettings.INT_DIMENSION_SPACE);
		propertyDimIdSpace.setLanguageKey("gui.starcraft.config.dimension.space.id.name");
		propertyDimIdSpace.setComment(I18n.format("gui.starcraft.config.dimension.space.id.comment"));

		Property propertyDisableVanillaMobSpawning = config.get(CATEGORY_NAME_MOB_OPTIONS, "vanilla.mob.spawn", FactorySettings.BOOL_VANILLA_MOB_SPAWNING_DISABLED);
		propertyDisableVanillaMobSpawning.setLanguageKey("gui.starcraft.config.vanilla.mob.spawn.name");
		propertyDisableVanillaMobSpawning.setComment(I18n.format("gui.starcraft.config.vanilla.mob.spawn.comment"));

		Property propertyDarkTeplarVisible = config.get(CATEGORY_NAME_MOB_OPTIONS, "starcraft.templar.dark.visible", FactorySettings.BOOL_IS_DARK_TEMPLAR_VISIBLE);
		propertyDarkTeplarVisible.setLanguageKey("gui.starcraft.config.starcraft.templar.dark.visible.name");
		propertyDarkTeplarVisible.setComment(I18n.format("gui.starcraft.config.starcraft.templar.dark.visible.comment"));

		List<String> propertyOrderGeneral = new ArrayList<String>();
		propertyOrderGeneral.add(propertyCreepCanSpread.getName());
		propertyOrderGeneral.add(propertyCreepSpreadBaseValue.getName());
		config.setCategoryPropertyOrder(CATEGORY_NAME_GENERAL, propertyOrderGeneral);

		List<String> propertyOrderDimensionIds = new ArrayList<String>();
		propertyOrderDimensionIds.add(propertyDimIdChar.getName());
		propertyOrderDimensionIds.add(propertyDimIdShakuras.getName());
		propertyOrderDimensionIds.add(propertyDimIdSlayn.getName());
		propertyOrderDimensionIds.add(propertyDimIdKorhal.getName());
		propertyOrderDimensionIds.add(propertyDimIdKaldir.getName());
		propertyOrderDimensionIds.add(propertyDimIdAiur.getName());
		propertyOrderDimensionIds.add(propertyDimIdZerus.getName());
		propertyOrderDimensionIds.add(propertyDimIdSpace.getName());
		config.setCategoryPropertyOrder(CATEGORY_NAME_DIMENSION_IDS, propertyOrderDimensionIds);

		List<String> propertyOrderMobOptions = new ArrayList<String>();
		propertyOrderMobOptions.add(propertyDisableVanillaMobSpawning.getName());
		propertyOrderMobOptions.add(propertyDarkTeplarVisible.getName());
		config.setCategoryPropertyOrder(CATEGORY_NAME_MOB_OPTIONS, propertyOrderMobOptions);

		if (readFieldsFromConfig) {
			BOOL_CREEP_CAN_SPREAD = propertyCreepCanSpread.getBoolean();
			INT_CREEP_SPREAD_BASE_VALUE = propertyCreepSpreadBaseValue.getInt();
			INT_DIMENSION_CHAR = propertyDimIdChar.getInt();
			INT_DIMENSION_SHAKURAS = propertyDimIdShakuras.getInt();
			INT_DIMENSION_SLAYN = propertyDimIdSlayn.getInt();
			INT_DIMENSION_KORHAL = propertyDimIdKorhal.getInt();
			INT_DIMENSION_KALDIR = propertyDimIdKaldir.getInt();
			INT_DIMENSION_AIUR = propertyDimIdAiur.getInt();
			INT_DIMENSION_ZERUS = propertyDimIdZerus.getInt();
			INT_DIMENSION_SPACE = propertyDimIdSpace.getInt();
			BOOL_VANILLA_MOB_SPAWNING_DISABLED = propertyDisableVanillaMobSpawning.getBoolean();
			BOOL_IS_DARK_TEMPLAR_VISIBLE = propertyDarkTeplarVisible.getBoolean();
		}

		propertyCreepCanSpread.set(BOOL_CREEP_CAN_SPREAD);
		propertyCreepSpreadBaseValue.set(INT_CREEP_SPREAD_BASE_VALUE);
		propertyDimIdChar.set(INT_DIMENSION_CHAR);
		propertyDimIdShakuras.set(INT_DIMENSION_SHAKURAS);
		propertyDimIdSlayn.set(INT_DIMENSION_SLAYN);
		propertyDimIdKorhal.set(INT_DIMENSION_KORHAL);
		propertyDimIdKaldir.set(INT_DIMENSION_KALDIR);
		propertyDimIdAiur.set(INT_DIMENSION_AIUR);
		propertyDimIdZerus.set(INT_DIMENSION_ZERUS);
		propertyDimIdSpace.set(INT_DIMENSION_SPACE);
		propertyDisableVanillaMobSpawning.set(BOOL_VANILLA_MOB_SPAWNING_DISABLED);
		propertyDarkTeplarVisible.set(BOOL_IS_DARK_TEMPLAR_VISIBLE);

		if (config.hasChanged()) {
			config.save();
		}
	}

	private static class ConfigEventHandler {
		@SubscribeEvent(priority = EventPriority.LOWEST)
		public void onEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
			if (event.getModID().equals(Starcraft.MOD_ID)) {
				syncFromGui();
			}
		}
	}

	private static String registerCategory(Category category) {
		categories.add(category);
		return category.getName();
	}

	public static Configuration getConfig() {
		return config;
	}
}