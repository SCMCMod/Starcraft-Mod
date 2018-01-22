package ga.scmc.tileentity;

import java.util.LinkedList;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;

public class TileEntityProtossPowerCore extends TileEntity {

	public static final LinkedList<BlockPos> CORE_POSITIONS = new LinkedList<BlockPos>();

	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		CORE_POSITIONS.remove(getPos());
		CORE_POSITIONS.add(getPos());
	}

	@Override
	public void invalidate() {
		super.invalidate();
		CORE_POSITIONS.remove(getPos());
	}
}