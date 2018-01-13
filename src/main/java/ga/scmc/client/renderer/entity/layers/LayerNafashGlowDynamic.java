package ga.scmc.client.renderer.entity.layers;

import org.lwjgl.opengl.GL11;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.RenderNafash;
import ga.scmc.entity.living.EntityNafash;
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
public class LayerNafashGlowDynamic<T extends EntityNafash> implements LayerRenderer<T> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.BROODMOTHER_GLOW_DYNAMIC);
	private final RenderNafash<T> RENDERER;

	public LayerNafashGlowDynamic(RenderNafash<T> zealotRendererIn) {
		this.RENDERER = zealotRendererIn;
	}

	public void doRenderLayer(EntityNafash entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.renderDynamicGlow(this.RENDERER, entitylivingbaseIn, TEXTURE, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures() {
		return false;
	}
}