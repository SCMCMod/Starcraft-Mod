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
@EventBusSubscriber
public class PlayerEventHandler {

	@SubscribeEvent
	public void onPlayerCloneEvent(net.minecraftforge.event.entity.player.PlayerEvent.Clone event) {
		EntityPlayer player = event.getEntityPlayer();
		IColor color = player.getCapability(ColorProvider.COLOR, null);
		IColor oldColor = event.getOriginal().getCapability(ColorProvider.COLOR, null);

		color.set(oldColor.getColor());
	}

	// @SubscribeEvent
	// public static void onPlayerChangedDimensionEvent(PlayerEvent.PlayerChangedDimensionEvent e) {
	// if (e.toDim == ConfigHandler.INT_DIMENSION_CHAR) {
	// e.player.addStat(Achievements.getRegisteredAchievement(Achievements.ENTER_CHAR), 1);
	// // add sound here
	// }
	//
	// if (e.toDim == ConfigHandler.INT_DIMENSION_SHAKURAS) {
	// e.player.addStat(Achievements.getRegisteredAchievement(Achievements.ENTER_SHAKURAS), 1);
	// // add sound here
	// }
	//
	// if (e.toDim == ConfigHandler.INT_DIMENSION_KORHAL) {
	// e.player.addStat(Achievements.getRegisteredAchievement(Achievements.ENTER_KORHAL), 1);
	// // add sound here
	// }
	//
	// if (e.toDim == ConfigHandler.INT_DIMENSION_KALDIR) {
	// e.player.addStat(Achievements.getRegisteredAchievement(Achievements.ENTER_KALDIR), 1);
	// // add sound here
	// }
	//
	// if (e.toDim == ConfigHandler.INT_DIMENSION_SLAYN) {
	// e.player.addStat(Achievements.getRegisteredAchievement(Achievements.ENTER_SLAYN), 1);
	// // add sound here
	// }
	//
	// if (e.toDim == ConfigHandler.INT_DIMENSION_AIUR) {
	// e.player.addStat(Achievements.getRegisteredAchievement(Achievements.ENTER_AIUR), 1);
	// // add sound here
	// }
	//
	// if (e.toDim == ConfigHandler.INT_DIMENSION_ZERUS) {
	// e.player.addStat(Achievements.getRegisteredAchievement(Achievements.ENTER_ZERUS), 1);
	// // add sound here
	// }
	// }

}