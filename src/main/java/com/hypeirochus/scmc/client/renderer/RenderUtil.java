package com.hypeirochus.scmc.client.renderer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.util.ResourceLocation;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 */
//TODO: MOVE TO CORE MOD
public class RenderUtil
{

	public static final float DEFAULT_BOX_TRANSLATION = 0.625F;
	private static final Minecraft MC = Minecraft.getMinecraft();

	/**
	 * Binds the texture to the resourceLocation.
	 * 
	 * @param resourceLocation The location to bind the texture with
	 */
	public static void bindTexture(ResourceLocation resourceLocation)
	{
		MC.renderEngine.bindTexture(resourceLocation);
	}

	/**
	 * Checks if the player is in first person view.
	 * 
	 * @param o The Object
	 * @return whether the player is in first person view
	 */
	public static boolean firstPersonRenderCheck(Object o)
	{
		return o == MC.getRenderViewEntity() && MC.gameSettings.thirdPersonView == 0 && (!(MC.currentScreen instanceof GuiInventory) && !(MC.currentScreen instanceof GuiContainerCreative));
	}
}