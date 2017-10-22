package ga.scmc.client.gui.element;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is an option for the lava larva GUI.
 * 
 * @author Ocelot5836
 */
public class LarvaOption {

	private int iconId;
	private List<String> tooltip;

	public LarvaOption(int iconId) {
		this.iconId = iconId;
		this.tooltip = new ArrayList<String>();
	}

	public void render() {

	}

	public int getIconId() {
		return iconId;
	}

	public List<String> getTooltip() {
		return tooltip;
	}

	public LarvaOption setTooltip(String tooltip) {
		this.tooltip.add(tooltip);
		return this;
	}

	public LarvaOption setTooltip(String tooltip, String delimeter) {
		String[] tokens = tooltip.split(delimeter);
		for (int i = 0; i < tokens.length; i++)
			this.tooltip.add(tokens[i]);

		return this;
	}
}