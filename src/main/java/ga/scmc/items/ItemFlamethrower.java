package ga.scmc.items;

import com.arisux.mdx.lib.world.entity.player.inventory.Inventories;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.entity.projectiles.EntityC14GaussRifleBullet;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.SoundHandler;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemFlamethrower extends Item {

	public ItemFlamethrower() {
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
		setFull3D();
		setUnlocalizedName("flamethrower");
		setRegistryName("flamethrower");
		setMaxStackSize(1);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemstack, World world, EntityPlayer player, EnumHand hand) {
		if (this.hasAmmo(world, player)) {
			if (!world.isRemote) {
				EntityC14GaussRifleBullet projectile = new EntityC14GaussRifleBullet(world, player);
                projectile.setThrowableHeading(projectile.motionX, projectile.motionY, projectile.motionZ, 5F, 0F);
				player.world.playSound(null, player.getPosition().getX(), player.getPosition().getY(), player.getPosition().getZ(), SoundHandler.FX_C14GAUSSRIFLE_FIRING, SoundCategory.PLAYERS, 0.4F, 1.5F);
				world.spawnEntity(projectile);
			}
		} else if (!this.hasAmmo(world, player)) {
			player.world.playSound(null, player.getPosition().getX(), player.getPosition().getY(), player.getPosition().getZ(), SoundHandler.FX_C14GAUSSRIFLE_OUT, SoundCategory.PLAYERS, 0.4F, 0.4F / (itemRand.nextFloat() * 0.5F + 0.8F));
		}
		return super.onItemRightClick(itemstack, world, player, hand);
	}

	@Override
	public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
		return true;
	}

	@Override
	public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, EntityPlayer player) {
		return false;
	}

	public boolean hasAmmo(World world, EntityPlayer player) {
		if (player.capabilities.isCreativeMode) {
			return true;
		}

		if (Inventories.playerHas(getAmmo(), player)) {
			ItemStack ammoStack = player.inventory.getStackInSlot(Inventories.getSlotForItemIn(getAmmo(), player.inventory));

			if (ammoStack != null && ammoStack.getItem() != null) {
				if (ammoStack.getItemDamage() < ammoStack.getMaxDamage()) {
					ammoStack.damageItem(1, player);
				} else {
					Inventories.consumeItem(player, ammoStack.getItem());
				}

				return true;
			}
		}
		return false;
	}

	public Item getAmmo() {
		return ItemHandler.BULLET;
	}
}
