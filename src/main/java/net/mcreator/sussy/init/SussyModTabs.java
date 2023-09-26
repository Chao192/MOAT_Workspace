
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sussy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.sussy.SussyMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SussyModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SussyMod.MODID);
	public static final RegistryObject<CreativeModeTab> VANILLA_ADDON = REGISTRY.register("vanilla_addon",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.sussy.vanilla_addon")).icon(() -> new ItemStack(SussyModItems.STAR_FRUIT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SussyModItems.GRUNGO.get());
				tabData.accept(SussyModItems.SNOWBALL_CANNON.get());
				tabData.accept(SussyModItems.STAR_FRUIT.get());
				tabData.accept(SussyModItems.MOON_FRUIT.get());
				tabData.accept(SussyModItems.COPPER_TOOLS_PICKAXE.get());
				tabData.accept(SussyModItems.COPPER_TOOLS_SWORD.get());
				tabData.accept(SussyModItems.COPPER_TOOLS_SHOVEL.get());
				tabData.accept(SussyModItems.COPPER_TOOLS_HOE.get());
				tabData.accept(SussyModItems.DRAGON_STAR.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ETHANS_MODS = REGISTRY.register("ethans_mods",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.sussy.ethans_mods")).icon(() -> new ItemStack(Blocks.AMETHYST_CLUSTER)).displayItems((parameters, tabData) -> {
				tabData.accept(SussyModItems.EMERALD_HAMMER_TOOL.get());
				tabData.accept(SussyModItems.DIAMOND_DUAL_GLAIVE.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(SussyModItems.EMERALD_ARMOR_ARMOR_HELMET.get());
			tabData.accept(SussyModItems.EMERALD_ARMOR_ARMOR_CHESTPLATE.get());
			tabData.accept(SussyModItems.EMERALD_ARMOR_ARMOR_LEGGINGS.get());
			tabData.accept(SussyModItems.EMERALD_ARMOR_ARMOR_BOOTS.get());
			tabData.accept(SussyModItems.COPPER_ARMOR_ARMOR_HELMET.get());
			tabData.accept(SussyModItems.COPPER_ARMOR_ARMOR_CHESTPLATE.get());
			tabData.accept(SussyModItems.COPPER_ARMOR_ARMOR_LEGGINGS.get());
			tabData.accept(SussyModItems.COPPER_ARMOR_ARMOR_BOOTS.get());
			tabData.accept(SussyModItems.DRAGON_SWORD.get());
			tabData.accept(SussyModItems.DRAGON_ARMOR_HELMET.get());
			tabData.accept(SussyModItems.DRAGON_ARMOR_CHESTPLATE.get());
			tabData.accept(SussyModItems.DRAGON_ARMOR_LEGGINGS.get());
			tabData.accept(SussyModItems.DRAGON_ARMOR_BOOTS.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(SussyModItems.CRIMSON_AMULET.get());
			tabData.accept(SussyModItems.COPPER_TOOLS_AXE.get());
			tabData.accept(SussyModItems.DRAGON_PICKAXE.get());
			tabData.accept(SussyModItems.DRAGON_AXE.get());
			tabData.accept(SussyModItems.DRAGON_SHOVEL.get());
			tabData.accept(SussyModItems.DRAGON_HOE.get());
		}
	}
}
