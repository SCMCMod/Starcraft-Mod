package io.github.scmcmod.client.gui.element;

import java.io.IOException;

import com.google.common.collect.ImmutableList;
import com.ocelot.api.utils.TimeUtils;

import io.github.scmcmod.SCConstants;
import io.github.scmcmod.client.gui.GuiLists.Product;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.config.GuiUtils;
import net.rom.utils.CoreUtil;

/**
 * @author Ocelot5836
 */
public class ItemShopTab extends GuiScreen
{

	private static final Minecraft MC = Minecraft.getMinecraft();
	private ResourceLocation texture;

	private ImmutableList<Product> items;
	private ItemStack icon;
	private String name;
	private int x;
	private int y;
	private int width;
	private int height;
	private boolean selected;

	private int xOffset = 14;

	public ItemShopTab(ItemStack icon, String name, int x, int y, ImmutableList<Product> items)
	{
		this(icon, name, x, y, 32, 28, TimeUtils.isChristmas() ? new ResourceLocation(SCConstants.MODID + "textures/gui/item_shop/item_shop_christmas.png") : new ResourceLocation(SCConstants.MODID + "textures/gui/item_shop/item_shop.png"), items);
	}

	public ItemShopTab(ItemStack icon, String name, int x, int y, ResourceLocation texture, ImmutableList<Product> items)
	{
		this(icon, name, x, y, 32, 28, texture, items);
	}

	public ItemShopTab(ItemStack icon, String name, int x, int y, int width, int height, ImmutableList<Product> items)
	{
		this(icon, name, x, y, width, height, TimeUtils.isChristmas() ? new ResourceLocation(SCConstants.MODID + "textures/gui/item_shop/item_shop_christmas.png") : new ResourceLocation(SCConstants.MODID + "textures/gui/item_shop/item_shop.png"), items);
	}

	public ItemShopTab(ItemStack icon, String name, int x, int y, int width, int height, ResourceLocation texture, ImmutableList<Product> items)
	{
		this.icon = icon;
		this.name = name;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.items = items;
		this.texture = texture;
	}

	public void renderBackground(int x, int y, int width, int height)
	{
		bindTexture();
		GlStateManager.color(1, 1, 1, 1);
		drawTexturedModalRect(x, y, 0, 0, width, height);
	}

	public void renderUnlit(int mouseX, int mouseY)
	{
		if (!selected)
		{
			bindTexture();
			GlStateManager.color(1, 1, 1, 1);
			this.drawTexturedModalRect(x, y, 152, 16, width, height);
		}
	}

	public void renderLit(int mouseX, int mouseY)
	{
		if (selected)
		{
			bindTexture();
			GlStateManager.color(1, 1, 1, 1);
			this.drawTexturedModalRect(x, y, 152, 44, width, height);
		}
	}

	public void renderIcon()
	{
		MC.getRenderItem().renderItemAndEffectIntoGUI(icon, x + 9, y + 7);
	}

	public void onMouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException
	{
//		if (GuiUtils.isMouseInside(x, y, width, height, mouseX, mouseY))
//		{
//			GuiUtils.playButtonClick();
//		}
	}

	public void bindTexture()
	{
		CoreUtil.bindTexture(texture);
	}

	public String getName()
	{
		return name;
	}

	public float getX()
	{
		return x;
	}

	public float getY()
	{
		return y;
	}

	public int getWidth()
	{
		return width;
	}

	public int getHeight()
	{
		return height;
	}

	public boolean isSelected()
	{
		return selected;
	}

	public void select()
	{
		this.selected = true;
	}

	public void deselect()
	{
		this.selected = false;
	}

	public ImmutableList<Product> getItems()
	{
		return items;
	}
}
