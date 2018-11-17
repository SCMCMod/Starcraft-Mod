package com.arpaesis.scmc.handlers;

import static com.arpaesis.scmc.handlers.BlockHandler.STARCRAFT_SKULL;

import com.arpaesis.scmc.Starcraft;
import com.arpaesis.scmc.client.model.entity.ModelBrakk;
import com.arpaesis.scmc.client.model.entity.ModelBroodling;
import com.arpaesis.scmc.client.model.entity.ModelBroodmother;
import com.arpaesis.scmc.client.model.entity.ModelBrutalisk;
import com.arpaesis.scmc.client.model.entity.ModelCivilian;
import com.arpaesis.scmc.client.model.entity.ModelDarkProbe;
import com.arpaesis.scmc.client.model.entity.ModelDarkTemplar;
import com.arpaesis.scmc.client.model.entity.ModelHydralisk;
import com.arpaesis.scmc.client.model.entity.ModelHydraliskPrimalDehaka;
import com.arpaesis.scmc.client.model.entity.ModelInfestedCivilian;
import com.arpaesis.scmc.client.model.entity.ModelKakaru;
import com.arpaesis.scmc.client.model.entity.ModelLarva;
import com.arpaesis.scmc.client.model.entity.ModelLarvaCocoon;
import com.arpaesis.scmc.client.model.entity.ModelLope;
import com.arpaesis.scmc.client.model.entity.ModelMarine;
import com.arpaesis.scmc.client.model.entity.ModelMutalisk;
import com.arpaesis.scmc.client.model.entity.ModelMutaliskBroodlord;
import com.arpaesis.scmc.client.model.entity.ModelMutaliskGlaiveWurm;
import com.arpaesis.scmc.client.model.entity.ModelMutaliskPrimal;
import com.arpaesis.scmc.client.model.entity.ModelMutaliskPrimalDehaka;
import com.arpaesis.scmc.client.model.entity.ModelMutaliskViper;
import com.arpaesis.scmc.client.model.entity.ModelPredator;
import com.arpaesis.scmc.client.model.entity.ModelProbe;
import com.arpaesis.scmc.client.model.entity.ModelProtossReaver;
import com.arpaesis.scmc.client.model.entity.ModelPurifierProbe;
import com.arpaesis.scmc.client.model.entity.ModelQueen;
import com.arpaesis.scmc.client.model.entity.ModelScarab;
import com.arpaesis.scmc.client.model.entity.ModelTyrannozor;
import com.arpaesis.scmc.client.model.entity.ModelTyrannozorDehaka;
import com.arpaesis.scmc.client.model.entity.ModelUrsadon;
import com.arpaesis.scmc.client.model.entity.ModelVoidProbe;
import com.arpaesis.scmc.client.model.entity.ModelZeratul;
import com.arpaesis.scmc.client.model.entity.ModelZergling;
import com.arpaesis.scmc.client.model.entity.ModelZerglingBoost;
import com.arpaesis.scmc.client.model.entity.ModelZerglingPrimal1;
import com.arpaesis.scmc.client.model.entity.ModelZerglingPrimal2;
import com.arpaesis.scmc.client.model.entity.ModelZerglingPrimal3;
import com.arpaesis.scmc.client.model.entity.ModelZerglingPrimalDehaka;
import com.arpaesis.scmc.client.model.entity.ModelZerglingPrimalDehakaBoost;
import com.arpaesis.scmc.client.model.entity.ModelZerglingRaptor;
import com.arpaesis.scmc.client.model.entity.ModelZerglingSwarmling;
import com.arpaesis.scmc.client.model.entity.projectile.ModelHydraliskSpike;
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
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
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
		
		RenderingRegistry.registerEntityRenderingHandler(EntityProbe.class, new RenderProbe(Minecraft.getMinecraft().getRenderManager(), new ModelProbe(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityProtossReaver.class, new RenderProtossReaver(Minecraft.getMinecraft().getRenderManager(), new ModelProtossReaver(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityScarab.class, new RenderScarab(Minecraft.getMinecraft().getRenderManager(), new ModelScarab(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityDarkTemplar.class, new RenderDarkTemplar(Minecraft.getMinecraft().getRenderManager(), new ModelDarkTemplar(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityVoidProbe.class, new RenderVoidProbe(Minecraft.getMinecraft().getRenderManager(), new ModelVoidProbe(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityScarab.class, new RenderScarab(Minecraft.getMinecraft().getRenderManager(), new ModelScarab(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityDarkProbe.class, new RenderDarkProbe(Minecraft.getMinecraft().getRenderManager(), new ModelDarkProbe(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityPurifierProbe.class, new RenderPurifierProbe(Minecraft.getMinecraft().getRenderManager(), new ModelPurifierProbe(), 0.4f));

		RenderingRegistry.registerEntityRenderingHandler(EntityZeratul.class, new RenderZeratul(Minecraft.getMinecraft().getRenderManager(), new ModelZeratul(), 0.4f));

		RenderingRegistry.registerEntityRenderingHandler(EntityBrutalisk.class, new RenderBrutalisk(Minecraft.getMinecraft().getRenderManager(), new ModelBrutalisk(), 3.0f));
		RenderingRegistry.registerEntityRenderingHandler(EntityHydralisk.class, new RenderHydralisk(Minecraft.getMinecraft().getRenderManager(), new ModelHydralisk(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityZergling.class, new RenderZergling(Minecraft.getMinecraft().getRenderManager(), new ModelZergling(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityZerglingRaptor.class, new RenderZerglingRaptor(Minecraft.getMinecraft().getRenderManager(), new ModelZerglingRaptor(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityZerglingSwarmling.class, new RenderZerglingSwarmling(Minecraft.getMinecraft().getRenderManager(), new ModelZerglingSwarmling(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityZerglingBoost.class, new RenderZerglingBoost(Minecraft.getMinecraft().getRenderManager(), new ModelZerglingBoost(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityLarva.class, new RenderLarva(Minecraft.getMinecraft().getRenderManager(), new ModelLarva(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityLarvaCocoon.class, new RenderLarvaCocoon(Minecraft.getMinecraft().getRenderManager(), new ModelLarvaCocoon(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityBroodling.class, new RenderBroodling(Minecraft.getMinecraft().getRenderManager(), new ModelBroodling(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityInfestedCivilian.class, new RenderInfestedCivilian(Minecraft.getMinecraft().getRenderManager(), new ModelInfestedCivilian(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityQueen.class, new RenderQueen(Minecraft.getMinecraft().getRenderManager(), new ModelQueen(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityNafash.class, new RenderNafash(Minecraft.getMinecraft().getRenderManager(), new ModelBroodmother(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityMutalisk.class, new RenderMutalisk(Minecraft.getMinecraft().getRenderManager(), new ModelMutalisk(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityMutaliskBroodlord.class, new RenderMutaliskBroodlord(Minecraft.getMinecraft().getRenderManager(), new ModelMutaliskBroodlord(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityMutaliskPrimal.class, new RenderMutaliskPrimal(Minecraft.getMinecraft().getRenderManager(), new ModelMutaliskPrimal(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityMutaliskViper.class, new RenderMutaliskViper(Minecraft.getMinecraft().getRenderManager(), new ModelMutaliskViper(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityZerglingPrimal1.class, new RenderZerglingPrimal1(Minecraft.getMinecraft().getRenderManager(), new ModelZerglingPrimal1(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityZerglingPrimal2.class, new RenderZerglingPrimal2(Minecraft.getMinecraft().getRenderManager(), new ModelZerglingPrimal2(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityZerglingPrimal3.class, new RenderZerglingPrimal3(Minecraft.getMinecraft().getRenderManager(), new ModelZerglingPrimal3(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityZerglingPrimalDehaka.class, new RenderZerglingPrimalDehaka(Minecraft.getMinecraft().getRenderManager(), new ModelZerglingPrimalDehaka(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityZerglingPrimalDehakaBoost.class, new RenderZerglingPrimalDehakaBoost(Minecraft.getMinecraft().getRenderManager(), new ModelZerglingPrimalDehakaBoost(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityHydraliskPrimal.class, new RenderHydraliskPrimal(Minecraft.getMinecraft().getRenderManager(), new ModelHydralisk(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityBrakk.class, new RenderBrakk(Minecraft.getMinecraft().getRenderManager(), new ModelBrakk(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityTyrannozor.class, new RenderTyrannozor(Minecraft.getMinecraft().getRenderManager(), new ModelTyrannozor(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityTyrannozorDehaka.class, new RenderTyrannozorDehaka(Minecraft.getMinecraft().getRenderManager(), new ModelTyrannozorDehaka(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityMutaliskPrimalDehaka.class, new RenderMutaliskPrimalDehaka(Minecraft.getMinecraft().getRenderManager(), new ModelMutaliskPrimalDehaka(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityHydraliskPrimalDehaka.class, new RenderHydraliskPrimalDehaka(Minecraft.getMinecraft().getRenderManager(), new ModelHydraliskPrimalDehaka(), 0.4f));

		RenderingRegistry.registerEntityRenderingHandler(EntityCivilian.class, new RenderCivilian(Minecraft.getMinecraft().getRenderManager(), new ModelCivilian(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityPredator.class, new RenderPredator(Minecraft.getMinecraft().getRenderManager(), new ModelPredator(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityMarine.class, new RenderMarine(Minecraft.getMinecraft().getRenderManager(), new ModelMarine(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityJimRaynor.class, new RenderJimRaynor(Minecraft.getMinecraft().getRenderManager(), new ModelMarine(), 0.4f));

		RenderingRegistry.registerEntityRenderingHandler(EntityKakaru.class, new RenderKakaru(Minecraft.getMinecraft().getRenderManager(), new ModelKakaru(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityTastelope.class, new RenderTastelope(Minecraft.getMinecraft().getRenderManager(), new ModelLope(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityArtosilope.class, new RenderArtosilope(Minecraft.getMinecraft().getRenderManager(), new ModelLope(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityUrsadon.class, new RenderUrsadon(Minecraft.getMinecraft().getRenderManager(), new ModelUrsadon(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityUrsadonMatriarch.class, new RenderUrsadonMatriarch(Minecraft.getMinecraft().getRenderManager(), new ModelUrsadon(), 0.4f));

		RenderingRegistry.registerEntityRenderingHandler(EntityHydraliskSpike.class, new RenderHydraliskSpike(Minecraft.getMinecraft().getRenderManager(), new ModelHydraliskSpike()));
		RenderingRegistry.registerEntityRenderingHandler(EntityMutaliskGlaiveWurm.class, new RenderMutaliskGlaiveWurm(Minecraft.getMinecraft().getRenderManager(), new ModelMutaliskGlaiveWurm()));

		RenderingRegistry.registerEntityRenderingHandler(EntityScout.class, new RenderScout(Minecraft.getMinecraft().getRenderManager()));

		RenderingRegistry.registerEntityRenderingHandler(EntityWraith.class, new RenderWraith(Minecraft.getMinecraft().getRenderManager()));
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

	public static IRenderFactory getRenderFactory(Render renderer)
	{
		return new IRenderFactory()
		{
			@Override
			public Render createRenderFor(RenderManager manager)
			{
				return renderer;
			}
		};
	}
}