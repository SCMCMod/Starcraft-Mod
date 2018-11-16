package com.hypeirochus.scmc.proxy;

import com.hypeirochus.scmc.client.model.armor.ModelArmorBase;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * This class is a template for a basic proxy class.
 *
 * @author Ocelot536
 */
public abstract class CommonProxy
{

	public void preInit(FMLPreInitializationEvent event)
	{
	}

	public void init(FMLInitializationEvent event)
	{
	}

	public void postInit(FMLPostInitializationEvent event)
	{
	}

	public ModelArmorBase getArmorModel(int id)
	{
		return null;
	}
}