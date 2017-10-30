package ga.scmc.events;

import java.util.Random;

import ga.scmc.handlers.BlockHandler;
import ga.scmc.handlers.ConfigurationHandler;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.SoundHandler;
import ga.scmc.handlers.WeaponHandler;
import ga.scmc.lib.CapabilityUtils;
import ga.scmc.lib.InventoryUtil;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

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
				if (CapabilityUtils.getShield(player) < GuiRenderEventHandler.getMaxShieldLevel() && GuiRenderEventHandler.isWearingFullProtossArmor(player)) {
					if (InventoryUtil.hasItemAndAmount(player, ItemHandler.ENERGY, 1, 0) && CapabilityUtils.getShield(player) <= 5) {
						CapabilityUtils.addShield(player, 5);
						InventoryUtil.removeItemWithAmount(player, ItemHandler.ENERGY, 1, 0);
						player.world.playSound(null, player.getPosition().getX(), player.getPosition().getY(), player.getPosition().getZ(), SoundHandler.FX_WARPBLADE_ATTACK, SoundCategory.PLAYERS, 1, 1);
					}
				}
			}
		}
		// else if (event.getEntity() instanceof EntityDarkTemplar && !StarcraftConfig.BOOL_IS_DARK_TEMPLAR_VISIBLE) {
		// event.getEntity().setInvisible(false);
		// }
	}
}