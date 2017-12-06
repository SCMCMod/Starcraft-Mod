package ga.scmc.proxy;

import ga.scmc.Starcraft;
import ga.scmc.client.gui.GuiHandler;
import ga.scmc.client.renderer.model.armor.ModelArmorBase;
import ga.scmc.client.renderer.model.armor.ModelTerranMarineArmorT1;
import ga.scmc.client.renderer.model.armor.ModelZergArmorT1;
import ga.scmc.client.renderer.model.armor.ModelZergArmorT2;
import ga.scmc.client.renderer.model.armor.ModelZergArmorT3;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 *
 * @author Ocelot536
 */
public class ClientProxy extends CommonProxy {

	@Override
	public ModelArmorBase getArmorModel(int id) {
		switch (id) {
		default:
			return new ModelZergArmorT1(1.0f);
		case 0:
			return new ModelZergArmorT1(1.0f);
		case 1:
			return new ModelZergArmorT1(0.5f);
		case 2:
			return new ModelZergArmorT2(1.0f);
		case 3:
			return new ModelZergArmorT2(0.5f);
		case 4:
			return new ModelZergArmorT3(1.0f);
		case 5:
			return new ModelZergArmorT3(0.5f);
		case 6:
			return new ModelTerranMarineArmorT1(1.0f);
		case 7:
			return new ModelTerranMarineArmorT1(0.5f);
		}
	}
}