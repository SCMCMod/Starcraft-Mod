package ga.scmc.events;

import ga.scmc.achievement.Achievements;
import ga.scmc.capabilities.ColorProvider;
import ga.scmc.capabilities.IColor;
import ga.scmc.handlers.ConfigurationHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

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
	public static void onPlayerChangedDimensionEvent(PlayerEvent.PlayerChangedDimensionEvent e) {
		if (e.toDim == ConfigurationHandler.INT_DIMENSION_CHAR) {
			e.player.addStat(Achievements.getRegisteredAchievement(Achievements.ENTER_CHAR), 1);
			// add sound here
		}

		if (e.toDim == ConfigurationHandler.INT_DIMENSION_SHAKURAS) {
			e.player.addStat(Achievements.getRegisteredAchievement(Achievements.ENTER_SHAKURAS), 1);
			// add sound here
		}
	}
}