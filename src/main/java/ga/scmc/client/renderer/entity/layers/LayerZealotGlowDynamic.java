package ga.scmc.client.renderer.entity.layers;

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

@SideOnly(Side.CLIENT)
public class LayerZealotGlowDynamic<T extends EntityZealot> implements LayerRenderer<T> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Library.MODID, "textures/entity/zealot_glow_dynamic.png");
	private final RenderZealot<T> RENDERER;

	public LayerZealotGlowDynamic(RenderZealot<T> zealotRendererIn) {
		this.RENDERER = zealotRendererIn;
	}

	public void doRenderLayer(EntityZealot entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		this.RENDERER.bindTexture(TEXTURE);
		GlStateManager.enableBlend();
		GlStateManager.enableAlpha();
		GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);

		if (entitylivingbaseIn.isInvisible()) {
			GlStateManager.depthMask(false);
		} else {
			GlStateManager.depthMask(true);
		}

		int i = 61680;
		int j = i % 65536;
		int k = i / 65536;
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) j, (float) k);
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glColor3f(entitylivingbaseIn.getTeamColor().getR() / 255, entitylivingbaseIn.getTeamColor().getG() / 255, entitylivingbaseIn.getTeamColor().getB() / 255);
		this.RENDERER.getMainModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		i = entitylivingbaseIn.getBrightnessForRender(partialTicks);
		j = i % 65536;
		k = i / 65536;
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) j, (float) k);
		this.RENDERER.setLightmap(entitylivingbaseIn, partialTicks);
		GlStateManager.disableBlend();
		GlStateManager.enableAlpha();
		GlStateManager.resetColor();
	}

	@Override
	public boolean shouldCombineTextures() {
		return false;
	}
}