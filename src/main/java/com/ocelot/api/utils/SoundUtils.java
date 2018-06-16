package com.ocelot.api.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.Sound;

/**
 * <em><b>Copyright (c) 2018 Ocelot5836.</b></em>
 * 
 * <br>
 * </br>
 * 
 * This class holds some useful methods for managing sounds.
 * 
 * @author Ocelot5836
 * @deprecated This class is actually useless. It's not very useful if you want to manage sounds
 */
public class SoundUtils {

	private static Minecraft mc = Minecraft.getMinecraft();

	/**
	 * Plays the default minecraft button click sound.
	 * 
	 * @deprecated This method was changed to {@link GuiUtils#playButtonClick()}
	 */
	public static void playButtonClick() {
		GuiUtils.playButtonClick();
	}

	/**
	 * Stops a specific sound.
	 * 
	 * @param sound
	 *            The sound to stop
	 * @deprecated This is a useless method. Just use the one provided by Minecraft
	 */
	public static void stopSound(ISound sound) {
		mc.getSoundHandler().stopSound(sound);
	}

	/**
	 * Stops all currently playing sounds.
	 * 
	 * @deprecated This is a useless method. Just use the one provided by Minecraft
	 */
	public static void stopAllSounds() {
		mc.getSoundHandler().stopSounds();
	}

	/**
	 * Pauses all currently playing sounds.
	 * 
	 * @deprecated This is a useless method. Just use the one provided by Minecraft
	 */
	public static void pauseAllSounds() {
		mc.getSoundHandler().pauseSounds();
	}

	/**
	 * Resumes all currently playing sounds.
	 * 
	 * @deprecated This is a useless method. Just use the one provided by Minecraft
	 */
	public static void resumeAllSounds() {
		mc.getSoundHandler().resumeSounds();
	}

	/**
	 * @return The sound used if a sound is missing.
	 * @deprecated This is a useless method. Just use the one provided by Minecraft
	 */
	public static Sound getMissingSound() {
		return mc.getSoundHandler().MISSING_SOUND;
	}
}