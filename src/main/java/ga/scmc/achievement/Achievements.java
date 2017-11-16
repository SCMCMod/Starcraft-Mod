package ga.scmc.achievement;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.resources.I18n;
import net.minecraft.stats.Achievement;
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
 * @see EnumAchievements
 * @see Achievement
 * @see AchievementPage
 */
public class Achievements {

	public static final String PAGE_UNLOCALIZED_NAME = "pageStarcraft";
	public static final String MINED_MINERALS = "mineMinerals";
	public static final String MINED_RICH_MINERALS = "mineRichMinerals";
	public static final String MINED_VESPENE = "mineVespene";
	public static final String GET_C14_GAUSS_RIFLE = "getC14GaussRifle";
	public static final String GET_PSI_BLADE_FOCUSER = "getPsiBladeFocuser";
	public static final String GET_PSI_BLADE = "getPsiBlade";
	public static final String GET_PSI_BLADE_FOCUSER_DARK = "getPsiBladeFocuserDark";
	public static final String GET_PSI_BLADE_DARK = "getPsiBladeDark";
	public static final String GET_WARP_BLADE = "getWarpBlade";
	public static final String GET_MASTER_PSI_BLADE = "getMasterPsiBlade";
	public static final String ENTER_CHAR = "enterChar";
	public static final String ENTER_SHAKURAS = "enterShakuras";

	private static List<Achievement> achievements = new ArrayList<Achievement>();

	/**
	 * Returns a registered achievement from the achievements array.
	 * 
	 * @param unlocalizedName
	 *            The name of the parent achievement
	 * @return The achievement found with that name
	 */
	@Nullable
	public static Achievement getRegisteredAchievement(String unlocalizedName) {
		for (Achievement achievement : achievements) {
			System.out.println(achievement.statId + ", " + unlocalizedName);
			if (achievement.statId.equalsIgnoreCase("achievement." + unlocalizedName)) {
				return achievement;
			}
		}

		return null;
	}

	/**
	 * Gets a registered achievement from the achievements array.
	 *
	 * @param achievement
	 *            The achievement to get the parent achievement from
	 * @return The achievement found with that name, which can be null if not found
	 * @deprecated Do not use this. Use {@link #getRegisteredAchievement(String)} instead.
	 */
	@Nullable
	public static Achievement getRegisteredAchievement(EnumAchievements achievement) {
		return getRegisteredAchievement(achievement.getParentUnlocalizedName());
	}

	/**
	 * Initializes the achievements and the achievement page. It adds all the currently created achievements to the page.
	 */
	public static void init() {
		for (int i = 0; i < EnumAchievements.values().length; i++) {
			EnumAchievements a = EnumAchievements.values()[i];
			Achievement achievement = new Achievement("achievement." + a.getUnlocalizedName(), a.getUnlocalizedName(), (int) a.getPosition().x, (int) a.getPosition().y, a.getIcon(), getRegisteredAchievement(a.getParentUnlocalizedName()));

			if (a.isSpecial())
				achievement.setSpecial();
			if (a.getParentUnlocalizedName() == null)
				achievement.initIndependentStat();

			achievements.add(achievement.registerStat());
		}

		Achievement[] achievementsArray = new Achievement[achievements.size()];
		for (int i = 0; i < achievements.size(); i++)
			achievementsArray[i] = achievements.get(i);

		AchievementPage.registerAchievementPage(new AchievementPage(I18n.format("achievement." + PAGE_UNLOCALIZED_NAME), achievementsArray));
	}
}