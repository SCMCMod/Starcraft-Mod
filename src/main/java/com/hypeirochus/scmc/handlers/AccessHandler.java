package com.hypeirochus.scmc.handlers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.launchwrapper.Launch;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * A utility class for handling all things to do with the game (which normally we don't have access to)
 * 
 * @author CJMinecraft
 */
public class AccessHandler {

	/**
	 * @return The minecraft instance
	 */
	@SideOnly(Side.CLIENT)
	public static Minecraft getMinecraft() {
		return Minecraft.instance;
	}

	/**
	 * @return The minecraft font renderer instance
	 */
	@SideOnly(Side.CLIENT)
	public static FontRenderer getFontRenderer() {
		return getMinecraft().fontRenderer;
	}

	/**
	 * @return The percentage from last update and this update
	 */
	@SideOnly(Side.CLIENT)
	public static float getPartialTicks() {
		return getMinecraft().timer.renderPartialTicks;
	}

	/**
	 * @return Whether or not the environment is deobfuscated
	 */
	public static boolean isDeobfuscatedEnvironment() {
		return (boolean) Launch.blackboard.get("fml.deobfuscatedEnvironment");
	}
}