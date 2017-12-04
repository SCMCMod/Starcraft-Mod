package ga.scmc.blocks;

import ga.scmc.Starcraft;
import ga.scmc.api.Utils;
import ga.scmc.client.gui.GuiHandler;
import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.enums.EnumWorldType;
import ga.scmc.handlers.BlockHandler;
import ga.scmc.tileentity.TileEntityBlockCharFurnace;
import ga.scmc.tileentity.TileEntityStarcraftFurnace;
import net.minecraft.block.*;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

import javax.annotation.Nullable;
import java.util.Random;

/**
 * A block which is used for all of the starcraft furnaces
 *
 * @author CJMinecraft
 */
public class BlockStarcraftFurnace extends BlockContainer {

    public static final PropertyDirection FACING = BlockHorizontal.FACING;
    private final boolean isBurning;
    private static boolean keepInventory;

    private EnumWorldType type;
    private BlockStarcraftFurnace litBlock, normalBlock;

    public BlockStarcraftFurnace(boolean isBurning, MapColor mapColor, EnumWorldType type) {
        super(Material.ROCK, mapColor);
        this.type = type;
        this.isBurning = isBurning;
        if (isBurning) {
            this.setUnlocalizedName(type.getName() + ".furnace.lit");
            this.setRegistryName(type.getName() + ".furnace.lit");
            this.setCreativeTab(null);
        } else {
            this.setUnlocalizedName(type.getName() + ".furnace");
            this.setRegistryName(type.getName() + ".furnace");
            this.setCreativeTab(StarcraftCreativeTabs.MISC);
        }
        setSoundType(SoundType.STONE);
        setHardness(3.5F);
        setResistance(17.5F);
        setHarvestLevel("pickaxe", 0);
        setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }

    public BlockStarcraftFurnace setBlocks(BlockStarcraftFurnace litBlock, BlockStarcraftFurnace normalBlock) {
        this.litBlock = litBlock;
        this.normalBlock = normalBlock;
        return this;
    }

    public EnumWorldType getType() {
        return type;
    }

    /**
     * Get the Item that this Block should drop when harvested.
     */
    @Nullable
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(BlockHandler.FURNACE_CHAR);
    }

    @Override
    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
        this.setDefaultFacing(worldIn, pos, state);
    }

    private void setDefaultFacing(World worldIn, BlockPos pos, IBlockState state) {
        if (!worldIn.isRemote) {
            IBlockState north = worldIn.getBlockState(pos.north());
            IBlockState south = worldIn.getBlockState(pos.south());
            IBlockState west = worldIn.getBlockState(pos.west());
            IBlockState east = worldIn.getBlockState(pos.east());
            EnumFacing facing = state.getValue(FACING);

            if (facing == EnumFacing.NORTH && north.isFullBlock() && !south.isFullBlock())
                facing = EnumFacing.SOUTH;
            else if (facing == EnumFacing.SOUTH && south.isFullBlock() && !north.isFullBlock())
                facing = EnumFacing.NORTH;
            else if (facing == EnumFacing.WEST && west.isFullBlock() && !east.isFullBlock())
                facing = EnumFacing.EAST;
            else if (facing == EnumFacing.EAST && east.isFullBlock() && !west.isFullBlock())
                facing = EnumFacing.WEST;

            worldIn.setBlockState(pos, state.withProperty(FACING, facing), 2);
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        if (this.isBurning) {
            EnumFacing enumfacing = stateIn.getValue(FACING);
            double x = (double) pos.getX() + 0.5D;
            double y = (double) pos.getY() + rand.nextDouble() * 6.0D / 16.0D;
            double z = (double) pos.getZ() + 0.5D;
            double randOffset = rand.nextDouble() * 0.6D - 0.3D;

            if (rand.nextDouble() < 0.1D)
                worldIn.playSound((double) pos.getX() + 0.5D, (double) pos.getY(), (double) pos.getZ() + 0.5D, SoundEvents.BLOCK_FURNACE_FIRE_CRACKLE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);

            switch (enumfacing) {
                case WEST:
                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, x - 0.52D, y, z + randOffset, 0.0D, 0.0D, 0.0D, new int[0]);
                    worldIn.spawnParticle(EnumParticleTypes.FLAME, x - 0.52D, y, z + randOffset, 0.0D, 0.0D, 0.0D, new int[0]);
                    break;
                case EAST:
                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, x + 0.52D, y, z + randOffset, 0.0D, 0.0D, 0.0D, new int[0]);
                    worldIn.spawnParticle(EnumParticleTypes.FLAME, x + 0.52D, y, z + randOffset, 0.0D, 0.0D, 0.0D, new int[0]);
                    break;
                case NORTH:
                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, x + randOffset, y, z - 0.52D, 0.0D, 0.0D, 0.0D, new int[0]);
                    worldIn.spawnParticle(EnumParticleTypes.FLAME, x + randOffset, y, z - 0.52D, 0.0D, 0.0D, 0.0D, new int[0]);
                    break;
                case SOUTH:
                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, x + randOffset, y, z + 0.52D, 0.0D, 0.0D, 0.0D, new int[0]);
                    worldIn.spawnParticle(EnumParticleTypes.FLAME, x + randOffset, y, z + 0.52D, 0.0D, 0.0D, 0.0D, new int[0]);
                    break;
            }
        }
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (worldIn.isRemote)
            return true;
        else {
            TileEntity te = worldIn.getTileEntity(pos);

            if (te instanceof TileEntityStarcraftFurnace) {
                switch(this.type) {
                    case CHAR:
                        playerIn.openGui(Starcraft.instance, GuiHandler.CHAR_FURNACE, worldIn, pos.getX(), pos.getY(), pos.getZ());
                        break;
                    case SHAKURAS:
                        playerIn.openGui(Starcraft.instance, GuiHandler.SHAKURAS_FURNACE, worldIn, pos.getX(), pos.getY(), pos.getZ());
                        break;
                    case SLAYN:
                        playerIn.openGui(Starcraft.instance, GuiHandler.SLAYN_FURNACE, worldIn, pos.getX(), pos.getY(), pos.getZ());
                        break;
                }
                // TODO open gui
                playerIn.addStat(StatList.FURNACE_INTERACTION);
            }

            return true;
        }
    }

    public static void setState(boolean active, World worldIn, BlockPos pos) {
        IBlockState state = worldIn.getBlockState(pos);
        BlockStarcraftFurnace block = (BlockStarcraftFurnace) state.getBlock();
        TileEntity te = worldIn.getTileEntity(pos);
        keepInventory = true;

        if (active) {
            worldIn.setBlockState(pos, block.litBlock.getDefaultState().withProperty(FACING, state.getValue(FACING)), 3);
            worldIn.setBlockState(pos, block.litBlock.getDefaultState().withProperty(FACING, state.getValue(FACING)), 3);
        } else {
            worldIn.setBlockState(pos, block.normalBlock.getDefaultState().withProperty(FACING, state.getValue(FACING)), 3);
            worldIn.setBlockState(pos, block.normalBlock.getDefaultState().withProperty(FACING, state.getValue(FACING)), 3);
        }

        keepInventory = false;

        if (te != null) {
            te.validate();
            worldIn.setTileEntity(pos, te);
        }
    }

    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityBlockCharFurnace();
    }

    /**
     * Called by ItemBlocks just before a block is actually set in the world, to allow for adjustments to the IBlockstate
     */
    @Override
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY,
                                            float hitZ, int meta, EntityLivingBase placer) {
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }

    /**
     * Called by ItemBlocks after a block is set in the world, to allow post-place logic
     */
    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        worldIn.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing().getOpposite()), 2);

        if (stack.hasDisplayName()) {
            TileEntity tileentity = worldIn.getTileEntity(pos);

            if (tileentity instanceof TileEntityBlockCharFurnace) {
                ((TileEntityBlockCharFurnace) tileentity).setCustomInventoryName(stack.getDisplayName());
            }
        }
    }

    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
        if (!keepInventory) {
            TileEntity te = worldIn.getTileEntity(pos);

            if (te instanceof TileEntityStarcraftFurnace) {
                IItemHandler handler = te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
                for (int slot = 0; slot < handler.getSlots(); slot++)
                    InventoryHelper.spawnItemStack(worldIn, pos.getX(), pos.getY(), pos.getZ(), handler.getStackInSlot(slot));
                worldIn.updateComparatorOutputLevel(pos, this);
            }
        }

        super.breakBlock(worldIn, pos, state);
    }

    @Override
    public boolean hasComparatorInputOverride(IBlockState state) {
        return true;
    }

    @Override
    public int getComparatorInputOverride(IBlockState blockState, World worldIn, BlockPos pos) {
        return Utils.calculateRedstone(worldIn.getTileEntity(pos).getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null));
    }

    @Override
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
        return new ItemStack(BlockHandler.FURNACE_CHAR);
    }

    /**
     * The type of render function called. 3 for standard block models, 2 for TESR's, 1 for liquids, -1 is no render
     */
    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    @Override
    public IBlockState getStateFromMeta(int meta) {
        EnumFacing face = EnumFacing.getFront(meta);

        if (face.getAxis() == EnumFacing.Axis.Y)
            face = EnumFacing.NORTH;

        return this.getDefaultState().withProperty(FACING, face);
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    @Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumFacing) state.getValue(FACING)).getIndex();
    }

    /**
     * Returns the blockstate with the given rotation from the passed blockstate. If inapplicable, returns the passed blockstate.
     */
    @Override
    public IBlockState withRotation(IBlockState state, Rotation rot) {
        return state.withProperty(FACING, rot.rotate((EnumFacing) state.getValue(FACING)));
    }

    /**
     * Returns the blockstate with the given mirror of the passed blockstate. If inapplicable, returns the passed blockstate.
     */
    @Override
    public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
        return state.withRotation(mirrorIn.toRotation((EnumFacing) state.getValue(FACING)));
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{FACING});
    }
}
