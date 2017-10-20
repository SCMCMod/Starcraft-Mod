package ga.scmc.client.renderer.layers;

import org.lwjgl.opengl.GL11;

import ga.scmc.client.renderer.entity.RenderZerglingSC2;
import ga.scmc.entity.living.EntityZerglingSC2;
import ga.scmc.lib.Library;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @since 1.6
 * @author Ocelot5836
 */
@SideOnly(Side.CLIENT)
public class LayerZerglingColor<T extends EntityZerglingSC2> implements LayerRenderer<T> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(Library.RL_BASE + "textures/entity/zergling_overlay.png");
	private final RenderZerglingSC2<T> RENDERER;

	public LayerZerglingColor(RenderZerglingSC2<T> rendererIn) {
		this.RENDERER = rendererIn;
	}

	public void doRenderLayer(EntityZerglingSC2 entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		this.RENDERER.bindTexture(TEXTURE);
		GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);

		if (entitylivingbaseIn.isInvisible()) {
			GlStateManager.depthMask(false);
		} else {
			GlStateManager.depthMask(true);
		}

		GL11.glColor3f(entitylivingbaseIn.getTeamColor().getR() / 255, entitylivingbaseIn.getTeamColor().getG() / 255, entitylivingbaseIn.getTeamColor().getB() / 255);
		this.RENDERER.getMainModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		GlStateManager.resetColor();
	}

	@Override
	public boolean shouldCombineTextures() {
		return true;
	}
}