package ga.scmc.client.renderer.entity.layers;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.RenderMutaliskPrimalDehaka;
import ga.scmc.entity.living.EntityMutaliskPrimalDehaka;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerMutaliskPrimalDehakaGlowStatic<T extends EntityMutaliskPrimalDehaka> implements LayerRenderer<T>
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.MUTALISKPRIMALDEHAKA_GLOW_STATIC);
    private final RenderMutaliskPrimalDehaka<T> RENDERER;

    public LayerMutaliskPrimalDehakaGlowStatic(RenderMutaliskPrimalDehaka<T> zerglingSC2RendererIn)
    {
        this.RENDERER = zerglingSC2RendererIn;
    }

    public void doRenderLayer(EntityMutaliskPrimalDehaka entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, TEXTURE, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
    }

    @Override
    public boolean shouldCombineTextures()
    {
        return false;
    }
}