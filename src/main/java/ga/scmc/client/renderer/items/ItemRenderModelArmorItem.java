package ga.scmc.client.renderer.items;

import static net.minecraft.inventory.EntityEquipmentSlot.CHEST;
import static net.minecraft.inventory.EntityEquipmentSlot.FEET;
import static net.minecraft.inventory.EntityEquipmentSlot.HEAD;
import static net.minecraft.inventory.EntityEquipmentSlot.LEGS;

import ga.scmc.client.renderer.model.IArmorModelItem;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ItemRenderModelArmorItem extends ItemRenderer {

	private IArmorModelItem model;
	private EntityEquipmentSlot type;

	public ItemRenderModelArmorItem(EntityEquipmentSlot type, IArmorModelItem model, ResourceLocation texture) {
		super(model.getArmorModel(), texture);
		this.model = model;

		switch (type) {
		case CHEST:
			break;
		case FEET:
			break;
		case HEAD:
			break;
		case LEGS:
			break;
		default:
			throw new IllegalArgumentException("You cannot have an armor item that uses the hands! 4 available arguments are CHEST, FEET, HEAD, and LEGS.");
		}

		this.type = type;
	}

	@Override
	public void renderFirstPersonLeft(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		renderFirstPersonRight(itemstack, entity, cameraTransformType);
	}

	@Override
	public void renderFirstPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		float scale = 1;
		if (type == HEAD) {
			model.renderHelmet(entity, scale);
		}

		if (type == CHEST) {
			model.renderChestplate(entity, scale);
		}

		if (type == LEGS) {
			model.renderLeggings(entity, scale);
		}

		if (type == FEET) {
			model.renderBoots(entity, scale);
		}
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

	@Override
	public void renderFixed(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {

	}

	@Override
	public void renderHead(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {

	}
}