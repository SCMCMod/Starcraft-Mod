package ocelot.api.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import ga.scmc.api.Utils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * <em><b>Copyright (c) 2017 Ocelot5836.</b></em>
 * 
 * @author Ocelot5836
 */
public class GuiUtils {

	/**
	 * Draws an array of lines to a gui.
	 * 
	 * @param lines
	 *            The lines to render
	 * @param x
	 *            The x position to render at
	 * @param y
	 *            The y position to render at
	 * @param color
	 *            The color of the text
	 */
	public static void drawLines(List<String> lines, int x, int y, int color) {
		for (int i = 0; i < lines.size(); i++) {
			Minecraft.getMinecraft().fontRendererObj.drawString(lines.get(i), x, y + (i * 8), color);
		}
	}

	/**
	 * Checks if the mouse is inside of the specified location.
	 * 
	 * @param x
	 *            The x position to check
	 * @param y
	 *            The y position to check
	 * @param width
	 *            The width of the check area
	 * @param height
	 *            The height of the check area
	 * @param mouseX
	 *            The x of the mouse
	 * @param mouseY
	 *            The y of the mouse
	 * @return Whether the mouse is inside of that location
	 */
	public static boolean isMouseInside(int x, int y, int width, int height, int mouseX, int mouseY) {
		if (mouseX >= x && mouseX <= (x + width) && mouseY >= y && mouseY < (y + height)) {
			return true;
		}
		return false;
	}

	/**
	 * Draws a gui with the specified parameters.
	 * 
	 * @param x
	 *            The x to draw the window at
	 * @param y
	 *            The y to draw the window at
	 * @param width
	 *            The width of the window
	 * @param height
	 *            The height of the window
	 * @param zLevel
	 *            <em> MAKE SURE NOT TO EDIT THIS VALUE UNLESS YOU KNOW WHAT YOU ARE DOING!!</em>
	 */
	@SideOnly(Side.CLIENT)
	public static void drawCustomSizeGui(int x, int y, int width, int height, GuiType type) {
		TextureUtils.bindTexture("ocelotutil", "textures/gui/util.png");
		GlStateManager.color(1F, 1F, 1F, 1F);

		int u = type.getU();
		int v = type.getV();
		int cellSize = type.getCellSize();

		GuiScreen.drawScaledCustomSizeModalRect(x + cellSize, y + cellSize, u + cellSize, v + cellSize, cellSize, cellSize, width - cellSize * 2, height - cellSize * 2, 256, 256);
		GuiScreen.drawScaledCustomSizeModalRect(x, y + cellSize, u, v + cellSize, cellSize, cellSize, cellSize, height - cellSize * 2, 256, 256);
		GuiScreen.drawScaledCustomSizeModalRect(x + width - cellSize, y + cellSize, u + cellSize * 2, v + cellSize, cellSize, cellSize, cellSize, height - cellSize * 2, 256, 256);
		GuiScreen.drawScaledCustomSizeModalRect(x + cellSize, y + height - cellSize, u + cellSize, v + cellSize * 2, cellSize, cellSize, width - cellSize * 2, cellSize, 256, 256);
		GuiScreen.drawScaledCustomSizeModalRect(x + cellSize, y, u + cellSize, v, cellSize, cellSize, width - cellSize * 2, cellSize, 256, 256);

		drawStaticTextureModelRect(x, y, u, v, cellSize, cellSize);
		drawStaticTextureModelRect(x + width - cellSize, y, u + cellSize * 2, v, cellSize, cellSize);
		drawStaticTextureModelRect(x, y + height - cellSize, u, v + cellSize * 2, cellSize, cellSize);
		drawStaticTextureModelRect(x + width - cellSize, y + height - cellSize, u + cellSize * 2, v + cellSize * 2, cellSize, cellSize);
	}

	/**
	 * Draws a default minecraft slot at the specified position with the specified size.
	 * 
	 * @param x
	 *            The x position
	 * @param y
	 *            The y position
	 * @param width
	 *            The width of the slot
	 * @param height
	 *            The height of the slot
	 */
	@SideOnly(Side.CLIENT)
	public static void drawSlot(int x, int y, int width, int height) {
		TextureUtils.bindTexture("ocelotutil", "textures/gui/util.png");
		GlStateManager.color(1F, 1F, 1F, 1F);
		GuiScreen.drawScaledCustomSizeModalRect(x + 1, y + 1, 1, 16, 0, 0, width - 2, height - 2, 256, 256);

		GuiScreen.drawScaledCustomSizeModalRect(x, y, 0, 15, 1, 1, 1, height - 1, 256, 256);
		GuiScreen.drawScaledCustomSizeModalRect(x + 1, y, 0, 15, 1, 1, width - 2, 1, 256, 256);
		GuiScreen.drawScaledCustomSizeModalRect(x + (width - 1), y, 2, 16, 1, 1, 1, height - 1, 256, 256);
		GuiScreen.drawScaledCustomSizeModalRect(x + 1, y + (height - 1), 1, 17, 1, 1, width - 1, 1, 256, 256);

		GuiScreen.drawScaledCustomSizeModalRect(x + (width - 1), y, 2, 15, 1, 1, 1, 1, 256, 256);
		GuiScreen.drawScaledCustomSizeModalRect(x, y + (height - 1), 0, 17, 1, 1, 1, 1, 256, 256);
	}

	/**
	 * Renders an entity to the screen.
	 * 
	 * @param x
	 *            The x position
	 * @param y
	 *            The y position
	 * @param scale
	 *            The scale of the entity
	 * @param mouseX
	 *            The mouse x position
	 * @param mouseY
	 *            The mouse y position
	 * @param entity
	 *            The entity to render
	 */
	@SideOnly(Side.CLIENT)
	public static void drawEntityOnScreen(int x, int y, int scale, float mouseX, float mouseY, EntityLivingBase entity) {
		if (entity != null) {
			GlStateManager.enableColorMaterial();
			GlStateManager.pushMatrix();
			GlStateManager.translate((float) x, (float) y, 50.0F);
			GlStateManager.scale((float) (-scale), (float) scale, (float) scale);
			GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
			float f = entity.renderYawOffset;
			float f1 = entity.rotationYaw;
			float f2 = entity.rotationPitch;
			float f3 = entity.prevRotationYawHead;
			float f4 = entity.rotationYawHead;
			GlStateManager.rotate(135.0F, 0.0F, 1.0F, 0.0F);
			RenderHelper.enableStandardItemLighting();
			GlStateManager.rotate(-135.0F, 0.0F, 1.0F, 0.0F);
			GlStateManager.rotate(-((float) Math.atan((double) (mouseY / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
			entity.renderYawOffset = (float) Math.atan((double) (mouseX / 40.0F)) * 20.0F;
			entity.rotationYaw = (float) Math.atan((double) (mouseX / 40.0F)) * 40.0F;
			entity.rotationPitch = -((float) Math.atan((double) (mouseY / 40.0F))) * 20.0F;
			entity.rotationYawHead = entity.rotationYaw;
			entity.prevRotationYawHead = entity.rotationYaw;
			GlStateManager.translate(0.0F, 0.0F, 0.0F);
			RenderManager rendermanager = Minecraft.getMinecraft().getRenderManager();
			rendermanager.setPlayerViewY(180.0F);
			rendermanager.setRenderShadow(false);
			rendermanager.doRenderEntity(entity, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F, false);
			rendermanager.setRenderShadow(true);
			entity.renderYawOffset = f;
			entity.rotationYaw = f1;
			entity.rotationPitch = f2;
			entity.prevRotationYawHead = f3;
			entity.rotationYawHead = f4;
			GlStateManager.popMatrix();
			RenderHelper.disableStandardItemLighting();
			GlStateManager.disableRescaleNormal();
			GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
			GlStateManager.disableTexture2D();
			GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
		} else {
			Utils.getLogger().warn("Trying to render an entity that is null!");
		}
	}

	/**
	 * A static reference to {@link #drawTexturedModalRect(float, float, int, int, int, int)}.
	 * 
	 * <br>
	 * </br>
	 * 
	 * <em> Draws a textured rectangle using the texture currently bound to the TextureManager </em>
	 * 
	 * @param zLevel
	 *            <em> MAKE SURE NOT TO EDIT THIS VALUE UNLESS YOU KNOW WHAT YOU ARE DOING!!</em>
	 */
	@SideOnly(Side.CLIENT)
	private static void drawStaticTextureModelRect(float x, float y, int minU, int minV, int maxU, int maxV) {
		float zLevel = 0;
		float f = 0.00390625F;
		float f1 = 0.00390625F;
		Tessellator tessellator = Tessellator.getInstance();
		VertexBuffer vertexbuffer = tessellator.getBuffer();
		vertexbuffer.begin(7, DefaultVertexFormats.POSITION_TEX);
		vertexbuffer.pos((double) (x + 0.0F), (double) (y + (float) maxV), (double) zLevel).tex((double) ((float) (minU + 0) * 0.00390625F), (double) ((float) (minV + maxV) * 0.00390625F)).endVertex();
		vertexbuffer.pos((double) (x + (float) maxU), (double) (y + (float) maxV), (double) zLevel).tex((double) ((float) (minU + maxU) * 0.00390625F), (double) ((float) (minV + maxV) * 0.00390625F)).endVertex();
		vertexbuffer.pos((double) (x + (float) maxU), (double) (y + 0.0F), (double) zLevel).tex((double) ((float) (minU + maxU) * 0.00390625F), (double) ((float) (minV + 0) * 0.00390625F)).endVertex();
		vertexbuffer.pos((double) (x + 0.0F), (double) (y + 0.0F), (double) zLevel).tex((double) ((float) (minU + 0) * 0.00390625F), (double) ((float) (minV + 0) * 0.00390625F)).endVertex();
		tessellator.draw();
	}

	/**
	 * Gets the username of a player based on the uuid given.
	 * 
	 * @param uuid
	 *            The uuid of the player.
	 * @return The name of the player if the uuid is valid
	 */
	public static String getPlayerName(String uuid) {
		String name = null;
		try {
			URL url = new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + uuid);
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
			StringBuilder sb = new StringBuilder();
			String line;

			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}

			JsonParser parser = new JsonParser();
			JsonElement obj = parser.parse(sb.toString().trim());
			name = obj.getAsJsonObject().get("name").getAsString();
			reader.close();
		} catch (Exception ex) {
			ex.printStackTrace();
			name = "Invalid UUID";
		}
		return name;
	}

	public static class GuiType {

		public static final GuiType DEFAULT = new GuiType(0, 0, 3, 3, 5);
		public static final GuiType BOOK = new GuiType(15, 0, 3, 3, 8);

		private int u, v, width, height, cellSize;

		private GuiType(int u, int v, int width, int height, int cellSize) {
			this.u = u;
			this.v = v;
			this.width = width;
			this.height = height;
			this.cellSize = cellSize;
		}

		public int getU() {
			return u;
		}

		public int getV() {
			return v;
		}

		public int getWidth() {
			return width;
		}

		public int getHeight() {
			return height;
		}

		public int getCellSize() {
			return cellSize;
		}
	}
}