package ga.scmc.blocks;

import ga.scmc.handlers.ConfigurationHandler;

public class BlockDimPortalChar extends BlockDimPortal {

	public BlockDimPortalChar() {
		super(ConfigurationHandler.INT_DIMENSION_CHAR);
		setUnlocalizedName("char.portal");
		setRegistryName("char.portal");
	}
}