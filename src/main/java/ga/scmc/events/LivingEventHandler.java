package ga.scmc.events;

import java.util.Random;

import ga.scmc.api.CapabilityUtils;
import ga.scmc.handlers.ArmorHandler;
import ga.scmc.handlers.ConfigurationHandler;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.SoundHandler;
import ga.scmc.handlers.TeleporterHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import ocelot.api.utils.InventoryUtils;

/**
 * This class handles events that involve living entities.
 *
 * @author Ocelot5836
 */
@EventBusSubscriber
public class LivingEventHandler {

	private static Random rand = new Random();

	/**
	 * TODO add cloaking mechanics
	 */
	@SubscribeEvent
	public static void onLivingUpdate(LivingUpdateEvent event) {
		if (event.getEntity() != null) {

			/** Handling Char gravity **/
			if (event.getEntity().motionY > 0 && event.getEntity().dimension == ConfigurationHandler.INT_DIMENSION_CHAR) {
				event.getEntity().motionY = event.getEntity().motionY * 1.0375;

			}

			/** TODO: Handling Space gravity **/
			if (event.getEntity().dimension == ConfigurationHandler.INT_DIMENSION_SPACE) {

			}

			else if (event.getEntity() instanceof EntityPlayerMP) {

				EntityPlayerMP player = ((EntityPlayerMP) event.getEntity());
				if (player.dimension != ConfigurationHandler.INT_DIMENSION_SPACE && player.posY > 255) {
					player.getServer().getPlayerList().transferPlayerToDimension(player, ConfigurationHandler.INT_DIMENSION_SPACE, new TeleporterHandler(player.world.provider.getDimension(), player.mcServer.worldServerForDimension(ConfigurationHandler.INT_DIMENSION_SPACE), player.posX, player.posY, player.posZ, true));
				}

				if (!player.world.isRemote) {
					if (CapabilityUtils.getShield(player) < 10 && isWearingFullProtossArmor(player)) {
						if (InventoryUtils.hasItemAndAmount(player, ItemHandler.ENERGY, 1, 0) && CapabilityUtils.getShield(player) <= 5) {
							CapabilityUtils.addShield(player, 5);
							InventoryUtils.removeItemWithAmount(player, ItemHandler.ENERGY, 1, 0);
							player.world.playSound(null, player.getPosition().getX(), player.getPosition().getY(), player.getPosition().getZ(), SoundHandler.FX_WARPBLADE_ATTACK, SoundCategory.PLAYERS, 1, 1);
						}
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void onHitEvent(LivingHurtEvent event) {
		if (event.getEntity() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.getEntityLiving();
			if (isWearingFullProtossArmor(player)) {
				if (CapabilityUtils.getShield(player) * 2 >= event.getAmount()) {
					CapabilityUtils.removeShield(player, event.getAmount() / 2);
					event.setCanceled(true);
					return;
				}
			}
		}
	}

	public static boolean isWearingFullProtossArmor(EntityPlayer player) {
		boolean helmet = false;
		boolean chestplate = false;
		boolean leggings = false;
		boolean boots = false;
		ItemStack head = player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
		ItemStack chest = player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
		ItemStack legs = player.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
		ItemStack feet = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);

		if (head != null && head.getItem() == ArmorHandler.PROTOSS_T1_HELMET) {
			helmet = true;
		}
		if (chest != null && chest.getItem() == ArmorHandler.PROTOSS_T1_CHESTPLATE) {
			chestplate = true;
		}
		if (legs != null && legs.getItem() == ArmorHandler.PROTOSS_T1_LEGGINGS) {
			leggings = true;
		}
		if (feet != null && feet.getItem() == ArmorHandler.PROTOSS_T1_BOOTS) {
			boots = true;
		}

		return helmet && chestplate && leggings && boots;
	}

	@SubscribeEvent
	public void onPlayerRespawnEvent(PlayerEvent.PlayerRespawnEvent event) {
		CapabilityUtils.setShield(event.player, CapabilityUtils.getShield(event.player));
	}
}