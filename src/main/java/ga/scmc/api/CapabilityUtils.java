package ga.scmc.api;

import ga.scmc.capabilities.ShieldProvider;
import ga.scmc.network.NetworkHandler;
import ga.scmc.network.message.MessageSetPlayerShieldClient;
import ga.scmc.network.message.MessageSetPlayerShieldServer;
import net.minecraft.entity.player.EntityPlayer;

/**
 * This class can hold some methods that involve our methods of setting and getting our capabilities for the player.
 * 
 * @author Ocelot5836
 */
public class CapabilityUtils {

	public static double getShield(EntityPlayer player) {
		return player.getCapability(ShieldProvider.SHIELD, null).getShield();
	}

	public static void setShield(EntityPlayer player, double amount) {
		NetworkHandler.sendToServer(new MessageSetPlayerShieldServer(amount));
		NetworkHandler.sendToClient(new MessageSetPlayerShieldClient(amount));
	}

	public static void addShield(EntityPlayer player, double amount) {
		setShield(player, getShield(player) + amount);
	}

	public static void removeShield(EntityPlayer player, double amount) {
		addShield(player, -amount);
	}
}