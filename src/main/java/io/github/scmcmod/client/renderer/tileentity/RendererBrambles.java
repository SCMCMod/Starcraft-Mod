package io.github.scmcmod.client.renderer.tileentity;

import io.github.scmcmod.Starcraft;
import io.github.scmcmod.client.model.block.ModelBrambles;
import io.github.scmcmod.client.model.block.ModelPalm;
import io.github.scmcmod.tileentity.TileEntityBrambles;
import io.github.scmcmod.utils.Assets;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Ocelot5836
 */
@SideOnly(Side.CLIENT)
public class RendererBrambles extends TileEntitySpecialRenderer<TileEntityBrambles>
{

	private static final ModelBrambles BRAMBLES = new ModelBrambles();
	private static final ModelPalm PALM = new ModelPalm();

	@Override
	public void render(TileEntityBrambles te, double x, double y, double z, float partialTicks, int destroyStage, float alpha)
	{
		super.render(te, x, y, z, partialTicks, destroyStage, alpha);

		if (te.getBlockMetadata() == 0)
		{
			GlStateManager.disableCull();
			GlStateManager.pushMatrix();
			GlStateManager.translate(x + 0.5, y + 1.5, z + 0.5);
			GlStateManager.rotate(180, 0, 0, 1);
			switch (te.getVariant())
			{
			case 0:
				bindTexture(Assets.getTexture("KALDIR_BRAMBLES"));
				BRAMBLES.render(0.0625f, te.getAge());
				break;
			case 1:
				bindTexture(Assets.getTexture("SHAKURAS_PALM"));
				PALM.render(0.0625f, te.getAge());
				break;
			case 2:
				bindTexture(Assets.getTexture("ZERUS_PALM"));
				PALM.render(0.0625f, te.getAge());
				break;
			}
			GlStateManager.popMatrix();
			GlStateManager.enableCull();
		}
	}
}