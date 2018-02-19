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
 * This class handles events that involve the player.
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