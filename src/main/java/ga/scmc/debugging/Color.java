package ga.scmc.debugging;

import ga.scmc.enums.TeamColors;

/**
 * 
 * Default implementation of IMana
 * 
 */

public class Color implements IColor

{

	private int color = 0;

	@Override
	public void set(int color) {
		this.color = color;
	}

	@Override
	public int getColor() {
		return color;
	}

}