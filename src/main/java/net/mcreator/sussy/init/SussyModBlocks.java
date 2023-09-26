
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sussy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.sussy.block.RawDragonStoneBlock;
import net.mcreator.sussy.block.DragonStoneOreBlock;
import net.mcreator.sussy.block.DragonStoneBlockBlock;
import net.mcreator.sussy.SussyMod;

public class SussyModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SussyMod.MODID);
	public static final RegistryObject<Block> DRAGON_STONE_BLOCK = REGISTRY.register("dragon_stone_block", () -> new DragonStoneBlockBlock());
	public static final RegistryObject<Block> DRAGON_STONE_ORE = REGISTRY.register("dragon_stone_ore", () -> new DragonStoneOreBlock());
	public static final RegistryObject<Block> RAW_DRAGON_STONE = REGISTRY.register("raw_dragon_stone", () -> new RawDragonStoneBlock());
}
