package com.hypeirochus.scmc.annotation;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * This annotation means the class or method this is placed over is not being used currently. This should most likely be fixed at some point or another.
 * 
 * @author Ocelot5836
 */
public @interface Unused {

	/**
	 * Might be useful in telling how long a certain object has been in the mod.
	 * 
	 * @return The version this was deemed unused
	 */
	String value() default "";

}