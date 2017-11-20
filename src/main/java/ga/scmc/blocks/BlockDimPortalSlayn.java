package ga.scmc.blocks;

import ga.scmc.handlers.ConfigurationHandler;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class BlockDimPortalSlayn extends BlockDimPortal {

	public BlockDimPortalSlayn() {
		super(0);
		setUnlocalizedName("slayn.portal");
		setRegistryName("slayn.portal");
	}
}