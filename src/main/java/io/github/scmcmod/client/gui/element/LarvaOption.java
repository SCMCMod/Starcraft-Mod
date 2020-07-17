package io.github.scmcmod.client.gui.element;

import java.util.ArrayList;
import java.util.List;

import io.github.scmcmod.entity.living.EntityHydralisk;
import io.github.scmcmod.entity.living.EntityLarvaCocoon;
import io.github.scmcmod.entity.living.EntityZergling;
import io.github.scmcmod.entity.living.EntityZerglingRaptor;
import io.github.scmcmod.entity.living.EntityZerglingSwarmling;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.fml.client.config.GuiUtils;

/**
 * This class is an option for the larva morph larva GUI.
 *
 * @author Ocelot5836
 */
public class LarvaOption
{

	private static int nextIconId;

	private int id;
	private List<String> tooltip;
	private List<LarvaOption> children;
	private boolean isChild;

	private int mineralCost;
	private int vespeneCost;

	/**
	 * Creates a new larva option with the specified prices.
	 *
	 * @param mineralCost The cost in minerals
	 * @param vespeneCost The cost in vespene
	 */
	public LarvaOption(int id, int mineralCost, int vespeneCost)
	{
		this.mineralCost = mineralCost;
		this.vespeneCost = vespeneCost;
		this.id = id;
		this.tooltip = new ArrayList<String>();
		this.children = new ArrayList<LarvaOption>();
		this.isChild = false;
	}

	/**
	 * Creates a new larva option that has the specified children.
	 *
	 * @param options The options to be added as children
	 */
	public LarvaOption(LarvaOption... options)
	{
		if (options.length > 0)
		{
			this.mineralCost = -1;
			this.vespeneCost = -1;
			this.tooltip = new ArrayList<String>();
			this.children = new ArrayList<LarvaOption>();
			this.isChild = false;

			for (int i = 0; i < options.length; i++)
			{
				if (options[i] != null)
				{
					addChild(options[i]);
				}
			}

			this.tooltip = children.get(0).getTooltip();
		} else
		{
			throw new IllegalArgumentException("A larva option with children must have at least 1 child!");
		}
	}

	public void render(boolean renderingOveray, int x, int y)
	{
		Minecraft mc = Minecraft.getMinecraft();

		EntityLivingBase entity = (EntityLivingBase) (hasChildren() ? EntityLarvaCocoon.getEntityById(mc.world, children.get(0).id) : EntityLarvaCocoon.getEntityById(mc.world, id));
		int xx = x + 8;
		int yy = y + 12;
		int scale = 12;

		if (entity instanceof EntityHydralisk)
		{
			scale = 4;
			xx += 2;
		}

		if (entity instanceof EntityZergling || entity instanceof EntityZerglingSwarmling || entity instanceof EntityZerglingRaptor)
		{
			scale = 8;
			yy += 2;
		}

		if (renderingOveray)
		{
			xx = x + 8;
			yy = y + 12;
			scale = 12;

			if (entity instanceof EntityZergling || entity instanceof EntityZerglingSwarmling || entity instanceof EntityZerglingRaptor)
			{
				scale = 8;
				yy += 2;
			}

			GlStateManager.color(1, 1, 1, 1);
//			GuiUtils.drawEntityOnScreen(xx, yy, scale, 100, -50, entity);
		} else
		{
			GlStateManager.enableDepth();
//			GuiUtils.drawEntityOnScreen(xx, yy, scale, 100, -50, entity);
			GlStateManager.disableDepth();
		}
		GlStateManager.color(1, 1, 1, 1);
	}

	/**
	 * @return The id of this option
	 */
	public int getId()
	{
		return id;
	}

	public List<String> getTooltip()
	{
		return tooltip;
	}

	public int getMineralCost()
	{
		return mineralCost;
	}

	public int getVespeneCost()
	{
		return vespeneCost;
	}

	public LarvaOption[] getChildren()
	{
		LarvaOption[] result = new LarvaOption[children.size()];
		for (int i = 0; i < result.length; i++)
		{
			result[i] = children.get(i);
		}
		return result;
	}

	public boolean hasChildren()
	{
		return children.size() > 0;
	}

	/**
	 * Sets the highlighted tooltip to the specified string.
	 *
	 * @param tooltip The tooltip for the option
	 */
	public LarvaOption setTooltip(String tooltip)
	{
		this.tooltip.clear();
		this.tooltip.add(tooltip);
		return this;
	}

	/**
	 * Sets the highlighted tooltip to the specified string with the specified
	 * string to add new lines.
	 *
	 * @param tooltip The tooltip for the option
	 * @param delimeter The split point in the string
	 */
	public LarvaOption setTooltip(String tooltip, String delimeter)
	{
		String[] tokens = tooltip.split(delimeter);
		this.tooltip.clear();
		for (int i = 0; i < tokens.length; i++)
			this.tooltip.add(tokens[i]);

		return this;
	}

	/**
	 * Adds a new child option to the option.
	 *
	 * @param child The child to add
	 * @deprecated Use the second constructor instead of this because it works
	 *             better
	 */
	public LarvaOption addChild(LarvaOption child)
	{
		if (!this.isChild)
		{
			child.isChild = true;
			this.children.add(child);
		}
		return this;
	}
}
