package com.hypeirochus.scmc.events;

import com.hypeirochus.scmc.capabilities.ColorProvider;
import com.hypeirochus.scmc.capabilities.IColor;
import com.hypeirochus.scmc.lib.FactorySettings;

import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * This class handles all of the events that do not have to do with the client.
 * 
 * @author Ocelot5836
 */
@EventBusSubscriber
public class StarcraftEventHandler {

	@SubscribeEvent
	public static void onEntitySpawn(EntityJoinWorldEvent event) {
		if (FactorySettings.BOOL_VANILLA_MOB_SPAWNING_DISABLED) {
			if (event.getEntity() instanceof EntityCaveSpider || event.getEntity() instanceof EntitySilverfish || event.getEntity() instanceof EntityWitch || event.getEntity() instanceof EntitySlime || event.getEntity() instanceof EntityEnderman || event.getEntity() instanceof EntityCreeper || event.getEntity() instanceof EntitySkeleton || event.getEntity() instanceof EntityZombie || event.getEntity() instanceof EntitySpider) {
				event.getEntity().setDropItemsWhenDead(false);
				event.getEntity().setSilent(true);
				event.getEntity().setInvisible(true);
				event.getEntity().setDead();
				event.setCanceled(true);
			}
		}
	}

	@SubscribeEvent
	public void onPlayerCloneEvent(net.minecraftforge.event.entity.player.PlayerEvent.Clone event) {
		EntityPlayer player = event.getEntityPlayer();
		IColor color = player.getCapability(ColorProvider.COLOR, null);
		IColor oldColor = event.getOriginal().getCapability(ColorProvider.COLOR, null);

		color.set(oldColor.getColor());
	}

	@SubscribeEvent
	public void onPlayerLoggedInEvent(PlayerLoggedInEvent event) {
		EntityPlayer player = event.player;
		String message = "Running SCMC version 2.0.656!";
		player.sendMessage(new TextComponentString(message).setStyle(new Style().setColor(TextFormatting.BLUE)));
	}
}