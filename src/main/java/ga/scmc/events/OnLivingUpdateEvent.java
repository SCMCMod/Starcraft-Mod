package ga.scmc.events;

import ga.scmc.handlers.BlockHandler;
import ga.scmc.handlers.ConfigurationHandler;
import ga.scmc.handlers.WeaponHandler;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
// import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class OnLivingUpdateEvent {

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

			ItemStack headItem = player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
			if (headItem != null && headItem.getItem() == Items.DIAMOND_HELMET) {
				GuiOverlayEvent.renderHelmetOverlay = true;
			} else {
				GuiOverlayEvent.renderHelmetOverlay = false;
			}
		}
	}
	// TODO: this is disabled until we add cloaking mechanics
	// else if(event.getEntity() instanceof EntityDarkTemplar && !StarcraftConfig.BOOL_IS_DARK_TEMPLAR_VISIBLE) {
	// event.getEntity().setInvisible(false);
	// }
}