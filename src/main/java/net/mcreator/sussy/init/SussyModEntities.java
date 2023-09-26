
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sussy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.sussy.entity.SnowballCannonEntity;
import net.mcreator.sussy.SussyMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SussyModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SussyMod.MODID);
	public static final RegistryObject<EntityType<SnowballCannonEntity>> SNOWBALL_CANNON = register("projectile_snowball_cannon",
			EntityType.Builder.<SnowballCannonEntity>of(SnowballCannonEntity::new, MobCategory.MISC).setCustomClientFactory(SnowballCannonEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
