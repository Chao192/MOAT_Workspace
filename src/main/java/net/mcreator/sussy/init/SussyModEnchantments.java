
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sussy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.sussy.enchantment.ButterFingersEnchantment;
import net.mcreator.sussy.SussyMod;

public class SussyModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, SussyMod.MODID);
	public static final RegistryObject<Enchantment> BUTTER_FINGERS = REGISTRY.register("butter_fingers", () -> new ButterFingersEnchantment());
}
