package ga.scmc.events;

import ga.scmc.achievement.Achievements;
import ga.scmc.handlers.ConfigurationHandler;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

@EventBusSubscriber
public class OnPlayerEnterDimEvent {

	@SubscribeEvent
	public static void onEnterChar(PlayerEvent.PlayerChangedDimensionEvent e) {
		if(e.toDim == ConfigurationHandler.INT_DIMENSION_CHAR) {
			e.player.addStat(Achievements.achievementEnterChar, 1);
			// add sound here
		}
	}

	@SubscribeEvent
	public static void onEnterShakuras(PlayerEvent.PlayerChangedDimensionEvent e) {
		if(e.toDim == ConfigurationHandler.INT_DIMENSION_SHAKURAS) {
			e.player.addStat(Achievements.achievementEnterShakuras, 1);
			// add sound here
		}
	}
}