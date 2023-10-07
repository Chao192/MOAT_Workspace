
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sussy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.sussy.SussyMod;

public class SussyModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SussyMod.MODID);
	public static final RegistryObject<CreativeModeTab> ETHANS_MODS = REGISTRY.register("ethans_mods",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.sussy.ethans_mods")).icon(() -> new ItemStack(Blocks.AMETHYST_CLUSTER)).displayItems((parameters, tabData) -> {
				tabData.accept(SussyModItems.EMERALD_HAMMER_TOOL.get());
				tabData.accept(SussyModItems.DIAMOND_DUAL_GLAIVE.get());
				tabData.accept(SussyModItems.DRAGON_DUAL_GLAIVE.get());
				tabData.accept(SussyModItems.NETHERITEDUALGLAIVE.get());
				tabData.accept(SussyModItems.CLAYMOREWEAPONTOOL.get());
				tabData.accept(SussyModItems.NETHERITECLAYMORETOOL.get());
				tabData.accept(SussyModItems.DRAGONCLAYMORETOOL.get());
				tabData.accept(SussyModItems.HOLOGRAM.get());
				tabData.accept(SussyModItems.DIAMONDDAGGER.get());
				tabData.accept(SussyModItems.NETHERITEDAGGER.get());
				tabData.accept(SussyModItems.DRAGONDAGGER.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> MOAT = REGISTRY.register("moat",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.sussy.moat")).icon(() -> new ItemStack(SussyModItems.DRAGON_SWORD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SussyModItems.GRUNGO.get());
				tabData.accept(SussyModItems.CRIMSON_AMULET.get());
				tabData.accept(SussyModItems.SNOWBALL_CANNON.get());
				tabData.accept(SussyModItems.STAR_FRUIT.get());
				tabData.accept(SussyModItems.MOON_FRUIT.get());
				tabData.accept(SussyModItems.COPPER_TOOLS_PICKAXE.get());
				tabData.accept(SussyModItems.COPPER_TOOLS_AXE.get());
				tabData.accept(SussyModItems.COPPER_TOOLS_SWORD.get());
				tabData.accept(SussyModItems.COPPER_TOOLS_SHOVEL.get());
				tabData.accept(SussyModItems.COPPER_TOOLS_HOE.get());
				tabData.accept(SussyModItems.EMERALD_ARMOR_ARMOR_HELMET.get());
				tabData.accept(SussyModItems.EMERALD_ARMOR_ARMOR_CHESTPLATE.get());
				tabData.accept(SussyModItems.EMERALD_ARMOR_ARMOR_LEGGINGS.get());
				tabData.accept(SussyModItems.EMERALD_ARMOR_ARMOR_BOOTS.get());
				tabData.accept(SussyModItems.DRAGON_STAR.get());
				tabData.accept(SussyModItems.COPPER_ARMOR_ARMOR_HELMET.get());
				tabData.accept(SussyModItems.COPPER_ARMOR_ARMOR_CHESTPLATE.get());
				tabData.accept(SussyModItems.COPPER_ARMOR_ARMOR_LEGGINGS.get());
				tabData.accept(SussyModItems.COPPER_ARMOR_ARMOR_BOOTS.get());
				tabData.accept(SussyModItems.DRAGON_PICKAXE.get());
				tabData.accept(SussyModItems.DRAGON_AXE.get());
				tabData.accept(SussyModItems.DRAGON_SWORD.get());
				tabData.accept(SussyModItems.DRAGON_SHOVEL.get());
				tabData.accept(SussyModItems.DRAGON_HOE.get());
				tabData.accept(SussyModItems.DRAGON_ARMOR_HELMET.get());
				tabData.accept(SussyModItems.DRAGON_ARMOR_CHESTPLATE.get());
				tabData.accept(SussyModItems.DRAGON_ARMOR_LEGGINGS.get());
				tabData.accept(SussyModItems.DRAGON_ARMOR_BOOTS.get());
				tabData.accept(SussyModBlocks.DRAGON_STONE_ORE.get().asItem());
				tabData.accept(SussyModItems.DRAGON_INGOT.get());
				tabData.accept(SussyModBlocks.RAW_DRAGON_STONE.get().asItem());
				tabData.accept(SussyModBlocks.DRAGON_STONE_BLOCK.get().asItem());
				tabData.accept(SussyModItems.DRAGON_STONE_INGOT.get());
				tabData.accept(SussyModItems.BUTTER.get());
				tabData.accept(SussyModItems.UNIVERSAL_RESPAWN_ANCHOR.get());
				tabData.accept(SussyModItems.RINGOF_LUCK.get());
				tabData.accept(SussyModItems.FIRE_WAND.get());
				tabData.accept(SussyModItems.BAKA_MITAI.get());
				tabData.accept(SussyModItems.OMNI_TOOL.get());
				tabData.accept(SussyModItems.OMNI_HOE.get());
				tabData.accept(SussyModItems.THAT_ONE_RING.get());
			}).withSearchBar().build());
}
