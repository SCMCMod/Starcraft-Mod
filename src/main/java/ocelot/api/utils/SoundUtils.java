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

	private static final Minecraft MC = Minecraft.getMinecraft();

	/**
	 * Plays the default minecraft button click sound.
	 */
	public static void playButtonClick() {
		MC.getSoundHandler().playSound(PositionedSoundRecord.getMasterRecord(SoundEvents.UI_BUTTON_CLICK, 1.0F));
	}

	/**
	 * Stops all currently playing sounds.
	 */
	public static void stopAllSounds() {
		MC.getSoundHandler().stopSounds();
	}

	/**
	 * Pauses all currently playing sounds.
	 */
	public static void pauseAllSounds() {
		MC.getSoundHandler().pauseSounds();
	}

	/**
	 * Resumes all currently playing sounds.
	 */
	public static void resumeAllSounds() {
		MC.getSoundHandler().resumeSounds();
	}

	/**
	 * Unloads the sounds currently inside the sounds handler.
	 */
	public static void unloadSounds() {
		MC.getSoundHandler().unloadSounds();
	}

	/**
	 * @return The sound used if a sound is missing.
	 */
	public static Sound getMissingSound() {
		return MC.getSoundHandler().MISSING_SOUND;
	}
}