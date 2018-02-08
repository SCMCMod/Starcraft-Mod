package ga.scmc.api;

import ga.scmc.capabilities.ShieldProvider;
import ga.scmc.network.NetworkHandler;
import ga.scmc.network.message.MessageSetPlayerShieldClient;
import ga.scmc.network.message.MessageSetPlayerShieldServer;
import net.minecraft.entity.player.EntityPlayer;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * This class holds some methods that involve our methods of setting and getting
 * our capabilities for the player.
 * 
 * @author Ocelot5836
 */
public class CapabilityUtils {

	/**
	 * @param player
	 *            The player to get the shield
	 * @return the specified player's shield level
	 */
	public static double getShield(EntityPlayer player) {
		return player.getCapability(ShieldProvider.SHIELD, null).getShield();
	}

	/**
	 * Sets the shield level of a specified player to the specified amount.
	 * 
	 * @param player
	 *            The player to change the shield
	 * @param amount
	 *            The amount to set the shield to
	 */
	public static void setShield(EntityPlayer player, double amount) {
		NetworkHandler.sendToServer(new MessageSetPlayerShieldServer(amount));
		NetworkHandler.sendToAllClients(new MessageSetPlayerShieldClient(amount));
	}

	/**
	 * Adds to a specified player's shield level.
	 * 
	 * @param player
	 *            The player to change the shield
	 * @param amount
	 *            The amount to add
	 */
	public static void addShield(EntityPlayer player, double amount) {
		setShield(player, getShield(player) + amount);
	}

	/**
	 * Removes from a specified player's shield level.
	 * 
	 * @param player
	 *            The player to change the shield
	 * @param amount
	 *            The amount to take
	 */
	public static void removeShield(EntityPlayer player, double amount) {
		addShield(player, -amount);
	}
}