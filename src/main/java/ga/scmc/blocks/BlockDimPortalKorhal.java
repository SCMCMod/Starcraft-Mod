package ga.scmc.blocks;

import ga.scmc.handlers.ConfigurationHandler;

public class BlockDimPortalKorhal extends BlockDimPortal {

	public BlockDimPortalKorhal() {
		super(ConfigurationHandler.INT_DIMENSION_KORHAL);
		setUnlocalizedName("korhal.portal");
		setRegistryName("korhal.portal");
	}
}