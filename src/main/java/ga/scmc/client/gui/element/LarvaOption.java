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
	private List<LarvaOption> children;
	private boolean isChild;

	private int mineralCost;
	private int vespeneCost;

	public LarvaOption(int mineralCost, int vespeneCost) {
		this.mineralCost = mineralCost;
		this.vespeneCost = vespeneCost;
		this.iconId = nextIconId++;
		this.tooltip = new ArrayList<String>();
		this.children = new ArrayList<LarvaOption>();
		this.isChild = false;
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

	public LarvaOption[] getChildren() {
		LarvaOption[] result = new LarvaOption[children.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = children.get(i);
		}
		return result;
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

	public LarvaOption addChild(LarvaOption child) {
		if (!this.isChild) {
			child.isChild = true;
			this.children.add(child);
		}
		return this;
	}
}