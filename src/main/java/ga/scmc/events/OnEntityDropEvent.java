package ga.scmc.events;

import ga.scmc.entity.EntityStarcraftMob;
import ga.scmc.entity.EntityStarcraftPassive;
import ga.scmc.entity.StarcraftEnums.TypeAttributes;
import ga.scmc.handlers.ItemHandler;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class OnEntityDropEvent {

	@SubscribeEvent
	public static void onC14GaussRifleObtained(LivingDropsEvent e) {
		int biomassAmount;
		if(e.getEntityLiving().getMaxHealth() <= 256) {
			biomassAmount = (int) e.getEntityLiving().getMaxHealth() / 4;
		}else {
			biomassAmount = 64;
		}
		if(e.getEntityLiving() instanceof EntityStarcraftMob) {
			if(((EntityStarcraftMob)e.getEntityLiving()).isType(TypeAttributes.MECHANICAL)) {
				
			}else {
				e.getEntityLiving().dropItem(ItemHandler.BIOMASS, biomassAmount);
			}
		}else if(e.getEntityLiving() instanceof EntityStarcraftPassive) {
			if(((EntityStarcraftPassive)e.getEntityLiving()).isType(TypeAttributes.MECHANICAL)) {
				
			}else {
				e.getEntityLiving().dropItem(ItemHandler.BIOMASS, biomassAmount);
			}
		}else {
			e.getEntityLiving().dropItem(ItemHandler.BIOMASS, biomassAmount);
		}
	}
}