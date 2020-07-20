package io.github.scmcmod.proxy;

import io.github.scmcmod.utils.Assets;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.rom.registry.ReadOnlyRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(ReadOnlyRegistry registry, FMLPreInitializationEvent event) {
		super.preInit(registry, event);
		//// Below ////
		registerEventHandler(this);
		
		//// Above ////
		registry.clientPreInit(event);
	}
	
	@Override
	public void init(ReadOnlyRegistry registry, FMLInitializationEvent event) {
		super.init(registry, event);
		//// Below ////
		
		
		//// Above ////
		registry.clientInit(event);
	}

	@Override
	public void postInit(ReadOnlyRegistry registry, FMLPostInitializationEvent event) {
		super.postInit(registry, event);
		//// Below ////
		registerTextureAssets();
		
		//// Above ////
		registry.clientPostInit(event);
	}
	
	@Override
	public void registerTextureAssets() {
		Assets.addTexture("KALDIR_BRAMBLES", "textures/models/block/kaldir_brambles.png");
		Assets.addTexture("SHAKURAS_PALM", "textures/models/block/shakuras_brambles.png");
		Assets.addTexture("ZERUS_PALM", "textures/models/block/zerus_brambles.png");
		Assets.addTexture("tab_protoss", "textures/gui/container/creative_inventory/tab_protoss.png");
		Assets.addTexture("tab_terran", "textures/gui/container/creative_inventory/tab_terran.png");
		Assets.addTexture("tab_zerg", "textures/gui/container/creative_inventory/tab_zerg.png");
		
	}
	
	public World getWorld() {
		return Minecraft.getMinecraft().world;
	}
	
	@Override
	public EntityPlayer getClientPlayer() {
		return Minecraft.getMinecraft().player;
	}
	
	public static void registerEventHandler(Object handler) {
		MinecraftForge.EVENT_BUS.register(handler);
	}
	
	public void registerVarients() {
		
	}

}
