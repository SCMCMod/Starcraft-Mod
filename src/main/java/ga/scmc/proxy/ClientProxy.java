package ga.scmc.proxy;

import ga.scmc.client.renderer.model.armor.ModelArmorBase;
import ga.scmc.client.renderer.model.armor.ModelProtossArmor;
import ga.scmc.client.renderer.model.armor.ModelProtossNerazimArmor;
import ga.scmc.client.renderer.model.armor.ModelProtossTaldarimArmor;
import ga.scmc.client.renderer.model.armor.ModelTerranMarineArmor;
import ga.scmc.client.renderer.model.armor.ModelZergArmorT1;
import ga.scmc.client.renderer.model.armor.ModelZergArmorT2;
import ga.scmc.client.renderer.model.armor.ModelZergArmorT3;

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
			return new ModelTerranMarineArmor(1.0f);
		case 7:
			return new ModelTerranMarineArmor(0.5f);
		case 8:
			return new ModelProtossArmor(1.0f);
		case 9:
			return new ModelProtossArmor(0.5f);
		case 10:
			return new ModelProtossTaldarimArmor(1.0f);
		case 11:
			return new ModelProtossTaldarimArmor(0.5f);
		case 12:
			return new ModelProtossNerazimArmor(1.0f);
		case 13:
			return new ModelProtossNerazimArmor(0.5f);
		}
	}
}