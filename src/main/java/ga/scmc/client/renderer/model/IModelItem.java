package ga.scmc.client.renderer.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public interface IModelItem {

	void renderItem(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType);

	ModelBase getModel();
}