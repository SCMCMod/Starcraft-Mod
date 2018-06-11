package com.hypeirochus.scmc.worldgen;

//TODO: MOVE TO CORE MOD
public class DimensionUtil {

	public static float calculateCelestialAngle(long worldTime, float renderPartialTicks) {
		long cycleTime = 48000L;
		int remainingTime = (int) (worldTime % cycleTime);
		float angle = (remainingTime + renderPartialTicks) / cycleTime - 0.25F;

		if (angle < 0.0F) {
			angle += 1.0F;
		}

		if (angle > 1.0F) {
			angle -= 1.0F;
		}

		float anglePrev = angle;
		angle = 1.0F - (float) ((Math.cos(angle * Math.PI) + 1.0D) / 2.0D);
		angle = anglePrev + (angle - anglePrev) / 3.0F;

		return angle;
	}

}