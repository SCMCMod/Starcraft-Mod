package ga.scmc.client.renderer.entity.layers;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.RenderZeratul;
import ga.scmc.entity.living.EntityZeratul;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerZeratulGlowStatic<T extends EntityZeratul> implements LayerRenderer<T> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.ZERATUL_GLOW_STATIC);
    private final RenderZeratul<T> RENDERER;

    public LayerZeratulGlowStatic(RenderZeratul<T> darktemplarRendererIn) {
        RENDERER = darktemplarRendererIn;
    }

    @Override
    public void doRenderLayer(EntityZeratul entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, TEXTURE, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }
}
