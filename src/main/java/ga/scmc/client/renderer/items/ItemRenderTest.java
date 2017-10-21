package ga.scmc.client.renderer.items;

import ga.scmc.client.renderer.block.ModelTable;
import ga.scmc.lib.GuiUtils;
import ga.scmc.lib.Library;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ItemRenderTest extends ItemRenderer {

	private static final ResourceLocation TEXTURE = new ResourceLocation(Library.MODID, "textures/models/block/table.png");

	public ItemRenderTest() {
		super(new ModelTable(), TEXTURE);
	}

	@Override
	public void renderFirstPersonLeft(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		GlStateManager.pushMatrix();
		GlStateManager.translate(-1, 0, -1.5);
		GlStateManager.rotate(180, 0, 0, 1);
		GlStateManager.rotate(45, 0, 1, 0);
		GuiUtils.bindTexture("textures/models/block/table.png");
		model.render(entity, 0, 0, 0, 0, 0, 0.0625f);
		GlStateManager.popMatrix();	}

	@Override
	public void renderFirstPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		GlStateManager.pushMatrix();
		GlStateManager.translate(1, 0, -1.5);
		GlStateManager.rotate(180, 0, 0, 1);
		GlStateManager.rotate(45, 0, 1, 0);
		GuiUtils.bindTexture("textures/models/block/table.png");
		model.render(entity, 0, 0, 0, 0, 0, 0.0625f);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderInInventory(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {

	}

	@Override
	public void renderInWorld(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {

	}

	@Override
	public void renderThirdPersonLeft(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {

	}

	@Override
	public void renderThirdPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {

	}
}