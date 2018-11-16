package com.hypeirochus.scmc.handlers;

import com.hypeirochus.scmc.Starcraft;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * @author Ocelot5836
 */
//TODO: CONSIDER if this should be moved to the core mod or not.
@SideOnly(Side.CLIENT)
public class WavefrontModelHandler
{

	/**
	 * Adds a new OBJ loader domain.
	 */
	public static void pre(FMLPreInitializationEvent event)
	{
		OBJLoader.INSTANCE.addDomain(Starcraft.MOD_ID);
		register();
	}

	/**
	 * Registers the obj models.
	 */
	public static void register()
	{

	}

	/**
	 * Registers a model.
	 * 
	 * @param object Accepts an item or a block to register. If the object is not
	 *        either it simply returns.
	 */
	private static void registerModel(Object object)
	{
		Item item = null;
		if (object instanceof Block)
			item = Item.getItemFromBlock((Block) object);
		if (object instanceof Item)
			item = (Item) object;
		if (item == null)
			return;

		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}