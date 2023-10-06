package net.mcreator.sussy.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PullProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getSource(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(DamageSource damagesource, Entity entity, Entity sourceentity) {
		execute(null, damagesource, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, DamageSource damagesource, Entity entity, Entity sourceentity) {
		if (damagesource == null || entity == null || sourceentity == null)
			return;
		if ((EnchantmentHelper.getItemEnchantmentLevel(SussyModEnchantments.PULLENCHANT.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
				|| EnchantmentHelper.getItemEnchantmentLevel(SussyModEnchantments.PULLENCHANT.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) != 0) && damagesource.is(DamageTypes.ARROW)) {
			entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(sourceentity.getYRot() + 180)) * 2 * (-1)), ((Math.sin(Math.toRadians(0 - sourceentity.getXRot())) + 0.5) * 1.5), (Math.cos(Math.toRadians(sourceentity.getYRot())) * 2 * (-1))));
		}
	}
}
