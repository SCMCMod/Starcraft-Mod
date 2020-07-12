package io.github.scmcmod.jei;

public interface IJeiTooltip
{

	/**
	 * Adds a tooltip to jei for extra info on something if wanted.
	 * 
	 * @param meta The meta of the tooltip trying to be added
	 * @return The tooltip to be added for the specifed metadata value
	 */
	String getTooltip(int meta);
}