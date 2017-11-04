package ga.scmc.handlers;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.items.armor.ArmorProtossT1;
import ga.scmc.items.armor.ArmorZergArmorT1;
import ga.scmc.items.armor.ArmorZergArmorT2;
import ga.scmc.items.armor.ArmorZergArmorT3;
import ga.scmc.lib.Library;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Contains all the armors in the mod.
 */
public class ArmorHandler {

	/*
	 * CLOTH(5, new int[]{1, 3, 2, 1}, 15), CHAIN(15, new int[]{2, 5, 4, 1}, 12), IRON(15, new int[]{2, 6, 5, 2}, 9), GOLD(7, new int[]{2, 5, 3, 1}, 25), DIAMOND(33, new int[]{3, 8, 6, 3}, 10);
	 */

	public static final ArmorMaterial ADEPT_ARMOR_MATERIAL_T1 = EnumHelper.addArmorMaterial("adeptArmorMaterialT1", Library.RL_BASE + "adept_t1", 33, new int[] { 3, 8, 6, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static final ArmorMaterial ADEPT_ARMOR_MATERIAL_T2 = EnumHelper.addArmorMaterial("adeptArmorMaterialT2", Library.RL_BASE + "adept_t2", 35, new int[] { 4, 9, 7, 4 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static final ArmorMaterial ADEPT_ARMOR_MATERIAL_T3 = EnumHelper.addArmorMaterial("adeptArmorMaterialT3", Library.RL_BASE + "adept_t3", 37, new int[] { 5, 10, 8, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);

	public static final ArmorMaterial COPPER_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("copperArmorMaterial", Library.RL_BASE + "copper", 11, new int[] { 2, 5, 4, 1 }, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f);

	public static final ArmorMaterial GHOST_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("ghostArmourMaterial", Library.RL_BASE + "ghost_invis", 20, new int[] { 2, 6, 4, 2 }, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);

	public static final ArmorMaterial KHAYDARIN_AMULET_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("khaydarinAmuletArmorMaterial", Library.RL_BASE + "khaydarin_amulet", 37, new int[] { 5, 10, 8, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);

	public static final ArmorMaterial STEEL_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("steelArmorMaterial", Library.RL_BASE + "steel", 29, new int[] { 3, 7, 5, 3 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f);

	public static final ArmorMaterial TITANIUM_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("titaniumArmorMaterial", Library.RL_BASE + "titanium", 21, new int[] { 3, 6, 5, 2 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f);

	public static final ArmorMaterial MARINE_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("marineArmorMaterial", Library.RL_BASE + "marine", 21, new int[] { 3, 6, 5, 2 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f);

	public static final ArmorMaterial ZEALOT_ARMOR_MATERIAL_T1 = EnumHelper.addArmorMaterial("zealotArmorMaterialT1", Library.RL_BASE + "zealot_t1", 33, new int[] { 3, 8, 6, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static final ArmorMaterial ZEALOT_ARMOR_MATERIAL_T2 = EnumHelper.addArmorMaterial("zealotArmorMaterialT2", Library.RL_BASE + "zealot_t2", 35, new int[] { 4, 9, 7, 4 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static final ArmorMaterial ZEALOT_ARMOR_MATERIAL_T3 = EnumHelper.addArmorMaterial("zealotArmorMaterialT3", Library.RL_BASE + "zealot_t3", 37, new int[] { 5, 10, 8, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);

	public static final ArmorMaterial ZERG_ARMOR_MATERIAL_T1 = EnumHelper.addArmorMaterial("zergArmorMaterialT1", Library.RL_BASE + "zerg_t1", 33, new int[] { 3, 8, 6, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static final ArmorMaterial ZERG_ARMOR_MATERIAL_T2 = EnumHelper.addArmorMaterial("zergArmorMaterialT2", Library.RL_BASE + "zerg_t2", 35, new int[] { 4, 9, 7, 4 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static final ArmorMaterial ZERG_ARMOR_MATERIAL_T3 = EnumHelper.addArmorMaterial("zergArmorMaterialT3", Library.RL_BASE + "zerg_t3", 37, new int[] { 5, 10, 8, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);

	public static final ArmorMaterial PROTOSS_ARMOR_MATERIAL_T1 = EnumHelper.addArmorMaterial("zergArmorMaterialT1", Library.RL_BASE + "zerg_t1", 33, new int[] { 3, 8, 6, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static final ArmorMaterial PROTOSS_ARMOR_MATERIAL_T2 = EnumHelper.addArmorMaterial("zergArmorMaterialT2", Library.RL_BASE + "zerg_t2", 35, new int[] { 4, 9, 7, 4 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static final ArmorMaterial PROTOSS_ARMOR_MATERIAL_T3 = EnumHelper.addArmorMaterial("zergArmorMaterialT3", Library.RL_BASE + "zerg_t3", 37, new int[] { 5, 10, 8, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);

	public static Item COPPER_BOOTS;
	public static Item COPPER_CHESTPLATE;
	public static Item COPPER_HELMET;
	public static Item COPPER_LEGGINGS;

	public static Item STEEL_BOOTS;
	public static Item STEEL_CHESTPLATE;
	public static Item STEEL_HELMET;
	public static Item STEEL_LEGGINGS;

	public static Item TITANIUM_BOOTS;
	public static Item TITANIUM_CHESTPLATE;
	public static Item TITANIUM_HELMET;
	public static Item TITANIUM_LEGGINGS;

	public static Item MARINE_BOOTS;
	public static Item MARINE_CHESTPLATE;
	public static Item MARINE_HELMET;
	public static Item MARINE_LEGGINGS;

	public static Item ZERG_T1_BOOTS;
	public static Item ZERG_T1_CHESTPLATE;
	public static Item ZERG_T1_HELMET;
	public static Item ZERG_T1_LEGGINGS;

	public static Item ZERG_T2_BOOTS;
	public static Item ZERG_T2_CHESTPLATE;
	public static Item ZERG_T2_HELMET;
	public static Item ZERG_T2_LEGGINGS;

	public static Item ZERG_T3_BOOTS;
	public static Item ZERG_T3_CHESTPLATE;
	public static Item ZERG_T3_HELMET;
	public static Item ZERG_T3_LEGGINGS;

	public static Item PROTOSS_T1_BOOTS;
	public static Item PROTOSS_T1_CHESTPLATE;
	public static Item PROTOSS_T1_HELMET;
	public static Item PROTOSS_T1_LEGGINGS;

	public static Item PROTOSS_T2_BOOTS;
	public static Item PROTOSS_T2_CHESTPLATE;
	public static Item PROTOSS_T2_HELMET;
	public static Item PROTOSS_T2_LEGGINGS;

	public static Item PROTOSS_T3_BOOTS;
	public static Item PROTOSS_T3_CHESTPLATE;
	public static Item PROTOSS_T3_HELMET;
	public static Item PROTOSS_T3_LEGGINGS;

	public static void init() {
		TITANIUM_HELMET = new ItemArmor(TITANIUM_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("titanium.helmet").setRegistryName("titanium.helmet").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		TITANIUM_CHESTPLATE = new ItemArmor(TITANIUM_ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("titanium.chestplate").setRegistryName("titanium.chestplate").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		TITANIUM_LEGGINGS = new ItemArmor(TITANIUM_ARMOR_MATERIAL, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("titanium.leggings").setRegistryName("titanium.leggings").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		TITANIUM_BOOTS = new ItemArmor(TITANIUM_ARMOR_MATERIAL, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("titanium.boots").setRegistryName("titanium.boots").setCreativeTab(StarcraftCreativeTabs.TERRAN);

		COPPER_HELMET = new ItemArmor(COPPER_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("copper.helmet").setRegistryName("copper_helmet").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		COPPER_CHESTPLATE = new ItemArmor(COPPER_ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("copper.chestplate").setRegistryName("copper.chestplate").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		COPPER_LEGGINGS = new ItemArmor(COPPER_ARMOR_MATERIAL, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("copper.leggings").setRegistryName("copper.leggings").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		COPPER_BOOTS = new ItemArmor(COPPER_ARMOR_MATERIAL, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("copper.boots").setRegistryName("copper.boots").setCreativeTab(StarcraftCreativeTabs.TERRAN);

		STEEL_HELMET = new ItemArmor(STEEL_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("steel.helmet").setRegistryName("steel.helmet").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		STEEL_CHESTPLATE = new ItemArmor(STEEL_ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("steel.chestplate").setRegistryName("steel.chestplate").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		STEEL_LEGGINGS = new ItemArmor(STEEL_ARMOR_MATERIAL, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("steel.leggings").setRegistryName("steel.leggings").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		STEEL_BOOTS = new ItemArmor(STEEL_ARMOR_MATERIAL, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("steel.boots").setRegistryName("steel.boots").setCreativeTab(StarcraftCreativeTabs.TERRAN);

		MARINE_HELMET = new ItemArmor(MARINE_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("marine.helmet").setRegistryName("marine.helmet").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		MARINE_CHESTPLATE = new ItemArmor(MARINE_ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("marine.chestplate").setRegistryName("marine.chestplate").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		MARINE_LEGGINGS = new ItemArmor(MARINE_ARMOR_MATERIAL, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("marine.leggings").setRegistryName("marine.leggings").setCreativeTab(StarcraftCreativeTabs.TERRAN);
		MARINE_BOOTS = new ItemArmor(MARINE_ARMOR_MATERIAL, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("marine.boots").setRegistryName("marine.boots").setCreativeTab(StarcraftCreativeTabs.TERRAN);

		ZERG_T1_HELMET = new ArmorZergArmorT1(ZERG_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("zerg.helmet.1").setRegistryName("zerg.helmet.1").setCreativeTab(StarcraftCreativeTabs.ZERG);
		ZERG_T1_CHESTPLATE = new ArmorZergArmorT1(ZERG_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("zerg.chestplate.1").setRegistryName("zerg_chestplate.1").setCreativeTab(StarcraftCreativeTabs.ZERG);
		ZERG_T1_LEGGINGS = new ArmorZergArmorT1(ZERG_ARMOR_MATERIAL_T1, 1, EntityEquipmentSlot.LEGS).setUnlocalizedName("zerg.leggings.1").setRegistryName("zerg.leggings.1").setCreativeTab(StarcraftCreativeTabs.ZERG);
		ZERG_T1_BOOTS = new ArmorZergArmorT1(ZERG_ARMOR_MATERIAL_T1, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("zerg.boots.1").setRegistryName("zerg_boots.1").setCreativeTab(StarcraftCreativeTabs.ZERG);

		ZERG_T2_HELMET = new ArmorZergArmorT2(ZERG_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("zerg.helmetT2").setRegistryName("zerg.helmet.2").setCreativeTab(StarcraftCreativeTabs.ZERG);
		ZERG_T2_CHESTPLATE = new ArmorZergArmorT2(ZERG_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("zerg.chestplate.2").setRegistryName("zerg.chestplate.2").setCreativeTab(StarcraftCreativeTabs.ZERG);
		ZERG_T2_LEGGINGS = new ArmorZergArmorT2(ZERG_ARMOR_MATERIAL_T2, 1, EntityEquipmentSlot.LEGS).setUnlocalizedName("zerg.leggings.2").setRegistryName("zerg_leggings.2").setCreativeTab(StarcraftCreativeTabs.ZERG);
		ZERG_T2_BOOTS = new ArmorZergArmorT2(ZERG_ARMOR_MATERIAL_T2, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("zerg.boot.2").setRegistryName("zerg_boots.2").setCreativeTab(StarcraftCreativeTabs.ZERG);

		ZERG_T3_HELMET = new ArmorZergArmorT3(ZERG_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("zerg.helmet.3").setRegistryName("zerg.helmet.3").setCreativeTab(StarcraftCreativeTabs.ZERG);
		ZERG_T3_CHESTPLATE = new ArmorZergArmorT3(ZERG_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("zerg.chestplate.3").setRegistryName("zerg_chestplate.3").setCreativeTab(StarcraftCreativeTabs.ZERG);
		ZERG_T3_LEGGINGS = new ArmorZergArmorT3(ZERG_ARMOR_MATERIAL_T3, 1, EntityEquipmentSlot.LEGS).setUnlocalizedName("zerg.leggings.3").setRegistryName("zerg.leggings.3").setCreativeTab(StarcraftCreativeTabs.ZERG);
		ZERG_T3_BOOTS = new ArmorZergArmorT3(ZERG_ARMOR_MATERIAL_T3, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("zerg.boots.3").setRegistryName("zerg.boots.3").setCreativeTab(StarcraftCreativeTabs.ZERG);

		PROTOSS_T1_HELMET = new ArmorProtossT1(PROTOSS_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("protoss.helmet.1").setRegistryName("protoss.helmet.1").setCreativeTab(StarcraftCreativeTabs.PROTOSS);
		PROTOSS_T1_CHESTPLATE = new ArmorProtossT1(PROTOSS_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("protoss.chestplate.1").setRegistryName("protoss.chestplate.1").setCreativeTab(StarcraftCreativeTabs.PROTOSS);
		PROTOSS_T1_LEGGINGS = new ArmorProtossT1(PROTOSS_ARMOR_MATERIAL_T1, 1, EntityEquipmentSlot.LEGS).setUnlocalizedName("protoss.leggings.1").setRegistryName("protoss.leggings.1").setCreativeTab(StarcraftCreativeTabs.PROTOSS);
		PROTOSS_T1_BOOTS = new ArmorProtossT1(PROTOSS_ARMOR_MATERIAL_T1, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("protoss.boots.1").setRegistryName("protoss.boots.1").setCreativeTab(StarcraftCreativeTabs.PROTOSS);

		PROTOSS_T2_HELMET = new ArmorProtossT1(PROTOSS_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("protoss.helmet.2").setRegistryName("protoss.helmet.2").setCreativeTab(StarcraftCreativeTabs.PROTOSS);
		PROTOSS_T2_CHESTPLATE = new ArmorProtossT1(PROTOSS_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("protoss.chestplate.2").setRegistryName("protoss.chestplate.2").setCreativeTab(StarcraftCreativeTabs.PROTOSS);
		PROTOSS_T2_LEGGINGS = new ArmorProtossT1(PROTOSS_ARMOR_MATERIAL_T2, 1, EntityEquipmentSlot.LEGS).setUnlocalizedName("protoss.leggings.2").setRegistryName("protoss.leggings.2").setCreativeTab(StarcraftCreativeTabs.PROTOSS);
		PROTOSS_T2_BOOTS = new ArmorProtossT1(PROTOSS_ARMOR_MATERIAL_T2, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("protoss.boots.2").setRegistryName("protoss.boots.2").setCreativeTab(StarcraftCreativeTabs.PROTOSS);

		PROTOSS_T3_HELMET = new ArmorProtossT1(PROTOSS_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("protoss.helmet.3").setRegistryName("protoss.helmet.3").setCreativeTab(StarcraftCreativeTabs.PROTOSS);
		PROTOSS_T3_CHESTPLATE = new ArmorProtossT1(PROTOSS_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("protoss.chestplate.3").setRegistryName("protoss.chestplate.3").setCreativeTab(StarcraftCreativeTabs.PROTOSS);
		PROTOSS_T3_LEGGINGS = new ArmorProtossT1(PROTOSS_ARMOR_MATERIAL_T3, 1, EntityEquipmentSlot.LEGS).setUnlocalizedName("protoss.leggings.3").setRegistryName("protoss.leggings.3").setCreativeTab(StarcraftCreativeTabs.PROTOSS);
		PROTOSS_T3_BOOTS = new ArmorProtossT1(PROTOSS_ARMOR_MATERIAL_T3, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("protoss.boots.3").setRegistryName("protoss.boots.3").setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}

	public static void register() {

		registerItem(TITANIUM_HELMET);
		registerItem(TITANIUM_CHESTPLATE);
		registerItem(TITANIUM_LEGGINGS);
		registerItem(TITANIUM_BOOTS);

		registerItem(COPPER_HELMET);
		registerItem(COPPER_CHESTPLATE);
		registerItem(COPPER_LEGGINGS);
		registerItem(COPPER_BOOTS);

		registerItem(STEEL_HELMET);
		registerItem(STEEL_CHESTPLATE);
		registerItem(STEEL_LEGGINGS);
		registerItem(STEEL_BOOTS);

		registerItem(MARINE_HELMET);
		registerItem(MARINE_CHESTPLATE);
		registerItem(MARINE_LEGGINGS);
		registerItem(MARINE_BOOTS);

		registerItem(ZERG_T1_HELMET);
		registerItem(ZERG_T1_CHESTPLATE);
		registerItem(ZERG_T1_LEGGINGS);
		registerItem(ZERG_T1_BOOTS);

		registerItem(ZERG_T2_HELMET);
		registerItem(ZERG_T2_CHESTPLATE);
		registerItem(ZERG_T2_LEGGINGS);
		registerItem(ZERG_T2_BOOTS);

		registerItem(ZERG_T3_HELMET);
		registerItem(ZERG_T3_CHESTPLATE);
		registerItem(ZERG_T3_LEGGINGS);
		registerItem(ZERG_T3_BOOTS);
		
		registerItem(PROTOSS_T1_HELMET);
		registerItem(PROTOSS_T1_CHESTPLATE);
		registerItem(PROTOSS_T1_LEGGINGS);
		registerItem(PROTOSS_T1_BOOTS);

		registerItem(PROTOSS_T2_HELMET);
		registerItem(PROTOSS_T2_CHESTPLATE);
		registerItem(PROTOSS_T2_LEGGINGS);
		registerItem(PROTOSS_T2_BOOTS);

		registerItem(PROTOSS_T3_HELMET);
		registerItem(PROTOSS_T3_CHESTPLATE);
		registerItem(PROTOSS_T3_LEGGINGS);
		registerItem(PROTOSS_T3_BOOTS);
	}

	private static void registerItem(Item item) {
		GameRegistry.register(item);
	}
}