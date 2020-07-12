package com.arpaesis.scmc.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.TextureStitchEvent.Pre;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.rom.proxy.IProxy;
import net.rom.registry.ReadOnlyRegistry;

public class CommonProxy implements IProxy {

	@Override
	public void preInit(ReadOnlyRegistry registry, FMLPreInitializationEvent event) {
		registry.preInit(event);
	}

	@Override
	public void init(ReadOnlyRegistry registry, FMLInitializationEvent event) {
		registry.init(event);
	}

	@Override
	public void postInit(ReadOnlyRegistry registry, FMLPostInitializationEvent event) {
		registry.postInit(event);
	}

	@Override
	public EntityPlayer getClientPlayer() {
		return null;
	}
	
	public void registerRender() {}

	public void registerTexture(Pre event, String texture) {}

	public void registerItemRenderer(Item item, int meta, String id) {}

	public void registerVariants() {}

	public void registerModels() {}
	
	public void registerTextureAssets() {}
}
