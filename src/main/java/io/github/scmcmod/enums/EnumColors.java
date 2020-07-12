package io.github.scmcmod.enums;

import java.awt.Color;

import io.github.scmcmod.lib.SCUtils;
import net.minecraft.util.IStringSerializable;

/**
 * This holds all the possible team colors for entities.
 * 
 * @author Ocelot5836
 */
public enum EnumColors implements IStringSerializable{
	WHITE("White", 238, 237, 233),
	ORANGE("Orange",228, 113, 10),
	MAGENTA("Magenta",172, 62, 166),
	LIGHT_BLUE("LightBlue",143, 211, 230),
	YELLOW("Yellow",231, 204, 54),
	LIME("Lime",93, 234, 68),
	PINK("Pink",216, 147, 178),
	GRAY("Gray",70, 70, 70),
	SILVER("Silver",187, 187, 191),
	CYAN("Cyan",67, 181, 216),
	PURPLE("Purple",153, 50, 204),
	BLUE("Blue",56, 95, 183),
	BROWN("Brown",117, 77, 43),
	GREEN("Green",52, 122, 29),
	RED("Red",168, 21, 24),
	BLACK("Black",25, 25, 25);

	private String name;
	private float r;
	private float g;
	private float b;

	EnumColors(String name, float r, float g, float b) {
		this.name = name;
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	@Override
	public String getName() {
		return name;
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
	 * @param id The id of the color
	 */
	public static EnumColors getColorById(int id) {
		return EnumColors.values()[id];
	}

	/**
	 * Gets the team color using metadata.
	 * 
	 * @param id The id of the color
	 */
	public static EnumColors getColorByMeta(int id) {
		return EnumColors.values()[EnumColors.values().length - id];
	}

	/**
	 * Gets the color from default minecraft ids to starcraft ids.
	 * 
	 * @param id The id of the color
	 */
	public static EnumColors getColorStarcraft(int id) {
		return EnumColors.values()[SCUtils.minecraftColorToStarcraftColor(id)];
	}
}