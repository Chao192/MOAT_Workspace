
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sussy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.sussy.world.features.ores.DragonStoneOreFeature;
import net.mcreator.sussy.SussyMod;

@Mod.EventBusSubscriber
public class SussyModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, SussyMod.MODID);
	public static final RegistryObject<Feature<?>> DRAGON_STONE_ORE = REGISTRY.register("dragon_stone_ore", DragonStoneOreFeature::new);
}
