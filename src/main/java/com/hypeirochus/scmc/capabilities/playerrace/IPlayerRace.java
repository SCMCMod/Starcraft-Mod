package com.hypeirochus.scmc.capabilities.playerrace;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * @author Ocelot5836
 */
public interface IPlayerRace {

	/**
	 * @return The race after it is parsed
	 */
	Race getRace();

	/**
	 * Sets the current race.
	 * 
	 * @param race
	 *            The new race
	 */
	void setRace(Race race);

	/**
	 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
	 * 
	 * <br>
	 * </br>
	 * 
	 * The difference starcraft races available.
	 * 
	 * @author Ocelot5836
	 */
	public enum Race {
		UNDEFINED, PROTOSS, TERRAN, ZERG
	}
}