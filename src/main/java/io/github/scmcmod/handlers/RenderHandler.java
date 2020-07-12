package io.github.scmcmod.handlers;

import io.github.scmcmod.SCConstants;
import io.github.scmcmod.client.renderer.entity.RenderArtosilope;
import io.github.scmcmod.client.renderer.entity.RenderBrakk;
import io.github.scmcmod.client.renderer.entity.RenderBroodling;
import io.github.scmcmod.client.renderer.entity.RenderBrutalisk;
import io.github.scmcmod.client.renderer.entity.RenderCivilian;
import io.github.scmcmod.client.renderer.entity.RenderDarkProbe;
import io.github.scmcmod.client.renderer.entity.RenderDarkTemplar;
import io.github.scmcmod.client.renderer.entity.RenderHydralisk;
import io.github.scmcmod.client.renderer.entity.RenderHydraliskPrimal;
import io.github.scmcmod.client.renderer.entity.RenderHydraliskPrimalDehaka;
import io.github.scmcmod.client.renderer.entity.RenderInfestedCivilian;
import io.github.scmcmod.client.renderer.entity.RenderJimRaynor;
import io.github.scmcmod.client.renderer.entity.RenderKakaru;
import io.github.scmcmod.client.renderer.entity.RenderLarva;
import io.github.scmcmod.client.renderer.entity.RenderLarvaCocoon;
import io.github.scmcmod.client.renderer.entity.RenderMarine;
import io.github.scmcmod.client.renderer.entity.RenderMutalisk;
import io.github.scmcmod.client.renderer.entity.RenderMutaliskBroodlord;
import io.github.scmcmod.client.renderer.entity.RenderMutaliskPrimal;
import io.github.scmcmod.client.renderer.entity.RenderMutaliskPrimalDehaka;
import io.github.scmcmod.client.renderer.entity.RenderMutaliskViper;
import io.github.scmcmod.client.renderer.entity.RenderNafash;
import io.github.scmcmod.client.renderer.entity.RenderPredator;
import io.github.scmcmod.client.renderer.entity.RenderProbe;
import io.github.scmcmod.client.renderer.entity.RenderProtossReaver;
import io.github.scmcmod.client.renderer.entity.RenderPurifierProbe;
import io.github.scmcmod.client.renderer.entity.RenderQueen;
import io.github.scmcmod.client.renderer.entity.RenderScarab;
import io.github.scmcmod.client.renderer.entity.RenderTastelope;
import io.github.scmcmod.client.renderer.entity.RenderTyrannozor;
import io.github.scmcmod.client.renderer.entity.RenderTyrannozorDehaka;
import io.github.scmcmod.client.renderer.entity.RenderUrsadon;
import io.github.scmcmod.client.renderer.entity.RenderUrsadonMatriarch;
import io.github.scmcmod.client.renderer.entity.RenderVoidProbe;
import io.github.scmcmod.client.renderer.entity.RenderZealot;
import io.github.scmcmod.client.renderer.entity.RenderZeratul;
import io.github.scmcmod.client.renderer.entity.RenderZergling;
import io.github.scmcmod.client.renderer.entity.RenderZerglingBoost;
import io.github.scmcmod.client.renderer.entity.RenderZerglingPrimal1;
import io.github.scmcmod.client.renderer.entity.RenderZerglingPrimal2;
import io.github.scmcmod.client.renderer.entity.RenderZerglingPrimal3;
import io.github.scmcmod.client.renderer.entity.RenderZerglingPrimalDehaka;
import io.github.scmcmod.client.renderer.entity.RenderZerglingPrimalDehakaBoost;
import io.github.scmcmod.client.renderer.entity.RenderZerglingRaptor;
import io.github.scmcmod.client.renderer.entity.RenderZerglingSwarmling;
import io.github.scmcmod.client.renderer.entity.projectiles.RenderHydraliskSpike;
import io.github.scmcmod.client.renderer.entity.projectiles.RenderMutaliskGlaiveWurm;
import io.github.scmcmod.client.renderer.entity.vehicles.RenderScout;
import io.github.scmcmod.client.renderer.entity.vehicles.RenderWraith;
import io.github.scmcmod.client.renderer.tileentity.RendererBrambles;
import io.github.scmcmod.client.renderer.tileentity.RendererProtossWormhole;
import io.github.scmcmod.client.renderer.tileentity.RendererStarcraftSkull;
import io.github.scmcmod.client.renderer.tileentity.RendererZerusGlowPod;
import io.github.scmcmod.client.renderer.tileentity.RendererZerusLightcap;
import io.github.scmcmod.entity.EntityHydraliskSpike;
import io.github.scmcmod.entity.EntityMutaliskGlaiveWurm;
import io.github.scmcmod.entity.living.EntityArtosilope;
import io.github.scmcmod.entity.living.EntityBrakk;
import io.github.scmcmod.entity.living.EntityBroodling;
import io.github.scmcmod.entity.living.EntityBrutalisk;
import io.github.scmcmod.entity.living.EntityCivilian;
import io.github.scmcmod.entity.living.EntityDarkProbe;
import io.github.scmcmod.entity.living.EntityDarkTemplar;
import io.github.scmcmod.entity.living.EntityHydralisk;
import io.github.scmcmod.entity.living.EntityHydraliskPrimal;
import io.github.scmcmod.entity.living.EntityHydraliskPrimalDehaka;
import io.github.scmcmod.entity.living.EntityInfestedCivilian;
import io.github.scmcmod.entity.living.EntityJimRaynor;
import io.github.scmcmod.entity.living.EntityKakaru;
import io.github.scmcmod.entity.living.EntityLarva;
import io.github.scmcmod.entity.living.EntityLarvaCocoon;
import io.github.scmcmod.entity.living.EntityMarine;
import io.github.scmcmod.entity.living.EntityMutalisk;
import io.github.scmcmod.entity.living.EntityMutaliskBroodlord;
import io.github.scmcmod.entity.living.EntityMutaliskPrimal;
import io.github.scmcmod.entity.living.EntityMutaliskPrimalDehaka;
import io.github.scmcmod.entity.living.EntityMutaliskViper;
import io.github.scmcmod.entity.living.EntityNafash;
import io.github.scmcmod.entity.living.EntityPredator;
import io.github.scmcmod.entity.living.EntityProbe;
import io.github.scmcmod.entity.living.EntityProtossReaver;
import io.github.scmcmod.entity.living.EntityPurifierProbe;
import io.github.scmcmod.entity.living.EntityQueen;
import io.github.scmcmod.entity.living.EntityScarab;
import io.github.scmcmod.entity.living.EntityTastelope;
import io.github.scmcmod.entity.living.EntityTyrannozor;
import io.github.scmcmod.entity.living.EntityTyrannozorDehaka;
import io.github.scmcmod.entity.living.EntityUrsadon;
import io.github.scmcmod.entity.living.EntityUrsadonMatriarch;
import io.github.scmcmod.entity.living.EntityVoidProbe;
import io.github.scmcmod.entity.living.EntityZealot;
import io.github.scmcmod.entity.living.EntityZeratul;
import io.github.scmcmod.entity.living.EntityZergling;
import io.github.scmcmod.entity.living.EntityZerglingBoost;
import io.github.scmcmod.entity.living.EntityZerglingPrimal1;
import io.github.scmcmod.entity.living.EntityZerglingPrimal2;
import io.github.scmcmod.entity.living.EntityZerglingPrimal3;
import io.github.scmcmod.entity.living.EntityZerglingPrimalDehaka;
import io.github.scmcmod.entity.living.EntityZerglingPrimalDehakaBoost;
import io.github.scmcmod.entity.living.EntityZerglingRaptor;
import io.github.scmcmod.entity.living.EntityZerglingSwarmling;
import io.github.scmcmod.entity.vehicles.EntityScout;
import io.github.scmcmod.entity.vehicles.EntityWraith;
import io.github.scmcmod.init.StarCraftBlocks;
import io.github.scmcmod.tileentity.TileEntityBrambles;
import io.github.scmcmod.tileentity.TileEntityProtossWormhole;
import io.github.scmcmod.tileentity.TileEntityStarcraftSkull;
import io.github.scmcmod.tileentity.TileEntityZerusGlowPod;
import io.github.scmcmod.tileentity.TileEntityZerusLightcap;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RenderHandler
{

	public static void registerItemMetaRenders()
	{
		for (Item item : Item.REGISTRY)
		{
			if (item != null && item instanceof IMetaRenderHandler)
			{
				IMetaRenderHandler handler = (IMetaRenderHandler) item;
				if (!item.getHasSubtypes())
					throw new IllegalArgumentException(String.format("Item %s attempted to register as a meta item but does not have subtypes!", item.getRegistryName()));
				for (int j = 0; j < handler.getItemCount(); j++)
				{
					if (handler.getName(j) != null)
					{
						registerItemRender(item, j, handler.getName(j));
					} else
					{
						continue;
					}
				}
			}
		}
	}

	public static void registerBlockMetaRenders()
	{
		for (Block block : Block.REGISTRY)
		{
			if (block != null && block instanceof IMetaRenderHandler)
			{
				IMetaRenderHandler handler = (IMetaRenderHandler) block;
				if (!Item.getItemFromBlock(block).getHasSubtypes())
					throw new IllegalArgumentException(String.format("Block %s attempted to register as a meta item but does not have subtypes!", block.getRegistryName()));
				for (int j = 0; j < handler.getItemCount(); j++)
				{
					if (handler.getName(j) != null)
					{
						registerBlockRender(block, j, handler.getName(j));
					} else
					{
						continue;
					}
				}
			}
		}
	}

	public static void init(FMLPreInitializationEvent event)
	{
		if (FMLCommonHandler.instance().getSide() == Side.CLIENT)
		{
			registerTileEntityRenders();
			registerEntityRenderers();
		}
	}

	private static void registerTileEntityRenders()
	{
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityStarcraftSkull.class, new RendererStarcraftSkull());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityZerusGlowPod.class, new RendererZerusGlowPod());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBrambles.class, new RendererBrambles());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityZerusLightcap.class, new RendererZerusLightcap());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityProtossWormhole.class, new RendererProtossWormhole());
	}

	private static void registerEntityRenderers()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityZealot.class, RenderZealot.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityProbe.class, RenderProbe.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityProtossReaver.class, RenderProtossReaver.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityScarab.class, RenderScarab.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityDarkTemplar.class, RenderDarkTemplar.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityVoidProbe.class, RenderVoidProbe.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityDarkProbe.class, RenderDarkProbe.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityPurifierProbe.class, RenderPurifierProbe.FACTORY);

		RenderingRegistry.registerEntityRenderingHandler(EntityZeratul.class, RenderZeratul.FACTORY);

		RenderingRegistry.registerEntityRenderingHandler(EntityBrutalisk.class, RenderBrutalisk.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityHydralisk.class, RenderHydralisk.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityZergling.class, RenderZergling.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityZerglingRaptor.class, RenderZerglingRaptor.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityZerglingSwarmling.class, RenderZerglingSwarmling.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityZerglingBoost.class, RenderZerglingBoost.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityLarva.class, RenderLarva.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityLarvaCocoon.class, RenderLarvaCocoon.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityBroodling.class, RenderBroodling.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityInfestedCivilian.class, RenderInfestedCivilian.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityQueen.class, RenderQueen.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityNafash.class, RenderNafash.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityMutalisk.class, RenderMutalisk.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityMutaliskBroodlord.class, RenderMutaliskBroodlord.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityMutaliskPrimal.class, RenderMutaliskPrimal.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityMutaliskViper.class, RenderMutaliskViper.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityZerglingPrimal1.class, RenderZerglingPrimal1.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityZerglingPrimal2.class, RenderZerglingPrimal2.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityZerglingPrimal3.class, RenderZerglingPrimal3.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityZerglingPrimalDehaka.class, RenderZerglingPrimalDehaka.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityZerglingPrimalDehakaBoost.class, RenderZerglingPrimalDehakaBoost.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityHydraliskPrimal.class, RenderHydraliskPrimal.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityBrakk.class, RenderBrakk.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityTyrannozor.class, RenderTyrannozor.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityTyrannozorDehaka.class, RenderTyrannozorDehaka.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityMutaliskPrimalDehaka.class, RenderMutaliskPrimalDehaka.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityHydraliskPrimalDehaka.class, RenderHydraliskPrimalDehaka.FACTORY);

		RenderingRegistry.registerEntityRenderingHandler(EntityCivilian.class, RenderCivilian.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityPredator.class, RenderPredator.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityMarine.class, RenderMarine.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityJimRaynor.class, RenderJimRaynor.FACTORY);

		RenderingRegistry.registerEntityRenderingHandler(EntityKakaru.class, RenderKakaru.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityTastelope.class, RenderTastelope.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityArtosilope.class, RenderArtosilope.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityUrsadon.class, RenderUrsadon.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityUrsadonMatriarch.class, RenderUrsadonMatriarch.FACTORY);

		RenderingRegistry.registerEntityRenderingHandler(EntityHydraliskSpike.class, RenderHydraliskSpike.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityMutaliskGlaiveWurm.class, RenderMutaliskGlaiveWurm.FACTORY);

		RenderingRegistry.registerEntityRenderingHandler(EntityScout.class, RenderScout.FACTORY);

		RenderingRegistry.registerEntityRenderingHandler(EntityWraith.class, RenderWraith.FACTORY);
	}

	@SideOnly(Side.CLIENT)
	public static void createStateMappers()
	{
		ModelLoader.setCustomStateMapper(StarCraftBlocks.STARCRAFT_SKULL, getNormalVariant(StarCraftBlocks.STARCRAFT_SKULL));
	}

	public static void registerItemRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

	public static void registerItemRender(Item item, int meta, String fileName)
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(SCConstants.MODID, fileName), "inventory"));
	}

	public static void registerBlockRender(Block block)
	{
		registerItemRender(Item.getItemFromBlock(block));
	}

	public static void registerBlockRender(Block block, int meta, String fileName)
	{
		registerItemRender(Item.getItemFromBlock(block), meta, fileName);
	}

	public static void registerFluid(final Block block)
	{
		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(block), new ItemMeshDefinition()
		{

			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack)
			{
				return new ModelResourceLocation(block.getRegistryName(), "fluid");
			}
		});
		ModelLoader.setCustomStateMapper(block, new StateMapperBase()
		{

			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation(block.getRegistryName(), "fluid");
			}
		});
	}

	public static void registerLayered(final Block block)
	{
		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(block), new ItemMeshDefinition()
		{

			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack)
			{
				return new ModelResourceLocation(block.getRegistryName(), "normal");
			}
		});
		ModelLoader.setCustomStateMapper(block, new StateMapperBase()
		{

			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				char num = state.toString().charAt(state.toString().length() - 2);
				return new ModelResourceLocation(block.getRegistryName(), "layers=" + num);
			}
		});
	}

	public static StateMapperBase getNormalVariant(Block block)
	{
		return new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation(block.getRegistryName(), "normal");
			}
		};
	}
}