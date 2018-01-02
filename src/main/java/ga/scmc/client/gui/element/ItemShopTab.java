package ga.scmc.client.gui.element;

import java.io.IOException;

import com.google.common.collect.ImmutableList;

import ga.scmc.client.gui.GuiLists.Product;
import ga.scmc.lib.Library;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import ocelot.api.utils.GuiUtils;
import ocelot.api.utils.SoundUtils;
import ocelot.api.utils.TextureUtils;
import ocelot.api.utils.TimeUtils;

/**
 * @author Ocelot5836
 */
public class ItemShopTab extends GuiScreen {

	private static final Minecraft MC = Minecraft.getMinecraft();
	private ResourceLocation texture;

	private ImmutableList<Product> items;
	private ItemStack icon;
	private String name;
	private int id;
	private int x;
	private int y;
	private int width;
	private int height;
	private boolean selected;

	private int xOffset = 14;

	public ItemShopTab(ItemStack icon, String name, int id, int x, int y, ImmutableList<Product> items) {
		this(icon, name, id, x, y, 32, 28, TimeUtils.isChristmas() ? new ResourceLocation(Library.RL_BASE + "textures/gui/itemShop/item_shop_christmas.png") : new ResourceLocation(Library.RL_BASE + "textures/gui/itemShop/item_shop.png"), items);
	}

	public ItemShopTab(ItemStack icon, String name, int id, int x, int y, ResourceLocation texture, ImmutableList<Product> items) {
		this(icon, name, id, x, y, 32, 28, texture, items);
	}

	public ItemShopTab(ItemStack icon, String name, int id, int x, int y, int width, int height, ImmutableList<Product> items) {
		this(icon, name, id, x, y, width, height, TimeUtils.isChristmas() ? new ResourceLocation(Library.RL_BASE + "textures/gui/itemShop/item_shop_christmas.png") : new ResourceLocation(Library.RL_BASE + "textures/gui/itemShop/item_shop.png"), items);
	}

	public ItemShopTab(ItemStack icon, String name, int id, int x, int y, int width, int height, ResourceLocation texture, ImmutableList<Product> items) {
		this.icon = icon;
		this.name = name;
		this.id = id;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.items = items;
		this.texture = texture;
	}

	public void renderBackground(int x, int y, int width, int height) {
		bindTexture();
		GlStateManager.color(1, 1, 1, 1);
		drawTexturedModalRect(x, y, 0, 0, width, height);
	}

	public void renderUnlit(int mouseX, int mouseY) {
		if (!selected) {
			bindTexture();
			GlStateManager.color(1, 1, 1, 1);
			this.drawTexturedModalRect(x, y, 152, 16, width, height);
		}
	}

	public void renderLit(int mouseX, int mouseY) {
		if (selected) {
			bindTexture();
			GlStateManager.color(1, 1, 1, 1);
			this.drawTexturedModalRect(x, y, 152, 44, width, height);
		}
	}

	public void renderIcon() {
		MC.getRenderItem().renderItemAndEffectIntoGUI(icon, x + 9, y + 7);
	}

	public void onMouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
		if (GuiUtils.isMouseInside(x, y, width, height, mouseX, mouseY)) {
			SoundUtils.playButtonClick();
		}
	}

	public void bindTexture() {
		TextureUtils.bindTexture(texture);
	}

	public String getName() {
		return name;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public boolean isSelected() {
		return selected;
	}

	public void select() {
		this.selected = true;
	}

	public void deselect() {
		this.selected = false;
	}

	public ImmutableList<Product> getItems() {
		return items;
	}
}