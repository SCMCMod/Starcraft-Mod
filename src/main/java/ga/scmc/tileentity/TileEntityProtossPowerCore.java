package ga.scmc.tileentity;

import ga.scmc.blocks.ProtossPowerCoreBlock;
import net.minecraft.tileentity.TileEntity;

public class TileEntityProtossPowerCore extends TileEntity {

	public TileEntityProtossPowerCore() {
	}

	@Override
	public void onLoad() {
		if (!world.isRemote) {
			ProtossPowerCoreBlock.CORE_POSITIONS.add(getPos());
		}
	}
}