
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sussy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.sussy.SussyMod;

public class SussyModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, SussyMod.MODID);
	public static final RegistryObject<SoundEvent> HOLOGRAMAUDIO = REGISTRY.register("hologramaudio", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sussy", "hologramaudio")));
	public static final RegistryObject<SoundEvent> BAKAMITAI = REGISTRY.register("bakamitai", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sussy", "bakamitai")));
}
