package ga.scmc.enums;

public enum EnumLarvaGuiEntities {

	DRONE(0, 50),
	OVERLORD(1, 100),
	ZERGLING(2, 50, 0, 2),
	ROACH(3, 75, 25),
	HYDRALISK(4, 100, 25),
	INFESTOR(5, 100, 150),
	SWARM_HOST(6, 100, 75),
	MUTALISK(7, 100, 100),
	SCOURGE(8, 25, 75),
	DEFILER(9, 50, 150),
	CORRUPTOR(10, 150, 100),
	QUEEN(11, 100),
	ULTRALISK(12, 200, 200),
	VIPER(13, 100, 200);

	private short id;
	private int mineralCost;
	private int vespeneCost;
	private int numSpawned;

	EnumLarvaGuiEntities(int id, int mineralCost) {
		this(id, mineralCost, 0, 1);
	}

	EnumLarvaGuiEntities(int id, int mineralCost, int vespeneCost) {
		this(id, mineralCost, vespeneCost, 1);
	}

	EnumLarvaGuiEntities(int id, int mineralCost, int vespeneCost, int numSpawned) {
		this.id = (short) id;
		this.mineralCost = mineralCost;
		this.vespeneCost = vespeneCost;
		this.numSpawned = numSpawned;
	}

	public short getId() {
		return id;
	}

	public int getMineralCost() {
		return mineralCost;
	}

	public int getVespeneCost() {
		return vespeneCost;
	}

	public int getNumSpawned() {
		return numSpawned;
	}
}