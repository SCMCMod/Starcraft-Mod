package com.ocelot.api.utils;

import java.util.BitSet;

public class RandomHalton {

	BitSet haltonGrid = new BitSet();
	private int base1;
	private int base2;
	private int haltonGridSideLength;
	private double spawnChance;

	public RandomHalton() {
		this(2);
	}

	public RandomHalton(float spawnChance) {
		this(2, 7, 1000, spawnChance);
	}

	public RandomHalton(int base1, int base2, int haltonGridSideLength, float spawnChance) {
		this.base1 = base1;
		this.base2 = base2;
		this.haltonGridSideLength = haltonGridSideLength;
		this.spawnChance = spawnChance;
		this.populateHalton();
	}

	private float halton(int index, int base) {
		float result = 0;
		float theFraction = 1 / (float) base;
		int i = base;

		while (i > 0) {
			result = result + (theFraction * (1 % base));
			i = i / base;
			theFraction = theFraction / base;
		}
		return result;
	}

	private void populateHalton() {
		for (int z = 1; z < spawnChance * haltonGridSideLength * haltonGridSideLength; z++) {
			int zCoord = (int) (haltonGridSideLength * halton(z, base2));
			int xCoord = (int) (haltonGridSideLength * halton(z, base1));
			haltonGrid.set(zCoord * haltonGridSideLength + xCoord);
		}
	}

	public boolean get(int x, int z) {
		int indexX = Math.abs(x);
		int indexZ = Math.abs(z);

		if (x < 0) {
			indexX--;
		}
		if (z < 0) {
			indexZ--;
		}

		indexX = indexX % haltonGridSideLength;
		indexZ = indexZ % haltonGridSideLength;

		if (x < 0) {
			indexX = haltonGridSideLength - 1 - indexX;
		}
		if (z < 0) {
			indexZ = haltonGridSideLength - 1 - indexZ;
		}
		return haltonGrid.get(indexZ * haltonGridSideLength + indexX);
	}
}