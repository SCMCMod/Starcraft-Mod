package ga.scmc.events;

import java.util.Random;

import ga.scmc.api.CapabilityUtils;
import ga.scmc.handlers.ArmorHandler;
import ga.scmc.handlers.BlockHandler;
import ga.scmc.handlers.ConfigurationHandler;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.SoundHandler;
import ga.scmc.handlers.WeaponHandler;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
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
		if (event.getEntity().motionY > 0 && event.getEntity().dimension == ConfigurationHandler.INT_DIMENSION_CHAR) {
			event.getEntity().motionY = event.getEntity().motionY * 1.0375;
		} else if (event.getEntity() instanceof EntityPlayer) {

			EntityPlayer player = ((EntityPlayer) event.getEntity());

			int i = MathHelper.floor(player.posX);
			int j = MathHelper.floor(player.posY);
			int k = MathHelper.floor(player.posZ);
			if (player.getHeldItem(EnumHand.MAIN_HAND) != null) {
				if (player.getHeldItem(EnumHand.MAIN_HAND).getItem() == WeaponHandler.MASTER_PSI_BLADE || player.getHeldItem(EnumHand.MAIN_HAND).getItem() == WeaponHandler.PSI_BLADE || player.getHeldItem(EnumHand.MAIN_HAND).getItem() == WeaponHandler.WARP_BLADE || player.getHeldItem(EnumHand.MAIN_HAND).getItem() == WeaponHandler.BANE_BLADE || player.getHeldItem(EnumHand.MAIN_HAND).getItem() == WeaponHandler.DARK_WARP_BLADE) {
					BlockPos blockpos = new BlockPos(i, j + 1, k);

					if (player.world.getBlockState(blockpos).getMaterial() == Material.AIR) {
						player.world.setBlockState(blockpos, BlockHandler.LIGHT_SOURCE.getDefaultState());
					}
				}
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
		// else if (event.getEntity() instanceof EntityDarkTemplar && !StarcraftConfig.BOOL_IS_DARK_TEMPLAR_VISIBLE) {
		// event.getEntity().setInvisible(false);
		// }
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