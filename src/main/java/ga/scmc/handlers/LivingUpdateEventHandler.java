package ga.scmc.handlers;

import net.minecraft.entity.player.EntityPlayer;
// import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class LivingUpdateEventHandler {

	@SubscribeEvent
	public static void onLivingUpdate(LivingUpdateEvent event) {
		if(event.getEntity().motionY > 0 && event.getEntity().dimension == ConfigurationHandler.INT_DIMENSION_CHAR) {
			event.getEntity().motionY = event.getEntity().motionY * 1.0375;
		}else if(event.getEntity() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.getEntity();

			//try {
				//if(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof ArmorGhostHelmet
					//	&& player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() instanceof ArmorGhostChestplate
				//		&& player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() instanceof ArmorGhostLeggings
					//	&& player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof ArmorGhostBoots) {
				//	player.setInvisible(true);
				//} else {
				//	player.setInvisible(false);
				//}
			//} catch(NullPointerException e) {
			//	player.setInvisible(false);
			//}
		} 
		//TODO: this is disabled until we add cloaking mechanics
		//else if(event.getEntity() instanceof EntityDarkTemplar && !StarcraftConfig.BOOL_IS_DARK_TEMPLAR_VISIBLE) {
		//	event.getEntity().setInvisible(false);
		//}
	}
}

