package com.hypeirochus.scmc.config;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.hypeirochus.scmc.Starcraft;
import com.hypeirochus.scmc.config.category.CategoryEntryDimensionIds;
import com.hypeirochus.scmc.config.category.CategoryEntryGeneral;
import com.hypeirochus.scmc.config.category.CategoryEntryMobSpawning;
import com.hypeirochus.scmc.lib.FactorySettings;

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
public class StarcraftConfig {

	public static List<Category> categories = new ArrayList<Category>();

	private static Configuration config = null;

	public static final String CATEGORY_NAME_GENERAL = registerCategory(new Category("general", CategoryEntryGeneral.class));
	public static final String CATEGORY_NAME_DIMENSION_IDS = registerCategory(new Category("dimension.ids", CategoryEntryDimensionIds.class));
	public static final String CATEGORY_NAME_MOB_OPTIONS = registerCategory(new Category("mob.options", CategoryEntryMobSpawning.class));

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

		Property propertyCreepCanSpread = config.get(CATEGORY_NAME_GENERAL, "block.creep.spread", true);
		propertyCreepCanSpread.setLanguageKey("gui.starcraft.config.block.creep.spread.name");
		propertyCreepCanSpread.setComment(I18n.format("gui.starcraft.config.block.creep.spread.comment"));

		Property propertyCreepSpreadBaseValue = config.get(CATEGORY_NAME_GENERAL, "block.creep.spread.base", 1);
		propertyCreepSpreadBaseValue.setLanguageKey("gui.starcraft.config.block.creep.spread.base.name");
		propertyCreepSpreadBaseValue.setComment(I18n.format("gui.starcraft.config.block.creep.spread.base.comment"));
		propertyCreepSpreadBaseValue.setMinValue(0);
		propertyCreepSpreadBaseValue.setMaxValue(16);

		Property propertyDimIdChar = config.get(CATEGORY_NAME_DIMENSION_IDS, "dimension.char.id", 2);
		propertyDimIdChar.setLanguageKey("gui.starcraft.config.dimension.char.id.name");
		propertyDimIdChar.setComment(I18n.format("gui.starcraft.config.dimension.char.id.comment"));

		Property propertyDimIdShakuras = config.get(CATEGORY_NAME_DIMENSION_IDS, "dimension.shakuras.id", 3);
		propertyDimIdShakuras.setLanguageKey("gui.starcraft.config.dimension.shakuras.id.name");
		propertyDimIdShakuras.setComment(I18n.format("gui.starcraft.config.dimension.shakuras.id.comment"));

		Property propertyDimIdSlayn = config.get(CATEGORY_NAME_DIMENSION_IDS, "dimension.slayn.id", 4);
		propertyDimIdSlayn.setLanguageKey("gui.starcraft.config.dimension.slayn.id.name");
		propertyDimIdSlayn.setComment(I18n.format("gui.starcraft.config.dimension.slayn.id.comment"));

		Property propertyDimIdKorhal = config.get(CATEGORY_NAME_DIMENSION_IDS, "dimension.korhal.id", 5);
		propertyDimIdKorhal.setLanguageKey("gui.starcraft.config.dimension.korhal.id.name");
		propertyDimIdKorhal.setComment(I18n.format("gui.starcraft.config.dimension.korhal.id.comment"));

		Property propertyDimIdKaldir = config.get(CATEGORY_NAME_DIMENSION_IDS, "dimension.kaldir.id", 6);
		propertyDimIdKaldir.setLanguageKey("gui.starcraft.config.dimension.kaldir.id.name");
		propertyDimIdKaldir.setComment(I18n.format("gui.starcraft.config.dimension.kaldir.id.comment"));

		Property propertyDimIdAiur = config.get(CATEGORY_NAME_DIMENSION_IDS, "dimension.aiur.id", 7);
		propertyDimIdAiur.setLanguageKey("gui.starcraft.config.dimension.aiur.id.name");
		propertyDimIdAiur.setComment(I18n.format("gui.starcraft.config.dimension.aiur.id.comment"));

		Property propertyDimIdZerus = config.get(CATEGORY_NAME_DIMENSION_IDS, "dimension.zerus.id",8);
		propertyDimIdZerus.setLanguageKey("gui.starcraft.config.dimension.zerus.id.name");
		propertyDimIdZerus.setComment(I18n.format("gui.starcraft.config.dimension.zerus.id.comment"));

		Property propertyDimIdSpace = config.get(CATEGORY_NAME_DIMENSION_IDS, "dimension.space.id", 9);
		propertyDimIdSpace.setLanguageKey("gui.starcraft.config.dimension.space.id.name");
		propertyDimIdSpace.setComment(I18n.format("gui.starcraft.config.dimension.space.id.comment"));

		Property propertyDisableVanillaMobSpawning = config.get(CATEGORY_NAME_MOB_OPTIONS, "vanilla.mob.spawn", false);
		propertyDisableVanillaMobSpawning.setLanguageKey("gui.starcraft.config.vanilla.mob.spawn.name");
		propertyDisableVanillaMobSpawning.setComment(I18n.format("gui.starcraft.config.vanilla.mob.spawn.comment"));
		
		Property propertyDarkTeplarVisible = config.get(CATEGORY_NAME_MOB_OPTIONS, "starcraft.templar.dark.visible", true);
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
			FactorySettings.BOOL_CREEP_CAN_SPREAD = propertyCreepCanSpread.getBoolean();
			FactorySettings.INT_CREEP_SPREAD_BASE_VALUE = propertyCreepSpreadBaseValue.getInt();
			FactorySettings.INT_DIMENSION_CHAR = propertyDimIdChar.getInt();
			FactorySettings.INT_DIMENSION_SHAKURAS = propertyDimIdShakuras.getInt();
			FactorySettings.INT_DIMENSION_SLAYN = propertyDimIdSlayn.getInt();
			FactorySettings.INT_DIMENSION_KORHAL = propertyDimIdKorhal.getInt();
			FactorySettings.INT_DIMENSION_KALDIR = propertyDimIdKaldir.getInt();
			FactorySettings.INT_DIMENSION_AIUR = propertyDimIdAiur.getInt();
			FactorySettings.INT_DIMENSION_ZERUS = propertyDimIdZerus.getInt();
			FactorySettings.INT_DIMENSION_SPACE = propertyDimIdSpace.getInt();
			FactorySettings.BOOL_VANILLA_MOB_SPAWNING_DISABLED = propertyDisableVanillaMobSpawning.getBoolean();
			FactorySettings.BOOL_IS_DARK_TEMPLAR_VISIBLE = propertyDarkTeplarVisible.getBoolean();
		}

		propertyCreepCanSpread.set(FactorySettings.BOOL_CREEP_CAN_SPREAD);
		propertyCreepSpreadBaseValue.set(FactorySettings.INT_CREEP_SPREAD_BASE_VALUE);
		propertyDimIdChar.set(FactorySettings.INT_DIMENSION_CHAR);
		propertyDimIdShakuras.set(FactorySettings.INT_DIMENSION_SHAKURAS);
		propertyDimIdSlayn.set(FactorySettings.INT_DIMENSION_SLAYN);
		propertyDimIdKorhal.set(FactorySettings.INT_DIMENSION_KORHAL);
		propertyDimIdKaldir.set(FactorySettings.INT_DIMENSION_KALDIR);
		propertyDimIdAiur.set(FactorySettings.INT_DIMENSION_AIUR);
		propertyDimIdZerus.set(FactorySettings.INT_DIMENSION_ZERUS);
		propertyDimIdSpace.set(FactorySettings.INT_DIMENSION_SPACE);
		propertyDisableVanillaMobSpawning.set(FactorySettings.BOOL_VANILLA_MOB_SPAWNING_DISABLED);
		propertyDarkTeplarVisible.set(FactorySettings.BOOL_IS_DARK_TEMPLAR_VISIBLE);

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