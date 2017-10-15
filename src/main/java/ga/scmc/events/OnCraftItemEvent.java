package ga.scmc.events;

import ga.scmc.achievement.Achievements;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.WeaponHandler;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

@EventBusSubscriber
public class OnCraftItemEvent {

	@SubscribeEvent
	public static void onC14GaussRifleObtained(PlayerEvent.ItemCraftedEvent e) {
		if(e.crafting.isItemEqual(new ItemStack(ItemHandler.C14_GAUSS_RIFLE))) {
			e.player.addStat(Achievements.achievementGetC14GaussRifle, 1);
			// add sound here
		}
	}

	@SubscribeEvent
	public static void onDarkPsiBladeFocuserObtained(PlayerEvent.ItemCraftedEvent e) {
		if(e.crafting.isItemEqual((new ItemStack(ItemHandler.PSI_BLADE_FOCUSER_UNCHARGED, 1, 1)))) {
			e.player.addStat(Achievements.achievementGetPsiBladeFocuserDark, 1);
			// add sound here
		}
	}

	@SubscribeEvent
	public static void onDarkPsiBladeObtained(PlayerEvent.ItemCraftedEvent e) {
		if(e.crafting.isItemEqual((new ItemStack(WeaponHandler.BANE_BLADE)))) {
			e.player.addStat(Achievements.achievementGetPsiBladeDark, 1);
			// add sound here
		}
	}

	@SubscribeEvent
	public static void onDarkWarpBladeObtained(PlayerEvent.ItemCraftedEvent e) {
		if(e.crafting.isItemEqual((new ItemStack(WeaponHandler.DARK_WARP_BLADE)))) {
			e.player.addStat(Achievements.achievementGetPsiBladeFocuserDark, 1);
			// add sound here
		}
	}

	@SubscribeEvent
	public static void onPsiBladeFocuserObtained(PlayerEvent.ItemCraftedEvent e) {
		if(e.crafting.isItemEqual((new ItemStack(ItemHandler.PSI_BLADE_FOCUSER_UNCHARGED)))) {
			e.player.addStat(Achievements.achievementGetPsiBladeFocuser, 1);
			// add sound here
		}
	}

	@SubscribeEvent
	public static void onPsiBladeObtained(PlayerEvent.ItemCraftedEvent e) {
		if(e.crafting.isItemEqual((new ItemStack(WeaponHandler.PSI_BLADE)))) {
			e.player.addStat(Achievements.achievementGetPsiBlade, 1);
			// add sound here
		}
	}

	@SubscribeEvent
	public static void onWarpBladeObtained(PlayerEvent.ItemCraftedEvent e) {
		if(e.crafting.isItemEqual((new ItemStack(WeaponHandler.WARP_BLADE)))) {
			e.player.addStat(Achievements.achievementGetPsiBladeFocuserDark, 1);
			// add sound here
		}
	}
}