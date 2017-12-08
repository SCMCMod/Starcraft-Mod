package ga.scmc.items.weapons;

import ga.scmc.handlers.BlockHandler;
import jdk.nashorn.internal.ir.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WeaponBase extends ItemSword {

    public WeaponBase(ToolMaterial material) {
        super(material);
    }

    @Override
    public void onUpdate(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected) {
        if (!world.isRemote && entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entity;
            if (player.getHeldItem(EnumHand.MAIN_HAND) != null && player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof WeaponBase) {
                if (!stack.hasTagCompound()) {
                    NBTTagCompound nbt = new NBTTagCompound();
                    nbt.setTag("LastLightPos", NBTUtil.createPosTag(player.getPosition().up()));
                    stack.setTagCompound(nbt);
                }
                BlockPos lastPos = NBTUtil.getPosFromTag(stack.getTagCompound().getCompoundTag("LastLightPos"));
                if (player.getPosition().up() != lastPos)
                    world.setBlockToAir(lastPos);
                if (world.getBlockState(player.getPosition().up()).getBlock() != BlockHandler.LIGHT_SOURCE) {
                    world.setBlockState(player.getPosition().up(), BlockHandler.LIGHT_SOURCE.getDefaultState());
                    stack.getTagCompound().setTag("LastLightPos", NBTUtil.createPosTag(player.getPosition().up()));
                }
            } else if (world.getBlockState(player.getPosition().up()).getBlock() == BlockHandler.LIGHT_SOURCE) {
                world.setBlockToAir(player.getPosition().up());
            }
        }
    }
}