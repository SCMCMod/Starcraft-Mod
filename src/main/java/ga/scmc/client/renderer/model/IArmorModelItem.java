package ga.scmc.client.renderer.model;

import ga.scmc.client.renderer.model.armor.ModelArmorBase;
import net.minecraft.entity.Entity;

public interface IArmorModelItem {

	void renderHelmet(Entity entity, float scale);

	void renderChestplate(Entity entity, float scale);

	void renderLeggings(Entity entity, float scale);

	void renderBoots(Entity entity, float scale);

	ModelArmorBase getArmorModel();

}