package ga.scmc.client.gui.element;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is an option for the lava larva GUI.
 * 
 * @author Ocelot5836
 */
public class LarvaOption {

	private static int nextIconId;
	
	private int iconId;
	private List<String> tooltip;

	private int mineralCost;
	private int vespeneCost;

	public LarvaOption() {
		this.iconId = nextIconId++;
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

	public int getMineralCost() {
		return mineralCost;
	}
	
	public int getVespeneCost() {
		return vespeneCost;
	}

	public LarvaOption setTooltip(String tooltip) {
		this.tooltip.clear();
		this.tooltip.add(tooltip);
		return this;
	}

	public LarvaOption setTooltip(String tooltip, String delimeter) {
		String[] tokens = tooltip.split(delimeter);
		this.tooltip.clear();
		for (int i = 0; i < tokens.length; i++)
			this.tooltip.add(tokens[i]);

		return this;
	}

	public LarvaOption setCost(int mineralCost, int vespeneCost) {
		this.mineralCost = mineralCost;
		this.vespeneCost = vespeneCost;
		return this;
	}
}