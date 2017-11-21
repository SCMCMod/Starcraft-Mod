package ga.scmc.blocks;

import ga.scmc.handlers.ConfigurationHandler;

public class BlockDimPortalKaldir extends BlockDimPortal {

	public BlockDimPortalKaldir() {
		super(ConfigurationHandler.INT_DIMENSION_KALDIR);
		setUnlocalizedName("kaldir.portal");
		setRegistryName("kaldir.portal");
	}
}