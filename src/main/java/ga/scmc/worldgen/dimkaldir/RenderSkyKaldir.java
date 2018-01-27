package ga.scmc.worldgen.dimkaldir;

import java.util.Random;

import org.lwjgl.opengl.GL11;

import com.arisux.mdx.lib.client.render.Color;
import com.arisux.mdx.lib.client.render.Draw;
import com.arisux.mdx.lib.client.render.OpenGL;
import com.arisux.mdx.lib.game.Game;
import com.arisux.mdx.lib.game.GameResources;

import ga.scmc.worldgen.DimensionUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.client.IRenderHandler;
import ocelot.api.utils.TextureUtils;

public class RenderSkyKaldir extends IRenderHandler {
	private Color skyColor = new Color(0.11F, 0.225F, 0.265F, 1F);
	protected Color cloudColor = new Color(0.075F, 0.1F, 0.15F, 0.75F);
	public int starGLCallList = GLAllocation.generateDisplayLists(3);

	public RenderSkyKaldir() {
		this.generateStars();
	}

	private void generateStars() {
		Tessellator tessellator = Tessellator.getInstance();
		VertexBuffer vertexbuffer = tessellator.getBuffer();

		if (this.starGLCallList >= 0) {
			GLAllocation.deleteDisplayLists(this.starGLCallList);
			this.starGLCallList = -1;
		}

		this.starGLCallList = GLAllocation.generateDisplayLists(1);
		GlStateManager.pushMatrix();
		GlStateManager.glNewList(this.starGLCallList, 4864);
		this.renderStars(vertexbuffer);
		GlStateManager.glEndList();
		GlStateManager.popMatrix();

		this.starGLCallList += 1;
	}

	private void renderStars(VertexBuffer buffer) {
		Random random = new Random(10842L);
		buffer.begin(7, DefaultVertexFormats.POSITION);

		for (int i = 0; i < 1500; ++i) {
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

	@Override
	public void render(float partialTicks, WorldClient world, Minecraft mc) {
		if (world.provider instanceof WorldProviderKaldir) {
			WorldProviderKaldir provider = (WorldProviderKaldir) world.provider;

			GlStateManager.disableTexture2D();
			GL11.glColor3f(1.0F, 1.0F, 1.0F);
			GlStateManager.depthMask(false);
			GlStateManager.disableFog();
			GL11.glColor3f(skyColor.r, skyColor.g, skyColor.b);

			/** Render Sky **/
			GlStateManager.disableFog();
			GlStateManager.disableAlpha();
			GlStateManager.enableBlend();
			OpenGL.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
			OpenGL.color(1.0F, 1.0F, 1.0F, provider.getStarBrightness(partialTicks) * 2);

			/** Render Stars **/
			this.renderStars(Tessellator.getInstance().getBuffer());

			GlStateManager.enableTexture2D();
			OpenGL.blendFunc(GL11.GL_SRC_ALPHA, 1);

			OpenGL.pushMatrix();
			{
				float scale = 30.0F;
				OpenGL.rotate(-90.0F, 0.0F, 1.0F, 0.0F);
				OpenGL.color(1.0F, 1.0F, 1.0F, 1.0F);
				OpenGL.rotate(world.getCelestialAngle(partialTicks) * 360.0F, 1.0F, 0.0F, 0.0F);
				Draw.bindTexture(GameResources.SKY_SUN);
				Draw.startQuads();
				Draw.vertex(-scale, 150.0D, -scale, 0.0D, 0.0D).endVertex();
				Draw.vertex(scale, 150.0D, -scale, 1.0D, 0.0D).endVertex();
				Draw.vertex(scale, 150.0D, scale, 1.0D, 1.0D).endVertex();
				Draw.vertex(-scale, 150.0D, scale, 0.0D, 1.0D).endVertex();
				Draw.tessellate();
			}
			OpenGL.popMatrix();

			OpenGL.pushMatrix();
			{
				float scale = 175.0F;
				OpenGL.translate(30F, 0F, 0F);
				OpenGL.rotate(DimensionUtil.calculateCelestialAngle(world.getWorldTime(), partialTicks) * 360.0F, 0.0F, 1.0F, 0.0F);
				OpenGL.color(1.0F, 1.0F, 1.0F, 1.0F);
				OpenGL.rotate(DimensionUtil.calculateCelestialAngle(world.getWorldTime(), partialTicks) * 360.0F, 10.0F, -6.0F, -20.0F);
				OpenGL.rotate(135F, 0.0F, 1.0F, 0.0F);
				TextureUtils.bindTexture("textures/world/Midr-IV.png");
				Draw.startQuads();
				Draw.vertex(-scale, 150.0D, -scale, 0.0D, 0.0D).endVertex();
				Draw.vertex(scale, 150.0D, -scale, 1.0D, 0.0D).endVertex();
				Draw.vertex(scale, 150.0D, scale, 1.0D, 1.0D).endVertex();
				Draw.vertex(-scale, 150.0D, scale, 0.0D, 1.0D).endVertex();
				Draw.tessellate();
			}
			OpenGL.popMatrix();

			OpenGL.blendClear();
			GlStateManager.disableBlend();
			GlStateManager.enableAlpha();
			GlStateManager.enableTexture2D();
			GlStateManager.depthMask(true);
		}
	}
}