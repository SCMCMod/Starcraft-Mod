package ga.scmc.events;

import ga.scmc.debugging.ColorProvider;
import ga.scmc.debugging.IColor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class OnPlayerCloneEvent {
	@SubscribeEvent
    public void onPlayerClone(PlayerEvent.Clone event)
    {
        EntityPlayer player = event.getEntityPlayer();
        IColor color = player.getCapability(ColorProvider.COLOR, null);
        IColor oldColor = event.getOriginal().getCapability(ColorProvider.COLOR, null);

        color.set(oldColor.getColor());
    }
}
