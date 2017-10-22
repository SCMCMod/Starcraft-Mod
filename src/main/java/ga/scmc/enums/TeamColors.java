package ga.scmc.enums;

import org.lwjgl.util.vector.Vector3f;

import ga.scmc.lib.StarcraftUtils;

public enum TeamColors {
	WHITE(0, new Vector3f(238, 237, 233)), ORANGE(1, new Vector3f(228, 113, 10)), MAGENTA(2, new Vector3f(172, 62, 166)), LIGHT_BLUE(3, new Vector3f(143, 211, 230)), YELLOW(4, new Vector3f(231, 204, 54)), LIME(5, new Vector3f(93, 234, 68)), PINK(6, new Vector3f(216, 147, 178)), GRAY(7, new Vector3f(70, 70, 70)), SILVER(8, new Vector3f(187, 187, 191)), CYAN(9, new Vector3f(67, 181, 216)), PURPLE(10, new Vector3f(119, 28, 142)), BLUE(11, new Vector3f(56, 95, 183)), BROWN(12, new Vector3f(117, 77, 43)), GREEN(13, new Vector3f(52, 122, 29)), RED(14, new Vector3f(168, 21, 24)), BLACK(15, new Vector3f(25, 25, 25));

	private int ID;
	private Vector3f color;

	TeamColors(int ID, Vector3f color) {
		this.ID = ID;
		this.color = color;
	}

	public int getId() {
		return ID;
	}
	
	public Vector3f getColor() {
		return color;
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

	public static TeamColors getColorById(int id) {
		return TeamColors.values()[id];
	}

	public static TeamColors getColorByMeta(int id) {
		return TeamColors.values()[TeamColors.values().length - id];
	}

	public static TeamColors getColorStarcraft(int id) {
		return TeamColors.values()[StarcraftUtils.minecraftColorToStarcraftColor(id)];
	}
}