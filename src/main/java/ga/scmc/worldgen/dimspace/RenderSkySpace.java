package ga.scmc.worldgen.dimspace;

import java.util.Random;

import org.lwjgl.opengl.GL11;

import hypeirochus.api.client.render.OpenGL;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RenderSkySpace extends IRenderHandler {
	public int glCallListStars = GLAllocation.generateDisplayLists(3);

	public RenderSkySpace() {
		this.generateStars();
	}

	private void generateStars() {
		Tessellator tessellator = Tessellator.getInstance();
		VertexBuffer vertexbuffer = tessellator.getBuffer();

		if (this.glCallListStars >= 0) {
			GLAllocation.deleteDisplayLists(this.glCallListStars);
			this.glCallListStars = -1;
		}

		this.glCallListStars = GLAllocation.generateDisplayLists(1);
		GlStateManager.pushMatrix();
		GlStateManager.glNewList(this.glCallListStars, 4864);
		this.renderStars(vertexbuffer);
		GlStateManager.glEndList();
		GlStateManager.popMatrix();

		this.glCallListStars += 1;
	}

	private void renderStars(VertexBuffer buffer) {
		Random random = new Random(10842L);
		buffer.begin(7, DefaultVertexFormats.POSITION);

		for (int stars = 0; stars < 1500; ++stars) {
			double d0 = (double) (random.nextFloat() * 2.0F - 1.0F);
			double d1 = (double) (random.nextFloat() * 2.0F - 1.0F);
			double d2 = (double) (random.nextFloat() * 2.0F - 1.0F);
			double d3 = (double) (0.15F + random.nextFloat() * 0.1F);
			double d4 = d0 * d0 + d1 * d1 + d2 * d2;

			if (d4 < 1.0D && d4 > 0.01D) {
				d4 = 1.0D / Math.sqrt(d4);
				d0 = d0 * d4;
				d1 = d1 * d4;
				d2 = d2 * d4;
				double d5 = d0 * 100.0D;
				double d6 = d1 * 100.0D;
				double d7 = d2 * 100.0D;
				double d8 = Math.atan2(d0, d2);
				double d9 = Math.sin(d8);
				double d10 = Math.cos(d8);
				double d11 = Math.atan2(Math.sqrt(d0 * d0 + d2 * d2), d1);
				double d12 = Math.sin(d11);
				double d13 = Math.cos(d11);
				double d14 = random.nextDouble() * Math.PI * 2.0D;
				double d15 = Math.sin(d14);
				double d16 = Math.cos(d14);

				for (int j = 0; j < 4; ++j) {
					double d18 = (double) ((j & 2) - 1) * d3;
					double d19 = (double) ((j + 1 & 2) - 1) * d3;
					double d21 = d18 * d16 - d19 * d15;
					double d22 = d19 * d16 + d18 * d15;
					double d23 = d21 * d12 + 0.0D * d13;
					double d24 = 0.0D * d12 - d21 * d13;
					double d25 = d24 * d9 - d22 * d10;
					double d26 = d22 * d9 + d24 * d10;
					buffer.pos(d5 + d25, d6 + d23, d7 + d26).endVertex();
				}
			}
		}
		Tessellator.getInstance().draw();
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void render(float partialTicks, WorldClient world, Minecraft mc) {
		if (world.provider instanceof WorldProviderSpace) {
			WorldProviderSpace provider = (WorldProviderSpace) world.provider;

			OpenGL.disable(GL11.GL_TEXTURE_2D);
			GL11.glColor3f(1.0F, 1.0F, 1.0F);
			GL11.glDepthMask(false);
			OpenGL.enable(GL11.GL_FOG);
			GL11.glColor3f(0.0F, 0.0F, 0.0F);

			/** Render Sky **/
			OpenGL.disable(GL11.GL_FOG);
			OpenGL.disable(GL11.GL_ALPHA_TEST);
			OpenGL.enable(GL11.GL_BLEND);
			OpenGL.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
			OpenGL.color(1.0F, 1.0F, 1.0F, 1.0F);

			/** Render Stars **/
			this.renderStars(Tessellator.getInstance().getBuffer());

			OpenGL.enable(GL11.GL_TEXTURE_2D);
			OpenGL.blendFunc(GL11.GL_SRC_ALPHA, 1);

			OpenGL.blendClear();
			// OpenGL.disable(GL11.GL_BLEND);
			OpenGL.enable(GL11.GL_FOG);
			OpenGL.enable(GL11.GL_ALPHA_TEST);
			OpenGL.enable(GL11.GL_ALPHA_TEST);
			OpenGL.enable(GL11.GL_TEXTURE_2D);
			GL11.glDepthMask(true);
		}
	}
}