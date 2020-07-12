package io.github.scmcmod.handlers;

import java.util.ArrayList;
import java.util.List;

import io.github.scmcmod.enchantment.EnchantmentGlowing;
import net.minecraft.enchantment.Enchantment;

public class EnchantmentHandler
{

	public static List<Enchantment> enchantments;

	public static Enchantment GLOWING;

	private static void init()
	{
		enchantments = new ArrayList<Enchantment>();

		instantiate();
	}

	private static void instantiate()
	{
		GLOWING = new EnchantmentGlowing();
	}

	/**
	 * Registers an enchantment.
	 * 
	 * @param enchantment The enchantment to register
	 */
	public static void register(Enchantment enchantment)
	{
		enchantments.add(enchantment);
	}

	/**
	 * Used for registry.
	 * 
	 * @return The list of blocks to be registered
	 */
	public static Enchantment[] getEnchantments()
	{
		if (enchantments == null)
			init();
		return enchantments.toArray(new Enchantment[enchantments.size()]);
	}
}