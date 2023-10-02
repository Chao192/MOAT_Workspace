
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sussy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.sussy.potion.ROOBEEREffectMobEffect;
import net.mcreator.sussy.SussyMod;

public class SussyModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, SussyMod.MODID);
	public static final RegistryObject<MobEffect> ROOBEER_EFFECT = REGISTRY.register("roobeer_effect", () -> new ROOBEEREffectMobEffect());
}
