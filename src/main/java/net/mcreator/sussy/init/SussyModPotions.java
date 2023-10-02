
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sussy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.sussy.SussyMod;

public class SussyModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, SussyMod.MODID);
	public static final RegistryObject<Potion> ROOBEER = REGISTRY.register("roobeer", () -> new Potion(new MobEffectInstance(SussyModMobEffects.ROOBEER_EFFECT.get(), 3600, 0, false, true)));
}
