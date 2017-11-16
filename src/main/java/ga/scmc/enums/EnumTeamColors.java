package ga.scmc.enums;

import java.awt.Color;

import org.lwjgl.util.vector.Vector3f;

import ga.scmc.api.StarcraftUtils;

/**
 * This holds all the possible team colors for entities.
 * 
 * @author Ocelot5836
 */
public enum EnumTeamColors {
	WHITE(0, new Vector3f(238, 237, 233)), ORANGE(1, new Vector3f(228, 113, 10)), MAGENTA(2, new Vector3f(172, 62, 166)), LIGHT_BLUE(3, new Vector3f(143, 211, 230)), YELLOW(4, new Vector3f(231, 204, 54)), LIME(5, new Vector3f(93, 234, 68)), PINK(6, new Vector3f(216, 147, 178)), GRAY(7, new Vector3f(70, 70, 70)), SILVER(8, new Vector3f(187, 187, 191)), CYAN(9, new Vector3f(67, 181, 216)), PURPLE(10, new Vector3f(119, 28, 142)), BLUE(11, new Vector3f(56, 95, 183)), BROWN(12, new Vector3f(117, 77, 43)), GREEN(13, new Vector3f(52, 122, 29)), RED(14, new Vector3f(168, 21, 24)), BLACK(15, new Vector3f(25, 25, 25));

	private int ID;
	private Vector3f color;

	EnumTeamColors(int ID, Vector3f color) {
		this.ID = ID;
		this.color = color;
	}

	public int getId() {
		return ID;
	}

	public Color getColor() {
		return new Color(color.x, color.y, color.z);
	}

	public float getR() {
		return color.x;
	}

	public float getG() {
		return color.y;
	}

	public float getB() {
		return color.z;
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