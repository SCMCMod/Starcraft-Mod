package ga.scmc.client.renderer.items;

import ga.scmc.client.renderer.RenderUtil;
import ga.scmc.client.renderer.block.ModelTable;
import ga.scmc.lib.GuiUtils;
import ga.scmc.lib.Library;
import ga.scmc.model.IModelSkull;
import ga.scmc.model.ModelBrutalisk;
import ga.scmc.model.ModelHydralisk;
import ga.scmc.model.ModelZerglingSC2;
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

	public ItemRenderStarcraftSkull() {
		super(new ModelTable(), TEXTURE);
	}

	@Override
	public void renderFirstPersonLeft(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		renderFirstPersonRight(itemstack, entity, cameraTransformType);
	}

	@Override
	public void renderFirstPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		GlStateManager.pushMatrix();

		int type = itemstack.getMetadata();
		if (type == 0)
			GlStateManager.translate(0, -0.5, 0);
		if (type == 1)
			GlStateManager.translate(0, -0.2, 0);

		GuiUtils.bindTexture("textures/models/block/table.png");
		renderSkull(stack.getMetadata(), 0.0625 * 1);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderInInventory(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		GlStateManager.pushMatrix();
		GlStateManager.rotate(30, 1, 0, 0);
		GlStateManager.rotate(225, 0, 1, 0);
		GlStateManager.translate(-0.5, -0.7, 0.5);
		GuiUtils.bindTexture("textures/models/block/table.png");
		renderSkull(stack.getMetadata(), 0.0625);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderInWorld(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		GlStateManager.pushMatrix();
		GlStateManager.rotate(45, 0, 1, 0);
		GlStateManager.translate(-0.5, -1.3, -0.5);
		GuiUtils.bindTexture("textures/models/block/table.png");
		renderSkull(stack.getMetadata(), 0.0625 * 0.25);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderFixed(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		GlStateManager.pushMatrix();
		GlStateManager.translate(0, -0.2, 0);
		GuiUtils.bindTexture("textures/models/block/table.png");
		renderSkull(stack.getMetadata(), 0.0625);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderThirdPersonLeft(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		GlStateManager.pushMatrix();
		GlStateManager.rotate(45, 1, 0, 0);
		GlStateManager.rotate(-45, 0, 1, 0);
		GlStateManager.translate(-0.09, -0.125, -0.1);
		GuiUtils.bindTexture("textures/models/block/table.png");
		renderSkull(stack.getMetadata(), 0.0625 * 0.5);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderThirdPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		GlStateManager.pushMatrix();
		GlStateManager.rotate(45, 1, 0, 0);
		GlStateManager.rotate(45, 0, 1, 0);
		GlStateManager.translate(0.09, -0.125, -0.1);
		GuiUtils.bindTexture("textures/models/block/table.png");
		renderSkull(stack.getMetadata(), 0.0625 * 0.5);
		GlStateManager.popMatrix();
	}

	public void renderSkull(int skullType, double scale) {
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
			skullModel = new ModelZerglingSC2();
			break;
		case 2:
			RenderUtil.bindTexture(new ResourceLocation(Library.MODID, "textures/entity/hydralisk_base.png"));
			skullModel = new ModelHydralisk();
			break;
		case 3:
			RenderUtil.bindTexture(new ResourceLocation(Library.MODID, "textures/entity/brutalisk_base.png"));
			skullModel = new ModelBrutalisk();
			break;
		}

		GlStateManager.pushMatrix();
		GlStateManager.disableCull();
		GlStateManager.enableRescaleNormal();
		GlStateManager.scale(-1.0F, -1.0F, 1.0F);
		GlStateManager.enableAlpha();

		switch (skullType) {
		default:
			skullModel.render((Entity) null, 0, 0.0F, 0.0F, 0, 0.0F, 0.0625F);
			break;
		case 1:
			if (skullModel instanceof IModelSkull) {
				RenderUtil.bindTexture(new ResourceLocation(Library.MODID, "textures/entity/zergling_base.png"));
				((IModelSkull) skullModel).renderSkull(0.0625f);
				GlStateManager.translate(0, 0.2, -0.2);
				RenderUtil.bindTexture(new ResourceLocation(Library.MODID, "textures/entity/zergling_overlay.png"));
				((IModelSkull) skullModel).renderSkull(0.0625f);
			}
			break;
		case 2:
			if (skullModel instanceof IModelSkull) {
				RenderUtil.bindTexture(new ResourceLocation(Library.MODID, "textures/entity/zergling_base.png"));
				((IModelSkull) skullModel).renderSkull(0.0625f);
				GlStateManager.translate(0, 0.2, -0.2);
				RenderUtil.bindTexture(new ResourceLocation(Library.MODID, "textures/entity/zergling_overlay.png"));
				((IModelSkull) skullModel).renderSkull(0.0625f);
			}
			break;
		case 3:
			if (skullModel instanceof IModelSkull) {
				RenderUtil.bindTexture(new ResourceLocation(Library.MODID, "textures/entity/zergling_base.png"));
				((IModelSkull) skullModel).renderSkull(0.0625f);
				GlStateManager.translate(0, 0.2, -0.2);
				RenderUtil.bindTexture(new ResourceLocation(Library.MODID, "textures/entity/zergling_overlay.png"));
				((IModelSkull) skullModel).renderSkull(0.0625f);
			}
			break;
		}

		GlStateManager.popMatrix();
	}
}