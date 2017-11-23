package ga.scmc.items;

import com.arisux.mdx.lib.world.entity.player.inventory.Inventories;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.entity.EntityC14GaussRifleBullet;
import ga.scmc.enums.EnumMetaItem;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.SoundHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import ocelot.api.utils.InventoryUtils;

public class ItemC14GaussRifle extends Item {

	public ItemC14GaussRifle() {
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
		setFull3D();
		setUnlocalizedName("rifleC14");
		setRegistryName("rifle_c14");
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

	public boolean hasAmmo(World world, EntityPlayer player) {
		if (player.capabilities.isCreativeMode) {
			return true;
		}

		if (Inventories.playerHas(getAmmo(), player)) {
			ItemStack ammoStack = player.inventory.mainInventory[InventoryUtils.getItemSlot(player, getAmmo(), EnumMetaItem.BulletMagazineType.C14.getID())];

			if (ammoStack != null && ammoStack.getItem() != null && ammoStack.getMetadata() == EnumMetaItem.BulletMagazineType.C14.getID() && ammoStack.hasTagCompound()) {
				NBTTagCompound nbt = ammoStack.getTagCompound();
				if (nbt.getInteger("BulletCount") >= 1) {
					nbt.setInteger("BulletCount", nbt.getInteger("BulletCount") - 1);
				}

				return true;
			}
		}
		return false;
	}

	public Item getAmmo() {
		return ItemHandler.BULLET_MAGAZINE;
	}
}
