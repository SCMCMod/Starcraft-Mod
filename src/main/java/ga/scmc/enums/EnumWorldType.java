package ga.scmc.enums;

import ga.scmc.handlers.GuiHandler;
import net.minecraft.util.IStringSerializable;

public enum EnumWorldType implements IStringSerializable {
	CHAR(0, "char", GuiHandler.CHAR_FURNACE), SHAKURAS(1, "shakuras", GuiHandler.SHAKURAS_FURNACE), SLAYN(2, "slayn", GuiHandler.SLAYN_FURNACE);

	private int id;
	private String name;
	private int guiId;

	EnumWorldType(int id, String name, int guiId) {
		this.id = id;
		this.name = name;
		this.guiId = guiId;
	}

	public int getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	public int getGuiId() {
		return guiId;
	}

	@Override
	public String toString() {
		return getName();
	}
}
