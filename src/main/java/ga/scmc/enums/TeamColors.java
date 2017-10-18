package ga.scmc.enums;

import org.lwjgl.util.vector.Vector3f;

public enum TeamColors {
	PURPLE(0, new Vector3f(119, 28, 142)),
	BROWN(1, new Vector3f(117, 77, 43)),
	PINK(2, new Vector3f(216, 147, 178)),
	BLUE(3, new Vector3f(40, 91, 200)),
	CYAN(4, new Vector3f(67, 181, 216)),
	GRAY(5, new Vector3f(70, 70, 70)),
	GREEN(6, new Vector3f(52, 122, 29)),
	LIGHTBLUE(7, new Vector3f(143, 211, 230)),
	LIME(8, new Vector3f(93, 234, 68)),
	MAGENTA(9, new Vector3f(172, 62, 166)),
	ORANGE(10, new Vector3f(228, 113, 10)),
	RED(11, new Vector3f(168, 21, 24)),
	SILVER(12, new Vector3f(187, 187, 191)),
	WHITE(13, new Vector3f(238, 237, 233)),
	YELLOW(14, new Vector3f(231, 204, 54));
	
	public int ID;
	private Vector3f color;

	TeamColors(int ID,  Vector3f color) {
		this.ID = ID;
		this.color = color;
	}
	
	int getId() {
		return ID;
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
}