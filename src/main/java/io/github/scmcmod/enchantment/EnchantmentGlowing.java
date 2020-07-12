package io.github.scmcmod.enchantment;

import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;

public class EnchantmentGlowing extends SCEnchantment
{

	public EnchantmentGlowing()
	{
		super("glowing", Rarity.RARE, EnumEnchantmentType.ALL, EntityEquipmentSlot.values());
	}
}