package ga.scmc.client.renderer.entity.layers;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.RenderZerglingPrimalDehaka;
import ga.scmc.entity.living.EntityZerglingPrimalDehaka;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerZerglingPrimalDehakaStatic<T extends EntityZerglingPrimalDehaka> implements LayerRenderer<T>
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.ZERGLINGPRIMALDEHAKA_GLOW_STATIC);
    private final RenderZerglingPrimalDehaka<T> RENDERER;

    public LayerZerglingPrimalDehakaStatic(RenderZerglingPrimalDehaka<T> zerglingRaptorRendererIn)
    {
        this.RENDERER = zerglingRaptorRendererIn;
    }

    public void doRenderLayer(EntityZerglingPrimalDehaka entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, TEXTURE, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
    }

    @Override
    public boolean shouldCombineTextures()
    {
        return false;
    }
}