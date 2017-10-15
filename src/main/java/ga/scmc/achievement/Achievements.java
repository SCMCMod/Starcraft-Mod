package ga.scmc.achievement;

import java.util.ArrayList;
import java.util.List;

import ga.scmc.handlers.BlockHandler;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.WeaponHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.common.AchievementPage;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * This class holds all the achievements in the mod, registers them, and then creates a new Achievement page based on the amount of achievements.
 * 
 * @author Ocelot5836
 * 
 * @see Achievement
 * @see AchievementPage
 */
public class Achievements {

	public static Achievement achievementEnterChar;
	public static Achievement achievementEnterShakuras;
	public static Achievement achievementGetC14GaussRifle;
	public static Achievement achievementGetMasterPsiBlade;
	public static Achievement achievementGetPsiBlade;
	public static Achievement achievementGetPsiBladeDark;
	public static Achievement achievementGetPsiBladeFocuser;
	public static Achievement achievementGetPsiBladeFocuserDark;
	public static Achievement achievementGetWarpBlade;
	public static Achievement achievementMinedMinerals;

	public static Achievement achievementMinedRichMinerals;
	public static Achievement achievementMinedVespene;

	/** The array that holds all the achievements to be added to the page */
	private static List<Achievement> achievements;

	/**
	 * Sets all the achievements to their respective ids.
	 */
	public static void initAchievements() {
		achievementMinedMinerals = createAchievement("mineMinerals", 0, 0, new ItemStack(ItemHandler.MINERAL_SHARD, 1, 0), null);

		achievementMinedRichMinerals = createAchievement("mineRichMinerals", 1, 0, new ItemStack(ItemHandler.MINERAL_SHARD, 1, 1), achievementMinedMinerals);

		achievementMinedVespene = createAchievement("mineVespene", 0, 1, new ItemStack(ItemHandler.VESPENE, 0, 3), null);

		achievementGetC14GaussRifle = createAchievement("getC14GaussRifle", 6, 0, new ItemStack(ItemHandler.C14_GAUSS_RIFLE), null).setSpecial();

		// Protoss Achievements
		achievementGetPsiBladeFocuser = createAchievement("getPsiBladeFocuser", 3, 0, new ItemStack(ItemHandler.PSI_BLADE_FOCUSER_UNCHARGED), null);

		achievementGetPsiBladeFocuserDark = createAchievement("getPsiBladeFocuserDark", 4, 0, new ItemStack(ItemHandler.PSI_BLADE_FOCUSER_UNCHARGED, 1, 1), null);

		achievementGetPsiBladeDark = createAchievement("getPsiBladeDark", 4, 1, new ItemStack(WeaponHandler.BANE_BLADE), achievementGetPsiBladeFocuserDark);

		achievementGetPsiBlade = createAchievement("getPsiBlade", 3, 1, new ItemStack(WeaponHandler.PSI_BLADE), achievementGetPsiBladeFocuser);

		achievementGetWarpBlade = createAchievement("getWarpBlade", 3, 2, new ItemStack(WeaponHandler.WARP_BLADE), achievementGetPsiBladeFocuser);

		achievementGetMasterPsiBlade = createAchievement("getMasterPsiBlade", 3, 3, new ItemStack(WeaponHandler.MASTER_PSI_BLADE), achievementGetPsiBladeFocuser);

		// Dimension Achievements
		achievementEnterChar = createAchievement("enterChar", -3, 0, new ItemStack(BlockHandler.STONE_CHAR), null);

		achievementEnterShakuras = createAchievement("enterShakuras", -2, 0, new ItemStack(BlockHandler.STONE_SHAKURAS), null);
	}

	/**
	 * Initializes the achievements and the achievement page. It adds all the currently created achievements to the page.
	 */
	public static void init() {
		achievements = new ArrayList<Achievement>();
		initAchievements();
		Achievement[] achievementArray = new Achievement[achievements.size()];

		for (int i = 0; i < achievements.size(); i++) {
			achievementArray[i] = achievements.get(i);
		}
		
		AchievementPage.registerAchievementPage(new AchievementPage(I18n.translateToLocal("achievement.pageStarcraft"), achievementArray));
	}

	/**
	 * Creates a new achievement and adds it to the achievement page automatically.
	 * 
	 * @param unlocalized
	 *            The unlocalized name of the achievement
	 * @param collumn
	 *            The collumn of the achievement
	 * @param row
	 *            The row of the achievement
	 * @param icon
	 *            The {@link ItemStack} that the icon will be
	 * @param parent
	 *            The parent achievement
	 * @return The new achievement created
	 */
	private static Achievement createAchievement(String unlocalized, int collumn, int row, ItemStack icon, Achievement parent) {
		/** The achievement to be added to the array */
		Achievement achievement = new Achievement("achivement." + unlocalized, unlocalized, collumn, row, icon, parent).initIndependentStat().registerStat();
		achievements.add(achievement);
		return achievement;
	}
}