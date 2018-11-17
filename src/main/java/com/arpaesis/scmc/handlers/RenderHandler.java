package com.arpaesis.scmc.handlers;

import static com.arpaesis.scmc.handlers.BlockHandler.STARCRAFT_SKULL;

import com.arpaesis.scmc.Starcraft;
import com.arpaesis.scmc.client.renderer.entity.RenderArtosilope;
import com.arpaesis.scmc.client.renderer.entity.RenderBrakk;
import com.arpaesis.scmc.client.renderer.entity.RenderBroodling;
import com.arpaesis.scmc.client.renderer.entity.RenderBrutalisk;
import com.arpaesis.scmc.client.renderer.entity.RenderCivilian;
import com.arpaesis.scmc.client.renderer.entity.RenderDarkProbe;
import com.arpaesis.scmc.client.renderer.entity.RenderDarkTemplar;
import com.arpaesis.scmc.client.renderer.entity.RenderHydralisk;
import com.arpaesis.scmc.client.renderer.entity.RenderHydraliskPrimal;
import com.arpaesis.scmc.client.renderer.entity.RenderHydraliskPrimalDehaka;
import com.arpaesis.scmc.client.renderer.entity.RenderInfestedCivilian;
import com.arpaesis.scmc.client.renderer.entity.RenderJimRaynor;
import com.arpaesis.scmc.client.renderer.entity.RenderKakaru;
import com.arpaesis.scmc.client.renderer.entity.RenderLarva;
import com.arpaesis.scmc.client.renderer.entity.RenderLarvaCocoon;
import com.arpaesis.scmc.client.renderer.entity.RenderMarine;
import com.arpaesis.scmc.client.renderer.entity.RenderMutalisk;
import com.arpaesis.scmc.client.renderer.entity.RenderMutaliskBroodlord;
import com.arpaesis.scmc.client.renderer.entity.RenderMutaliskPrimal;
import com.arpaesis.scmc.client.renderer.entity.RenderMutaliskPrimalDehaka;
import com.arpaesis.scmc.client.renderer.entity.RenderMutaliskViper;
import com.arpaesis.scmc.client.renderer.entity.RenderNafash;
import com.arpaesis.scmc.client.renderer.entity.RenderPredator;
import com.arpaesis.scmc.client.renderer.entity.RenderProbe;
import com.arpaesis.scmc.client.renderer.entity.RenderProtossReaver;
import com.arpaesis.scmc.client.renderer.entity.RenderPurifierProbe;
import com.arpaesis.scmc.client.renderer.entity.RenderQueen;
import com.arpaesis.scmc.client.renderer.entity.RenderScarab;
import com.arpaesis.scmc.client.renderer.entity.RenderTastelope;
import com.arpaesis.scmc.client.renderer.entity.RenderTyrannozor;
import com.arpaesis.scmc.client.renderer.entity.RenderTyrannozorDehaka;
import com.arpaesis.scmc.client.renderer.entity.RenderUrsadon;
import com.arpaesis.scmc.client.renderer.entity.RenderUrsadonMatriarch;
import com.arpaesis.scmc.client.renderer.entity.RenderVoidProbe;
import com.arpaesis.scmc.client.renderer.entity.RenderZealot;
import com.arpaesis.scmc.client.renderer.entity.RenderZeratul;
import com.arpaesis.scmc.client.renderer.entity.RenderZergling;
import com.arpaesis.scmc.client.renderer.entity.RenderZerglingBoost;
import com.arpaesis.scmc.client.renderer.entity.RenderZerglingPrimal1;
import com.arpaesis.scmc.client.renderer.entity.RenderZerglingPrimal2;
import com.arpaesis.scmc.client.renderer.entity.RenderZerglingPrimal3;
import com.arpaesis.scmc.client.renderer.entity.RenderZerglingPrimalDehaka;
import com.arpaesis.scmc.client.renderer.entity.RenderZerglingPrimalDehakaBoost;
import com.arpaesis.scmc.client.renderer.entity.RenderZerglingRaptor;
import com.arpaesis.scmc.client.renderer.entity.RenderZerglingSwarmling;
import com.arpaesis.scmc.client.renderer.entity.projectiles.RenderHydraliskSpike;
import com.arpaesis.scmc.client.renderer.entity.projectiles.RenderMutaliskGlaiveWurm;
import com.arpaesis.scmc.client.renderer.entity.vehicles.RenderScout;
import com.arpaesis.scmc.client.renderer.entity.vehicles.RenderWraith;
import com.arpaesis.scmc.client.renderer.tileentity.RendererBrambles;
import com.arpaesis.scmc.client.renderer.tileentity.RendererProtossWormhole;
import com.arpaesis.scmc.client.renderer.tileentity.RendererStarcraftSkull;
import com.arpaesis.scmc.client.renderer.tileentity.RendererZerusGlowPod;
import com.arpaesis.scmc.client.renderer.tileentity.RendererZerusLightcap;
import com.arpaesis.scmc.entity.EntityHydraliskSpike;
import com.arpaesis.scmc.entity.EntityMutaliskGlaiveWurm;
import com.arpaesis.scmc.entity.living.EntityArtosilope;
import com.arpaesis.scmc.entity.living.EntityBrakk;
import com.arpaesis.scmc.entity.living.EntityBroodling;
import com.arpaesis.scmc.entity.living.EntityBrutalisk;
import com.arpaesis.scmc.entity.living.EntityCivilian;
import com.arpaesis.scmc.entity.living.EntityDarkProbe;
import com.arpaesis.scmc.entity.living.EntityDarkTemplar;
import com.arpaesis.scmc.entity.living.EntityHydralisk;
import com.arpaesis.scmc.entity.living.EntityHydraliskPrimal;
import com.arpaesis.scmc.entity.living.EntityHydraliskPrimalDehaka;
import com.arpaesis.scmc.entity.living.EntityInfestedCivilian;
import com.arpaesis.scmc.entity.living.EntityJimRaynor;
import com.arpaesis.scmc.entity.living.EntityKakaru;
import com.arpaesis.scmc.entity.living.EntityLarva;
import com.arpaesis.scmc.entity.living.EntityLarvaCocoon;
import com.arpaesis.scmc.entity.living.EntityMarine;
import com.arpaesis.scmc.entity.living.EntityMutalisk;
import com.arpaesis.scmc.entity.living.EntityMutaliskBroodlord;
import com.arpaesis.scmc.entity.living.EntityMutaliskPrimal;
import com.arpaesis.scmc.entity.living.EntityMutaliskPrimalDehaka;
import com.arpaesis.scmc.entity.living.EntityMutaliskViper;
import com.arpaesis.scmc.entity.living.EntityNafash;
import com.arpaesis.scmc.entity.living.EntityPredator;
import com.arpaesis.scmc.entity.living.EntityProbe;
import com.arpaesis.scmc.entity.living.EntityProtossReaver;
import com.arpaesis.scmc.entity.living.EntityPurifierProbe;
import com.arpaesis.scmc.entity.living.EntityQueen;
import com.arpaesis.scmc.entity.living.EntityScarab;
import com.arpaesis.scmc.entity.living.EntityTastelope;
import com.arpaesis.scmc.entity.living.EntityTyrannozor;
import com.arpaesis.scmc.entity.living.EntityTyrannozorDehaka;
import com.arpaesis.scmc.entity.living.EntityUrsadon;
import com.arpaesis.scmc.entity.living.EntityUrsadonMatriarch;
import com.arpaesis.scmc.entity.living.EntityVoidProbe;
import com.arpaesis.scmc.entity.living.EntityZealot;
import com.arpaesis.scmc.entity.living.EntityZeratul;
import com.arpaesis.scmc.entity.living.EntityZergling;
import com.arpaesis.scmc.entity.living.EntityZerglingBoost;
import com.arpaesis.scmc.entity.living.EntityZerglingPrimal1;
import com.arpaesis.scmc.entity.living.EntityZerglingPrimal2;
import com.arpaesis.scmc.entity.living.EntityZerglingPrimal3;
import com.arpaesis.scmc.entity.living.EntityZerglingPrimalDehaka;
import com.arpaesis.scmc.entity.living.EntityZerglingPrimalDehakaBoost;
import com.arpaesis.scmc.entity.living.EntityZerglingRaptor;
import com.arpaesis.scmc.entity.living.EntityZerglingSwarmling;
import com.arpaesis.scmc.entity.vehicles.EntityScout;
import com.arpaesis.scmc.entity.vehicles.EntityWraith;
import com.arpaesis.scmc.tileentity.TileEntityBrambles;
import com.arpaesis.scmc.tileentity.TileEntityProtossWormhole;
import com.arpaesis.scmc.tileentity.TileEntityStarcraftSkull;
import com.arpaesis.scmc.tileentity.TileEntityZerusGlowPod;
import com.arpaesis.scmc.tileentity.TileEntityZerusLightcap;

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

	public static void registerFluidRenders()
	{
		registerFluid(BlockHandler.ACID);
		registerFluid(BlockHandler.BLOOD);
		registerFluid(BlockHandler.VESPENE);
		registerFluid(BlockHandler.TERRAZINE);
		registerFluid(BlockHandler.TAR);
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
		ModelLoader.setCustomStateMapper(STARCRAFT_SKULL, getNormalVariant(STARCRAFT_SKULL));
	}

	public static void registerItemRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

	public static void registerItemRender(Item item, int meta, String fileName)
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Starcraft.MOD_ID, fileName), "inventory"));
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