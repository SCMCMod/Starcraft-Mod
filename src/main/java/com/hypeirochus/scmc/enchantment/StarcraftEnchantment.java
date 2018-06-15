package com.hypeirochus.scmc.enchantment;

import com.hypeirochus.scmc.handlers.EnchantmentHandler;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;

//TODO: MOVE TO CORE MOD, rename to be generic.
public class StarcraftEnchantment extends Enchantment {
	
	public StarcraftEnchantment(Rarity rarity, EnumEnchantmentType type, EntityEquipmentSlot... slots) {
		super(rarity, type, slots);
	}
	
	public StarcraftEnchantment(String name, Rarity rarity, EnumEnchantmentType type, EntityEquipmentSlot... slots) {
		this(name, name, rarity, type, slots);
	}
	
	public StarcraftEnchantment(String registryName, String unlocalizedName, Rarity rarity, EnumEnchantmentType type, EntityEquipmentSlot... slots) {
		super(rarity, type, slots);
		setRegistryName(registryName);
		setName(unlocalizedName);
		EnchantmentHandler.register(this);
	}
}