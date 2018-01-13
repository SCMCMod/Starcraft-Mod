package ga.scmc.tileentity;

import org.lwjgl.util.vector.Vector3f;

import ga.scmc.handlers.BlockHandler;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;

/**
 * @author Ocelot5836
 */
public class TileEntityWarpGateWormhole extends TileEntity {
	
	public int getColor() {
		IBlockState block = world.getBlockState(pos.down(3));
		
		if(block == BlockHandler.PROTOSS_ENERGY_STABILIZER.getDefaultState()) {
			return 0xFF42CEF4;
		}
		
		if(block == BlockHandler.PROTOSS_DARK_ENERGY_STABILIZER.getDefaultState()) {
			return 0xFFFF0000;
		}
		
		if(block == BlockHandler.PROTOSS_VOID_ENERGY_STABILIZER.getDefaultState()) {
			return 0xFF00FF00;
		}
		
		return 0;
	}
}