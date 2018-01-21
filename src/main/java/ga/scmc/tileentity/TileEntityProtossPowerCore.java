package ga.scmc.tileentity;

import ga.scmc.blocks.ProtossPowerCoreBlock;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;

public class TileEntityProtossPowerCore extends TileEntity {

	public TileEntityProtossPowerCore() {
	}
	
	//TODO: Fixme, I don't remove my position once the block is removed from the world!
	@Override
	public void readFromNBT(NBTTagCompound compound) {
			ProtossPowerCoreBlock.CORE_POSITIONS.add(new BlockPos(compound.getInteger("x"), compound.getInteger("y"), compound.getInteger("z")));
		System.out.println(compound.getKeySet());
		super.readFromNBT(compound);
	}
}