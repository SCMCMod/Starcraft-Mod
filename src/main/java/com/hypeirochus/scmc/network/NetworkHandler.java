package com.hypeirochus.scmc.network;

import com.hypeirochus.scmc.lib.Library;
import com.hypeirochus.scmc.network.message.MessageGetFurnaceData;
import com.hypeirochus.scmc.network.message.MessageKillEntity;
import com.hypeirochus.scmc.network.message.MessageMorphLarva;
import com.hypeirochus.scmc.network.message.MessageReturnFurnaceData;
import com.hypeirochus.scmc.network.message.MessageSetPlayerShieldClient;
import com.hypeirochus.scmc.network.message.MessageSetPlayerShieldServer;
import com.hypeirochus.scmc.network.message.MessageSpawnItem;
import com.hypeirochus.scmc.network.message.MessageSyncLarvaCocoonGui;
import com.hypeirochus.scmc.network.message.MessageSyncLarvaGui;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class NetworkHandler {

	public static final SimpleNetworkWrapper	INSTANCE	= NetworkRegistry.INSTANCE.newSimpleChannel(Library.MODID);

	private static int							nextId		= 0;

	public static void pre(FMLPreInitializationEvent event) {
		registerServer();
		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
			registerClient();
		}
	}

	private static void registerServer() {
		registerMessage(new MessageMorphLarva(), MessageMorphLarva.class, Side.SERVER);
		registerMessage(new MessageSpawnItem(), MessageSpawnItem.class, Side.SERVER);
		registerMessage(new MessageSetPlayerShieldServer(), MessageSetPlayerShieldServer.class, Side.SERVER);
		registerMessage(new MessageGetFurnaceData.Handler(), MessageGetFurnaceData.class, Side.SERVER);
		registerMessage(new MessageKillEntity(), MessageKillEntity.class, Side.SERVER);
	}

	private static void registerClient() {
		registerMessage(new MessageSyncLarvaGui(), MessageSyncLarvaGui.class, Side.CLIENT);
		registerMessage(new MessageSyncLarvaCocoonGui(), MessageSyncLarvaCocoonGui.class, Side.CLIENT);
		registerMessage(new MessageSetPlayerShieldClient(), MessageSetPlayerShieldClient.class, Side.CLIENT);
		registerMessage(new MessageReturnFurnaceData.Handler(), MessageReturnFurnaceData.class, Side.CLIENT);
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

	public static void sendToAllClients(IMessage message) {
		INSTANCE.sendToAll(message);
	}

	public static void sendToClient(IMessage message, EntityPlayerMP player) {
		INSTANCE.sendTo(message, player);
	}

	public static void getPacketFrom(IMessage message) {
		INSTANCE.getPacketFrom(message);
	}
}