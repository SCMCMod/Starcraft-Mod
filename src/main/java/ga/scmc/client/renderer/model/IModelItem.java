package ga.scmc.client.renderer.model;

import net.minecraft.entity.Entity;

public interface IModelItem {

	void renderHelmet(Entity entity, float scale);

	void renderChestplate(Entity entity, float scale);

	void renderLeggings(Entity entity, float scale);

	void renderBoots(Entity entity, float scale);
}