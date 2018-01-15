package ga.scmc.client.renderer.tileentity;

import ga.scmc.client.renderer.model.blocks.ModelZerusLightcap;
import ga.scmc.client.renderer.model.blocks.ModelZerusLightcapVariant;
import ga.scmc.lib.Library;
import ga.scmc.tileentity.TileEntityZerusLightcap;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;
import ocelot.api.utils.TextureUtils;

public class RendererZerusLightcap extends TileEntitySpecialRenderer<TileEntityZerusLightcap> {

	public static final ModelZerusLightcap MODEL = new ModelZerusLightcap();
	public static final ModelZerusLightcapVariant MODEL_VARIANT = new ModelZerusLightcapVariant();

	public static final ResourceLocation TEXTURE = new ResourceLocation(Library.RL_BASE + "textures/models/block/zerus_lightcap.png");
	
	@Override
	public void renderTileEntityAt(TileEntityZerusLightcap te, double x, double y, double z, float partialTicks, int destroyStage) {
		super.renderTileEntityAt(te, x, y, z, partialTicks, destroyStage);
		GlStateManager.pushMatrix();
		GlStateManager.translate(x + 0.5, y + 1.5, z + 0.5);
		GlStateManager.rotate(180, 0, 0, 1);
		bindTexture(TEXTURE);
		MODEL.render(0.0625f);
		GlStateManager.popMatrix();
	}
}