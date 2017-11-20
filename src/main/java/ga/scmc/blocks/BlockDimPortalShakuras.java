package ga.scmc.blocks;

import ga.scmc.handlers.ConfigurationHandler;

public class BlockDimPortalShakuras extends BlockDimPortal {

	public BlockDimPortalShakuras() {
		super(ConfigurationHandler.INT_DIMENSION_SHAKURAS);
		setUnlocalizedName("shakuras.portal");
		setRegistryName("shakuras.portal");
	}
}