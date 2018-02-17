package com.hypeirochus.scmc.capabilities;

import com.hypeirochus.scmc.Starcraft;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * 
 * Capability handler
 * 
 * 
 * This class is responsible for attaching our capabilities
 * 
 */

public class CapabilityHandler {

	public static final ResourceLocation COLOR = new ResourceLocation(Starcraft.MOD_ID, "color");
	public static final ResourceLocation SHIELD = new ResourceLocation(Starcraft.MOD_ID, "shield");

	@SubscribeEvent
	public void attachCapability(AttachCapabilitiesEvent<Entity> event) {
		if (!(event.getObject() instanceof EntityPlayer))
			return;

		event.addCapability(SHIELD, new ShieldProvider());
		event.addCapability(COLOR, new ColorProvider());
	}
}