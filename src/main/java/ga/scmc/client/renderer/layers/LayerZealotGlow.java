package ga.scmc.client.renderer.layers;

import javax.vecmath.Vector4f;

import org.lwjgl.opengl.GL11;

import ga.scmc.client.renderer.entity.RenderZealot;
import ga.scmc.entity.living.EntityZealot;
import ga.scmc.lib.Library;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @since 1.6
 * @author Ocelot5836
 */
@SideOnly(Side.CLIENT)
public class LayerZealotGlow<T extends EntityZealot> implements LayerRenderer<T> {

	private static final ResourceLocation ZEALOT_LAYER_GLOW = new ResourceLocation(Library.MODID, "textures/entity/zealot_layer_glow.png");
	private final RenderZealot<T> zealotRenderer;
	private Vector4f color;

	public LayerZealotGlow(RenderZealot<T> zealotRendererIn, Vector4f color) {
		this.zealotRenderer = zealotRendererIn;
		this.color = color;
	}

	public LayerZealotGlow(RenderZealot<T> zealotRendererIn, float r, float g, float b) {
		this(zealotRendererIn, new Vector4f(r / 255, g / 255, b / 255, 1.0f));
	}

	public LayerZealotGlow(RenderZealot<T> zealotRendererIn, float r, float g, float b, float alpha) {
		this(zealotRendererIn, new Vector4f(r / 255, g / 255, b / 255, alpha / 255));
	}

	public LayerZealotGlow(RenderZealot<T> zealotRendererIn) {
		this(zealotRendererIn, new Vector4f(0, 0, 0, 0));
	}

	public void doRenderLayer(EntityZealot entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		this.zealotRenderer.bindTexture(ZEALOT_LAYER_GLOW);
		GlStateManager.enableBlend();
		GlStateManager.enableAlpha();
		GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);

		if (entitylivingbaseIn.isInvisible()) {
			GlStateManager.depthMask(false);
		} else {
			GlStateManager.depthMask(true);
		}

		GL11.glColor4f(color.x, color.y, color.z, color.w);

		int i = 61680;
		int j = i % 65536;
		int k = i / 65536;
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) j, (float) k);
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		this.zealotRenderer.getMainModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		i = entitylivingbaseIn.getBrightnessForRender(partialTicks);
		j = i % 65536;
		k = i / 65536;
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) j, (float) k);
		this.zealotRenderer.setLightmap(entitylivingbaseIn, partialTicks);
		GlStateManager.disableBlend();
		GlStateManager.enableAlpha();
	}

	@Override
	public boolean shouldCombineTextures() {
		return false;
	}
}