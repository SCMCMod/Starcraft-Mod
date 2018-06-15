package com.hypeirochus.scmc.recipes;

import java.util.ArrayList;
import java.util.List;

import com.hypeirochus.scmc.Starcraft;

import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Handles any recipes that use nbt or something similar to function.
 * 
 * @author Ocelot5836
 */
public class CustomRecipes {

	private static List<IRecipe> recipes;

	private static void init() {
		recipes = new ArrayList<IRecipe>();

		register();
	}

	private static void register() {
	}

	/**
	 * Registers an IRecipe.
	 * 
	 * @param recipe
	 *            The recipe to register
	 */
	public static void registerRecipe(IRecipe recipe, String registryName) {
		recipe.setRegistryName(new ResourceLocation(Starcraft.RL_BASE + registryName));
		recipes.add(recipe);
	}

	/**
	 * Used for registration.
	 * 
	 * @return All of the registered recipes
	 */
	public static IRecipe[] getRecipes() {
		if (recipes == null)
			init();
		return recipes.toArray(new IRecipe[recipes.size()]);
	}
}