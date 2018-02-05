package ga.scmc.enums;

import net.minecraft.block.material.MapColor;
import net.minecraft.util.IStringSerializable;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Holds the enums for the blocks in the mod.
 */
public class EnumMetaBlock {

	public static enum StarSurfaceType implements IStringSerializable {
		BLUE("blue", 0, MapColor.BLUE), 
		LIGHTBLUE("lightblue", 1, MapColor.LIGHT_BLUE), 
		ORANGE("orange", 2, MapColor.ADOBE), 
		YELLOW("yellow", 3, MapColor.GOLD), 
		LIGHTYELLOW("lightyellow", 4, MapColor.YELLOW), 
		RED("red", 5, MapColor.RED);

		private int ID;
		private String name;
		private MapColor color;

		private StarSurfaceType(String name, int ID, MapColor color) {
			this.ID = ID;
			this.name = name;
			this.color = color;
		}

		public int getID() {
			return ID;
		}

		@Override
		public String getName() {
			return name;
		}

		public MapColor getMapColor() {
			return color;
		}

		@Override
		public String toString() {
			return getName();
		}
	}
	
	public static enum PlanetSurfaceType implements IStringSerializable {
		BLUE("blue", 0, MapColor.BLUE), 
		BROWN("brown", 1, MapColor.BROWN), 
		CYAN("cyan", 2, MapColor.CYAN), 
		GRAY("gray", 3, MapColor.GRAY), 
		GREEN("green", 4, MapColor.GREEN), 
		LIGHTBLUE("lightblue", 5, MapColor.LIGHT_BLUE), 
		LIME("lime", 6, MapColor.LIME), 
		MAGENTA("magenta", 7, MapColor.MAGENTA), 
		ORANGE("orange", 8, MapColor.ADOBE), 
		PINK("pink", 9, MapColor.PINK), 
		PURPLE("purple", 10, MapColor.PURPLE), 
		RED("red", 11, MapColor.RED), 
		WHITE("white", 12, MapColor.SNOW), 
		SILVER("silver", 13, MapColor.SILVER),
		BLACK("black", 14, MapColor.BLUE),
		YELLOW("yellow", 15, MapColor.YELLOW); 

		private int ID;
		private String name;
		private MapColor color;

		private PlanetSurfaceType(String name, int ID, MapColor color) {
			this.ID = ID;
			this.name = name;
			this.color = color;
		}

		public int getID() {
			return ID;
		}

		@Override
		public String getName() {
			return name;
		}

		public MapColor getMapColor() {
			return color;
		}

		@Override
		public String toString() {
			return getName();
		}
	}
	
	public static enum CompressedMetalType implements IStringSerializable {
		COPPER("copper", 0, MapColor.ADOBE), STEEL("steel", 1, MapColor.BLACK), TITANIUM("titanium", 2, MapColor.IRON);

		private int ID;
		private String name;
		private MapColor color;

		private CompressedMetalType(String name, int ID, MapColor color) {
			this.ID = ID;
			this.name = name;
			this.color = color;
		}

		public int getID() {
			return ID;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return getName();
		}

		public MapColor getMapColor() {
			return color;
		}
	}

	public static enum CompressedMineralType implements IStringSerializable {
		BLUE("blue", 0, MapColor.BLUE), RICH("rich", 1, MapColor.ADOBE);

		private int ID;
		private String name;
		private MapColor color;

		private CompressedMineralType(String name, int ID, MapColor color) {
			this.ID = ID;
			this.name = name;
			this.color = color;
		}

		public int getID() {
			return ID;
		}

		@Override
		public String getName() {
			return name;
		}

		public MapColor getMapColor() {
			return color;
		}

		@Override
		public String toString() {
			return getName();
		}
	}

	public static enum NeosteelMetalType implements IStringSerializable {
		BASE("base", 0, MapColor.IRON), FRAME("frame", 1, MapColor.IRON);

		private int ID;
		private String name;
		private MapColor color;

		private NeosteelMetalType(String name, int ID, MapColor color) {
			this.ID = ID;
			this.name = name;
			this.color = color;
		}

		public int getID() {
			return ID;
		}

		@Override
		public String getName() {
			return name;
		}

		public MapColor getMapColor() {
			return color;
		}

		@Override
		public String toString() {
			return getName();
		}
	}

	public static enum ParisteelMetalType implements IStringSerializable {
		PURPLE("purple", 0, MapColor.PURPLE), BROWN("brown", 1, MapColor.BROWN), PINK("pink", 2, MapColor.PINK), BLUE("blue", 3, MapColor.BLUE), CYAN("cyan", 4, MapColor.CYAN), GRAY("gray", 5, MapColor.GRAY), GREEN("green", 6, MapColor.GREEN), LIGHT_BLUE("lightblue", 7, MapColor.LIGHT_BLUE), LIME("lime", 8, MapColor.LIME), MAGENTA("magenta", 9, MapColor.MAGENTA), ORANGE("orange", 10, MapColor.ADOBE), RED("red", 11, MapColor.RED), SILVER("silver", 12, MapColor.SILVER), WHITE("white", 13, MapColor.SNOW), YELLOW("yellow", 14, MapColor.YELLOW), BLACK("black", 15, MapColor.BLACK);

		private int ID;
		private String name;
		private MapColor color;

		private ParisteelMetalType(String name, int ID, MapColor color) {
			this.ID = ID;
			this.name = name;
			this.color = color;
		}

		public int getID() {
			return ID;
		}

		@Override
		public String getName() {
			return name;
		}

		public MapColor getMapColor() {
			return color;
		}

		@Override
		public String toString() {
			return getName();
		}
	}

	public static enum ProtossMetalType implements IStringSerializable {
		AIUR("aiur", 0, MapColor.GOLD), DARK("dark", 1, MapColor.BLACK), GREEN("green", 2, MapColor.GREEN), BLUE("blue", 3, MapColor.BLUE), RED("red", 4, MapColor.RED);

		private int ID;
		private String name;
		private MapColor color;

		private ProtossMetalType(String name, int ID, MapColor color) {
			this.ID = ID;
			this.name = name;
			this.color = color;
		}

		public int getID() {
			return ID;
		}

		@Override
		public String getName() {
			return name;
		}

		public MapColor getMapColor() {
			return color;
		}

		@Override
		public String toString() {
			return getName();
		}
	}

	public static enum PylonCrystalType implements IStringSerializable {
		PURE("pure", 0, MapColor.LIGHT_BLUE), DARK("dark", 1, MapColor.BLACK), VOID("void", 2, MapColor.LIME);

		private int ID;
		private String name;
		private MapColor color;

		private PylonCrystalType(String name, int ID, MapColor color) {
			this.ID = ID;
			this.name = name;
			this.color = color;
		}

		public int getID() {
			return ID;
		}

		@Override
		public String getName() {
			return name;
		}

		public MapColor getMapColor() {
			return color;
		}

		@Override
		public String toString() {
			return getName();
		}
	}

	public static enum ZergFleshType implements IStringSerializable {
		PURPLE("purple", 0, MapColor.PURPLE), BROWN("brown", 1, MapColor.BROWN), PINK("pink", 2, MapColor.PINK), BLUE("blue", 3, MapColor.BLUE), CYAN("cyan", 4, MapColor.CYAN), GRAY("gray", 5, MapColor.GRAY), GREEN("green", 6, MapColor.GREEN), LIGHT_BLUE("lightblue", 7, MapColor.LIGHT_BLUE), LIME("lime", 8, MapColor.LIME), MAGENTA("magenta", 9, MapColor.MAGENTA), ORANGE("orange", 10, MapColor.ADOBE), RED("red", 11, MapColor.RED), SILVER("silver", 12, MapColor.SILVER), WHITE("white", 13, MapColor.SNOW), YELLOW("yellow", 14, MapColor.YELLOW);

		private int ID;
		private String name;
		private MapColor color;

		private ZergFleshType(String name, int ID, MapColor color) {
			this.ID = ID;
			this.name = name;
			this.color = color;
		}

		public int getID() {
			return ID;
		}

		@Override
		public String getName() {
			return name;
		}

		public MapColor getMapColor() {
			return color;
		}

		@Override
		public String toString() {
			return getName();
		}
	}

	public static enum ZergStructureCarapaceType implements IStringSerializable {
		T1("1", 0, MapColor.BROWN), T2("2", 1, MapColor.BROWN), T3("3", 2, MapColor.BROWN);

		private int ID;
		private String name;
		private MapColor color;

		private ZergStructureCarapaceType(String name, int ID, MapColor color) {
			this.ID = ID;
			this.name = name;
			this.color = color;
		}

		public int getID() {
			return ID;
		}

		@Override
		public String getName() {
			return name;
		}

		public MapColor getMapColor() {
			return color;
		}

		@Override
		public String toString() {
			return getName();
		}
	}

	public static enum GasCollectorType implements IStringSerializable {
		PROTOSS("protoss", 0, MapColor.YELLOW), TERRAN("terran", 1, MapColor.IRON), ZERG("zerg", 2, MapColor.BROWN);

		private int ID;
		private String name;
		private MapColor color;

		private GasCollectorType(String name, int ID, MapColor color) {
			this.ID = ID;
			this.name = name;
			this.color = color;
		}

		public int getID() {
			return ID;
		}

		@Override
		public String getName() {
			return name;
		}

		public MapColor getMapColor() {
			return color;
		}

		@Override
		public String toString() {
			return getName();
		}
	}
	
	public static enum EnumSkullType implements IStringSerializable {
		CIVILIAN("civilian", 0), ZERGLING_SC2("zergling_sc2", 1), HYDRALISK("hydralisk", 2), BRUTALISK("brutalisk", 3);

		private int ID;
		private String name;

		private EnumSkullType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}

		public int getID() {
			return ID;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return getName();
		}
	}
}