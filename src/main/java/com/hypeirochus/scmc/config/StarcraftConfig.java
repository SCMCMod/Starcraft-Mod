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
public class StarcraftConfig {

	public static List<Category> categories = new ArrayList<Category>();

	private static Configuration config = null;

	public static final String CATEGORY_NAME_GENERAL = registerCategory(new Category("general", CategoryEntryGeneral.class));
	public static final String CATEGORY_NAME_DIMENSION_IDS = registerCategory(new Category("dimension.ids", CategoryEntryDimensionIds.class));
	public static final String CATEGORY_NAME_MOB_OPTIONS = registerCategory(new Category("mob.options", CategoryEntryMobSpawning.class));

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
		config.setCategoryPropertyOrder(CATEGORY_NAME_DIMENSION_IDS, propertyOrderDimensionIds);

		List<String> propertyOrderMobOptions = new ArrayList<String>();
		propertyOrderMobOptions.add(propertyDisableVanillaMobSpawning.getName());
		propertyOrderMobOptions.add(propertyDarkTeplarVisible.getName());
		config.setCategoryPropertyOrder(CATEGORY_NAME_MOB_OPTIONS, propertyOrderMobOptions);

		if (readFieldsFromConfig) {
			BOOL_CREEP_CAN_SPREAD = propertyCreepCanSpread.getBoolean();
			INT_CREEP_SPREAD_BASE_VALUE = propertyCreepSpreadBaseValue.getInt();
			BOOL_VANILLA_MOB_SPAWNING_DISABLED = propertyDisableVanillaMobSpawning.getBoolean();
			BOOL_IS_DARK_TEMPLAR_VISIBLE = propertyDarkTeplarVisible.getBoolean();
		}

		propertyCreepCanSpread.set(BOOL_CREEP_CAN_SPREAD);
		propertyCreepSpreadBaseValue.set(INT_CREEP_SPREAD_BASE_VALUE);
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