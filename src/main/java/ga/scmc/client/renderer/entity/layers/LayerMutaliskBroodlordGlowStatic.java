package ga.scmc.client.renderer.entity.layers;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.RenderMutaliskBroodlord;
import ga.scmc.entity.living.EntityMutaliskBroodlord;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerMutaliskBroodlordGlowStatic<T extends EntityMutaliskBroodlord> implements LayerRenderer<T> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.MUTALISK_GLOW_STATIC);
	private final RenderMutaliskBroodlord<T> RENDERER;

	public LayerMutaliskBroodlordGlowStatic(RenderMutaliskBroodlord<T> zerglingSC2RendererIn) {
		this.RENDERER = zerglingSC2RendererIn;
	}

	public void doRenderLayer(EntityMutaliskBroodlord entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, TEXTURE, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures() {
		return false;
	}
}