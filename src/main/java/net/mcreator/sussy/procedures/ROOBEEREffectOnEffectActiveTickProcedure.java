package net.mcreator.sussy.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ROOBEEREffectOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.causeFoodExhaustion((float) 0.1);
		entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), -1);
	}
}
