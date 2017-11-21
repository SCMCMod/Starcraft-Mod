package ga.scmc.network;

import ga.scmc.lib.Library;
import ga.scmc.network.message.MessageMorphLarva;
import ga.scmc.network.message.MessageSetPlayerShieldClient;
import ga.scmc.network.message.MessageSetPlayerShieldServer;
import ga.scmc.network.message.MessageSpawnItem;
import ga.scmc.network.message.MessageSyncLarvaGui;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class NetworkHandler {

	public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Library.MODID);

	private static int nextId = 0;

	public static void preInit() {
		registerServer();
		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
			registerClient();
		}
	}

	@SideOnly(Side.SERVER)
	private static void registerServer() {
		registerMessage(new MessageMorphLarva(), MessageMorphLarva.class, Side.SERVER);
		registerMessage(new MessageSpawnItem(), MessageSpawnItem.class, Side.SERVER);
		registerMessage(new MessageSetPlayerShieldServer(), MessageSetPlayerShieldServer.class, Side.SERVER);
	}

	@SideOnly(Side.CLIENT)
	private static void registerClient() {
		registerMessage(new MessageSyncLarvaGui(), MessageSyncLarvaGui.class, Side.CLIENT);
		registerMessage(new MessageSetPlayerShieldClient(), MessageSetPlayerShieldClient.class, Side.CLIENT);
	}

	private static void registerMessage(IMessageHandler messageHandler, Class requestMessageType, Side side) {
		INSTANCE.registerMessage(messageHandler, requestMessageType, nextId++, side);
	}

	private static void registerMessage(Class messageHandler, Class requestMessageType, Side side) {
		INSTANCE.registerMessage(messageHandler, requestMessageType, nextId++, side);
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