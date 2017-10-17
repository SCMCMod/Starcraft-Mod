package ga.scmc.enums;

public enum TeamColors {
	PURPLE(0),
	BROWN(1),
	PINK(2),
	BLUE(3),
	CYAN(4),
	GRAY(5),
	GREEN(6),
	LIGHTBLUE(7),
	LIME(8),
	MAGENTA(9),
	ORANGE(10),
	RED(11),
	WHITE(12),
	YELLOW(13);
	
	public int ID;

	TeamColors(int ID) {
		this.ID = ID;
	}
	
	int getId() {
		return ID;
	}
}