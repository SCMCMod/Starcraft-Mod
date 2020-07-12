package io.github.scmcmod.tileentity;

/**
 * A very basic interface that adds the pylon requirements, speed bonus, and
 * efficiency bonus to a protoss machine.
 * 
 * @author Ocelot5836
 */
public interface IProtossMachine
{

	/**
	 * @return Do we have enough pylons to preoceed with out function?
	 */
	boolean hasPylons();

	/**
	 * @return The multiplier in speed
	 */
	int getSpeedBonus();

	/**
	 * @return The multiplier in efficiency/duplication
	 */
	int getEfficiencyBonus();

}