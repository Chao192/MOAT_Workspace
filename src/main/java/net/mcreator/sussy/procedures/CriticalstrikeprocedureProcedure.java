package net.mcreator.sussy.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import net.mcreator.sussy.init.SussyModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CriticalstrikeprocedureProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getSource(), event.getEntity(), event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, DamageSource damagesource, Entity entity, Entity sourceentity, double amount) {
		execute(null, world, damagesource, entity, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, DamageSource damagesource, Entity entity, Entity sourceentity, double amount) {
		if (damagesource == null || entity == null || sourceentity == null)
			return;
		double enchant_level = 0;
		double random = 0;
		if (EnchantmentHelper.getItemEnchantmentLevel(SussyModEnchantments.CRITICAL_STRIKE.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
			enchant_level = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(SussyModEnchantments.CRITICAL_STRIKE.get());
			random = Math.random() * 100;
			if (enchant_level == 1 && random <= 5 && damagesource.is(DamageTypes.PLAYER_ATTACK)) {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_ATTACK)), (float) (amount * 2));
			}
			if (enchant_level == 2 && random <= 10 && damagesource.is(DamageTypes.PLAYER_ATTACK)) {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_ATTACK)), (float) (amount * 2));
			}
			if (enchant_level == 3 && random <= 15 && damagesource.is(DamageTypes.PLAYER_ATTACK)) {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_ATTACK)), (float) (amount * 2));
			}
			if (enchant_level == 4 && random <= 20 && damagesource.is(DamageTypes.PLAYER_ATTACK)) {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_ATTACK)), (float) (amount * 2));
			}
			if (enchant_level == 5 && random <= 25 && damagesource.is(DamageTypes.PLAYER_ATTACK)) {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_ATTACK)), (float) (amount * 2));
			}
		}
	}
}
