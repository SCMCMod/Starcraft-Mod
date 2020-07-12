/**
 * Copyright (C) 2020 Interstellar:  Exoplanets
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.github.scmcmod.utils;

import java.util.HashMap;
import java.util.Map;

import io.github.scmcmod.SCConstants;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.rom.utils.CoreUtil;

public class Assets {
	/**
	 * Private constructor for singleton.
	 */
	private Assets() {
	}

	private static final String DOMAIN = SCConstants.MODID;
	public static Map<String, ResourceLocation> textures = new HashMap<>();
	public static Map<String, ResourceLocation[]> textureGroups = new HashMap<>();
	//private static Map<String, SoundEvent> sounds = new HashMap<>();

    // ==================================================
    //                        Add
    // ==================================================
	// ========== Texture ==========
	public static void addTexture(String name, String domain, String path) {
		name = name.toLowerCase();
		textures.put(name, new ResourceLocation(domain, path));
	}
	
	public static void addTexture(String name, String path) {
		name = name.toLowerCase();
		textures.put(name, new ResourceLocation(DOMAIN, path));
	}
	
    // ==================================================
    //                        Get
    // ==================================================
	// ========== Texture ==========
	public static ResourceLocation getTexture(String name) {
		name = name.toLowerCase();
		if(!textures.containsKey(name))
			return null;
		return textures.get(name);
	}

}
