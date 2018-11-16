package com.hypeirochus.scmc.events;

import com.hypeirochus.scmc.Starcraft;
import com.hypeirochus.scmc.capabilities.ColorProvider;
import com.hypeirochus.scmc.capabilities.IColor;
import com.hypeirochus.scmc.capabilities.LockedItemsProvider;
import com.hypeirochus.scmc.config.SCConfig;
import com.hypeirochus.scmc.entity.vehicles.EntitySpaceship;
import com.hypeirochus.scmc.items.ItemGun;

import net.minecraft.client.Minecraft;
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
import net.minecraft.world.GameType;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * This class handles all of the events that do not have to do with the client.
 * 
 * @author Ocelot5836
 */
@EventBusSubscriber
public class SCEventHandler
{

	public static TextureAtlasSprite gasCollectorIngot;
	public static TextureAtlasSprite gasCollectorBlock;
	public static TextureAtlasSprite gasCollectorFlesh;
	public static float FOV = 90.0F;

	@SubscribeEvent
	public static void onEntitySpawn(EntityJoinWorldEvent event)
	{
		if (SCConfig.BOOL_VANILLA_MOB_SPAWNING_DISABLED)
		{
			if (event.getEntity() instanceof EntityCaveSpider || event.getEntity() instanceof EntitySilverfish || event.getEntity() instanceof EntityWitch || event.getEntity() instanceof EntitySlime || event.getEntity() instanceof EntityEnderman || event.getEntity() instanceof EntityCreeper
					|| event.getEntity() instanceof EntitySkeleton || event.getEntity() instanceof EntityZombie || event.getEntity() instanceof EntitySpider)
			{
				event.getEntity().setDropItemsWhenDead(false);
				event.getEntity().setSilent(true);
				event.getEntity().setInvisible(true);
				event.getEntity().setDead();
				event.setCanceled(true);
			}
		}
	}

	@SubscribeEvent
	public void onPlayerCloneEvent(net.minecraftforge.event.entity.player.PlayerEvent.Clone event)
	{
		EntityPlayer player = event.getEntityPlayer();
		IColor color = player.getCapability(ColorProvider.COLOR, null);
		IColor oldColor = event.getOriginal().getCapability(ColorProvider.COLOR, null);

		color.set(oldColor.getColor());
	}

	@SubscribeEvent
	public void onPlayerLoggedInEvent(PlayerLoggedInEvent event)
	{
		EntityPlayer player = event.player;
		String message = "Running SCMC version " + Starcraft.VERSION + "!";
		player.sendMessage(new TextComponentString(message).setStyle(new Style().setColor(TextFormatting.BLUE)));

		if (player.getEntityWorld().getMinecraftServer() != null)
			if (player.getEntityWorld().getMinecraftServer().getGameType() == GameType.CREATIVE)
				player.getCapability(LockedItemsProvider.LOCKED_ITEMS, null).getLockedItems().clear();
	}

	@SubscribeEvent
	public void onBlockPunchEvent(BlockEvent.BreakEvent event)
	{
		EntityPlayer player = event.getPlayer();
		if (player.getHeldItemMainhand().getItem() instanceof ItemGun || player.getHeldItemOffhand().getItem() instanceof ItemGun)
		{
			event.setCanceled(true);
		}
	}

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onTextureStitchEvent(TextureStitchEvent.Pre event)
	{
		TextureMap map = event.getMap();
		gasCollectorIngot = map.registerSprite(new ResourceLocation(Starcraft.MOD_ID, "items/gas_collector/ingot"));
		gasCollectorBlock = map.registerSprite(new ResourceLocation(Starcraft.MOD_ID, "items/gas_collector/block"));
		gasCollectorFlesh = map.registerSprite(new ResourceLocation(Starcraft.MOD_ID, "items/gas_collector/flesh"));
	}

	@SubscribeEvent
	public void onLivingRender(RenderLivingEvent.Pre e)
	{
		if (e.getEntity().getRidingEntity() instanceof EntitySpaceship)
		{
			e.setCanceled(true);
		}
	}

	@SubscribeEvent
	public void cameraPosition(EntityViewRenderEvent.CameraSetup e)
	{
		if (e.getEntity().getRidingEntity() instanceof EntitySpaceship)
		{
			e.setPitch(30.0F);
		}
	}

	@SubscribeEvent
	public void cameraPosition(EntityViewRenderEvent.FOVModifier e)
	{

		if (e.getEntity().dimension == SCConfig.INT_DIMENSION_SPACE)
		{
			if (e.getEntity().getRidingEntity() instanceof EntitySpaceship)
			{
				if (((EntitySpaceship) e.getEntity().getRidingEntity()).isAccelerating)
				{
					if (this.FOV < 120.0F)
					{
						e.setFOV(this.FOV += 0.1F);
					} else
					{
						this.FOV = 120.0F;
						e.setFOV(FOV);
					}
				} else
				{
					if (this.FOV > 90.0F)
					{
						e.setFOV(this.FOV -= 0.1F);
					} else
					{
						this.FOV = 90.0F;
						e.setFOV(FOV);
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void onHUDRender(RenderGameOverlayEvent e)
	{
		if (Minecraft.getMinecraft().player.getRidingEntity() instanceof EntitySpaceship)
		{
			if (e.getType() == ElementType.HOTBAR || e.getType() == ElementType.EXPERIENCE || e.getType() == ElementType.HEALTH)
			{
				e.setCanceled(true);
			}
		}
	}
}