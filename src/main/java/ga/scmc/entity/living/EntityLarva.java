package ga.scmc.entity.living;

import java.util.List;
import java.util.Random;

import ga.scmc.Starcraft;
import ga.scmc.client.gui.GuiLarvaMorph;
import ga.scmc.enums.EnumFactionTypes;
import ga.scmc.enums.EnumMetaItem;
import ga.scmc.enums.EnumTeamColors;
import ga.scmc.enums.EnumTypeAttributes;
import ga.scmc.handlers.BlockHandler;
import ga.scmc.handlers.GuiHandler;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.MetaBlockHandler;
import ga.scmc.handlers.SoundHandler;
import hypeirochus.api.world.entity.ItemDrop;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockWall;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ReportedException;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntityLarva extends EntityZergPassive {
	private int		fire;
	private int		nextStepDistance;
	private Random	random	= new Random();

	// Redo entity movement
	public EntityLarva(World world) {
		super(world);
		setSize(1.0F, .5F);
		this.setTeamColor(EnumTeamColors.PURPLE);
		this.setFactions(EnumFactionTypes.SWARM);
		setTypes(EnumTypeAttributes.LIGHT, EnumTypeAttributes.BIOLOGICAL, EnumTypeAttributes.GROUND);
	}

	protected void applyEntityAI() {
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(.19241212312);
		getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(20.0D);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return null;
	}

	@Override
	protected void dropFewItems(boolean recentlyHit, int looting) {
		ItemDrop drop = new ItemDrop(50, new ItemStack(ItemHandler.ZERG_CARAPACE, 1 + this.rand.nextInt(2), EnumMetaItem.CarapaceType.T1.getID()));
		drop.tryDrop(this);
	}

	@Override
	public boolean processInteract(EntityPlayer player, EnumHand hand, ItemStack stack) {
		boolean flag = stack != null && stack.getItem() == Items.SPAWN_EGG;

		if (!flag && this.isEntityAlive() && !this.isChild() && !player.isSneaking()) {
			if (this.world.isRemote) {
				GuiLarvaMorph.INSTANCE.openGUI(player, Starcraft.instance, GuiHandler.LARVA_MORPH_ID, world, (int) player.posX, (int) player.posY, (int) player.posZ, this);
			}
			return true;
		} else {
			return super.processInteract(player, hand, stack);
		}
	}

	@Override
	public SoundEvent getAmbientSound() {
		return SoundHandler.ENTITY_LARVA_LIVE1;
	}

	@Override
	public SoundEvent getDeathSound() {
		return SoundHandler.ENTITY_LARVA_DEATH;
	}

	@Override
	public SoundEvent getHurtSound() {
		return SoundHandler.ENTITY_LARVA_HURT;
	}

	@Override
	public int getTalkInterval() {
		return 160;
	}

	@Override
	protected void initEntityAI() {
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(4, new EntityAIAvoidEntity<EntityProtossMob>(this, EntityProtossMob.class, 16.0F, 1.0D, 1.0D));
		tasks.addTask(4, new EntityAIAvoidEntity<EntityTerranMob>(this, EntityTerranMob.class, 16.0F, 1.0D, 1.0D));
		tasks.addTask(4, new EntityAIAvoidEntity<EntityPlayer>(this, EntityPlayer.class, 16.0F, 1.0D, 1.0D));
		tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1));
		tasks.addTask(7, new EntityAIWander(this, 1));
		tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8));
		tasks.addTask(8, new EntityAILookIdle(this));
		applyEntityAI();
	}

	@Override
	public void move(double x, double y, double z) {
		if (noClip) {
			setEntityBoundingBox(getEntityBoundingBox().offset(x, y, z));
			resetPositionToBB();
		} else {
			world.theProfiler.startSection("move");
			double d0 = posX;
			double d1 = posY;
			double d2 = posZ;

			if (isInWeb) {
				isInWeb = false;
				x *= 0.25D;
				y *= 0.05000000074505806D;
				z *= 0.25D;
				motionX = 0;
				motionY = 0;
				motionZ = 0;
			}

			double d3 = x;
			double d4 = y;
			double d5 = z;
			boolean flag = onGround && isSneaking();

			if (flag) {
				for (; x != 0 && world.getCollisionBoxes(this, getEntityBoundingBox().offset(x, -1, 0)).isEmpty(); d3 = x) {
					if (x < 0.05D && x >= -0.05D) {
						x = 0;
					} else if (x > 0) {
						x -= 0.05D;
					} else {
						x += 0.05D;
					}
				}

				for (; z != 0 && world.getCollisionBoxes(this, getEntityBoundingBox().offset(0, -1, z)).isEmpty(); d5 = z) {
					if (z < 0.05D && z >= -0.05D) {
						z = 0;
					} else if (z > 0) {
						z -= 0.05D;
					} else {
						z += 0.05D;
					}
				}

				for (; x != 0 && z != 0 && world.getCollisionBoxes(this, getEntityBoundingBox().offset(x, -1, z)).isEmpty(); d5 = z) {
					if (x < 0.05D && x >= -0.05D) {
						x = 0;
					} else if (x > 0) {
						x -= 0.05D;
					} else {
						x += 0.05D;
					}

					d3 = x;

					if (z < 0.05D && z >= -0.05D) {
						z = 0;
					} else if (z > 0) {
						z -= 0.05D;
					} else {
						z += 0.05D;
					}
				}
			}

			List<AxisAlignedBB> list1 = world.getCollisionBoxes(this, getEntityBoundingBox().addCoord(x, y, z));
			AxisAlignedBB axisalignedbb = getEntityBoundingBox();
			int i = 0;

			for (int j = list1.size(); i < j; ++i) {
				y = list1.get(i).calculateYOffset(getEntityBoundingBox(), y);
			}

			setEntityBoundingBox(getEntityBoundingBox().offset(0, y, 0));
			boolean i_ = onGround || d4 != y && d4 < 0;
			int j4 = 0;

			for (int k = list1.size(); j4 < k; ++j4) {
				x = list1.get(j4).calculateXOffset(getEntityBoundingBox(), x);
			}

			setEntityBoundingBox(getEntityBoundingBox().offset(x, 0, 0));
			j4 = 0;

			for (int k4 = list1.size(); j4 < k4; ++j4) {
				z = list1.get(j4).calculateZOffset(getEntityBoundingBox(), z);
			}

			setEntityBoundingBox(getEntityBoundingBox().offset(0, 0, z));

			if (stepHeight > 0 && i_ && (d3 != x || d5 != z)) {
				double d11 = x;
				double d7 = y;
				double d8 = z;
				AxisAlignedBB axisalignedbb1 = getEntityBoundingBox();
				setEntityBoundingBox(axisalignedbb);
				y = stepHeight;
				List<AxisAlignedBB> list = world.getCollisionBoxes(this, getEntityBoundingBox().addCoord(d3, y, d5));
				AxisAlignedBB axisalignedbb2 = getEntityBoundingBox();
				AxisAlignedBB axisalignedbb3 = axisalignedbb2.addCoord(d3, 0, d5);
				double d9 = y;
				int l = 0;

				for (int i1 = list.size(); l < i1; ++l) {
					d9 = list.get(l).calculateYOffset(axisalignedbb3, d9);
				}

				axisalignedbb2 = axisalignedbb2.offset(0, d9, 0);
				double d15 = d3;
				int j1 = 0;

				for (int k1 = list.size(); j1 < k1; ++j1) {
					d15 = list.get(j1).calculateXOffset(axisalignedbb2, d15);
				}

				axisalignedbb2 = axisalignedbb2.offset(d15, 0, 0);
				double d16 = d5;
				int l1 = 0;

				for (int i2 = list.size(); l1 < i2; ++l1) {
					d16 = list.get(l1).calculateZOffset(axisalignedbb2, d16);
				}

				axisalignedbb2 = axisalignedbb2.offset(0, 0, d16);
				AxisAlignedBB axisalignedbb4 = getEntityBoundingBox();
				double d17 = y;
				int j2 = 0;

				for (int k2 = list.size(); j2 < k2; ++j2) {
					d17 = list.get(j2).calculateYOffset(axisalignedbb4, d17);
				}

				axisalignedbb4 = axisalignedbb4.offset(0, d17, 0);
				double d18 = d3;
				int l2 = 0;

				for (int i3 = list.size(); l2 < i3; ++l2) {
					d18 = list.get(l2).calculateXOffset(axisalignedbb4, d18);
				}

				axisalignedbb4 = axisalignedbb4.offset(d18, 0, 0);
				double d19 = d5;
				int j3 = 0;

				for (int k3 = list.size(); j3 < k3; ++j3) {
					d19 = list.get(j3).calculateZOffset(axisalignedbb4, d19);
				}

				axisalignedbb4 = axisalignedbb4.offset(0, 0, d19);
				double d20 = d15 * d15 + d16 * d16;
				double d10 = d18 * d18 + d19 * d19;

				if (d20 > d10) {
					x = d15;
					z = d16;
					y = -d9;
					setEntityBoundingBox(axisalignedbb2);
				} else {
					x = d18;
					z = d19;
					y = -d17;
					setEntityBoundingBox(axisalignedbb4);
				}

				int l3 = 0;

				for (int i4 = list.size(); l3 < i4; ++l3) {
					y = list.get(l3).calculateYOffset(getEntityBoundingBox(), y);
				}

				setEntityBoundingBox(getEntityBoundingBox().offset(0, y, 0));

				if (d11 * d11 + d8 * d8 >= x * x + z * z) {
					x = d11;
					y = d7;
					z = d8;
					setEntityBoundingBox(axisalignedbb1);
				}
			}

			world.theProfiler.endSection();
			world.theProfiler.startSection("rest");
			resetPositionToBB();
			isCollidedHorizontally = d3 != x || d5 != z;
			isCollidedVertically = d4 != y;
			onGround = isCollidedVertically && d4 < 0;
			isCollided = isCollidedHorizontally || isCollidedVertically;
			j4 = MathHelper.floor(posX);
			int l4 = MathHelper.floor(posY - 0.20000000298023224D);
			int i5 = MathHelper.floor(posZ);
			BlockPos blockpos = new BlockPos(j4, l4, i5);
			IBlockState iblockstate = world.getBlockState(blockpos);

			if (iblockstate.getMaterial() == Material.AIR) {
				BlockPos blockpos1 = blockpos.down();
				IBlockState iblockstate1 = world.getBlockState(blockpos1);
				Block block1 = iblockstate1.getBlock();

				if (block1 instanceof BlockFence || block1 instanceof BlockWall || block1 instanceof BlockFenceGate) {
					iblockstate = iblockstate1;
					blockpos = blockpos1;
				}
			}

			updateFallState(y, onGround, iblockstate, blockpos);

			if (d3 != x) {
				motionX = 0;
			}

			if (d5 != z) {
				motionZ = 0;
			}

			Block block = iblockstate.getBlock();

			if (d4 != y) {
				block.onLanded(world, this);
			}

			if (canTriggerWalking() && !flag && !isRiding()) {
				double d12 = posX - d0;
				double d13 = posY - d1;
				double d14 = posZ - d2;

				if (block != Blocks.LADDER) {
					d13 = 0;
				}

				if (block == BlockHandler.ZERG_CREEP || block == Blocks.AIR || block == BlockHandler.KERATIN_CHUNK || block == MetaBlockHandler.ZERG_CARAPACE_BLOCK || block == MetaBlockHandler.ZERG_FLESH) {

				} else {
					kill();
				}

				if (block != null && onGround) {
					block.onEntityWalk(world, blockpos, this);
				}

				distanceWalkedModified = (float) (distanceWalkedModified + MathHelper.sqrt(d12 * d12 + d14 * d14) * 0.6D);
				distanceWalkedOnStepModified = (float) (distanceWalkedOnStepModified + MathHelper.sqrt(d12 * d12 + d13 * d13 + d14 * d14) * 0.6D);

				if (distanceWalkedOnStepModified > nextStepDistance && iblockstate.getMaterial() != Material.AIR) {
					nextStepDistance = (int) distanceWalkedOnStepModified + 1;

					if (isInWater()) {
						float f = MathHelper.sqrt(motionX * motionX * 0.20000000298023224D + motionY * motionY + motionZ * motionZ * 0.20000000298023224D) * 0.35F;

						if (f > 1) {
							f = 1;
						}

						playSound(getSwimSound(), f, 1 + (rand.nextFloat() - rand.nextFloat()) * 0.4F);
					}

					playStepSound(blockpos, block);
				}
			}

			try {
				doBlockCollisions();
			} catch (Throwable throwable) {
				CrashReport crashreport = CrashReport.makeCrashReport(throwable, "Checking entity block collision");
				CrashReportCategory crashreportcategory = crashreport.makeCategory("Entity being checked for collision");
				addEntityCrashInfo(crashreportcategory);
				throw new ReportedException(crashreport);
			}

			boolean flag1 = isWet();

			if (world.isFlammableWithin(getEntityBoundingBox().contract(0.001D))) {
				dealFireDamage(1);

				if (!flag1) {
					++fire;

					if (fire == 0) {
						setFire(8);
					}
				}
			} else if (fire <= 0) {
				fire = -fireResistance;
			}

			if (flag1 && fire > 0) {
				playSound(SoundEvents.ENTITY_GENERIC_EXTINGUISH_FIRE, 0.7F, 1.6F + (rand.nextFloat() - rand.nextFloat()) * 0.4F);
				fire = -fireResistance;
			}

			world.theProfiler.endSection();
		}
	}
}