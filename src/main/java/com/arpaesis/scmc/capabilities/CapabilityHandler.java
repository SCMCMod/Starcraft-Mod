package com.arpaesis.scmc.capabilities;

import com.arpaesis.scmc.SCConstants;
import com.arpaesis.scmc.capabilities.playerrace.RaceProvider;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Capability handler This class is responsible for attaching our capabilities
 */

//TODO: Why is there a race capability? Shouldn't it be factions? Ocelot :/
public class CapabilityHandler
{

	public static final ResourceLocation COLOR = new ResourceLocation(SCConstants.MODID, "color");
	public static final ResourceLocation SHIELD = new ResourceLocation(SCConstants.MODID, "shield");
	public static final ResourceLocation RACE = new ResourceLocation(SCConstants.MODID, "race");
	public static final ResourceLocation LOCKED_ITEMS = new ResourceLocation(SCConstants.MODID, "locked_items");

	@SubscribeEvent
	public void attachCapability(AttachCapabilitiesEvent<Entity> event)
	{
		if (!(event.getObject() instanceof EntityPlayer))
			return;

		event.addCapability(SHIELD, new ShieldProvider());
		event.addCapability(COLOR, new ColorProvider());
		event.addCapability(RACE, new RaceProvider());
		event.addCapability(LOCKED_ITEMS, new LockedItemsProvider());
	}
}