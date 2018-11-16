package com.hypeirochus.scmc.client.renderer.tileentity;

import com.hypeirochus.scmc.Starcraft;
import com.hypeirochus.scmc.client.model.block.ModelBrambles;
import com.hypeirochus.scmc.client.model.block.ModelPalm;
import com.hypeirochus.scmc.tileentity.TileEntityBrambles;

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

	public static final ResourceLocation KALDIR_BRAMBLES_TEXTURE = new ResourceLocation(Starcraft.RL_BASE + "textures/models/block/kaldir_brambles.png");
	public static final ResourceLocation SHAKURAS_BRAMBLES_TEXTURE = new ResourceLocation(Starcraft.RL_BASE + "textures/models/block/shakuras_brambles.png");
	public static final ResourceLocation ZERUS_BRAMBLES_TEXTURE = new ResourceLocation(Starcraft.RL_BASE + "textures/models/block/zerus_brambles.png");

	@Override
	public void render(TileEntityBrambles te, double x, double y, double z, float partialTicks, int destroyStage, float alpha)
	{
		super.render(te, x, y, z, partialTicks, destroyStage, alpha);

		if (te.getBlockMetadata() == 0)
		{
			GlStateManager.pushMatrix();
			GlStateManager.translate(x + 0.5, y + 1.5, z + 0.5);
			GlStateManager.rotate(180, 0, 0, 1);
			switch (te.getVariant())
			{
			case 0:
				bindTexture(KALDIR_BRAMBLES_TEXTURE);
				BRAMBLES.render(0.0625f, te.getAge());
				break;
			case 1:
				bindTexture(SHAKURAS_BRAMBLES_TEXTURE);
				PALM.render(0.0625f, te.getAge());
				break;
			case 2:
				bindTexture(ZERUS_BRAMBLES_TEXTURE);
				PALM.render(0.0625f, te.getAge());
				break;
			}
			GlStateManager.popMatrix();
		}
	}
}