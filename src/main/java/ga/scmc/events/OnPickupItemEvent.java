package ga.scmc.events;

import ga.scmc.achievement.Achievements;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.WeaponHandler;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

@EventBusSubscriber
public class OnPickupItemEvent {

	@SubscribeEvent
	public static void onMasterPsiBladeObtained(PlayerEvent.ItemPickupEvent e) {
		if (e.pickedUp.getEntityItem().isItemEqual(new ItemStack(WeaponHandler.MASTER_PSI_BLADE))) {
			e.player.addStat(Achievements.achievementGetMasterPsiBlade, 1);
			// add sound here
		}
	}

	@SubscribeEvent
	public static void onMineralShardObtained(PlayerEvent.ItemPickupEvent e) {
		if (e.pickedUp.getEntityItem().isItemEqual(new ItemStack(ItemHandler.MINERAL_SHARD, 1, 0))) {
			e.player.addStat(Achievements.achievementMinedMinerals, 1);
			// add sound here
		}
	}

	@SubscribeEvent
	public static void onRawVespeneObtained(PlayerEvent.ItemPickupEvent e) {
		if (e.pickedUp.getEntityItem().isItemEqual(new ItemStack(ItemHandler.VESPENE, 0, 3))) {
			e.player.addStat(Achievements.achievementMinedVespene, 1);
			// add sound here
		}
	}

	@SubscribeEvent
	public static void onRichMineralShardObtained(PlayerEvent.ItemPickupEvent e) {
		if (e.pickedUp.getEntityItem().isItemEqual(new ItemStack(ItemHandler.MINERAL_SHARD, 1, 1))) {
			e.player.addStat(Achievements.achievementMinedRichMinerals, 1);
			// add sound here
		}
	}
}