package com.hypeirochus.scmc.events;

import com.hypeirochus.scmc.Starcraft;
import com.hypeirochus.scmc.capabilities.ColorProvider;
import com.hypeirochus.scmc.capabilities.IColor;
import com.hypeirochus.scmc.config.StarcraftConfig;
import com.hypeirochus.scmc.items.ItemGun;

import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scala.reflect.internal.Trees.Star;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * This class handles all of the events that do not have to do with the client.
 * 
 * @author Ocelot5836
 */
@EventBusSubscriber
public class StarcraftEventHandler {

	public static TextureAtlasSprite gasCollectorIngot;
	public static TextureAtlasSprite gasCollectorBlock;
	public static TextureAtlasSprite gasCollectorFlesh;

	@SubscribeEvent
	public static void onEntitySpawn(EntityJoinWorldEvent event) {
		if (StarcraftConfig.BOOL_VANILLA_MOB_SPAWNING_DISABLED) {
			if (event.getEntity() instanceof EntityCaveSpider || event.getEntity() instanceof EntitySilverfish || event.getEntity() instanceof EntityWitch || event.getEntity() instanceof EntitySlime || event.getEntity() instanceof EntityEnderman || event.getEntity() instanceof EntityCreeper || event.getEntity() instanceof EntitySkeleton || event.getEntity() instanceof EntityZombie || event.getEntity() instanceof EntitySpider) {
				event.getEntity().setDropItemsWhenDead(false);
				event.getEntity().setSilent(true);
				event.getEntity().setInvisible(true);
				event.getEntity().setDead();
				event.setCanceled(true);
			}
		}
	}

	@SubscribeEvent
	public void onPlayerCloneEvent(net.minecraftforge.event.entity.player.PlayerEvent.Clone event) {
		EntityPlayer player = event.getEntityPlayer();
		IColor color = player.getCapability(ColorProvider.COLOR, null);
		IColor oldColor = event.getOriginal().getCapability(ColorProvider.COLOR, null);

		color.set(oldColor.getColor());
	}

	@SubscribeEvent
	public void onPlayerLoggedInEvent(PlayerLoggedInEvent event) {
		EntityPlayer player = event.player;
		String message = "Running SCMC version 2.1.691!";
		player.sendMessage(new TextComponentString(message).setStyle(new Style().setColor(TextFormatting.BLUE)));
	}
	
	@SubscribeEvent
	public void onBlockPunchEvent(BlockEvent.BreakEvent event) {
		EntityPlayer player = event.getPlayer();
		if(player.getHeldItemMainhand().getItem() instanceof ItemGun || player.getHeldItemOffhand().getItem() instanceof ItemGun) {
			event.setCanceled(true);
		}
	}
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onTextureStitchEvent(TextureStitchEvent.Pre event) {
		TextureMap map = event.getMap();
		gasCollectorIngot = map.registerSprite(new ResourceLocation(Starcraft.MOD_ID, "items/gas_collector/ingot"));
		gasCollectorBlock = map.registerSprite(new ResourceLocation(Starcraft.MOD_ID, "items/gas_collector/block"));
		gasCollectorFlesh = map.registerSprite(new ResourceLocation(Starcraft.MOD_ID, "items/gas_collector/flesh"));
	}
}