package ga.scmc.events;

import ga.scmc.debugging.ColorProvider;
import ga.scmc.debugging.IColor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class OnPlayerLogInEvent {

	@SubscribeEvent
	public void onPlayerLogsIn(PlayerLoggedInEvent event) {
		EntityPlayer player = event.player;

		IColor color = player.getCapability(ColorProvider.COLOR, null);

		String message = "Hello there, your team ID is " + color.getColor() + ".";

		player.sendMessage(new TextComponentString(message));
	}
}