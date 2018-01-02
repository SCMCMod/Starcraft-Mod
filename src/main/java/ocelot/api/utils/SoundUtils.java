package ocelot.api.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.audio.Sound;
import net.minecraft.init.SoundEvents;

/**
 * <em><b>Copyright (c) 2017 Ocelot5836.</b></em>
 * 
 * <br>
 * </br>
 * 
 * This class holds some useful methods for managing sounds.
 * 
 * @author Ocelot5836
 */
public class SoundUtils {

	private static Minecraft mc = Minecraft.getMinecraft();

	/**
	 * Plays the default minecraft button click sound.
	 */
	public static void playButtonClick() {
		mc.getSoundHandler().playSound(PositionedSoundRecord.getMasterRecord(SoundEvents.UI_BUTTON_CLICK, 1.0F));
	}

	/**
	 * Stops all currently playing sounds.
	 */
	public static void stopAllSounds() {
		mc.getSoundHandler().stopSounds();
	}

	/**
	 * Pauses all currently playing sounds.
	 */
	public static void pauseAllSounds() {
		mc.getSoundHandler().pauseSounds();
	}

	/**
	 * Resumes all currently playing sounds.
	 */
	public static void resumeAllSounds() {
		mc.getSoundHandler().resumeSounds();
	}

	/**
	 * Unloads the sounds currently inside the sounds handler.
	 */
	public static void unloadSounds() {
		mc.getSoundHandler().unloadSounds();
	}

	/**
	 * @return The sound used if a sound is missing.
	 */
	public static Sound getMissingSound() {
		return mc.getSoundHandler().MISSING_SOUND;
	}
}