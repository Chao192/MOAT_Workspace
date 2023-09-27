package net.mcreator.sussy.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.sussy.init.SussyModItems;
import net.mcreator.sussy.init.SussyModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ButterFingerEnchantProcedure {
	@SubscribeEvent
	public static void onUseItemStart(LivingEntityUseItemEvent.Start event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getItem());
		}
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double grumb = 0;
		if (EnchantmentHelper.getItemEnchantmentLevel(SussyModEnchantments.BUTTER_FINGERS.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
			grumb = Math.random() * 100;
			if (grumb == 1) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = itemstack;
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(SussyModItems.BUTTER.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
		}
	}
}
