package ga.scmc.client.renderer.items;

import ga.scmc.client.renderer.RenderUtil;
import ga.scmc.client.renderer.model.IModelSkull;
import ga.scmc.client.renderer.model.ModelBrutalisk;
import ga.scmc.client.renderer.model.ModelHydralisk;
import ga.scmc.client.renderer.model.ModelZergling;
import ga.scmc.client.renderer.model.blocks.ModelTable;
import ga.scmc.lib.Library;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelSkeletonHead;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ItemRenderStarcraftSkull extends ItemRenderer {

	private static final ResourceLocation TEXTURE = new ResourceLocation(Library.MODID, "textures/models/block/table.png");
	private int type;

	public ItemRenderStarcraftSkull() {
		super(new ModelTable(), TEXTURE);
	}

	@Override
	public void renderPre(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		if (type != itemstack.getMetadata())
			type = itemstack.getMetadata();
	}

	@Override
	public void renderFirstPersonLeft(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		double scale = 1;

		GlStateManager.pushMatrix();
		if (type == 0) {
			GlStateManager.translate(0, -0.5, 0);
		}
		if (type == 1) {
			GlStateManager.translate(0.1, -0.2, 0);
		}
		if (type == 2) {
			GlStateManager.translate(0.2, -0.1, 0);
			scale = 0.5;
		}
		if (type == 3) {
			GlStateManager.translate(0.3, 0.1, -0.3);
			scale = 0.25;
		}

		renderSkull(type, 0.0625 * scale);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderFirstPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		double scale = 1;

		GlStateManager.pushMatrix();
		if (type == 0) {
			GlStateManager.translate(0, -0.5, 0);
		}
		if (type == 1) {
			GlStateManager.translate(-0.1, -0.2, 0);
		}
		if (type == 2) {
			GlStateManager.translate(-0.2, -0.1, 0);
			scale = 0.5;
		}
		if (type == 3) {
			GlStateManager.translate(-0.3, 0.1, -0.3);
			scale = 0.25;
		}

		renderSkull(type, 0.0625 * scale);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderInInventory(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		double scale = 1;

		GlStateManager.pushMatrix();
		GlStateManager.rotate(30, 1, 0, 0);
		GlStateManager.rotate(225, 0, 1, 0);

		if (type == 2) {
			scale = 0.55;
			GlStateManager.translate(-0.2, -0.2, -0.1);
		}
		if (type == 3) {
			scale = 0.85;
		}

		GlStateManager.translate(-0.5, -0.7, 0.5);
		renderSkull(type, 0.0625 * scale);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderInWorld(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		double scale = 0.5;

		GlStateManager.pushMatrix();
		GlStateManager.rotate(45, 0, 1, 0);
		GlStateManager.translate(-0.5, -1.3, -0.5);

		if (type == 0) {
			GlStateManager.translate(0.5, 1.2, 0.5);
		}
		if (type == 1) {
			GlStateManager.translate(0.5, 1, 0.5);
		}
		if (type == 2) {
			GlStateManager.translate(0.5, 1.15, 0.5);
		}
		if (type == 3) {
			GlStateManager.translate(0.5, 1.1, 0);
		}

		renderSkull(type, 0.0625 * scale);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderFixed(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		double scale = 1;

		GlStateManager.pushMatrix();
		GlStateManager.translate(0, -0.2, 0);
		renderSkull(type, 0.0625 * scale);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderThirdPersonLeft(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		double scale = 0.5;

		GlStateManager.pushMatrix();

		if (type == 1) {
			scale = 0.75;
		}
		if (type == 3) {
			scale = 0.5;
			GlStateManager.translate(0.25, 0.1, -0.2);
		}

		GlStateManager.rotate(45, 1, 0, 0);
		GlStateManager.rotate(-45, 0, 1, 0);
		GlStateManager.translate(-0.09, -0.125, -0.1);
		renderSkull(type, 0.0625 * scale);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderThirdPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		double scale = 0.5;

		GlStateManager.pushMatrix();

		if (type == 1) {
			scale = 0.75;
		}
		if (type == 3) {
			scale = 0.5;
			GlStateManager.translate(-0.25, 0.1, -0.2);
		}

		GlStateManager.rotate(45, 1, 0, 0);
		GlStateManager.rotate(45, 0, 1, 0);
		GlStateManager.translate(0.09, -0.125, -0.1);
		renderSkull(type, 0.0625 * scale);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderHead(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		double scale = 2;
		if (type == 0) {
			GlStateManager.translate(0, -0.45, 0);
		}
		if (type == 1) {
			GlStateManager.translate(0, 0.45, 0);
		}
		if (type == 2) {
			GlStateManager.translate(0, -0.2, 1);
		}
		if (type == 3) {
			GlStateManager.translate(0, -0.3, 1);
		}
		renderSkull(type, 0.0625 * scale);
	}

	public void renderSkull(int skullType, double scale) {
		GlStateManager.pushMatrix();
		ModelBase skullModel = new ModelSkeletonHead(0, 0, 64, 32);

		switch (skullType) {
		default:
			RenderUtil.bindTexture(new ResourceLocation("textures/entity/skeleton/skeleton.png"));
			break;
		case 0:
			RenderUtil.bindTexture(new ResourceLocation(Library.MODID, "textures/entity/civilian.png"));
			skullModel = new ModelSkeletonHead(0, 0, 64, 64);
			break;
		case 1:
			skullModel = new ModelZergling();
			break;
		case 2:
			skullModel = new ModelHydralisk();
			break;
		case 3:
			skullModel = new ModelBrutalisk();
			break;
		}

		GlStateManager.disableCull();
		GlStateManager.enableRescaleNormal();
		GlStateManager.scale(-1.0F, -1.0F, 1.0F);
		GlStateManager.enableAlpha();

		if (skullModel instanceof IModelSkull) {
			switch (skullType) {
			default:
				RenderUtil.bindTexture(new ResourceLocation(Library.MODID, "textures/entity/zergling_base.png"));
				skullModel.render((Entity) null, 0, 0, 0, 0, 0, (float) scale);
				break;
			case 1:
				RenderUtil.bindTexture(new ResourceLocation(Library.MODID, "textures/entity/zergling_base.png"));
				((IModelSkull) skullModel).renderSkull((float) scale);
				GlStateManager.translate(0, 0.2, -0.2);
				RenderUtil.bindTexture(new ResourceLocation(Library.MODID, "textures/entity/zergling_overlay.png"));
				((IModelSkull) skullModel).renderSkull((float) scale);
				break;
			case 2:
				RenderUtil.bindTexture(new ResourceLocation(Library.MODID, "textures/entity/hydralisk_base.png"));
				((IModelSkull) skullModel).renderSkull((float) scale);
				break;
			case 3:
				RenderUtil.bindTexture(new ResourceLocation(Library.MODID, "textures/entity/brutalisk_base.png"));
				((IModelSkull) skullModel).renderSkull((float) scale);
				break;
			}
		} else {
			skullModel.render((Entity) null, 0, 0, 0, 0, 0, (float) scale);
		}

		GlStateManager.popMatrix();
	}
}