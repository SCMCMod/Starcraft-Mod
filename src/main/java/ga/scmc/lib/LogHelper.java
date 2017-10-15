package ga.scmc.lib;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.relauncher.Side;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Holds the logger and some useful methods.
 */
public class LogHelper {

	public static Logger logger = FMLLog.getLogger();

	static Side side;

	public static void init() {
	}

	public static String toGrid(Object[] array, int width, int height) {
		String out = "\n";
		for (int w = 0; w < width; w++) {
			for (int h = 0; h < height; h++) {
				out += array[h + w * height].toString() + " ";
			}
			out += '\n';
		}
		return out;
	}
}