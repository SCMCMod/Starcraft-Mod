package ga.scmc.enums;

public enum EnumWorldType {
    CHAR(0, "char"), SHAKURAS(1, "shakuras"), SLAYN(2, "slayn");

    private int id;
    private String name;

    EnumWorldType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
