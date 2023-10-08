package net.mcreator.sussy.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class VampiricEnchantProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getSource(), event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(DamageSource damagesource, Entity sourceentity, double amount) {
		execute(null, damagesource, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, DamageSource damagesource, Entity sourceentity, double amount) {
		if (damagesource == null || sourceentity == null)
			return;
		double random = 0;
		double enchant_level = 0;
		if (EnchantmentHelper.getItemEnchantmentLevel(SussyModEnchantments.DELETED_MOD_ELEMENT.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
			enchant_level = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(SussyModEnchantments.DELETED_MOD_ELEMENT.get());
			random = Math.random() * 100;
			if (enchant_level == 1 && random <= 10 && damagesource.is(DamageTypes.PLAYER_ATTACK)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + amount * 0.2));
			}
			if (enchant_level == 2 && random <= 15 && damagesource.is(DamageTypes.PLAYER_ATTACK)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + amount * 0.25));
			}
			if (enchant_level == 3 && random <= 20 && damagesource.is(DamageTypes.PLAYER_ATTACK)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + amount * 0.3));
			}
		}
	}
}
