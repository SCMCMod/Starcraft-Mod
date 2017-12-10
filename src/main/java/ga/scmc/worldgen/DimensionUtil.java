package ga.scmc.worldgen;

import java.util.Random;

import com.arisux.mdx.lib.client.render.Draw;

public class DimensionUtil {
	public static void renderStars(Random rand, int stars, double starSize) {
		Draw.startQuads();

		for (int amountOfStars = 0; amountOfStars < stars; amountOfStars++) {
			double starX = rand.nextFloat() * 2.0F - 1.0F;
			double starY = rand.nextFloat() * 2.0F - 1.0F;
			double starZ = rand.nextFloat() * 2.0F - 1.0F;
			double size = 0.15F + rand.nextFloat() * 0.1F;
			double distance = starX * starX + starY * starY + starZ * starZ;

			if ((distance >= 1.0D) || (distance <= 0.01D)) {
				distance = 1.0D / Math.sqrt(distance);
				starX *= distance;
				starY *= distance;
				starZ *= distance;
				double sizeX = starX * starSize;
				double sizeY = starY * starSize;
				double sizeZ = starZ * starSize;
				double var20 = Math.atan2(starX, starZ);
				double var22 = Math.sin(var20);
				double var24 = Math.cos(var20);
				double var26 = Math.atan2(Math.sqrt(starX * starX + starZ * starZ), starY);
				double var28 = Math.sin(var26);
				double var30 = Math.cos(var26);
				double var32 = rand.nextDouble() * Math.PI * 2.0D;
				double var34 = Math.sin(var32);
				double var36 = Math.cos(var32);

				for (int vertex = 0; vertex < 4; vertex++) {
					double dist = 0.0D;
					double var41 = ((vertex & 0x2) - 1) * size;
					double var43 = ((vertex + 1 & 0x2) - 1) * size;
					double var45 = var41 * var36 - var43 * var34;
					double var47 = var43 * var36 + var41 * var34;
					double var51 = dist * var28 - var45 * var30;

					double randX = var51 * var22 - var47 * var24;
					double randY = var45 * var28 + dist * var30;
					double randZ = var47 * var22 + var51 * var24;
					Draw.vertex(sizeX + randX, sizeY + randY, sizeZ + randZ).endVertex();
				}
			}
		}

		Draw.tessellate();
	}

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