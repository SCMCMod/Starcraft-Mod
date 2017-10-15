package ga.scmc.tileentity;

import ga.scmc.blocks.BlockMovingLightSource;
import ga.scmc.handlers.BlockHandler;
import ga.scmc.handlers.WeaponHandler;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TileEntityMovingLightSource extends TileEntity implements ITickable
{
    
    public TileEntityMovingLightSource()
    {
    }
    
    /**
     * This controls whether the tile entity gets replaced whenever the block state 
     * is changed. Normally only want this when block actually is replaced.
     */
    @Override
    public boolean shouldRefresh(
          World world, 
          BlockPos pos, 
          IBlockState oldState, 
          IBlockState newSate)
    {
        return (oldState.getBlock() != newSate.getBlock());
    }
    
    @Override
    public void update() {
    		
            // check if player has moved away from the tile entity
            EntityPlayer thePlayer = world.getClosestPlayer(getPos().getX()+0.5D, 
                  getPos().getY()+0.5D, 
                  getPos().getZ()+0.5D, 
                  2.0D, false);
            if (thePlayer == null)
            {
                if (world.getBlockState(getPos()).getBlock() == 
                      BlockHandler.LIGHT_SOURCE)
                {
                    world.setBlockToAir(getPos());
                }
            }
            else if (thePlayer.getHeldItem(EnumHand.MAIN_HAND) != null 
                  && !(thePlayer.getHeldItem(EnumHand.MAIN_HAND).getItem() == WeaponHandler.MASTER_PSI_BLADE)
                  && !(thePlayer.getHeldItem(EnumHand.MAIN_HAND).getItem() == WeaponHandler.PSI_BLADE)
                  && !(thePlayer.getHeldItem(EnumHand.MAIN_HAND).getItem() == WeaponHandler.DARK_WARP_BLADE)
                  && !(thePlayer.getHeldItem(EnumHand.MAIN_HAND).getItem() == WeaponHandler.WARP_BLADE)
                  && !(thePlayer.getHeldItem(EnumHand.MAIN_HAND).getItem() == WeaponHandler.BANE_BLADE)
                  )
            {
                if (world.getBlockState(getPos()).getBlock() == 
                      BlockHandler.LIGHT_SOURCE)
                {
                	world.setBlockToAir(getPos());
                }            
            }
    }
}