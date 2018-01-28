package ga.scmc.events;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

@EventBusSubscriber
public class OnPlayerLoggedInEvent {

	@SubscribeEvent
	public void onPlayerLoggedInEvent(PlayerLoggedInEvent event) {
		EntityPlayer player = event.player;
		String message = "Running SCMC version 2.0.493!";
		player.sendMessage(new TextComponentString(message).setStyle(new Style().setColor(TextFormatting.BLUE)));
	}
}