package ga.scmc.handlers;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 */
public class FuelHandler implements IFuelHandler {

	public static void preInit() {
		GameRegistry.registerFuelHandler(new FuelHandler());
	}

	@Override
	public int getBurnTime(ItemStack fuel) {
		if (fuel.getItem() == ItemHandler.VESPENE)
			return 3200;
		if (fuel.getItem() == ItemHandler.TERRAZINE)
			return 3200;
		if (fuel.getItem() == ItemHandler.LOG)
			return 2000;

		return 0;
	}

}