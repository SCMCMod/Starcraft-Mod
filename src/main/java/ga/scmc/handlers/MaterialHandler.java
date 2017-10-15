package ga.scmc.handlers;

import ga.scmc.material.ModMaterialLiquids;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Holds some basic materials for the mod's blocks.
 */
public class MaterialHandler {

	public static Material ACID;
	public static Material BLOOD;
	public static Material VESPENE;
	public static Material TERRAZINE;

	public static Material VESPENE_GAS;
	public static Material TERRAZINE_GAS;

	public static void preInit() {
		ACID = new ModMaterialLiquids(MapColor.GREEN);
		BLOOD = new ModMaterialLiquids(MapColor.RED);
		VESPENE = new ModMaterialLiquids(MapColor.GREEN);
		TERRAZINE = new ModMaterialLiquids(MapColor.PURPLE);

		VESPENE_GAS = new Material(MapColor.GREEN);
		TERRAZINE_GAS = new Material(MapColor.PURPLE);
	}
}