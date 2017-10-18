package ga.scmc.client.renderer.layers;

import ga.scmc.client.renderer.entity.RenderDarkTemplar;
import ga.scmc.entity.living.EntityDarkTemplar;
import ga.scmc.lib.Library;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerDarkTemplar<T extends EntityDarkTemplar> implements LayerRenderer<T> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(Library.RL_BASE + "textures/entity/darktemplar_layer.png");
    private final RenderDarkTemplar<T> renderer;

    public LayerDarkTemplar(RenderDarkTemplar<T> darktemplarRendererIn) {
        renderer = darktemplarRendererIn;
    }

    @Override
    public void doRenderLayer(EntityDarkTemplar entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
    	if(!entitylivingbaseIn.isInvisible()) {
    		renderer.bindTexture(TEXTURE);
    		GlStateManager.enableBlend();
    		GlStateManager.enableAlpha();
    		GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);

    		if(entitylivingbaseIn.isInvisible()) {
    			GlStateManager.depthMask(false);
    		} else {
    			GlStateManager.depthMask(true);
    		}

    		int i = 61680;
    		int j = i % 65536;
    		int k = i / 65536;
    		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j, (float)k);
    		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
    		renderer.getMainModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
    		i = entitylivingbaseIn.getBrightnessForRender(partialTicks);
    		j = i % 65536;
    		k = i / 65536;
    		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j, (float)k);
    		renderer.setLightmap(entitylivingbaseIn, partialTicks);
    		GlStateManager.disableBlend();
    		GlStateManager.enableAlpha();
    	}
    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }
}
