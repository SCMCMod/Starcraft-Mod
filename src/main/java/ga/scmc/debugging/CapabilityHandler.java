package ga.scmc.debugging;

import ga.scmc.lib.Library;
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

	public static final ResourceLocation COLOR = new ResourceLocation(Library.MODID, "color");
	public static final ResourceLocation SHIELD = new ResourceLocation(Library.MODID, "shield");

	@SubscribeEvent
	public void attachCapability(AttachCapabilitiesEvent.Entity event) {
		if (!(event.getEntity() instanceof EntityPlayer))
			return;
		
		event.addCapability(SHIELD, new ShieldProvider());
		event.addCapability(COLOR, new ColorProvider());
	}
}