package ga.scmc.network;

import ga.scmc.lib.Library;
import ga.scmc.network.message.MessageMorphLarva;
import ga.scmc.network.message.MessageSetPlayerShieldClient;
import ga.scmc.network.message.MessageSetPlayerShieldServer;
import ga.scmc.network.message.MessageSpawnItem;
import ga.scmc.network.message.MessageSyncLarvaGui;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class NetworkHandler {

	public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Library.MODID);

	public static void init() {
		INSTANCE.registerMessage(new MessageSpawnItem(), MessageSpawnItem.class, 0, Side.SERVER);
		INSTANCE.registerMessage(new MessageMorphLarva(), MessageMorphLarva.class, 1, Side.SERVER);
		INSTANCE.registerMessage(new MessageSetPlayerShieldServer(), MessageSetPlayerShieldServer.class, 2, Side.SERVER);
		INSTANCE.registerMessage(new MessageSetPlayerShieldClient(), MessageSetPlayerShieldClient.class, 3, Side.CLIENT);
		INSTANCE.registerMessage(new MessageSyncLarvaGui(), MessageSyncLarvaGui.class, 4, Side.CLIENT);
	}

	public static void sendToServer(IMessage message) {
		INSTANCE.sendToServer(message);
	}

	public static void sendToClient(IMessage message) {
		INSTANCE.sendToAll(message);
	}

	public static void getPacketFrom(IMessage message) {
		INSTANCE.getPacketFrom(message);
	}
}