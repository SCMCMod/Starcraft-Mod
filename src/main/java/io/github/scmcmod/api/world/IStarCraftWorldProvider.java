package io.github.scmcmod.api.world;


/**
 * 
 * 
 * @author ROMVoid95
 *
 */
public interface IStarCraftWorldProvider {
	
    /**
     * Fall damage will be multiplied by this number while on the planet/moon.
     *
     * @return Fall damage multiplier, returning 1 will be equal to earth.
     */
    float getFallDamageModifier();

    /**
     * 
     * @return true if this world has no type of atmosphere at all - e.g. the Moon
     */
    boolean hasNoAtmosphere();
   
    /**
     * If false (the default) then Nether Portals will have no function on this world.
     * Nether Portals can still be constructed, if the player can make fire, they just
     * won't do anything.
     * 
     * @return True if Nether Portals should work like on the Overworld.
     */
    boolean netherPortalsOperational();
    
    /**
     * This value will affect player's thermal level, damaging them if it
     * reaches too high or too low.
     *
     * @return Positive integer for hot celestial bodies, negative for cold.
     * Zero for neutral
     */
    float getThermalLevelModifier();

    /**
     * Amount of wind on this world. Used for flag waving.
     * <p/>
     * Earth has a value of 1.0F, Luna (Moon) has a value of 0.0F.
     *
     * @return Flag movement magnitude. Relative to earth's value of 1.0F
     */
    float getWindLevel();
    
    /**
     * Factor by which the sun is to be drawn smaller (<1.0) or larger (>1.0) than
     * the sun on the Overworld
     * 
     * @return  factor
     */
    float getSolarSize();
    
    /**
     * Whether rain and snow should be disabled on this planet
     *
     * @return true if precipitation should be disabled. False otherwise.
     */
    boolean shouldDisablePrecipitation();

    /**
     * Whether or not player's armor should be corroded in this world
     *
     * @return true if armor should be corroded, false if not
     */
    boolean shouldCorrodeArmor();

}
