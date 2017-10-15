package ga.scmc.tileentity;

import org.lwjgl.util.vector.Vector3f;

import ga.scmc.handlers.BlockHandler;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;

/**
 * @author Ocelot5836
 */
public class TileEntityWarpGateWormhole extends TileEntity {
	
	private Vector3f color;
	
	// I know it's nooby but it works so deal with it
	public Vector3f getColor() {
		setColor(255, 255, 255);
		IBlockState block = world.getBlockState(pos.down(3));
		
		if(block == BlockHandler.PROTOSS_ENERGY_STABILIZER.getDefaultState()) {
			setColor(0, 0, 255);
		}
		
		if(block == BlockHandler.PROTOSS_DARK_ENERGY_STABILIZER.getDefaultState()) {
			setColor(255, 0, 0);
		}
		
		if(block == BlockHandler.PROTOSS_VOID_ENERGY_STABILIZER.getDefaultState()) {
			setColor(0, 255, 0);
		}
		
		return color;
	}
	
	private void setColor(int r, int g, int b) {
		this.color = new Vector3f(r / 255, g / 255, b / 255);
	}
}