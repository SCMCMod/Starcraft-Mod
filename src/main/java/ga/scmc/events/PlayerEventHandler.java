package ga.scmc.events;

import ga.scmc.achievement.Achievements;
import ga.scmc.debugging.ColorProvider;
import ga.scmc.debugging.IColor;
import ga.scmc.handlers.ConfigurationHandler;
import ga.scmc.lib.CapabilityUtils;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

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

	@SubscribeEvent
	public void onPlayerLoggedInEvent(PlayerLoggedInEvent event) {
		EntityPlayer player = event.player;
		String message = "Running SCMC version 1.6.";
		player.sendMessage(new TextComponentString(message).setStyle(new Style().setColor(TextFormatting.RED)));

		CapabilityUtils.setShield(event.player, CapabilityUtils.getShield(event.player));
	}

	@SubscribeEvent
	public static void onPlayerChangedDimensionEvent(PlayerEvent.PlayerChangedDimensionEvent e) {
		if (e.toDim == ConfigurationHandler.INT_DIMENSION_CHAR) {
			e.player.addStat(Achievements.achievementEnterChar, 1);
			// add sound here
		}

		if (e.toDim == ConfigurationHandler.INT_DIMENSION_SHAKURAS) {
			e.player.addStat(Achievements.achievementEnterShakuras, 1);
			// add sound here
		}
	}
}