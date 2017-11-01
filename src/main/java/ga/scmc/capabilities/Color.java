package ga.scmc.capabilities;

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