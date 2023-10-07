package net.mcreator.sussy.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.sussy.init.SussyModEnchantments;

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
		if (EnchantmentHelper.getItemEnchantmentLevel(SussyModEnchantments.VAMPIRIC.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
			enchant_level = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(SussyModEnchantments.VAMPIRIC.get());
			random = Math.random() * 100;
			if (enchant_level == 1 && random <= 5 && damagesource.is(DamageTypes.PLAYER_ATTACK)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + amount * 0.2));
			}
			if (enchant_level == 2 && random <= 10 && damagesource.is(DamageTypes.PLAYER_ATTACK)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + amount * 0.25));
			}
			if (enchant_level == 3 && random <= 15 && damagesource.is(DamageTypes.PLAYER_ATTACK)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + amount * 0.3));
			}
			if (enchant_level == 4 && random <= 20 && damagesource.is(DamageTypes.PLAYER_ATTACK)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + amount * 0.35));
			}
			if (enchant_level == 5 && random <= 25 && damagesource.is(DamageTypes.PLAYER_ATTACK)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + amount * 0.4));
			}
		}
	}
}
