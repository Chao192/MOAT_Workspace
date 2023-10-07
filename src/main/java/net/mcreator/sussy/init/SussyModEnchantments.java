
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sussy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.sussy.enchantment.VampiricEnchantment;
import net.mcreator.sussy.enchantment.PullenchantEnchantment;
import net.mcreator.sussy.enchantment.HemorrageEnchantEnchantment;
import net.mcreator.sussy.enchantment.CriticalStrikeEnchantment;
import net.mcreator.sussy.enchantment.ButterFingersEnchantment;
import net.mcreator.sussy.SussyMod;

public class SussyModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, SussyMod.MODID);
	public static final RegistryObject<Enchantment> CRITICAL_STRIKE = REGISTRY.register("critical_strike", () -> new CriticalStrikeEnchantment());
	public static final RegistryObject<Enchantment> BUTTER_FINGERS = REGISTRY.register("butter_fingers", () -> new ButterFingersEnchantment());
	public static final RegistryObject<Enchantment> HEMORRAGE_ENCHANT = REGISTRY.register("hemorrage_enchant", () -> new HemorrageEnchantEnchantment());
	public static final RegistryObject<Enchantment> PULLENCHANT = REGISTRY.register("pullenchant", () -> new PullenchantEnchantment());
	public static final RegistryObject<Enchantment> VAMPIRIC = REGISTRY.register("vampiric", () -> new VampiricEnchantment());
}
