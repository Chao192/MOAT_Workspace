
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sussy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.sussy.SussyMod;

public class SussyModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, SussyMod.MODID);
	public static final RegistryObject<PaintingVariant> SUSSY_MAN = REGISTRY.register("sussy_man", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> SHADOW_WIZARD_MONEY_GANG = REGISTRY.register("shadow_wizard_money_gang", () -> new PaintingVariant(64, 32));
	public static final RegistryObject<PaintingVariant> BADDY = REGISTRY.register("baddy", () -> new PaintingVariant(16, 32));
	public static final RegistryObject<PaintingVariant> THICC = REGISTRY.register("thicc", () -> new PaintingVariant(16, 16));
}