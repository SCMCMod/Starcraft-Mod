package ga.scmc.client.renderer.entity.layers;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.RenderZealot;
import ga.scmc.entity.living.EntityZealot;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerZealotGlowStatic<T extends EntityZealot> implements LayerRenderer<T>
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.ZEALOT_GLOW_STATIC);
    private final RenderZealot<T> RENDERER;

    public LayerZealotGlowStatic(RenderZealot<T> ZealotRendererIn)
    {
        this.RENDERER = ZealotRendererIn;
    }

    public void doRenderLayer(EntityZealot entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, TEXTURE, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
    }

    @Override
    public boolean shouldCombineTextures()
    {
        return false;
    }
}