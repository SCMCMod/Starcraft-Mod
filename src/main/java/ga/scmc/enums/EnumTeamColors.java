package ga.scmc.enums;

import java.awt.Color;

import ocelot.api.utils.StarcraftUtils;

/**
 * This holds all the possible team colors for entities.
 * 
 * @author Ocelot5836
 */
public enum EnumTeamColors {
	WHITE(0, 238, 237, 233), ORANGE(1, 228, 113, 10), MAGENTA(2, 172, 62, 166), LIGHT_BLUE(3, 143, 211, 230), YELLOW(4, 231, 204, 54), LIME(5, 93, 234, 68), PINK(6, 216, 147, 178), GRAY(7, 70, 70, 70), SILVER(8, 187, 187, 191), CYAN(9, 67, 181, 216), PURPLE(10, 153, 50, 204), BLUE(11, 56, 95, 183), BROWN(12, 117, 77, 43), GREEN(13, 52, 122, 29), RED(14, 168, 21, 24), BLACK(15, 25, 25, 25);

	private int ID;
	private float r;
	private float g;
	private float b;

	EnumTeamColors(int ID, float r, float g, float b) {
		this.ID = ID;
		this.r = r;
		this.g = g;
		this.b = b;
	}

	public int getId() {
		return ID;
	}

	public Color getColor() {
		return new Color(r, g, b);
	}

	public float getR() {
		return r;
	}

	public float getG() {
		return g;
	}

	public float getB() {
		return b;
	}

	/**
	 * Gets the team color using ids.
	 * 
	 * @param id
	 *            The id of the color
	 */
	public static EnumTeamColors getColorById(int id) {
		return EnumTeamColors.values()[id];
	}

	/**
	 * Gets the team color using metadata.
	 * 
	 * @param id
	 *            The id of the color
	 */
	public static EnumTeamColors getColorByMeta(int id) {
		return EnumTeamColors.values()[EnumTeamColors.values().length - id];
	}

	/**
	 * Gets the color from default minecraft ids to starcraft ids.
	 * 
	 * @param id
	 *            The id of the color
	 * 
	 */
	public static EnumTeamColors getColorStarcraft(int id) {
		return EnumTeamColors.values()[StarcraftUtils.minecraftColorToStarcraftColor(id)];
	}
}