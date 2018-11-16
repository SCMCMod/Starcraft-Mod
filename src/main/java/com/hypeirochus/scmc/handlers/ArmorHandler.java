package com.hypeirochus.scmc.handlers;

import com.hypeirochus.scmc.Starcraft;
import com.hypeirochus.scmc.creativetabs.SCCreativeTabs;
import com.hypeirochus.scmc.items.armor.ItemCustomArmor;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * Contains all the armors in the mod.
 */
public class ArmorHandler
{

	/**
	 * CLOTH(5, new int[]{1, 3, 2, 1}, 15), CHAIN(15, new int[]{2, 5, 4, 1}, 12),
	 * IRON(15, new int[]{2, 6, 5, 2}, 9), GOLD(7, new int[]{2, 5, 3, 1}, 25),
	 * DIAMOND(33, new int[]{3, 8, 6, 3}, 10);
	 */

	public static final ArmorMaterial COPPER_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("copperArmorMaterial", Starcraft.RL_BASE + "copper", 11, new int[]
	{ 2, 5, 4, 1 }, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f);

	public static final ArmorMaterial STEEL_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("steelArmorMaterial", Starcraft.RL_BASE + "steel", 29, new int[]
	{ 3, 6, 7, 3 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ArmorMaterial TITANIUM_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("titaniumArmorMaterial", Starcraft.RL_BASE + "titanium", 21, new int[]
	{ 4, 5, 6, 4 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F);

	public static final ArmorMaterial MARINE_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("marineArmorMaterial", Starcraft.RL_BASE + "marine", 21, new int[]
	{ 3, 6, 5, 2 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f);

	public static final ArmorMaterial ZERG_ARMOR_MATERIAL_T1 = EnumHelper.addArmorMaterial("zergArmorMaterialT1", Starcraft.RL_BASE + "zerg_t1", 33, new int[]
	{ 3, 8, 6, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static final ArmorMaterial ZERG_ARMOR_MATERIAL_T2 = EnumHelper.addArmorMaterial("zergArmorMaterialT2", Starcraft.RL_BASE + "zerg_t2", 35, new int[]
	{ 4, 9, 7, 4 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static final ArmorMaterial ZERG_ARMOR_MATERIAL_T3 = EnumHelper.addArmorMaterial("zergArmorMaterialT3", Starcraft.RL_BASE + "zerg_t3", 37, new int[]
	{ 5, 10, 8, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);

	public static final ArmorMaterial PROTOSS_ARMOR_MATERIAL_T1 = EnumHelper.addArmorMaterial("protossArmorMaterialT1", Starcraft.RL_BASE + "protoss_t1", 33, new int[]
	{ 3, 8, 6, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static final ArmorMaterial PROTOSS_ARMOR_MATERIAL_T2 = EnumHelper.addArmorMaterial("protossArmorMaterialT2", Starcraft.RL_BASE + "protoss_t2", 35, new int[]
	{ 4, 9, 7, 4 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static final ArmorMaterial PROTOSS_ARMOR_MATERIAL_T3 = EnumHelper.addArmorMaterial("protossArmorMaterialT3", Starcraft.RL_BASE + "protoss_t3", 37, new int[]
	{ 5, 10, 8, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);

	public static final ArmorMaterial PROTOSS_NERAZIM_ARMOR_MATERIAL_T1 = EnumHelper.addArmorMaterial("protossNerazimArmorMaterialT1", Starcraft.RL_BASE + "protoss_nerazim_t1", 33, new int[]
	{ 3, 8, 6, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static final ArmorMaterial PROTOSS_NERAZIM_ARMOR_MATERIAL_T2 = EnumHelper.addArmorMaterial("protossNerazimArmorMaterialT2", Starcraft.RL_BASE + "protoss_nerazim_t2", 35, new int[]
	{ 4, 9, 7, 4 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static final ArmorMaterial PROTOSS_NERAZIM_ARMOR_MATERIAL_T3 = EnumHelper.addArmorMaterial("protossNerazimArmorMaterialT3", Starcraft.RL_BASE + "protoss_nerazim_t3", 37, new int[]
	{ 5, 10, 8, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);

	public static final ArmorMaterial PROTOSS_TALDARIM_ARMOR_MATERIAL_T1 = EnumHelper.addArmorMaterial("protossTaldarimArmorMaterialT1", Starcraft.RL_BASE + "protoss_taldarim_t1", 33, new int[]
	{ 3, 8, 6, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static final ArmorMaterial PROTOSS_TALDARIM_ARMOR_MATERIAL_T2 = EnumHelper.addArmorMaterial("protossTaldarimArmorMaterialT2", Starcraft.RL_BASE + "protoss_taldarim_t2", 35, new int[]
	{ 4, 9, 7, 4 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static final ArmorMaterial PROTOSS_TALDARIM_ARMOR_MATERIAL_T3 = EnumHelper.addArmorMaterial("protossTaldarimArmorMaterialT3", Starcraft.RL_BASE + "protoss_taldarim_t3", 37, new int[]
	{ 5, 10, 8, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);

	public static final ArmorMaterial TERRAN_MARINE_ARMOR_MATERIAL_T1 = EnumHelper.addArmorMaterial("terranArmorMaterialT1", Starcraft.RL_BASE + "terran_t1", 33, new int[]
	{ 3, 8, 6, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static final ArmorMaterial TERRAN_MARINE_ARMOR_MATERIAL_T2 = EnumHelper.addArmorMaterial("terranArmorMaterialT2", Starcraft.RL_BASE + "terran_t2", 35, new int[]
	{ 4, 9, 7, 4 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static final ArmorMaterial TERRAN_MARINE_ARMOR_MATERIAL_T3 = EnumHelper.addArmorMaterial("terranArmorMaterialT3", Starcraft.RL_BASE + "terran_t3", 37, new int[]
	{ 5, 10, 8, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);

	public static final ArmorMaterial TERRAN_RAYNOR_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("terranRaynorMaterialT1", Starcraft.RL_BASE + "terran_raynor_t1", 33, new int[]
	{ 7, 12, 10, 7 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);

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

	public static Item PROTOSS_NERAZIM_T1_BOOTS;
	public static Item PROTOSS_NERAZIM_T1_CHESTPLATE;
	public static Item PROTOSS_NERAZIM_T1_HELMET;
	public static Item PROTOSS_NERAZIM_T1_LEGGINGS;

	public static Item PROTOSS_NERAZIM_T2_BOOTS;
	public static Item PROTOSS_NERAZIM_T2_CHESTPLATE;
	public static Item PROTOSS_NERAZIM_T2_HELMET;
	public static Item PROTOSS_NERAZIM_T2_LEGGINGS;

	public static Item PROTOSS_NERAZIM_T3_BOOTS;
	public static Item PROTOSS_NERAZIM_T3_CHESTPLATE;
	public static Item PROTOSS_NERAZIM_T3_HELMET;
	public static Item PROTOSS_NERAZIM_T3_LEGGINGS;

	public static Item PROTOSS_TALDARIM_T1_BOOTS;
	public static Item PROTOSS_TALDARIM_T1_CHESTPLATE;
	public static Item PROTOSS_TALDARIM_T1_HELMET;
	public static Item PROTOSS_TALDARIM_T1_LEGGINGS;

	public static Item PROTOSS_TALDARIM_T2_BOOTS;
	public static Item PROTOSS_TALDARIM_T2_CHESTPLATE;
	public static Item PROTOSS_TALDARIM_T2_HELMET;
	public static Item PROTOSS_TALDARIM_T2_LEGGINGS;

	public static Item PROTOSS_TALDARIM_T3_BOOTS;
	public static Item PROTOSS_TALDARIM_T3_CHESTPLATE;
	public static Item PROTOSS_TALDARIM_T3_HELMET;
	public static Item PROTOSS_TALDARIM_T3_LEGGINGS;

	public static Item TERRAN_MARINE_T1_BOOTS;
	public static Item TERRAN_MARINE_T1_CHESTPLATE;
	public static Item TERRAN_MARINE_T1_HELMET;
	public static Item TERRAN_MARINE_T1_LEGGINGS;

	public static Item TERRAN_MARINE_T2_BOOTS;
	public static Item TERRAN_MARINE_T2_CHESTPLATE;
	public static Item TERRAN_MARINE_T2_HELMET;
	public static Item TERRAN_MARINE_T2_LEGGINGS;

	public static Item TERRAN_MARINE_T3_BOOTS;
	public static Item TERRAN_MARINE_T3_CHESTPLATE;
	public static Item TERRAN_MARINE_T3_HELMET;
	public static Item TERRAN_MARINE_T3_LEGGINGS;

	public static Item TERRAN_RAYNOR_BOOTS;
	public static Item TERRAN_RAYNOR_CHESTPLATE;
	public static Item TERRAN_RAYNOR_HELMET;
	public static Item TERRAN_RAYNOR_LEGGINGS;

	public static void init()
	{
		instantiate();
		register();
	}

	private static void instantiate()
	{
		TITANIUM_HELMET = new ItemArmor(TITANIUM_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("titanium.helmet").setRegistryName("titanium.helmet").setCreativeTab(SCCreativeTabs.TERRAN);
		TITANIUM_CHESTPLATE = new ItemArmor(TITANIUM_ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("titanium.chestplate").setRegistryName("titanium.chestplate").setCreativeTab(SCCreativeTabs.TERRAN);
		TITANIUM_LEGGINGS = new ItemArmor(TITANIUM_ARMOR_MATERIAL, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("titanium.leggings").setRegistryName("titanium.leggings").setCreativeTab(SCCreativeTabs.TERRAN);
		TITANIUM_BOOTS = new ItemArmor(TITANIUM_ARMOR_MATERIAL, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("titanium.boots").setRegistryName("titanium.boots").setCreativeTab(SCCreativeTabs.TERRAN);

		COPPER_HELMET = new ItemArmor(COPPER_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("copper.helmet").setRegistryName("copper.helmet").setCreativeTab(SCCreativeTabs.TERRAN);
		COPPER_CHESTPLATE = new ItemArmor(COPPER_ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("copper.chestplate").setRegistryName("copper.chestplate").setCreativeTab(SCCreativeTabs.TERRAN);
		COPPER_LEGGINGS = new ItemArmor(COPPER_ARMOR_MATERIAL, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("copper.leggings").setRegistryName("copper.leggings").setCreativeTab(SCCreativeTabs.TERRAN);
		COPPER_BOOTS = new ItemArmor(COPPER_ARMOR_MATERIAL, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("copper.boots").setRegistryName("copper.boots").setCreativeTab(SCCreativeTabs.TERRAN);

		STEEL_HELMET = new ItemArmor(STEEL_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("steel.helmet").setRegistryName("steel.helmet").setCreativeTab(SCCreativeTabs.TERRAN);
		STEEL_CHESTPLATE = new ItemArmor(STEEL_ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("steel.chestplate").setRegistryName("steel.chestplate").setCreativeTab(SCCreativeTabs.TERRAN);
		STEEL_LEGGINGS = new ItemArmor(STEEL_ARMOR_MATERIAL, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("steel.leggings").setRegistryName("steel.leggings").setCreativeTab(SCCreativeTabs.TERRAN);
		STEEL_BOOTS = new ItemArmor(STEEL_ARMOR_MATERIAL, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("steel.boots").setRegistryName("steel.boots").setCreativeTab(SCCreativeTabs.TERRAN);

		ZERG_T1_HELMET = new ItemCustomArmor(ZERG_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.HEAD, 0, 1).setUnlocalizedName("zerg.helmet.1").setRegistryName("zerg.helmet.1").setCreativeTab(SCCreativeTabs.ZERG);
		ZERG_T1_CHESTPLATE = new ItemCustomArmor(ZERG_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.CHEST, 0, 1).setUnlocalizedName("zerg.chestplate.1").setRegistryName("zerg_chestplate.1").setCreativeTab(SCCreativeTabs.ZERG);
		ZERG_T1_LEGGINGS = new ItemCustomArmor(ZERG_ARMOR_MATERIAL_T1, 1, EntityEquipmentSlot.LEGS, 0, 1).setUnlocalizedName("zerg.leggings.1").setRegistryName("zerg.leggings.1").setCreativeTab(SCCreativeTabs.ZERG);
		ZERG_T1_BOOTS = new ItemCustomArmor(ZERG_ARMOR_MATERIAL_T1, 1, EntityEquipmentSlot.FEET, 0, 1).setUnlocalizedName("zerg.boots.1").setRegistryName("zerg.boots.1").setCreativeTab(SCCreativeTabs.ZERG);

		ZERG_T2_HELMET = new ItemCustomArmor(ZERG_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.HEAD, 2, 3).setUnlocalizedName("zerg.helmet.2").setRegistryName("zerg.helmet.2").setCreativeTab(SCCreativeTabs.ZERG);
		ZERG_T2_CHESTPLATE = new ItemCustomArmor(ZERG_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.CHEST, 2, 3).setUnlocalizedName("zerg.chestplate.2").setRegistryName("zerg.chestplate.2").setCreativeTab(SCCreativeTabs.ZERG);
		ZERG_T2_LEGGINGS = new ItemCustomArmor(ZERG_ARMOR_MATERIAL_T2, 1, EntityEquipmentSlot.LEGS, 2, 3).setUnlocalizedName("zerg.leggings.2").setRegistryName("zerg.leggings.2").setCreativeTab(SCCreativeTabs.ZERG);
		ZERG_T2_BOOTS = new ItemCustomArmor(ZERG_ARMOR_MATERIAL_T2, 1, EntityEquipmentSlot.FEET, 2, 3).setUnlocalizedName("zerg.boots.2").setRegistryName("zerg.boots.2").setCreativeTab(SCCreativeTabs.ZERG);

		ZERG_T3_HELMET = new ItemCustomArmor(ZERG_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.HEAD, 4, 5).setUnlocalizedName("zerg.helmet.3").setRegistryName("zerg.helmet.3").setCreativeTab(SCCreativeTabs.ZERG);
		ZERG_T3_CHESTPLATE = new ItemCustomArmor(ZERG_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.CHEST, 4, 5).setUnlocalizedName("zerg.chestplate.3").setRegistryName("zerg.chestplate.3").setCreativeTab(SCCreativeTabs.ZERG);
		ZERG_T3_LEGGINGS = new ItemCustomArmor(ZERG_ARMOR_MATERIAL_T3, 1, EntityEquipmentSlot.LEGS, 4, 5).setUnlocalizedName("zerg.leggings.3").setRegistryName("zerg.leggings.3").setCreativeTab(SCCreativeTabs.ZERG);
		ZERG_T3_BOOTS = new ItemCustomArmor(ZERG_ARMOR_MATERIAL_T3, 1, EntityEquipmentSlot.FEET, 4, 5).setUnlocalizedName("zerg.boots.3").setRegistryName("zerg.boots.3").setCreativeTab(SCCreativeTabs.ZERG);

		TERRAN_MARINE_T1_HELMET = new ItemCustomArmor(TERRAN_MARINE_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.HEAD, 6, 7).setUnlocalizedName("terran.marine.helmet.1").setRegistryName("terran.marine.helmet.1").setCreativeTab(SCCreativeTabs.TERRAN);
		TERRAN_MARINE_T1_CHESTPLATE = new ItemCustomArmor(TERRAN_MARINE_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.CHEST, 6, 7).setUnlocalizedName("terran.marine.chestplate.1").setRegistryName("terran.marine.chestplate.1").setCreativeTab(SCCreativeTabs.TERRAN);
		TERRAN_MARINE_T1_LEGGINGS = new ItemCustomArmor(TERRAN_MARINE_ARMOR_MATERIAL_T1, 1, EntityEquipmentSlot.LEGS, 6, 7).setUnlocalizedName("terran.marine.leggings.1").setRegistryName("terran.marine.leggings.1").setCreativeTab(SCCreativeTabs.TERRAN);
		TERRAN_MARINE_T1_BOOTS = new ItemCustomArmor(TERRAN_MARINE_ARMOR_MATERIAL_T1, 1, EntityEquipmentSlot.FEET, 6, 7).setUnlocalizedName("terran.marine.boots.1").setRegistryName("terran.marine.boots.1").setCreativeTab(SCCreativeTabs.TERRAN);

		TERRAN_MARINE_T2_HELMET = new ItemCustomArmor(TERRAN_MARINE_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.HEAD, 6, 7).setUnlocalizedName("terran.marine.helmet.2").setRegistryName("terran.marine.helmet.2").setCreativeTab(SCCreativeTabs.TERRAN);
		TERRAN_MARINE_T2_CHESTPLATE = new ItemCustomArmor(TERRAN_MARINE_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.CHEST, 6, 7).setUnlocalizedName("terran.marine.chestplate.2").setRegistryName("terran.marine.chestplate.2").setCreativeTab(SCCreativeTabs.TERRAN);
		TERRAN_MARINE_T2_LEGGINGS = new ItemCustomArmor(TERRAN_MARINE_ARMOR_MATERIAL_T2, 1, EntityEquipmentSlot.LEGS, 6, 7).setUnlocalizedName("terran.marine.leggings.2").setRegistryName("terran.marine.leggings.2").setCreativeTab(SCCreativeTabs.TERRAN);
		TERRAN_MARINE_T2_BOOTS = new ItemCustomArmor(TERRAN_MARINE_ARMOR_MATERIAL_T2, 1, EntityEquipmentSlot.FEET, 6, 7).setUnlocalizedName("terran.marine.boots.2").setRegistryName("terran.marine.boots.2").setCreativeTab(SCCreativeTabs.TERRAN);

		TERRAN_MARINE_T3_HELMET = new ItemCustomArmor(TERRAN_MARINE_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.HEAD, 6, 7).setUnlocalizedName("terran.marine.helmet.3").setRegistryName("terran.marine.helmet.3").setCreativeTab(SCCreativeTabs.TERRAN);
		TERRAN_MARINE_T3_CHESTPLATE = new ItemCustomArmor(TERRAN_MARINE_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.CHEST, 6, 7).setUnlocalizedName("terran.marine.chestplate.3").setRegistryName("terran.marine.chestplate.3").setCreativeTab(SCCreativeTabs.TERRAN);
		TERRAN_MARINE_T3_LEGGINGS = new ItemCustomArmor(TERRAN_MARINE_ARMOR_MATERIAL_T3, 1, EntityEquipmentSlot.LEGS, 6, 7).setUnlocalizedName("terran.marine.leggings.3").setRegistryName("terran.marine.leggings.3").setCreativeTab(SCCreativeTabs.TERRAN);
		TERRAN_MARINE_T3_BOOTS = new ItemCustomArmor(TERRAN_MARINE_ARMOR_MATERIAL_T3, 1, EntityEquipmentSlot.FEET, 6, 7).setUnlocalizedName("terran.marine.boots.3").setRegistryName("terran.marine.boots.3").setCreativeTab(SCCreativeTabs.TERRAN);

		TERRAN_RAYNOR_HELMET = new ItemCustomArmor(TERRAN_RAYNOR_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD, 6, 7).setUnlocalizedName("terran.raynor.helmet.1").setRegistryName("terran.raynor.helmet.1").setCreativeTab(SCCreativeTabs.TERRAN);
		TERRAN_RAYNOR_CHESTPLATE = new ItemCustomArmor(TERRAN_RAYNOR_ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST, 6, 7).setUnlocalizedName("terran.raynor.chestplate.1").setRegistryName("terran.raynor.chestplate.1").setCreativeTab(SCCreativeTabs.TERRAN);
		TERRAN_RAYNOR_LEGGINGS = new ItemCustomArmor(TERRAN_RAYNOR_ARMOR_MATERIAL, 1, EntityEquipmentSlot.LEGS, 6, 7).setUnlocalizedName("terran.raynor.leggings.1").setRegistryName("terran.raynor.leggings.1").setCreativeTab(SCCreativeTabs.TERRAN);
		TERRAN_RAYNOR_BOOTS = new ItemCustomArmor(TERRAN_RAYNOR_ARMOR_MATERIAL, 1, EntityEquipmentSlot.FEET, 6, 7).setUnlocalizedName("terran.raynor.boots.1").setRegistryName("terran.raynor.boots.1").setCreativeTab(SCCreativeTabs.TERRAN);

		PROTOSS_T1_HELMET = new ItemCustomArmor(PROTOSS_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.HEAD, 8, 9).setUnlocalizedName("protoss.helmet.1").setRegistryName("protoss.helmet.1").setCreativeTab(SCCreativeTabs.PROTOSS);
		PROTOSS_T1_CHESTPLATE = new ItemCustomArmor(PROTOSS_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.CHEST, 8, 9).setUnlocalizedName("protoss.chestplate.1").setRegistryName("protoss.chestplate.1").setCreativeTab(SCCreativeTabs.PROTOSS);
		PROTOSS_T1_LEGGINGS = new ItemCustomArmor(PROTOSS_ARMOR_MATERIAL_T1, 1, EntityEquipmentSlot.LEGS, 8, 9).setUnlocalizedName("protoss.leggings.1").setRegistryName("protoss.leggings.1").setCreativeTab(SCCreativeTabs.PROTOSS);
		PROTOSS_T1_BOOTS = new ItemCustomArmor(PROTOSS_ARMOR_MATERIAL_T1, 1, EntityEquipmentSlot.FEET, 8, 9).setUnlocalizedName("protoss.boots.1").setRegistryName("protoss.boots.1").setCreativeTab(SCCreativeTabs.PROTOSS);

		PROTOSS_T2_HELMET = new ItemCustomArmor(PROTOSS_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.HEAD, 8, 9).setUnlocalizedName("protoss.helmet.2").setRegistryName("protoss.helmet.2").setCreativeTab(SCCreativeTabs.PROTOSS);
		PROTOSS_T2_CHESTPLATE = new ItemCustomArmor(PROTOSS_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.CHEST, 8, 9).setUnlocalizedName("protoss.chestplate.2").setRegistryName("protoss.chestplate.2").setCreativeTab(SCCreativeTabs.PROTOSS);
		PROTOSS_T2_LEGGINGS = new ItemCustomArmor(PROTOSS_ARMOR_MATERIAL_T2, 1, EntityEquipmentSlot.LEGS, 8, 9).setUnlocalizedName("protoss.leggings.2").setRegistryName("protoss.leggings.2").setCreativeTab(SCCreativeTabs.PROTOSS);
		PROTOSS_T2_BOOTS = new ItemCustomArmor(PROTOSS_ARMOR_MATERIAL_T2, 1, EntityEquipmentSlot.FEET, 8, 9).setUnlocalizedName("protoss.boots.2").setRegistryName("protoss.boots.2").setCreativeTab(SCCreativeTabs.PROTOSS);

		PROTOSS_T3_HELMET = new ItemCustomArmor(PROTOSS_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.HEAD, 8, 9).setUnlocalizedName("protoss.helmet.3").setRegistryName("protoss.helmet.3").setCreativeTab(SCCreativeTabs.PROTOSS);
		PROTOSS_T3_CHESTPLATE = new ItemCustomArmor(PROTOSS_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.CHEST, 8, 9).setUnlocalizedName("protoss.chestplate.3").setRegistryName("protoss.chestplate.3").setCreativeTab(SCCreativeTabs.PROTOSS);
		PROTOSS_T3_LEGGINGS = new ItemCustomArmor(PROTOSS_ARMOR_MATERIAL_T3, 1, EntityEquipmentSlot.LEGS, 8, 9).setUnlocalizedName("protoss.leggings.3").setRegistryName("protoss.leggings.3").setCreativeTab(SCCreativeTabs.PROTOSS);
		PROTOSS_T3_BOOTS = new ItemCustomArmor(PROTOSS_ARMOR_MATERIAL_T3, 1, EntityEquipmentSlot.FEET, 8, 9).setUnlocalizedName("protoss.boots.3").setRegistryName("protoss.boots.3").setCreativeTab(SCCreativeTabs.PROTOSS);

		PROTOSS_NERAZIM_T1_HELMET = new ItemCustomArmor(PROTOSS_NERAZIM_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.HEAD, 12, 13).setUnlocalizedName("protoss.nerazim.helmet.1").setRegistryName("protoss.nerazim.helmet.1").setCreativeTab(SCCreativeTabs.PROTOSS);
		PROTOSS_NERAZIM_T1_CHESTPLATE = new ItemCustomArmor(PROTOSS_NERAZIM_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.CHEST, 12, 13).setUnlocalizedName("protoss.nerazim.chestplate.1").setRegistryName("protoss.nerazim.chestplate.1").setCreativeTab(SCCreativeTabs.PROTOSS);
		PROTOSS_NERAZIM_T1_LEGGINGS = new ItemCustomArmor(PROTOSS_NERAZIM_ARMOR_MATERIAL_T1, 1, EntityEquipmentSlot.LEGS, 12, 13).setUnlocalizedName("protoss.nerazim.leggings.1").setRegistryName("protoss.nerazim.leggings.1").setCreativeTab(SCCreativeTabs.PROTOSS);
		PROTOSS_NERAZIM_T1_BOOTS = new ItemCustomArmor(PROTOSS_NERAZIM_ARMOR_MATERIAL_T1, 1, EntityEquipmentSlot.FEET, 12, 13).setUnlocalizedName("protoss.nerazim.boots.1").setRegistryName("protoss.nerazim.boots.1").setCreativeTab(SCCreativeTabs.PROTOSS);

		PROTOSS_NERAZIM_T2_HELMET = new ItemCustomArmor(PROTOSS_NERAZIM_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.HEAD, 12, 13).setUnlocalizedName("protoss.nerazim.helmet.2").setRegistryName("protoss.nerazim.helmet.2").setCreativeTab(SCCreativeTabs.PROTOSS);
		PROTOSS_NERAZIM_T2_CHESTPLATE = new ItemCustomArmor(PROTOSS_NERAZIM_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.CHEST, 12, 13).setUnlocalizedName("protoss.nerazim.chestplate.2").setRegistryName("protoss.nerazim.chestplate.2").setCreativeTab(SCCreativeTabs.PROTOSS);
		PROTOSS_NERAZIM_T2_LEGGINGS = new ItemCustomArmor(PROTOSS_NERAZIM_ARMOR_MATERIAL_T2, 1, EntityEquipmentSlot.LEGS, 12, 13).setUnlocalizedName("protoss.nerazim.leggings.2").setRegistryName("protoss.nerazim.leggings.2").setCreativeTab(SCCreativeTabs.PROTOSS);
		PROTOSS_NERAZIM_T2_BOOTS = new ItemCustomArmor(PROTOSS_NERAZIM_ARMOR_MATERIAL_T2, 1, EntityEquipmentSlot.FEET, 12, 13).setUnlocalizedName("protoss.nerazim.boots.2").setRegistryName("protoss.nerazim.boots.2").setCreativeTab(SCCreativeTabs.PROTOSS);

		PROTOSS_NERAZIM_T3_HELMET = new ItemCustomArmor(PROTOSS_NERAZIM_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.HEAD, 12, 13).setUnlocalizedName("protoss.nerazim.helmet.3").setRegistryName("protoss.nerazim.helmet.3").setCreativeTab(SCCreativeTabs.PROTOSS);
		PROTOSS_NERAZIM_T3_CHESTPLATE = new ItemCustomArmor(PROTOSS_NERAZIM_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.CHEST, 12, 13).setUnlocalizedName("protoss.nerazim.chestplate.3").setRegistryName("protoss.nerazim.chestplate.3").setCreativeTab(SCCreativeTabs.PROTOSS);
		PROTOSS_NERAZIM_T3_LEGGINGS = new ItemCustomArmor(PROTOSS_NERAZIM_ARMOR_MATERIAL_T3, 1, EntityEquipmentSlot.LEGS, 12, 13).setUnlocalizedName("protoss.nerazim.leggings.3").setRegistryName("protoss.nerazim.leggings.3").setCreativeTab(SCCreativeTabs.PROTOSS);
		PROTOSS_NERAZIM_T3_BOOTS = new ItemCustomArmor(PROTOSS_NERAZIM_ARMOR_MATERIAL_T3, 1, EntityEquipmentSlot.FEET, 12, 13).setUnlocalizedName("protoss.nerazim.boots.3").setRegistryName("protoss.nerazim.boots.3").setCreativeTab(SCCreativeTabs.PROTOSS);

		PROTOSS_TALDARIM_T1_HELMET = new ItemCustomArmor(PROTOSS_TALDARIM_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.HEAD, 10, 11).setUnlocalizedName("protoss.taldarim.helmet.1").setRegistryName("protoss.taldarim.helmet.1").setCreativeTab(SCCreativeTabs.PROTOSS);
		PROTOSS_TALDARIM_T1_CHESTPLATE = new ItemCustomArmor(PROTOSS_TALDARIM_ARMOR_MATERIAL_T1, 0, EntityEquipmentSlot.CHEST, 10, 11).setUnlocalizedName("protoss.taldarim.chestplate.1").setRegistryName("protoss.taldarim.chestplate.1").setCreativeTab(SCCreativeTabs.PROTOSS);
		PROTOSS_TALDARIM_T1_LEGGINGS = new ItemCustomArmor(PROTOSS_TALDARIM_ARMOR_MATERIAL_T1, 1, EntityEquipmentSlot.LEGS, 10, 11).setUnlocalizedName("protoss.taldarim.leggings.1").setRegistryName("protoss.taldarim.leggings.1").setCreativeTab(SCCreativeTabs.PROTOSS);
		PROTOSS_TALDARIM_T1_BOOTS = new ItemCustomArmor(PROTOSS_TALDARIM_ARMOR_MATERIAL_T1, 1, EntityEquipmentSlot.FEET, 10, 11).setUnlocalizedName("protoss.taldarim.boots.1").setRegistryName("protoss.taldarim.boots.1").setCreativeTab(SCCreativeTabs.PROTOSS);

		PROTOSS_TALDARIM_T2_HELMET = new ItemCustomArmor(PROTOSS_TALDARIM_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.HEAD, 10, 11).setUnlocalizedName("protoss.taldarim.helmet.2").setRegistryName("protoss.taldarim.helmet.2").setCreativeTab(SCCreativeTabs.PROTOSS);
		PROTOSS_TALDARIM_T2_CHESTPLATE = new ItemCustomArmor(PROTOSS_TALDARIM_ARMOR_MATERIAL_T2, 0, EntityEquipmentSlot.CHEST, 10, 11).setUnlocalizedName("protoss.taldarim.chestplate.2").setRegistryName("protoss.taldarim.chestplate.2").setCreativeTab(SCCreativeTabs.PROTOSS);
		PROTOSS_TALDARIM_T2_LEGGINGS = new ItemCustomArmor(PROTOSS_TALDARIM_ARMOR_MATERIAL_T2, 1, EntityEquipmentSlot.LEGS, 10, 11).setUnlocalizedName("protoss.taldarim.leggings.2").setRegistryName("protoss.taldarim.leggings.2").setCreativeTab(SCCreativeTabs.PROTOSS);
		PROTOSS_TALDARIM_T2_BOOTS = new ItemCustomArmor(PROTOSS_TALDARIM_ARMOR_MATERIAL_T2, 1, EntityEquipmentSlot.FEET, 10, 11).setUnlocalizedName("protoss.taldarim.boots.2").setRegistryName("protoss.taldarim.boots.2").setCreativeTab(SCCreativeTabs.PROTOSS);

		PROTOSS_TALDARIM_T3_HELMET = new ItemCustomArmor(PROTOSS_TALDARIM_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.HEAD, 10, 11).setUnlocalizedName("protoss.taldarim.helmet.3").setRegistryName("protoss.taldarim.helmet.3").setCreativeTab(SCCreativeTabs.PROTOSS);
		PROTOSS_TALDARIM_T3_CHESTPLATE = new ItemCustomArmor(PROTOSS_TALDARIM_ARMOR_MATERIAL_T3, 0, EntityEquipmentSlot.CHEST, 10, 11).setUnlocalizedName("protoss.taldarim.chestplate.3").setRegistryName("protoss.taldarim.chestplate.3").setCreativeTab(SCCreativeTabs.PROTOSS);
		PROTOSS_TALDARIM_T3_LEGGINGS = new ItemCustomArmor(PROTOSS_TALDARIM_ARMOR_MATERIAL_T3, 1, EntityEquipmentSlot.LEGS, 10, 11).setUnlocalizedName("protoss.taldarim.leggings.3").setRegistryName("protoss.taldarim.leggings.3").setCreativeTab(SCCreativeTabs.PROTOSS);
		PROTOSS_TALDARIM_T3_BOOTS = new ItemCustomArmor(PROTOSS_TALDARIM_ARMOR_MATERIAL_T3, 1, EntityEquipmentSlot.FEET, 10, 11).setUnlocalizedName("protoss.taldarim.boots.3").setRegistryName("protoss.taldarim.boots.3").setCreativeTab(SCCreativeTabs.PROTOSS);

	}

	private static void register()
	{
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

		registerItem(PROTOSS_NERAZIM_T1_HELMET);
		registerItem(PROTOSS_NERAZIM_T1_CHESTPLATE);
		registerItem(PROTOSS_NERAZIM_T1_LEGGINGS);
		registerItem(PROTOSS_NERAZIM_T1_BOOTS);

		registerItem(PROTOSS_NERAZIM_T2_HELMET);
		registerItem(PROTOSS_NERAZIM_T2_CHESTPLATE);
		registerItem(PROTOSS_NERAZIM_T2_LEGGINGS);
		registerItem(PROTOSS_NERAZIM_T2_BOOTS);

		registerItem(PROTOSS_NERAZIM_T3_HELMET);
		registerItem(PROTOSS_NERAZIM_T3_CHESTPLATE);
		registerItem(PROTOSS_NERAZIM_T3_LEGGINGS);
		registerItem(PROTOSS_NERAZIM_T3_BOOTS);

		registerItem(PROTOSS_TALDARIM_T1_HELMET);
		registerItem(PROTOSS_TALDARIM_T1_CHESTPLATE);
		registerItem(PROTOSS_TALDARIM_T1_LEGGINGS);
		registerItem(PROTOSS_TALDARIM_T1_BOOTS);

		registerItem(PROTOSS_TALDARIM_T2_HELMET);
		registerItem(PROTOSS_TALDARIM_T2_CHESTPLATE);
		registerItem(PROTOSS_TALDARIM_T2_LEGGINGS);
		registerItem(PROTOSS_TALDARIM_T2_BOOTS);

		registerItem(PROTOSS_TALDARIM_T3_HELMET);
		registerItem(PROTOSS_TALDARIM_T3_CHESTPLATE);
		registerItem(PROTOSS_TALDARIM_T3_LEGGINGS);
		registerItem(PROTOSS_TALDARIM_T3_BOOTS);

		registerItem(TERRAN_MARINE_T1_HELMET);
		registerItem(TERRAN_MARINE_T1_CHESTPLATE);
		registerItem(TERRAN_MARINE_T1_LEGGINGS);
		registerItem(TERRAN_MARINE_T1_BOOTS);

		registerItem(TERRAN_MARINE_T2_HELMET);
		registerItem(TERRAN_MARINE_T2_CHESTPLATE);
		registerItem(TERRAN_MARINE_T2_LEGGINGS);
		registerItem(TERRAN_MARINE_T2_BOOTS);

		registerItem(TERRAN_MARINE_T3_HELMET);
		registerItem(TERRAN_MARINE_T3_CHESTPLATE);
		registerItem(TERRAN_MARINE_T3_LEGGINGS);
		registerItem(TERRAN_MARINE_T3_BOOTS);

		registerItem(TERRAN_RAYNOR_HELMET);
		registerItem(TERRAN_RAYNOR_CHESTPLATE);
		registerItem(TERRAN_RAYNOR_LEGGINGS);
		registerItem(TERRAN_RAYNOR_BOOTS);
	}

	private static void registerItem(Item item)
	{
		ItemHandler.register(item);
	}
}