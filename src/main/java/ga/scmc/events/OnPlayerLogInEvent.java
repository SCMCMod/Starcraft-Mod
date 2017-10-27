package ga.scmc.events;

import ga.scmc.debugging.ColorProvider;
import ga.scmc.debugging.IColor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class OnPlayerLogInEvent {

	@SubscribeEvent
	public void onPlayerLogsIn(PlayerLoggedInEvent event) {
		EntityPlayer player = event.player;
		String message = "Running SCMC version 1.6.";
		player.sendMessage(new TextComponentString(message).setStyle(new Style().setColor(TextFormatting.RED)));
	}
}