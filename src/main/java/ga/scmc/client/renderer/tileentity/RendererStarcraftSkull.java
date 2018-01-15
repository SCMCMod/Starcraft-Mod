package ga.scmc.client.renderer.tileentity;

import ga.scmc.client.renderer.RenderUtil;
import ga.scmc.client.renderer.model.IModelSkull;
import ga.scmc.client.renderer.model.ModelBrutalisk;
import ga.scmc.client.renderer.model.ModelHydralisk;
import ga.scmc.client.renderer.model.ModelZergling;
import ga.scmc.lib.Library;
import ga.scmc.tileentity.TileEntityStarcraftSkull;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelSkeletonHead;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Ocelot5836
 */
@SideOnly(Side.CLIENT)
public class RendererStarcraftSkull extends TileEntitySpecialRenderer<TileEntityStarcraftSkull> {

	public static RendererStarcraftSkull instance;

	private static final ModelSkeletonHead SKELETON = new ModelSkeletonHead(0, 0, 64, 64);
	private static final ModelZergling ZERGLING = new ModelZergling();
	private static final ModelSkeletonHead HYDRALISK = new ModelSkeletonHead(0, 0, 64, 64);
	private static final ModelSkeletonHead BRUTALISK = new ModelSkeletonHead(0, 0, 64, 64);

	public void renderTileEntityAt(TileEntityStarcraftSkull te, double x, double y, double z, float partialTicks, int destroyStage) {
		super.renderTileEntityAt(te, x, y, z, partialTicks, destroyStage);
		EnumFacing enumfacing = EnumFacing.getFront(te.getBlockMetadata() & 7);
		this.renderSkull((float) x, (float) y, (float) z, enumfacing, (float) (te.getSkullRotation() * 360) / 16.0F, te.getSkullType(), destroyStage);
	}

	public void setRendererDispatcher(TileEntityRendererDispatcher rendererDispatcherIn) {
		super.setRendererDispatcher(rendererDispatcherIn);
		instance = this;
	}

	public void renderSkull(float x, float y, float z, EnumFacing facing, float rotation, int skullType, int destroyStage) {
		ModelBase skullModel = new ModelSkeletonHead(0, 0, 64, 32);

		if (destroyStage >= 0) {
			this.bindTexture(DESTROY_STAGES[destroyStage]);
			GlStateManager.matrixMode(5890);
			GlStateManager.pushMatrix();
			GlStateManager.scale(4.0F, 2.0F, 1.0F);
			GlStateManager.translate(0.0625F, 0.0625F, 0.0625F);
			GlStateManager.matrixMode(5888);
		} else {
			switch (skullType) {
			default:
				this.bindTexture(new ResourceLocation("textures/entity/skeleton/skeleton.png"));
				break;
			case 0:
				this.bindTexture(new ResourceLocation(Library.MODID, "textures/entity/civilian.png"));
				skullModel = SKELETON;
				break;
			case 1:
				skullModel = ZERGLING;
				break;
			case 2:
				skullModel = HYDRALISK;
				break;
			case 3:
				skullModel = BRUTALISK;
				break;
			}
		}

		GlStateManager.pushMatrix();
		GlStateManager.disableCull();

		if (facing == EnumFacing.UP) {
			GlStateManager.translate(x + 0.5F, y, z + 0.5F);
		} else {
			switch (facing) {
			case NORTH:
				GlStateManager.translate(x + 0.5F, y + 0.25F, z + 0.74F);
				break;
			case SOUTH:
				GlStateManager.translate(x + 0.5F, y + 0.25F, z + 0.26F);
				rotation = 180.0F;
				break;
			case WEST:
				GlStateManager.translate(x + 0.74F, y + 0.25F, z + 0.5F);
				rotation = 270.0F;
				break;
			case EAST:
			default:
				GlStateManager.translate(x + 0.26F, y + 0.25F, z + 0.5F);
				rotation = 90.0F;
			}
		}

		GlStateManager.enableRescaleNormal();
		GlStateManager.scale(-1.0F, -1.0F, 1.0F);
		GlStateManager.rotate(rotation, 0, 1, 0);
		GlStateManager.enableAlpha();

		if (skullModel instanceof IModelSkull) {
			switch (skullType) {
			default:
				break;
			case 1:
				RenderUtil.bindTexture(new ResourceLocation(Library.MODID, "textures/entity/zergling_base.png"));
				((IModelSkull) skullModel).renderSkull(0.0625f);
				GlStateManager.translate(0, 0.2, -0.2);
				RenderUtil.bindTexture(new ResourceLocation(Library.MODID, "textures/entity/zergling_overlay.png"));
				((IModelSkull) skullModel).renderSkull(0.0625f);
				break;
			case 2:
				RenderUtil.bindTexture(new ResourceLocation(Library.MODID, "textures/entity/hydralisk_base.png"));
				((IModelSkull) skullModel).renderSkull(0.0625f);
				break;
			case 3:
				RenderUtil.bindTexture(new ResourceLocation(Library.MODID, "textures/entity/brutalisk_base.png"));
				((IModelSkull) skullModel).renderSkull(0.0625f);
				break;
			}
		} else {
			skullModel.render((Entity) null, 0, 0.0F, 0.0F, 0, 0.0F, 0.0625F);
		}

		GlStateManager.popMatrix();

		if (destroyStage >= 0) {
			GlStateManager.matrixMode(5890);
			GlStateManager.popMatrix();
			GlStateManager.matrixMode(5888);
		}
	}
}