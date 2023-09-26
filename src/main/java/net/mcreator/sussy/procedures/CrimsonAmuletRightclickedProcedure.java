package net.mcreator.sussy.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.sussy.SussyMod;

public class CrimsonAmuletRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean Overworld_dimension = false;
		boolean ggg = false;
		world.setBlock(BlockPos.containing(x, y, z), Blocks.NETHER_PORTAL.defaultBlockState(), 3);
		SussyMod.queueServerWork(200, () -> {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		});
	}
}
