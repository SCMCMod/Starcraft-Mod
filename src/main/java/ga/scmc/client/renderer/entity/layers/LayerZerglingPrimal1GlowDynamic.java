package ga.scmc.client.renderer.entity.layers;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.RenderZerglingPrimal1;
import ga.scmc.entity.living.EntityZerglingPrimal1;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerZerglingPrimal1GlowDynamic<T extends EntityZerglingPrimal1> implements LayerRenderer<T>
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.ZERGLINGPRIMAL_GLOW_DYNAMIC);
    private final RenderZerglingPrimal1<T> RENDERER;

    public LayerZerglingPrimal1GlowDynamic(RenderZerglingPrimal1<T> zerglingSC2RendererIn)
    {
        this.RENDERER = zerglingSC2RendererIn;
    }

    public void doRenderLayer(EntityZerglingPrimal1 entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.renderDynamicGlow(this.RENDERER, entitylivingbaseIn, TEXTURE, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

    @Override
    public boolean shouldCombineTextures()
    {
        return false;
    }
}