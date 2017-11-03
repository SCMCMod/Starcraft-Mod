package ga.scmc.handlers;

import static ga.scmc.handlers.ArmorHandler.COPPER_BOOTS;
import static ga.scmc.handlers.ArmorHandler.COPPER_CHESTPLATE;
import static ga.scmc.handlers.ArmorHandler.COPPER_HELMET;
import static ga.scmc.handlers.ArmorHandler.COPPER_LEGGINGS;
import static ga.scmc.handlers.ArmorHandler.PROTOSS_T1_BOOTS;
import static ga.scmc.handlers.ArmorHandler.PROTOSS_T1_CHESTPLATE;
import static ga.scmc.handlers.ArmorHandler.PROTOSS_T1_HELMET;
import static ga.scmc.handlers.ArmorHandler.PROTOSS_T1_LEGGINGS;
import static ga.scmc.handlers.ArmorHandler.PROTOSS_T2_BOOTS;
import static ga.scmc.handlers.ArmorHandler.PROTOSS_T2_CHESTPLATE;
import static ga.scmc.handlers.ArmorHandler.PROTOSS_T2_HELMET;
import static ga.scmc.handlers.ArmorHandler.PROTOSS_T2_LEGGINGS;
import static ga.scmc.handlers.ArmorHandler.PROTOSS_T3_BOOTS;
import static ga.scmc.handlers.ArmorHandler.PROTOSS_T3_CHESTPLATE;
import static ga.scmc.handlers.ArmorHandler.PROTOSS_T3_HELMET;
import static ga.scmc.handlers.ArmorHandler.PROTOSS_T3_LEGGINGS;
import static ga.scmc.handlers.ArmorHandler.STEEL_BOOTS;
import static ga.scmc.handlers.ArmorHandler.STEEL_CHESTPLATE;
import static ga.scmc.handlers.ArmorHandler.STEEL_HELMET;
import static ga.scmc.handlers.ArmorHandler.STEEL_LEGGINGS;
import static ga.scmc.handlers.ArmorHandler.TITANIUM_BOOTS;
import static ga.scmc.handlers.ArmorHandler.TITANIUM_CHESTPLATE;
import static ga.scmc.handlers.ArmorHandler.TITANIUM_HELMET;
import static ga.scmc.handlers.ArmorHandler.TITANIUM_LEGGINGS;
import static ga.scmc.handlers.ArmorHandler.ZERG_T1_BOOTS;
import static ga.scmc.handlers.ArmorHandler.ZERG_T1_CHESTPLATE;
import static ga.scmc.handlers.ArmorHandler.ZERG_T1_HELMET;
import static ga.scmc.handlers.ArmorHandler.ZERG_T1_LEGGINGS;
import static ga.scmc.handlers.ArmorHandler.ZERG_T2_BOOTS;
import static ga.scmc.handlers.ArmorHandler.ZERG_T2_CHESTPLATE;
import static ga.scmc.handlers.ArmorHandler.ZERG_T2_HELMET;
import static ga.scmc.handlers.ArmorHandler.ZERG_T2_LEGGINGS;
import static ga.scmc.handlers.ArmorHandler.ZERG_T3_BOOTS;
import static ga.scmc.handlers.ArmorHandler.ZERG_T3_CHESTPLATE;
import static ga.scmc.handlers.ArmorHandler.ZERG_T3_HELMET;
import static ga.scmc.handlers.ArmorHandler.ZERG_T3_LEGGINGS;
import static ga.scmc.handlers.BlockHandler.ASH_CHAR;
import static ga.scmc.handlers.BlockHandler.FLUID_ACID;
import static ga.scmc.handlers.BlockHandler.FLUID_BLOOD;
import static ga.scmc.handlers.BlockHandler.FLUID_TERRAZINE;
import static ga.scmc.handlers.BlockHandler.FLUID_VESPENE;
import static ga.scmc.handlers.BlockHandler.FURNACE_CHAR;
import static ga.scmc.handlers.BlockHandler.FURNACE_SHAKURAS;
import static ga.scmc.handlers.BlockHandler.FURNACE_SLAYN;
import static ga.scmc.handlers.BlockHandler.GAS_TERRAZINE;
import static ga.scmc.handlers.BlockHandler.GAS_VESPENE;
import static ga.scmc.handlers.BlockHandler.LIGHT_SOURCE;
import static ga.scmc.handlers.BlockHandler.LIT_FURNACE_CHAR;
import static ga.scmc.handlers.BlockHandler.LIT_FURNACE_SHAKURAS;
import static ga.scmc.handlers.BlockHandler.LIT_FURNACE_SLAYN;
import static ga.scmc.handlers.BlockHandler.PROTOSS_DARK_ENERGY_CHANNEL;
import static ga.scmc.handlers.BlockHandler.PROTOSS_DARK_ENERGY_STABILIZER;
import static ga.scmc.handlers.BlockHandler.PROTOSS_ENERGY_CHANNEL;
import static ga.scmc.handlers.BlockHandler.PROTOSS_ENERGY_STABILIZER;
import static ga.scmc.handlers.BlockHandler.PROTOSS_VOID_ENERGY_CHANNEL;
import static ga.scmc.handlers.BlockHandler.PROTOSS_VOID_ENERGY_STABILIZER;
import static ga.scmc.handlers.BlockHandler.STARCRAFT_SKULL;
import static ga.scmc.handlers.BlockHandler.TEST;
import static ga.scmc.handlers.BlockHandler.WARP_GATE_WORMHOLE;
import static ga.scmc.handlers.ItemHandler.BIOMASS;
import static ga.scmc.handlers.ItemHandler.BULLET;
import static ga.scmc.handlers.ItemHandler.C14_GAUSS_RIFLE;
import static ga.scmc.handlers.ItemHandler.C14_PARTS;
import static ga.scmc.handlers.ItemHandler.CREEP_RESIN;
import static ga.scmc.handlers.ItemHandler.DUST;
import static ga.scmc.handlers.ItemHandler.ENERGY;
import static ga.scmc.handlers.ItemHandler.FLAMETHROWER;
import static ga.scmc.handlers.ItemHandler.GAS_CONTAINER;
import static ga.scmc.handlers.ItemHandler.ICON_PROTOSS;
import static ga.scmc.handlers.ItemHandler.ICON_TERRAN;
import static ga.scmc.handlers.ItemHandler.ICON_ZERG;
import static ga.scmc.handlers.ItemHandler.INGOT;
import static ga.scmc.handlers.ItemHandler.MINERAL_SHARD;
import static ga.scmc.handlers.ItemHandler.NUCLEAR_MISSILE;
import static ga.scmc.handlers.ItemHandler.ORGANIC_TISSUE;
import static ga.scmc.handlers.ItemHandler.PHOSPHORUS;
import static ga.scmc.handlers.ItemHandler.PLEDGE;
import static ga.scmc.handlers.ItemHandler.PROTOSS_INGOT;
import static ga.scmc.handlers.ItemHandler.PSI_BLADE_FOCUSER_UNCHARGED;
import static ga.scmc.handlers.ItemHandler.SPAWNER_PROTOSS_CYBERNETICSCORE;
import static ga.scmc.handlers.ItemHandler.SPAWNER_PROTOSS_DARK_CYBERNETICSCORE;
import static ga.scmc.handlers.ItemHandler.SPAWNER_PROTOSS_DARK_PYLON;
import static ga.scmc.handlers.ItemHandler.SPAWNER_PROTOSS_DARK_WARPGATE;
import static ga.scmc.handlers.ItemHandler.SPAWNER_PROTOSS_PYLON;
import static ga.scmc.handlers.ItemHandler.SPAWNER_PROTOSS_VOID_CYBERNETICSCORE;
import static ga.scmc.handlers.ItemHandler.SPAWNER_PROTOSS_VOID_PYLON;
import static ga.scmc.handlers.ItemHandler.SPAWNER_PROTOSS_VOID_WARPGATE;
import static ga.scmc.handlers.ItemHandler.SPAWNER_PROTOSS_WARPGATE;
import static ga.scmc.handlers.ItemHandler.SPAWNER_TERRAN_BUNKER;
import static ga.scmc.handlers.ItemHandler.SPAWNER_ZERG_HYDRALISKDEN;
import static ga.scmc.handlers.ItemHandler.SPAWNER_ZERG_SPAWNINGPOOL;
import static ga.scmc.handlers.ItemHandler.SPAWNER_ZERG_SPIRE;
import static ga.scmc.handlers.ItemHandler.STIMPACK;
import static ga.scmc.handlers.ItemHandler.TERRAZINE;
import static ga.scmc.handlers.ItemHandler.VESPENE;
import static ga.scmc.handlers.ItemHandler.ZERG_CARAPACE;
import static ga.scmc.handlers.MetaBlockHandler.COMP_METAL_T1;
import static ga.scmc.handlers.MetaBlockHandler.COMP_MINERAL;
import static ga.scmc.handlers.MetaBlockHandler.GAS_COLLECTOR;
import static ga.scmc.handlers.MetaBlockHandler.NEOSTEEL_METAL;
import static ga.scmc.handlers.MetaBlockHandler.PARISTEEL_METAL;
import static ga.scmc.handlers.MetaBlockHandler.PROTOSS_METAL_T1;
import static ga.scmc.handlers.MetaBlockHandler.PROTOSS_METAL_T2;
import static ga.scmc.handlers.MetaBlockHandler.PROTOSS_METAL_T3;
import static ga.scmc.handlers.MetaBlockHandler.PYLON_CRYSTAL;
import static ga.scmc.handlers.MetaBlockHandler.ZERG_CARAPACE_BLOCK;
import static ga.scmc.handlers.MetaBlockHandler.ZERG_FLESH;
import static ga.scmc.handlers.ToolHandler.COPPER_AXE;
import static ga.scmc.handlers.ToolHandler.COPPER_HOE;
import static ga.scmc.handlers.ToolHandler.COPPER_PICKAXE;
import static ga.scmc.handlers.ToolHandler.COPPER_SHOVEL;
import static ga.scmc.handlers.ToolHandler.STEEL_AXE;
import static ga.scmc.handlers.ToolHandler.STEEL_HOE;
import static ga.scmc.handlers.ToolHandler.STEEL_PICKAXE;
import static ga.scmc.handlers.ToolHandler.STEEL_SHOVEL;
import static ga.scmc.handlers.ToolHandler.TITANIUM_AXE;
import static ga.scmc.handlers.ToolHandler.TITANIUM_HOE;
import static ga.scmc.handlers.ToolHandler.TITANIUM_PICKAXE;
import static ga.scmc.handlers.ToolHandler.TITANIUM_SHOVEL;
import static ga.scmc.handlers.WeaponHandler.BALISONG;
import static ga.scmc.handlers.WeaponHandler.BANE_BLADE;
import static ga.scmc.handlers.WeaponHandler.COPPER_SWORD;
import static ga.scmc.handlers.WeaponHandler.DARK_WARP_BLADE;
import static ga.scmc.handlers.WeaponHandler.MASTER_PSI_BLADE;
import static ga.scmc.handlers.WeaponHandler.MILITARY_KNIFE;
import static ga.scmc.handlers.WeaponHandler.MONOMOLECULAR_BLADE;
import static ga.scmc.handlers.WeaponHandler.PSI_BLADE;
import static ga.scmc.handlers.WeaponHandler.STEEL_SWORD;
import static ga.scmc.handlers.WeaponHandler.TITANIUM_SWORD;
import static ga.scmc.handlers.WeaponHandler.WARP_BLADE;

import ga.scmc.client.renderer.entity.RenderAdept;
import ga.scmc.client.renderer.entity.RenderBroodling;
import ga.scmc.client.renderer.entity.RenderBrutalisk;
import ga.scmc.client.renderer.entity.RenderBrutaliskCocoon;
import ga.scmc.client.renderer.entity.RenderCivilian;
import ga.scmc.client.renderer.entity.RenderDarkProbe;
import ga.scmc.client.renderer.entity.RenderDarkTemplar;
import ga.scmc.client.renderer.entity.RenderDragoon;
import ga.scmc.client.renderer.entity.RenderDrone;
import ga.scmc.client.renderer.entity.RenderGhost;
import ga.scmc.client.renderer.entity.RenderHydralisk;
import ga.scmc.client.renderer.entity.RenderInfestedCivilian;
import ga.scmc.client.renderer.entity.RenderKakaru;
import ga.scmc.client.renderer.entity.RenderLarva;
import ga.scmc.client.renderer.entity.RenderLarvaCocoon;
import ga.scmc.client.renderer.entity.RenderMarauder;
import ga.scmc.client.renderer.entity.RenderMarine;
import ga.scmc.client.renderer.entity.RenderPredator;
import ga.scmc.client.renderer.entity.RenderProbe;
import ga.scmc.client.renderer.entity.RenderProtossReaver;
import ga.scmc.client.renderer.entity.RenderQueen;
import ga.scmc.client.renderer.entity.RenderSCV;
import ga.scmc.client.renderer.entity.RenderScarab;
import ga.scmc.client.renderer.entity.RenderStalker;
import ga.scmc.client.renderer.entity.RenderVoidProbe;
import ga.scmc.client.renderer.entity.RenderZealot;
import ga.scmc.client.renderer.entity.RenderZergling;
import ga.scmc.client.renderer.entity.RenderZerglingBoost;
import ga.scmc.client.renderer.entity.RenderZerglingRaptor;
import ga.scmc.client.renderer.entity.RenderZerglingSwarmling;
import ga.scmc.client.renderer.model.ModelAdept;
import ga.scmc.client.renderer.model.ModelBroodling;
import ga.scmc.client.renderer.model.ModelBrutalisk;
import ga.scmc.client.renderer.model.ModelBrutaliskCocoon;
import ga.scmc.client.renderer.model.ModelBullet;
import ga.scmc.client.renderer.model.ModelCivilian;
import ga.scmc.client.renderer.model.ModelDarkProbe;
import ga.scmc.client.renderer.model.ModelDarkTemplar;
import ga.scmc.client.renderer.model.ModelDragoon;
import ga.scmc.client.renderer.model.ModelDrone;
import ga.scmc.client.renderer.model.ModelGhost;
import ga.scmc.client.renderer.model.ModelHydralisk;
import ga.scmc.client.renderer.model.ModelHydraliskSpike;
import ga.scmc.client.renderer.model.ModelInfestedCivilian;
import ga.scmc.client.renderer.model.ModelKakaru;
import ga.scmc.client.renderer.model.ModelLarva;
import ga.scmc.client.renderer.model.ModelLarvaCocoon;
import ga.scmc.client.renderer.model.ModelMarauder;
import ga.scmc.client.renderer.model.ModelMarine;
import ga.scmc.client.renderer.model.ModelPredator;
import ga.scmc.client.renderer.model.ModelProbe;
import ga.scmc.client.renderer.model.ModelProtossReaver;
import ga.scmc.client.renderer.model.ModelQueen;
import ga.scmc.client.renderer.model.ModelSCV;
import ga.scmc.client.renderer.model.ModelScarab;
import ga.scmc.client.renderer.model.ModelStalker;
import ga.scmc.client.renderer.model.ModelVoidProbe;
import ga.scmc.client.renderer.model.ModelZealot;
import ga.scmc.client.renderer.model.ModelZergling;
import ga.scmc.client.renderer.model.ModelZerglingBoost;
import ga.scmc.client.renderer.model.ModelZerglingRaptor;
import ga.scmc.client.renderer.model.ModelZerglingSwarmling;
import ga.scmc.client.renderer.projectiles.RenderC14GaussRifleBullet;
import ga.scmc.client.renderer.projectiles.RenderFlamethrowerFlame;
import ga.scmc.client.renderer.projectiles.RenderHydraliskSpike;
import ga.scmc.client.renderer.tileentity.RendererStarcraftSkull;
import ga.scmc.client.renderer.tileentity.RendererTest;
import ga.scmc.entity.EntityC14GaussRifleBullet;
import ga.scmc.entity.EntityFlamethrowerFlame;
import ga.scmc.entity.EntityHydraliskSpike;
import ga.scmc.entity.living.EntityAdept;
import ga.scmc.entity.living.EntityBroodling;
import ga.scmc.entity.living.EntityBrutalisk;
import ga.scmc.entity.living.EntityBrutaliskCocoon;
import ga.scmc.entity.living.EntityCivilian;
import ga.scmc.entity.living.EntityDarkProbe;
import ga.scmc.entity.living.EntityDarkTemplar;
import ga.scmc.entity.living.EntityDragoon;
import ga.scmc.entity.living.EntityDrone;
import ga.scmc.entity.living.EntityGhost;
import ga.scmc.entity.living.EntityHydralisk;
import ga.scmc.entity.living.EntityInfestedCivilian;
import ga.scmc.entity.living.EntityKakaru;
import ga.scmc.entity.living.EntityLarva;
import ga.scmc.entity.living.EntityLarvaCocoon;
import ga.scmc.entity.living.EntityMarauder;
import ga.scmc.entity.living.EntityMarine;
import ga.scmc.entity.living.EntityPredator;
import ga.scmc.entity.living.EntityProbe;
import ga.scmc.entity.living.EntityProtossReaver;
import ga.scmc.entity.living.EntityQueen;
import ga.scmc.entity.living.EntitySCV;
import ga.scmc.entity.living.EntityScarab;
import ga.scmc.entity.living.EntityStalker;
import ga.scmc.entity.living.EntityVoidProbe;
import ga.scmc.entity.living.EntityZealot;
import ga.scmc.entity.living.EntityZergling;
import ga.scmc.entity.living.EntityZerglingBoost;
import ga.scmc.entity.living.EntityZerglingRaptor;
import ga.scmc.entity.living.EntityZerglingSwarmling;
import ga.scmc.enums.EnumMetaBlock;
import ga.scmc.enums.EnumMetaItem;
import ga.scmc.lib.Library;
import ga.scmc.tileentity.TileEntityStarcraftSkull;
import ga.scmc.tileentity.TileEntityTest;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderingHandler {

	public static void preInit() {
		registerStandardItemRenderers();
		registerArmorItemRenderers();
		registerWeaponItemRenderers();
		registerToolItemRenderers();
		registerBlockModels();
		registerBlockMetaRenders();
		createStateMappers();
	}

	public static void init() {
		registerItemModelVariants();
		registerEntityRenderers();
		registerTileEntityRenders();
	}

	private static void registerItemModelVariants() {
		ModelBakery.registerItemVariants(ItemHandler.MINERAL_SHARD, new ResourceLocation(Library.MODID, "shard_blue"), new ResourceLocation(Library.MODID, "shard_rich"));
		ModelBakery.registerItemVariants(ItemHandler.VESPENE, new ResourceLocation(Library.MODID, "vespene_raw"), new ResourceLocation(Library.MODID, "vespene_protoss"), new ResourceLocation(Library.MODID, "vespene_terran"), new ResourceLocation(Library.MODID, "vespene_zerg"));
		ModelBakery.registerItemVariants(ItemHandler.ENERGY, new ResourceLocation(Library.MODID, "energy_pure"), new ResourceLocation(Library.MODID, "energy_corrupted"), new ResourceLocation(Library.MODID, "energy_void"));
		ModelBakery.registerItemVariants(ItemHandler.DUST, new ResourceLocation(Library.MODID, "dust_iron"), new ResourceLocation(Library.MODID, "dust_steel"), new ResourceLocation(Library.MODID, "dust_carbon"));
		ModelBakery.registerItemVariants(ItemHandler.PLEDGE, new ResourceLocation(Library.MODID, "pledge_white"), new ResourceLocation(Library.MODID, "pledge_orange"), new ResourceLocation(Library.MODID, "pledge_magenta"), new ResourceLocation(Library.MODID, "pledge_lightblue"), new ResourceLocation(Library.MODID, "pledge_yellow"), new ResourceLocation(Library.MODID, "pledge_lime"), new ResourceLocation(Library.MODID, "pledge_pink"), new ResourceLocation(Library.MODID, "pledge_gray"), new ResourceLocation(Library.MODID, "pledge_silver"), new ResourceLocation(Library.MODID, "pledge_cyan"), new ResourceLocation(Library.MODID, "pledge_purple"), new ResourceLocation(Library.MODID, "pledge_blue"), new ResourceLocation(Library.MODID, "pledge_brown"), new ResourceLocation(Library.MODID, "pledge_green"), new ResourceLocation(Library.MODID, "pledge_red"), new ResourceLocation(Library.MODID, "pledge_black"));
		ModelBakery.registerItemVariants(ItemHandler.INGOT, new ResourceLocation(Library.MODID, "ingot_copper"), new ResourceLocation(Library.MODID, "ingot_titanium"), new ResourceLocation(Library.MODID, "ingot_steel"));
		ModelBakery.registerItemVariants(ItemHandler.PROTOSS_INGOT, new ResourceLocation(Library.MODID, "pingot_khalai"), new ResourceLocation(Library.MODID, "pingot_dark"));
		ModelBakery.registerItemVariants(ItemHandler.PSI_BLADE_FOCUSER_UNCHARGED, new ResourceLocation(Library.MODID, "protoss_psiblade_focuser_uncharged_aiur"), new ResourceLocation(Library.MODID, "protoss_psiblade_focuser_uncharged_dark"));
		ModelBakery.registerItemVariants(ItemHandler.C14_PARTS, new ResourceLocation(Library.MODID, "part_c14_gauss_body"), new ResourceLocation(Library.MODID, "part_c14_gauss_barrel"), new ResourceLocation(Library.MODID, "part_c14_gauss_grip"));
		ModelBakery.registerItemVariants(ItemHandler.BULLET, new ResourceLocation(Library.MODID, "bullet_rifle_c14_gauss"));
		ModelBakery.registerItemVariants(ItemHandler.ZERG_CARAPACE, new ResourceLocation(Library.MODID, "zerg_icarapace_t1"), new ResourceLocation(Library.MODID, "zerg_icarapace_t2"), new ResourceLocation(Library.MODID, "zerg_icarapace_t3"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(MetaBlockHandler.PROTOSS_METAL_T1), new ResourceLocation(Library.MODID, "protoss.metal.1.aiur"), new ResourceLocation(Library.MODID, "protoss.metal.1.dark"), new ResourceLocation(Library.MODID, "protoss.metal.1.green"), new ResourceLocation(Library.MODID, "protoss.metal.1.blue"), new ResourceLocation(Library.MODID, "protoss.metal.1.red"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(MetaBlockHandler.PROTOSS_METAL_T2), new ResourceLocation(Library.MODID, "protoss.metal.2.aiur"), new ResourceLocation(Library.MODID, "protoss.metal.2.dark"), new ResourceLocation(Library.MODID, "protoss.metal.2.green"), new ResourceLocation(Library.MODID, "protoss.metal.2.blue"), new ResourceLocation(Library.MODID, "protoss.metal.2.red"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(MetaBlockHandler.PROTOSS_METAL_T3), new ResourceLocation(Library.MODID, "protoss.metal.3.aiur"), new ResourceLocation(Library.MODID, "protoss.metal.3.dark"), new ResourceLocation(Library.MODID, "protoss.metal.3.green"), new ResourceLocation(Library.MODID, "protoss.metal.3.blue"), new ResourceLocation(Library.MODID, "protoss.metal.3.red"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(MetaBlockHandler.PYLON_CRYSTAL), new ResourceLocation(Library.MODID, "protoss.pyloncrystal.pure"), new ResourceLocation(Library.MODID, "protoss.pyloncrystal.dark"), new ResourceLocation(Library.MODID, "protoss.pyloncrystal.void"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(MetaBlockHandler.ZERG_CARAPACE_BLOCK), new ResourceLocation(Library.MODID, "zerg.carapace.1"), new ResourceLocation(Library.MODID, "zerg.carapace.2"), new ResourceLocation(Library.MODID, "zerg.carapace.3"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(MetaBlockHandler.ZERG_FLESH), new ResourceLocation(Library.MODID, "zerg.flesh.purple"), new ResourceLocation(Library.MODID, "zerg.flesh.brown"), new ResourceLocation(Library.MODID, "zerg.flesh.pink"), new ResourceLocation(Library.MODID, "zerg.flesh.blue"), new ResourceLocation(Library.MODID, "zerg.flesh.cyan"), new ResourceLocation(Library.MODID, "zerg.flesh.gray"), new ResourceLocation(Library.MODID, "zerg.flesh.green"), new ResourceLocation(Library.MODID, "zerg.flesh.lightblue"), new ResourceLocation(Library.MODID, "zerg.flesh.lime"), new ResourceLocation(Library.MODID, "zerg.flesh.magenta"), new ResourceLocation(Library.MODID, "zerg.flesh.orange"), new ResourceLocation(Library.MODID, "zerg.flesh.red"), new ResourceLocation(Library.MODID, "zerg.flesh.silver"), new ResourceLocation(Library.MODID, "zerg.flesh.white"), new ResourceLocation(Library.MODID, "zerg.flesh.yellow"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(MetaBlockHandler.PARISTEEL_METAL), new ResourceLocation(Library.MODID, "terran.paristeel.purple"), new ResourceLocation(Library.MODID, "terran.paristeel.brown"), new ResourceLocation(Library.MODID, "terran.paristeel.pink"), new ResourceLocation(Library.MODID, "terran.paristeel.blue"), new ResourceLocation(Library.MODID, "terran.paristeel.cyan"), new ResourceLocation(Library.MODID, "terran.paristeel.gray"), new ResourceLocation(Library.MODID, "terran.paristeel.green"), new ResourceLocation(Library.MODID, "terran.paristeel.lightblue"), new ResourceLocation(Library.MODID, "terran.paristeel.lime"), new ResourceLocation(Library.MODID, "terran.paristeel.magenta"), new ResourceLocation(Library.MODID, "terran.paristeel.orange"), new ResourceLocation(Library.MODID, "terran.paristeel.red"), new ResourceLocation(Library.MODID, "terran.paristeel.silver"), new ResourceLocation(Library.MODID, "terran.paristeel.white"), new ResourceLocation(Library.MODID, "terran.paristeel.yellow"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(MetaBlockHandler.COMP_METAL_T1), new ResourceLocation(Library.MODID, "terran.metal.copper"), new ResourceLocation(Library.MODID, "terran.metal.steel"), new ResourceLocation(Library.MODID, "terran.metal.titanium"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(MetaBlockHandler.NEOSTEEL_METAL), new ResourceLocation(Library.MODID, "terran.neosteel.base"), new ResourceLocation(Library.MODID, "terran.neosteel.frame"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(MetaBlockHandler.COMP_MINERAL), new ResourceLocation(Library.MODID, "mineral.compressed.blue"), new ResourceLocation(Library.MODID, "mineral.compressed.rich"));
	}

	private static void registerEntityRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(EntityZealot.class, new RenderZealot<Object>(Minecraft.getMinecraft().getRenderManager(), new ModelZealot(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityProbe.class, new RenderProbe(Minecraft.getMinecraft().getRenderManager(), new ModelProbe(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityProtossReaver.class, new RenderProtossReaver(Minecraft.getMinecraft().getRenderManager(), new ModelProtossReaver(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityScarab.class, new RenderScarab(Minecraft.getMinecraft().getRenderManager(), new ModelScarab(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityDarkTemplar.class, new RenderDarkTemplar<Object>(Minecraft.getMinecraft().getRenderManager(), new ModelDarkTemplar(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityVoidProbe.class, new RenderVoidProbe(Minecraft.getMinecraft().getRenderManager(), new ModelVoidProbe(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityScarab.class, new RenderScarab(Minecraft.getMinecraft().getRenderManager(), new ModelScarab(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityDarkProbe.class, new RenderDarkProbe(Minecraft.getMinecraft().getRenderManager(), new ModelDarkProbe(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityAdept.class, new RenderAdept(Minecraft.getMinecraft().getRenderManager(), new ModelAdept(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityStalker.class, new RenderStalker(Minecraft.getMinecraft().getRenderManager(), new ModelStalker(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityDragoon.class, new RenderDragoon(Minecraft.getMinecraft().getRenderManager(), new ModelDragoon(), 0.4f));

		RenderingRegistry.registerEntityRenderingHandler(EntityBrutalisk.class, new RenderBrutalisk(Minecraft.getMinecraft().getRenderManager(), new ModelBrutalisk(), 3.0f));
		RenderingRegistry.registerEntityRenderingHandler(EntityHydralisk.class, new RenderHydralisk<Object>(Minecraft.getMinecraft().getRenderManager(), new ModelHydralisk(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityZergling.class, new RenderZergling<Object>(Minecraft.getMinecraft().getRenderManager(), new ModelZergling(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityZerglingRaptor.class, new RenderZerglingRaptor<Object>(Minecraft.getMinecraft().getRenderManager(), new ModelZerglingRaptor(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityZerglingSwarmling.class, new RenderZerglingSwarmling<Object>(Minecraft.getMinecraft().getRenderManager(), new ModelZerglingSwarmling(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityZerglingBoost.class, new RenderZerglingBoost<Object>(Minecraft.getMinecraft().getRenderManager(), new ModelZerglingBoost(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityLarva.class, new RenderLarva<Object>(Minecraft.getMinecraft().getRenderManager(), new ModelLarva(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityLarvaCocoon.class, new RenderLarvaCocoon(Minecraft.getMinecraft().getRenderManager(), new ModelLarvaCocoon(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityBroodling.class, new RenderBroodling(Minecraft.getMinecraft().getRenderManager(), new ModelBroodling(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityInfestedCivilian.class, new RenderInfestedCivilian(Minecraft.getMinecraft().getRenderManager(), new ModelInfestedCivilian(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityQueen.class, new RenderQueen(Minecraft.getMinecraft().getRenderManager(), new ModelQueen(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityDrone.class, new RenderDrone(Minecraft.getMinecraft().getRenderManager(), new ModelDrone(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityBrutaliskCocoon.class, new RenderBrutaliskCocoon(Minecraft.getMinecraft().getRenderManager(), new ModelBrutaliskCocoon(), 0.4f));

		RenderingRegistry.registerEntityRenderingHandler(EntityCivilian.class, new RenderCivilian(Minecraft.getMinecraft().getRenderManager(), new ModelCivilian(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityPredator.class, new RenderPredator(Minecraft.getMinecraft().getRenderManager(), new ModelPredator(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntitySCV.class, new RenderSCV(Minecraft.getMinecraft().getRenderManager(), new ModelSCV(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityMarine.class, new RenderMarine(Minecraft.getMinecraft().getRenderManager(), new ModelMarine(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityGhost.class, new RenderGhost(Minecraft.getMinecraft().getRenderManager(), new ModelGhost(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityMarauder.class, new RenderMarauder(Minecraft.getMinecraft().getRenderManager(), new ModelMarauder(), 0.4f));

		RenderingRegistry.registerEntityRenderingHandler(EntityKakaru.class, new RenderKakaru(Minecraft.getMinecraft().getRenderManager(), new ModelKakaru(), 0.4f));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityC14GaussRifleBullet.class, new RenderC14GaussRifleBullet(Minecraft.getMinecraft().getRenderManager(), new ModelBullet()));
		RenderingRegistry.registerEntityRenderingHandler(EntityHydraliskSpike.class, new RenderHydraliskSpike(Minecraft.getMinecraft().getRenderManager(), new ModelHydraliskSpike()));
		RenderingRegistry.registerEntityRenderingHandler(EntityFlamethrowerFlame.class, new RenderFlamethrowerFlame(Minecraft.getMinecraft().getRenderManager(), null));
	}

	private static void registerTileEntityRenders() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTest.class, new RendererTest());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityStarcraftSkull.class, new RendererStarcraftSkull());
	}

	@SideOnly(Side.CLIENT)
	public static void createStateMappers() {
		ModelLoader.setCustomStateMapper(STARCRAFT_SKULL, getNormalVariant(STARCRAFT_SKULL.getRegistryName()));
	}

	private static StateMapperBase getNormalVariant(final ResourceLocation location) {
		return new StateMapperBase() {
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return new ModelResourceLocation(location, "normal");
			}
		};
	}

	private static void registerStandardItemRenderers() {
		registerItemRender(C14_GAUSS_RIFLE);
		registerItemRender(FLAMETHROWER);

		registerItemRender(CREEP_RESIN);
		registerItemRender(ORGANIC_TISSUE);
		registerItemRender(BIOMASS);

		registerItemRender(NUCLEAR_MISSILE);
		registerItemRender(STIMPACK);

		registerItemRender(PHOSPHORUS);

		registerItemRender(SPAWNER_PROTOSS_DARK_CYBERNETICSCORE);
		registerItemRender(SPAWNER_PROTOSS_VOID_CYBERNETICSCORE);
		registerItemRender(SPAWNER_PROTOSS_CYBERNETICSCORE);
		registerItemRender(SPAWNER_PROTOSS_DARK_PYLON);
		registerItemRender(SPAWNER_PROTOSS_VOID_PYLON);
		registerItemRender(SPAWNER_PROTOSS_PYLON);
		registerItemRender(SPAWNER_PROTOSS_DARK_WARPGATE);
		registerItemRender(SPAWNER_PROTOSS_VOID_WARPGATE);
		registerItemRender(SPAWNER_PROTOSS_WARPGATE);

		registerItemRender(SPAWNER_TERRAN_BUNKER);

		registerItemRender(SPAWNER_ZERG_SPAWNINGPOOL);
		registerItemRender(SPAWNER_ZERG_SPIRE);
		registerItemRender(SPAWNER_ZERG_HYDRALISKDEN);

		registerItemRender(ICON_PROTOSS);
		registerItemRender(ICON_TERRAN);
		registerItemRender(ICON_ZERG);

		for (int i = 0; i < EnumMetaItem.MineralType.values().length; i++) {
			registerItemRender(MINERAL_SHARD, i, "shard_" + EnumMetaItem.MineralType.values()[i].getName());
		}
		for (int i = 0; i < EnumMetaItem.PledgeType.values().length; i++) {
			registerItemRender(PLEDGE, i, "pledge_" + EnumMetaItem.PledgeType.values()[i].getName());
		}
		for (int i = 0; i < EnumMetaItem.VespeneType.values().length; i++) {
			registerItemRender(VESPENE, i, "vespene_" + EnumMetaItem.VespeneType.values()[i].getName());
		}
		for (int i = 0; i < EnumMetaItem.TerrazineType.values().length; i++) {
			registerItemRender(TERRAZINE, i, "terrazine_" + EnumMetaItem.TerrazineType.values()[i].getName());
		}
		for (int i = 0; i < EnumMetaItem.ContainerType.values().length; i++) {
			registerItemRender(GAS_CONTAINER, i, "empty_container_" + EnumMetaItem.ContainerType.values()[i].getName());
		}
		for (int i = 0; i < EnumMetaItem.EnergyType.values().length; i++) {
			registerItemRender(ENERGY, i, "energy_" + EnumMetaItem.EnergyType.values()[i].getName());
		}
		for (int i = 0; i < EnumMetaItem.DustType.values().length; i++) {
			registerItemRender(DUST, i, "dust_" + EnumMetaItem.DustType.values()[i].getName());
		}
		for (int i = 0; i < EnumMetaItem.IngotType.values().length; i++) {
			registerItemRender(INGOT, i, "ingot_" + EnumMetaItem.IngotType.values()[i].getName());
		}
		for (int i = 0; i < EnumMetaItem.ProtossIngotType.values().length; i++) {
			registerItemRender(PROTOSS_INGOT, i, "pingot_" + EnumMetaItem.ProtossIngotType.values()[i].getName());
		}
		for (int i = 0; i < EnumMetaItem.BulletType.values().length; i++) {
			registerItemRender(BULLET, i, "bullet_" + EnumMetaItem.BulletType.values()[i].getName());
		}
		for (int i = 0; i < EnumMetaItem.C14PartType.values().length; i++) {
			registerItemRender(C14_PARTS, i, "part_c14_gauss_" + EnumMetaItem.C14PartType.values()[i].getName());
		}
		for (int i = 0; i < EnumMetaItem.FocuserType.values().length; i++) {
			registerItemRender(PSI_BLADE_FOCUSER_UNCHARGED, i, "protoss_psiblade_focuser_uncharged_" + EnumMetaItem.FocuserType.values()[i].getName());
		}
		for (int i = 0; i < EnumMetaItem.CarapaceType.values().length; i++) {
			registerItemRender(ZERG_CARAPACE, i, "zerg_icarapace_" + EnumMetaItem.CarapaceType.values()[i].getName());
		}
		for (int i = 0; i < EnumMetaItem.SkullType.values().length; i++) {
			registerItemRender(ItemHandler.STARCRAFT_SKULL, i, ItemHandler.STARCRAFT_SKULL.getRegistryName().getResourcePath());
		}
	}

	private static void registerToolItemRenderers() {
		registerItemRender(COPPER_PICKAXE);
		registerItemRender(COPPER_AXE);
		registerItemRender(COPPER_SHOVEL);
		registerItemRender(COPPER_HOE);

		registerItemRender(TITANIUM_PICKAXE);
		registerItemRender(TITANIUM_AXE);
		registerItemRender(TITANIUM_SHOVEL);
		registerItemRender(TITANIUM_HOE);

		registerItemRender(STEEL_PICKAXE);
		registerItemRender(STEEL_AXE);
		registerItemRender(STEEL_SHOVEL);
		registerItemRender(STEEL_HOE);
	}

	private static void registerWeaponItemRenderers() {
		registerItemRender(PSI_BLADE);
		registerItemRender(BANE_BLADE);

		registerItemRender(WARP_BLADE);
		registerItemRender(DARK_WARP_BLADE);

		registerItemRender(MASTER_PSI_BLADE);

		registerItemRender(BALISONG);
		registerItemRender(MILITARY_KNIFE);
		registerItemRender(MONOMOLECULAR_BLADE);

		registerItemRender(COPPER_SWORD);
		registerItemRender(TITANIUM_SWORD);
		registerItemRender(STEEL_SWORD);
	}

	private static void registerArmorItemRenderers() {
		registerItemRender(TITANIUM_HELMET);
		registerItemRender(TITANIUM_CHESTPLATE);
		registerItemRender(TITANIUM_LEGGINGS);
		registerItemRender(TITANIUM_BOOTS);

		registerItemRender(COPPER_HELMET);
		registerItemRender(COPPER_CHESTPLATE);
		registerItemRender(COPPER_LEGGINGS);
		registerItemRender(COPPER_BOOTS);

		registerItemRender(STEEL_HELMET);
		registerItemRender(STEEL_CHESTPLATE);
		registerItemRender(STEEL_LEGGINGS);
		registerItemRender(STEEL_BOOTS);

		registerItemRender(ZERG_T1_HELMET);
		registerItemRender(ZERG_T1_CHESTPLATE);
		registerItemRender(ZERG_T1_LEGGINGS);
		registerItemRender(ZERG_T1_BOOTS);

		registerItemRender(ZERG_T2_HELMET);
		registerItemRender(ZERG_T2_CHESTPLATE);
		registerItemRender(ZERG_T2_LEGGINGS);
		registerItemRender(ZERG_T2_BOOTS);

		registerItemRender(ZERG_T3_HELMET);
		registerItemRender(ZERG_T3_CHESTPLATE);
		registerItemRender(ZERG_T3_LEGGINGS);
		registerItemRender(ZERG_T3_BOOTS);

		registerItemRender(PROTOSS_T1_HELMET);
		registerItemRender(PROTOSS_T1_CHESTPLATE);
		registerItemRender(PROTOSS_T1_LEGGINGS);
		registerItemRender(PROTOSS_T1_BOOTS);

		registerItemRender(PROTOSS_T2_HELMET);
		registerItemRender(PROTOSS_T2_CHESTPLATE);
		registerItemRender(PROTOSS_T2_LEGGINGS);
		registerItemRender(PROTOSS_T2_BOOTS);

		registerItemRender(PROTOSS_T3_HELMET);
		registerItemRender(PROTOSS_T3_CHESTPLATE);
		registerItemRender(PROTOSS_T3_LEGGINGS);
		registerItemRender(PROTOSS_T3_BOOTS);
	}

	private static void registerBlockModels() {
		registerBlockModel(WARP_GATE_WORMHOLE);

		// Furnaces
		registerBlockModel(LIT_FURNACE_SHAKURAS);
		registerBlockModel(FURNACE_SHAKURAS);
		registerBlockModel(LIT_FURNACE_CHAR);
		registerBlockModel(FURNACE_CHAR);
		registerBlockModel(FURNACE_SLAYN);
		registerBlockModel(LIT_FURNACE_SLAYN);

		// Other
		registerBlockModel(STARCRAFT_SKULL);
		registerBlockModel(TEST);

		// Protoss Blocks
		registerBlockModel(PROTOSS_ENERGY_CHANNEL);
		registerBlockModel(PROTOSS_ENERGY_STABILIZER);
		registerBlockModel(PROTOSS_DARK_ENERGY_CHANNEL);
		registerBlockModel(PROTOSS_DARK_ENERGY_STABILIZER);
		registerBlockModel(PROTOSS_VOID_ENERGY_CHANNEL);
		registerBlockModel(PROTOSS_VOID_ENERGY_STABILIZER);

		registerBlockModel(ASH_CHAR);
		// Layer Registration
		registerLayered(ASH_CHAR);

		// Fluid Registration
		registerFluid(FLUID_ACID);
		registerFluid(FLUID_BLOOD);
		registerFluid(FLUID_VESPENE);
		registerFluid(FLUID_TERRAZINE);

		// Gasses
		registerBlockModel(GAS_VESPENE);
		registerBlockModel(GAS_TERRAZINE);

		registerBlockModel(LIGHT_SOURCE);
	}

	/**
	 * Register the renders for the meta blocks.
	 */
	public static void registerBlockMetaRenders() {
		for (int i = 0; i < EnumMetaBlock.ProtossMetalType.values().length; i++) {
			registerBlockModel(PROTOSS_METAL_T1, i, "protoss.metal.1." + EnumMetaBlock.ProtossMetalType.values()[i].getName());
			registerBlockModel(PROTOSS_METAL_T2, i, "protoss.metal.2." + EnumMetaBlock.ProtossMetalType.values()[i].getName());
			registerBlockModel(PROTOSS_METAL_T3, i, "protoss.metal.3." + EnumMetaBlock.ProtossMetalType.values()[i].getName());
		}
		for (int i = 0; i < EnumMetaBlock.ZergFleshType.values().length; i++) {
			registerBlockModel(ZERG_FLESH, i, "zerg.flesh." + EnumMetaBlock.ZergFleshType.values()[i].getName());
		}
		for (int i = 0; i < EnumMetaBlock.ParisteelMetalType.values().length; i++) {
			registerBlockModel(PARISTEEL_METAL, i, "terran.paristeel." + EnumMetaBlock.ParisteelMetalType.values()[i].getName());
		}
		for (int i = 0; i < EnumMetaBlock.PylonCrystalType.values().length; i++) {
			registerBlockModel(PYLON_CRYSTAL, i, "protoss.pyloncrystal." + EnumMetaBlock.PylonCrystalType.values()[i].getName());
		}
		for (int i = 0; i < EnumMetaBlock.ZergStructureCarapaceType.values().length; i++) {
			registerBlockModel(ZERG_CARAPACE_BLOCK, i, "zerg.carapace." + EnumMetaBlock.ZergStructureCarapaceType.values()[i].getName());
		}
		for (int i = 0; i < EnumMetaBlock.CompressedMetalType.values().length; i++) {
			registerBlockModel(COMP_METAL_T1, i, "terran.metal." + EnumMetaBlock.CompressedMetalType.values()[i].getName());
		}
		for (int i = 0; i < EnumMetaBlock.NeosteelMetalType.values().length; i++) {
			registerBlockModel(NEOSTEEL_METAL, i, "terran.neosteel." + EnumMetaBlock.NeosteelMetalType.values()[i].getName());
		}
		for (int i = 0; i < EnumMetaBlock.CompressedMineralType.values().length; i++) {
			registerBlockModel(COMP_MINERAL, i, "mineral.compressed." + EnumMetaBlock.CompressedMineralType.values()[i].getName());
		}
		for (int i = 0; i < EnumMetaBlock.GasCollectorType.values().length; i++) {
			registerBlockModel(GAS_COLLECTOR, i, "gas.collector." + EnumMetaBlock.GasCollectorType.values()[i].getName());
		}
	}

	/**
	 * Registers the item render MUST BE CALLED IN THE PRE INIT METHOD IN YOUR MAIN CLASS
	 */
	@SideOnly(Side.CLIENT)
	public static void registerItemRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

	/**
	 * Registers the item render for an item which has meta data
	 */
	@SideOnly(Side.CLIENT)
	public static void registerItemRender(Item item, int meta, String fileName) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Library.MODID, fileName), "inventory"));
	}

	@SideOnly(Side.CLIENT)
	private static void registerBlockModel(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}

	/**
	 * Registers the blocks renders even if it has meta data.
	 */
	public static void registerBlockModel(Block block, int meta, String fileName) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Library.MODID, fileName), "inventory"));
	}

	private static void registerFluid(final Block block) {
		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(block), new ItemMeshDefinition() {

			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return new ModelResourceLocation(block.getRegistryName(), "fluid");
			}
		});
		ModelLoader.setCustomStateMapper(block, new StateMapperBase() {

			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return new ModelResourceLocation(block.getRegistryName(), "fluid");
			}
		});
	}

	private static void registerLayered(final Block block) {
		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(block), new ItemMeshDefinition() {

			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return new ModelResourceLocation(block.getRegistryName(), "normal");
			}
		});
		ModelLoader.setCustomStateMapper(block, new StateMapperBase() {

			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				char num = state.toString().charAt(state.toString().length() - 2);
				return new ModelResourceLocation(block.getRegistryName(), "layers=" + num);
			}
		});
	}
}
