package ga.scmc.achievement;

import ga.scmc.handlers.BlockHandler;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.WeaponHandler;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

/**
 * This holds all the achievements in starcraft.
 * 
 * @author Ocelot5836
 */
public enum EnumAchievements {

	MINED_MINERALS(Achievements.MINED_MINERALS, 0, 0, new ItemStack(ItemHandler.MINERAL_SHARD, 1, 0)),
	MINED_RICH_MINERALS(Achievements.MINED_RICH_MINERALS, 1, 0, new ItemStack(ItemHandler.MINERAL_SHARD, 1, 1), Achievements.MINED_MINERALS),
	MINED_VESPENE(Achievements.MINED_VESPENE, 0, 1, new ItemStack(ItemHandler.VESPENE, 0, 3)),
	GET_C14_GAUSS_RIFLE(Achievements.GET_C14_GAUSS_RIFLE, 6, 0, new ItemStack(ItemHandler.C14_GAUSS_RIFLE), null, true),
	GET_FLAMETHROWER(Achievements.GET_FLAMETHROWER, 6, 1, new ItemStack(ItemHandler.FLAMETHROWER), null, true),
	GET_PSI_BLADE_FOCUSER(Achievements.GET_PSI_BLADE_FOCUSER, 3, 0, new ItemStack(ItemHandler.PSI_BLADE_FOCUSER_UNCHARGED)),
	GET_PSI_BLADE(Achievements.GET_PSI_BLADE, 3, 1, new ItemStack(WeaponHandler.PSI_BLADE), Achievements.GET_PSI_BLADE_FOCUSER),
	GET_PSI_BLADE_FOCUSER_DARK(Achievements.GET_PSI_BLADE_FOCUSER_DARK, 4, 0, new ItemStack(ItemHandler.PSI_BLADE_FOCUSER_UNCHARGED, 1, 1)),
	GET_PSI_BLADE_DARK(Achievements.GET_PSI_BLADE_DARK, 4, 1, new ItemStack(WeaponHandler.BANE_BLADE), Achievements.GET_PSI_BLADE_FOCUSER_DARK),
	GET_WARP_BLADE(Achievements.GET_WARP_BLADE, 3, 2, new ItemStack(WeaponHandler.WARP_BLADE), Achievements.GET_PSI_BLADE_FOCUSER),
	GET_MASTER_PSI_BLADE(Achievements.GET_MASTER_PSI_BLADE, 3, 3, new ItemStack(WeaponHandler.MASTER_PSI_BLADE), Achievements.GET_PSI_BLADE_FOCUSER),
	ENTER_CHAR(Achievements.ENTER_CHAR, -2, 0, new ItemStack(BlockHandler.STONE_CHAR)),
	ENTER_SHAKURAS(Achievements.ENTER_SHAKURAS, -2, 1, new ItemStack(BlockHandler.STONE_SHAKURAS)),
	ENTER_SLAYN(Achievements.ENTER_SLAYN, -2, 2, new ItemStack(BlockHandler.STONE_SLAYN)),
	ENTER_KORHAL(Achievements.ENTER_KORHAL, -2, 3, new ItemStack(BlockHandler.CITY_STONE_KORHAL)),
	ENTER_KALDIR(Achievements.ENTER_KALDIR, -2, 4, new ItemStack(Blocks.SNOW)),
	ENTER_ZERUS(Achievements.ENTER_ZERUS, -2, 5, new ItemStack(BlockHandler.STONE_ZERUS)),
	ENTER_AIUR(Achievements.ENTER_AIUR, -2, 6, new ItemStack(Blocks.STONE));

	private String unlocalizedName;
	private float x;
	private float y;
	private ItemStack icon;
	private String parentUnlocalizedName;
	private boolean special;

	private EnumAchievements(String unlocalizedName, int x, int y, ItemStack icon) {
		this(unlocalizedName, x, y, icon, "");
	}

	private EnumAchievements(String unlocalizedName, int x, int y, ItemStack icon, String parentUnlocalizedName) {
		this(unlocalizedName, x, y, icon, parentUnlocalizedName, false);
	}

	private EnumAchievements(String unlocalizedName, int x, int y, ItemStack icon, String parentUnlocalizedName, boolean special) {
		this.unlocalizedName = unlocalizedName;
		this.x = x;
		this.y = y;
		this.icon = icon;
		this.parentUnlocalizedName = parentUnlocalizedName;
		this.special = special;
	}

	public String getUnlocalizedName() {
		return unlocalizedName;
	}

	public float[] getPosition() {
		return new float[] { x, y };
	}

	public ItemStack getIcon() {
		return icon;
	}

	public String getParentUnlocalizedName() {
		return parentUnlocalizedName;
	}

	public boolean isSpecial() {
		return special;
	}
}