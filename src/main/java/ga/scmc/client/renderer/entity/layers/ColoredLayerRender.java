package ga.scmc.client.renderer.entity.layers;

import ga.scmc.entity.living.EntityStarcraftPassive;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.util.ResourceLocation;

public class ColoredLayerRender {

    public static <T extends EntityStarcraftPassive> void render(RenderLiving<T> renderer, EntityStarcraftPassive entity, ResourceLocation overlayTexture, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        renderer.bindTexture(overlayTexture);
        GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);

        if(entity.isInvisible())
            GlStateManager.depthMask(false);
        else
            GlStateManager.depthMask(true);

        GlStateManager.color(entity.getTeamColor().getR() / 255.0F, entity.getTeamColor().getG() / 255.0F, entity.getTeamColor().getB() / 255.0F);
        renderer.getMainModel().render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
    }

}
