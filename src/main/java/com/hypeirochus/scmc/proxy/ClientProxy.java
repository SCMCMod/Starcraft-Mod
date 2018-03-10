package com.hypeirochus.scmc.proxy;

import com.hypeirochus.scmc.client.model.armor.ModelArmorBase;
import com.hypeirochus.scmc.client.model.armor.ModelProtossArmor;
import com.hypeirochus.scmc.client.model.armor.ModelProtossNerazimArmor;
import com.hypeirochus.scmc.client.model.armor.ModelProtossTaldarimArmor;
import com.hypeirochus.scmc.client.model.armor.ModelTerranMarineArmor;
import com.hypeirochus.scmc.client.model.armor.ModelZergArmorT1;
import com.hypeirochus.scmc.client.model.armor.ModelZergArmorT2;
import com.hypeirochus.scmc.client.model.armor.ModelZergArmorT3;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 *
 * @author Ocelot536
 */
public class ClientProxy extends CommonProxy {

	private static final ModelArmorBase M0 = new ModelZergArmorT1(1.0f);
	private static final ModelArmorBase M1 = new ModelZergArmorT1(0.5f);
	private static final ModelArmorBase M2 = new ModelZergArmorT2(1.0f);
	private static final ModelArmorBase M3 = new ModelZergArmorT2(0.5f);
	private static final ModelArmorBase M4 = new ModelZergArmorT3(1.0f);
	private static final ModelArmorBase M5 = new ModelZergArmorT3(0.5f);
	private static final ModelArmorBase M6 = new ModelTerranMarineArmor(1.0f);
	private static final ModelArmorBase M7 = new ModelTerranMarineArmor(0.5f);
	private static final ModelArmorBase M8 = new ModelProtossArmor(1.0f);
	private static final ModelArmorBase M9 = new ModelProtossArmor(0.5f);
	private static final ModelArmorBase M10 = new ModelProtossTaldarimArmor(1.0f);
	private static final ModelArmorBase M11 = new ModelProtossTaldarimArmor(0.5f);
	private static final ModelArmorBase M12 = new ModelProtossNerazimArmor(1.0f);
	private static final ModelArmorBase M13 = new ModelProtossNerazimArmor(0.5f);

	@Override
	public ModelArmorBase getArmorModel(int id) {
		switch (id) {
		default:
			return M0;
		case 0:
			return M0;
		case 1:
			return M1;
		case 2:
			return M2;
		case 3:
			return M3;
		case 4:
			return M4;
		case 5:
			return M5;
		case 6:
			return M6;
		case 7:
			return M7;
		case 8:
			return M8;
		case 9:
			return M9;
		case 10:
			return M10;
		case 11:
			return M11;
		case 12:
			return M12;
		case 13:
			return M13;
		}
	}
}