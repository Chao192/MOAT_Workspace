package net.mcreator.sussy.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CriticalstrikeprocedureProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity, double amount) {
		execute(null, world, entity, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity, double amount) {
		if (entity == null || sourceentity == null)
			return;
		double enchant_level = 0;
		double random = 0;
		enchant_level = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(SussyModEnchantments.CRITICAL_STRIKE.get());
		random = Math.random() * 100;
		if (enchant_level == 1 && random <= 5) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_ATTACK)), (float) (amount * 2));
		}
		if (enchant_level == 2 && random <= 10) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_ATTACK)), (float) (amount * 2));
		}
		if (enchant_level == 3 && random <= 15) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_ATTACK)), (float) (amount * 2));
		}
		if (enchant_level == 4 && random <= 20) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_ATTACK)), (float) (amount * 2));
		}
		if (enchant_level == 5 && random <= 25) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_ATTACK)), (float) (amount * 2));
		}
	}
}
