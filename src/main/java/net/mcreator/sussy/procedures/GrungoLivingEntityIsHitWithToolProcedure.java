package net.mcreator.sussy.procedures;

import net.minecraft.world.entity.Entity;

public class GrungoLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(3);
	}
}
