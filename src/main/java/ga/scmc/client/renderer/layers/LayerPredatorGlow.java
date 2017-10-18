package ga.scmc.client.renderer.layers;

import org.lwjgl.opengl.GL11;

import ga.scmc.client.renderer.entity.RenderPredator;
import ga.scmc.entity.living.EntityPredator;
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
public class LayerPredatorGlow<T extends EntityPredator> implements LayerRenderer<T> {

	private static final ResourceLocation CYBERCAT_LAYER_GLOW = new ResourceLocation(Library.RL_BASE + "textures/entity/cybercat_team_glow.png");
	private final RenderPredator<T> zealotRenderer;

	public LayerPredatorGlow(RenderPredator<T> zealotRendererIn) {
		this.zealotRenderer = zealotRendererIn;
	}

	public void doRenderLayer(EntityPredator entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		this.zealotRenderer.bindTexture(CYBERCAT_LAYER_GLOW);
		GlStateManager.enableAlpha();
		GlStateManager.enableBlend();
		GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);

		if (entitylivingbaseIn.isInvisible()) {
			GlStateManager.depthMask(false);
		} else {
			GlStateManager.depthMask(true);
		}

		GL11.glColor3f(entitylivingbaseIn.getTeamColor().getR(), entitylivingbaseIn.getTeamColor().getG(), entitylivingbaseIn.getTeamColor().getB());

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
		GlStateManager.resetColor();
	}

	@Override
	public boolean shouldCombineTextures() {
		return false;
	}
}