package ga.scmc.events;

import ga.scmc.handlers.ConfigurationHandler;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * This class handles events that are generic and do not fit into any other classes.
 * 
 * @author Ocelot5836
 */
@EventBusSubscriber
public class StarcraftEventHandler {

	@SubscribeEvent
	public static void onEntitySpawn(EntityJoinWorldEvent event) {
		if (ConfigurationHandler.BOOL_VANILLA_MOB_SPAWNING_DISABLED == true) {
			if (event.getEntity() instanceof EntityCaveSpider || event.getEntity() instanceof EntitySilverfish || event.getEntity() instanceof EntityWitch || event.getEntity() instanceof EntitySlime || event.getEntity() instanceof EntityEnderman || event.getEntity() instanceof EntityCreeper || event.getEntity() instanceof EntitySkeleton || event.getEntity() instanceof EntityZombie || event.getEntity() instanceof EntitySpider) {
				event.getEntity().setDropItemsWhenDead(false);
				event.getEntity().setDead();
				event.setCanceled(true);
			}
		}
	}
}