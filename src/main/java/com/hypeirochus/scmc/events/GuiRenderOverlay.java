package com.hypeirochus.scmc.events;

import com.hypeirochus.scmc.capabilities.ColorProvider;
import com.hypeirochus.scmc.capabilities.IColor;
import com.hypeirochus.scmc.client.renderer.item.ItemRenderC14GaussRifle;
import com.hypeirochus.scmc.handlers.ItemHandler;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumHand;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * This class handles events that involve the player.
 * 
 * @author Ocelot5836
 */
@SideOnly(Side.CLIENT)
public class GuiRenderOverlay {

	@SubscribeEvent
	public void onCrosshairRenderEvent(RenderGameOverlayEvent event) {
		if (event.getType() == ElementType.CROSSHAIRS) {
			if (Minecraft.getMinecraft().player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemHandler.C14_GAUSS_RIFLE) {
				if (ItemRenderC14GaussRifle.isAiming()) {
					event.setCanceled(true);
				}
			}
		}
	}

}