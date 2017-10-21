package ga.scmc.client.renderer.tileentity;

import ga.scmc.client.renderer.block.ModelTable;
import ga.scmc.lib.Library;
import ga.scmc.tileentity.TileEntityTest;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;

public class RendererTest extends TileEntitySpecialRenderer<TileEntityTest> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(Library.MODID, "textures/models/block/table.png");
	
	@Override
	public void renderTileEntityAt(TileEntityTest te, double x, double y, double z, float partialTicks, int destroyStage) {
		ModelTable model = new ModelTable();
		GlStateManager.pushMatrix();
		GlStateManager.translate(x + 0.5, y + 1.5, z + 0.5);
		GlStateManager.rotate(180, 0, 0, 1);
		bindTexture(TEXTURE);
		model.renderModel(0.0625f);
		GlStateManager.popMatrix();
	}
}