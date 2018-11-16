package com.hypeirochus.scmc.enchantment;

import com.hypeirochus.scmc.handlers.EnchantmentHandler;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;

//TODO: MOVE TO CORE MOD, rename to be generic.
public class SCEnchantment extends Enchantment
{

	public SCEnchantment(Rarity rarity, EnumEnchantmentType type, EntityEquipmentSlot... slots)
	{
		super(rarity, type, slots);
	}

	public SCEnchantment(String name, Rarity rarity, EnumEnchantmentType type, EntityEquipmentSlot... slots)
	{
		this(name, name, rarity, type, slots);
	}

	public SCEnchantment(String registryName, String unlocalizedName, Rarity rarity, EnumEnchantmentType type, EntityEquipmentSlot... slots)
	{
		super(rarity, type, slots);
		setRegistryName(registryName);
		setName(unlocalizedName);
		EnchantmentHandler.register(this);
	}
}