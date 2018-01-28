package ga.scmc.client.renderer.tileentity;

import ga.scmc.client.renderer.model.blocks.ModelZerusGlowPod;
import ga.scmc.lib.Library;
import ga.scmc.tileentity.TileEntityZerusGlowPod;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Ocelot5836
 */
@SideOnly(Side.CLIENT)
public class RendererZerusGlowPod extends TileEntitySpecialRenderer<TileEntityZerusGlowPod> {

	private static final ModelZerusGlowPod MODEL = new ModelZerusGlowPod();
	private static final ResourceLocation TEXTURE = new ResourceLocation(Library.MODID, "textures/models/block/zerus_glow_pod.png");
	
	@Override
	public void renderTileEntityAt(TileEntityZerusGlowPod te, double x, double y, double z, float partialTicks, int destroyStage) {
		super.renderTileEntityAt(te, x, y, z, partialTicks, destroyStage);
		GlStateManager.pushMatrix();
		GlStateManager.translate(x + 0.5, y + 1.5, z + 0.5);
		GlStateManager.rotate(180, 0, 0, 1);
		bindTexture(TEXTURE);
		MODEL.render(0.0625f, te.getPulsingProgress());
		GlStateManager.popMatrix();
	}
}