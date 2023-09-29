package net.mcreator.sussy.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FireWandPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ItemStack emeralds = ItemStack.EMPTY;
		ItemStack tool = ItemStack.EMPTY;
		ItemStack pickaxe = ItemStack.EMPTY;
		double enchant_levels = 0;
		double EnchtSize = 0;
		double i = 0;
		double j = 0;
		double k = 0;
		{
			Entity _shootFrom = entity;
			Level projectileLevel = _shootFrom.level();
			if (!projectileLevel.isClientSide()) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getFireball(Level level, Entity shooter, double ax, double ay, double az) {
						AbstractHurtingProjectile entityToSpawn = new LargeFireball(EntityType.FIREBALL, level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.xPower = ax;
						entityToSpawn.yPower = ay;
						entityToSpawn.zPower = az;
						return entityToSpawn;
					}
				}.getFireball(projectileLevel, entity, (entity.getLookAngle().x / 10), (entity.getLookAngle().y / 10), (entity.getLookAngle().z / 10));
				_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
				_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 100);
	}
}
