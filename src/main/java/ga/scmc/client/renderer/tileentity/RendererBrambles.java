package ga.scmc.client.renderer.tileentity;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.model.blocks.ModelBrambles;
import ga.scmc.tileentity.TileEntityBrambles;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Ocelot5836
 */
@SideOnly(Side.CLIENT)
public class RendererBrambles extends TileEntitySpecialRenderer<TileEntityBrambles> {

	private static final ModelBrambles MODEL = new ModelBrambles();

	@Override
	public void renderTileEntityAt(TileEntityBrambles te, double x, double y, double z, float partialTicks, int destroyStage) {
		super.renderTileEntityAt(te, x, y, z, partialTicks, destroyStage);

		if (te.getBlockMetadata() == 0) {
			GlStateManager.pushMatrix();
			GlStateManager.translate(x + 0.5, y + 1.5, z + 0.5);
			GlStateManager.rotate(180, 0, 0, 1);
			switch (te.getVariant()) {
			case 0:
				bindTexture(Resources.KALDIR_BRAMBLES_TEXTURE);
				break;
			case 1:
				bindTexture(Resources.SHAKURAS_BRAMBLES_TEXTURE);
				break;
			case 2:
				bindTexture(Resources.ZERUS_BRAMBLES_TEXTURE);
				break;
			}
			MODEL.render(0.0625f, te.getAge());
			GlStateManager.popMatrix();
		}
	}
}