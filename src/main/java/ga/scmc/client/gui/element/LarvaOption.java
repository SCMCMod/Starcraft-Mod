package ga.scmc.client.gui.element;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is an option for the larva morph larva GUI.
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

	/**
	 * Creates a new larva option with the specified prices.
	 * 
	 * @param mineralCost
	 *            The cost in minerals
	 * @param vespeneCost
	 *            The cost in vespene
	 */
	public LarvaOption(int mineralCost, int vespeneCost) {
		this.mineralCost = mineralCost;
		this.vespeneCost = vespeneCost;
		this.iconId = nextIconId++;
		this.tooltip = new ArrayList<String>();
		this.children = new ArrayList<LarvaOption>();
		this.isChild = false;
	}

	/**
	 * Creates a new larva option that has the specified children.
	 * 
	 * @param options
	 *            The options to be added as children
	 */
	public LarvaOption(LarvaOption... options) {
		this.mineralCost = -1;
		this.vespeneCost = -1;
		this.iconId = nextIconId++;
		this.tooltip = new ArrayList<String>();
		this.children = new ArrayList<LarvaOption>();
		this.isChild = false;

		for (int i = 0; i < options.length; i++) {
			if (options[i] != null) {
				addChild(options[i]);
			}
		}
	}

	/**
	 * @return The id the option uses to render
	 */
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

	/**
	 * Sets the highlighted tooltip to the specified string.
	 * 
	 * @param tooltip
	 *            The tooltip for the option
	 */
	public LarvaOption setTooltip(String tooltip) {
		this.tooltip.clear();
		this.tooltip.add(tooltip);
		return this;
	}

	/**
	 * Sets the highlighted tooltip to the specified string with the specified string to add new lines.
	 * 
	 * @param tooltip
	 *            The tooltip for the option
	 * @param delimeter
	 *            The split point in the string
	 */
	public LarvaOption setTooltip(String tooltip, String delimeter) {
		String[] tokens = tooltip.split(delimeter);
		this.tooltip.clear();
		for (int i = 0; i < tokens.length; i++)
			this.tooltip.add(tokens[i]);

		return this;
	}

	/**
	 * Adds a new child option to the option.
	 * 
	 * @param child
	 *            The child to add
	 * @deprecated Use the second constructor instead of this because it works better
	 */
	public LarvaOption addChild(LarvaOption child) {
		if (!this.isChild) {
			child.isChild = true;
			this.children.add(child);
		}
		return this;
	}
}