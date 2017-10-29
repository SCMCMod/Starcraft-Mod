package ga.scmc.events;

import ga.scmc.achievement.Achievements;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.WeaponHandler;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;


/**
 * This class handles events that involve items.
 * 
 * @author Ocelot5836
 */
@EventBusSubscriber
public class ItemEventHandler {

	@SubscribeEvent
	public static void onItemCraftedEvent(PlayerEvent.ItemCraftedEvent e) {
		if (e.crafting.isItemEqual(new ItemStack(ItemHandler.C14_GAUSS_RIFLE))) {
			e.player.addStat(Achievements.achievementGetC14GaussRifle, 1);
			// add sound here
		}

		if (e.crafting.isItemEqual((new ItemStack(ItemHandler.PSI_BLADE_FOCUSER_UNCHARGED, 1, 1)))) {
			e.player.addStat(Achievements.achievementGetPsiBladeFocuserDark, 1);
			// add sound here
		}

		if (e.crafting.isItemEqual((new ItemStack(WeaponHandler.BANE_BLADE)))) {
			e.player.addStat(Achievements.achievementGetPsiBladeDark, 1);
			// add sound here
		}

		if (e.crafting.isItemEqual((new ItemStack(WeaponHandler.DARK_WARP_BLADE)))) {
			e.player.addStat(Achievements.achievementGetPsiBladeFocuserDark, 1);
			// add sound here
		}

		if (e.crafting.isItemEqual((new ItemStack(ItemHandler.PSI_BLADE_FOCUSER_UNCHARGED)))) {
			e.player.addStat(Achievements.achievementGetPsiBladeFocuser, 1);
			// add sound here
		}

		if (e.crafting.isItemEqual((new ItemStack(WeaponHandler.PSI_BLADE)))) {
			e.player.addStat(Achievements.achievementGetPsiBlade, 1);
			// add sound here
		}

		if (e.crafting.isItemEqual((new ItemStack(WeaponHandler.WARP_BLADE)))) {
			e.player.addStat(Achievements.achievementGetPsiBladeFocuserDark, 1);
			// add sound here
		}
	}

	@SubscribeEvent
	public static void onItemPickedUpEvent(PlayerEvent.ItemPickupEvent e) {
		if (e.pickedUp.getEntityItem().isItemEqual(new ItemStack(WeaponHandler.MASTER_PSI_BLADE))) {
			e.player.addStat(Achievements.achievementGetMasterPsiBlade, 1);
			// add sound here
		}

		if (e.pickedUp.getEntityItem().isItemEqual(new ItemStack(ItemHandler.MINERAL_SHARD, 1, 0))) {
			e.player.addStat(Achievements.achievementMinedMinerals, 1);
			// add sound here
		}

		if (e.pickedUp.getEntityItem().isItemEqual(new ItemStack(ItemHandler.VESPENE, 0, 3))) {
			e.player.addStat(Achievements.achievementMinedVespene, 1);
			// add sound here
		}

		if (e.pickedUp.getEntityItem().isItemEqual(new ItemStack(ItemHandler.MINERAL_SHARD, 1, 1))) {
			e.player.addStat(Achievements.achievementMinedRichMinerals, 1);
			// add sound here
		}
	}
}