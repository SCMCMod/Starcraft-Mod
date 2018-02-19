package com.hypeirochus.scmc.events;

import com.hypeirochus.scmc.handlers.ItemHandler;

import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumHand;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * This class handles all of the events that have to do with client sided rendering.
 * 
 * @author Ocelot5836
 */
@SideOnly(Side.CLIENT)
public class GuiRenderEventHandler {

	@SubscribeEvent
	public void onCrosshairRenderEvent(RenderGameOverlayEvent event) {
		if (event.getType() == ElementType.CROSSHAIRS) {
			if (Minecraft.getMinecraft().player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemHandler.C14_GAUSS_RIFLE) {
				event.setCanceled(true);
			}
		}
	}
}