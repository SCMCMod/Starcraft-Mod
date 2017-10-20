package ga.scmc.proxy;

import ga.scmc.client.renderer.armor.ModelZergArmorT1;
import ga.scmc.client.renderer.armor.ModelZergArmorT2;
import ga.scmc.client.renderer.armor.ModelZergArmorT3;
import net.minecraft.client.model.ModelBiped;

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
	public ModelBiped getArmorModel(int id) {
		switch (id) {
		case 0:
			return new ModelZergArmorT1(1.0f);
		case 1:
			return new ModelZergArmorT1(0.5f);
		case 3:
			return new ModelZergArmorT2(1.0f);
		case 4:
			return new ModelZergArmorT2(0.5f);
		case 5:
			return new ModelZergArmorT3(1.0f);
		case 6:
			return new ModelZergArmorT3(0.5f);
		}
		return super.getArmorModel(id);
	}
}