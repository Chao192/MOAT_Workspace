package net.mcreator.sussy.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.sussy.init.SussyModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PullProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(SussyModEnchantments.PULLENCHANT.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
			entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(sourceentity.getYRot() + 180)) * 2 * (-1)), ((Math.sin(Math.toRadians(0 - sourceentity.getXRot())) + 0.5) * 1.5), (Math.cos(Math.toRadians(sourceentity.getYRot())) * 2 * (-1))));
		}
	}
}
