package net.mcreator.sussy.procedures;

import net.minecraftforge.eventbus.api.Event;

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
		if (EnchantmentHelper.getItemEnchantmentLevel(SussyModEnchantments.DELETED_MOD_ELEMENT.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
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
