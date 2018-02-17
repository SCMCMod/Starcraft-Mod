package com.hypeirochus.scmc.handlers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.launchwrapper.Launch;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * A utility class for handling all things to do with the game (which normally we don't have access to)
 * 
 * @author CJMinecraft
 */
public class AccessHandler {

	@SideOnly(Side.CLIENT)
	public static Minecraft getMinecraft() {
		return Minecraft.instance;
	}

	@SideOnly(Side.CLIENT)
	public static FontRenderer getFontRenderer() {
		return getMinecraft().fontRenderer;
	}

	@SideOnly(Side.CLIENT)
	public static float getPartialTicks() {
		return getMinecraft().getRenderPartialTicks();
	}

	public static boolean isDevEnvironment() {
		return (boolean) Launch.blackboard.get("fml.deobfuscatedEnvironment");
	}
}