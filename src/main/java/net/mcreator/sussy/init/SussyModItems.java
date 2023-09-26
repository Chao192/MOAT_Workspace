
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sussy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.sussy.item.StarFruitItem;
import net.mcreator.sussy.item.SnowballCannonItem;
import net.mcreator.sussy.item.NetheritedualglaiveItem;
import net.mcreator.sussy.item.MoonFruitItem;
import net.mcreator.sussy.item.GrungoItem;
import net.mcreator.sussy.item.Emerald_ArmorArmorItem;
import net.mcreator.sussy.item.EmeraldHammerToolItem;
import net.mcreator.sussy.item.DragonSwordItem;
import net.mcreator.sussy.item.DragonStoneIngotItem;
import net.mcreator.sussy.item.DragonStarItem;
import net.mcreator.sussy.item.DragonShovelItem;
import net.mcreator.sussy.item.DragonPickaxeItem;
import net.mcreator.sussy.item.DragonHoeItem;
import net.mcreator.sussy.item.DragonDualGlaiveItem;
import net.mcreator.sussy.item.DragonAxeItem;
import net.mcreator.sussy.item.DragonArmorItem;
import net.mcreator.sussy.item.DiamondDualGlaiveItem;
import net.mcreator.sussy.item.CrimsonAmuletItem;
import net.mcreator.sussy.item.CopperToolsSwordItem;
import net.mcreator.sussy.item.CopperToolsShovelItem;
import net.mcreator.sussy.item.CopperToolsPickaxeItem;
import net.mcreator.sussy.item.CopperToolsHoeItem;
import net.mcreator.sussy.item.CopperToolsAxeItem;
import net.mcreator.sussy.item.CopperArmorArmorItem;
import net.mcreator.sussy.SussyMod;

public class SussyModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SussyMod.MODID);
	public static final RegistryObject<Item> GRUNGO = REGISTRY.register("grungo", () -> new GrungoItem());
	public static final RegistryObject<Item> CRIMSON_AMULET = REGISTRY.register("crimson_amulet", () -> new CrimsonAmuletItem());
	public static final RegistryObject<Item> SNOWBALL_CANNON = REGISTRY.register("snowball_cannon", () -> new SnowballCannonItem());
	public static final RegistryObject<Item> STAR_FRUIT = REGISTRY.register("star_fruit", () -> new StarFruitItem());
	public static final RegistryObject<Item> MOON_FRUIT = REGISTRY.register("moon_fruit", () -> new MoonFruitItem());
	public static final RegistryObject<Item> COPPER_TOOLS_PICKAXE = REGISTRY.register("copper_tools_pickaxe", () -> new CopperToolsPickaxeItem());
	public static final RegistryObject<Item> COPPER_TOOLS_AXE = REGISTRY.register("copper_tools_axe", () -> new CopperToolsAxeItem());
	public static final RegistryObject<Item> COPPER_TOOLS_SWORD = REGISTRY.register("copper_tools_sword", () -> new CopperToolsSwordItem());
	public static final RegistryObject<Item> COPPER_TOOLS_SHOVEL = REGISTRY.register("copper_tools_shovel", () -> new CopperToolsShovelItem());
	public static final RegistryObject<Item> COPPER_TOOLS_HOE = REGISTRY.register("copper_tools_hoe", () -> new CopperToolsHoeItem());
	public static final RegistryObject<Item> EMERALD_ARMOR_ARMOR_HELMET = REGISTRY.register("emerald_armor_armor_helmet", () -> new Emerald_ArmorArmorItem.Helmet());
	public static final RegistryObject<Item> EMERALD_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("emerald_armor_armor_chestplate", () -> new Emerald_ArmorArmorItem.Chestplate());
	public static final RegistryObject<Item> EMERALD_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("emerald_armor_armor_leggings", () -> new Emerald_ArmorArmorItem.Leggings());
	public static final RegistryObject<Item> EMERALD_ARMOR_ARMOR_BOOTS = REGISTRY.register("emerald_armor_armor_boots", () -> new Emerald_ArmorArmorItem.Boots());
	public static final RegistryObject<Item> DRAGON_STAR = REGISTRY.register("dragon_star", () -> new DragonStarItem());
	public static final RegistryObject<Item> COPPER_ARMOR_ARMOR_HELMET = REGISTRY.register("copper_armor_armor_helmet", () -> new CopperArmorArmorItem.Helmet());
	public static final RegistryObject<Item> COPPER_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("copper_armor_armor_chestplate", () -> new CopperArmorArmorItem.Chestplate());
	public static final RegistryObject<Item> COPPER_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("copper_armor_armor_leggings", () -> new CopperArmorArmorItem.Leggings());
	public static final RegistryObject<Item> COPPER_ARMOR_ARMOR_BOOTS = REGISTRY.register("copper_armor_armor_boots", () -> new CopperArmorArmorItem.Boots());
	public static final RegistryObject<Item> DRAGON_PICKAXE = REGISTRY.register("dragon_pickaxe", () -> new DragonPickaxeItem());
	public static final RegistryObject<Item> DRAGON_AXE = REGISTRY.register("dragon_axe", () -> new DragonAxeItem());
	public static final RegistryObject<Item> DRAGON_SWORD = REGISTRY.register("dragon_sword", () -> new DragonSwordItem());
	public static final RegistryObject<Item> DRAGON_SHOVEL = REGISTRY.register("dragon_shovel", () -> new DragonShovelItem());
	public static final RegistryObject<Item> DRAGON_HOE = REGISTRY.register("dragon_hoe", () -> new DragonHoeItem());
	public static final RegistryObject<Item> DRAGON_ARMOR_HELMET = REGISTRY.register("dragon_armor_helmet", () -> new DragonArmorItem.Helmet());
	public static final RegistryObject<Item> DRAGON_ARMOR_CHESTPLATE = REGISTRY.register("dragon_armor_chestplate", () -> new DragonArmorItem.Chestplate());
	public static final RegistryObject<Item> DRAGON_ARMOR_LEGGINGS = REGISTRY.register("dragon_armor_leggings", () -> new DragonArmorItem.Leggings());
	public static final RegistryObject<Item> DRAGON_ARMOR_BOOTS = REGISTRY.register("dragon_armor_boots", () -> new DragonArmorItem.Boots());
	public static final RegistryObject<Item> EMERALD_HAMMER_TOOL = REGISTRY.register("emerald_hammer_tool", () -> new EmeraldHammerToolItem());
	public static final RegistryObject<Item> DIAMOND_DUAL_GLAIVE = REGISTRY.register("diamond_dual_glaive", () -> new DiamondDualGlaiveItem());
	public static final RegistryObject<Item> DRAGON_DUAL_GLAIVE = REGISTRY.register("dragon_dual_glaive", () -> new DragonDualGlaiveItem());
	public static final RegistryObject<Item> NETHERITEDUALGLAIVE = REGISTRY.register("netheritedualglaive", () -> new NetheritedualglaiveItem());
	public static final RegistryObject<Item> DRAGON_STONE_BLOCK = block(SussyModBlocks.DRAGON_STONE_BLOCK);
	public static final RegistryObject<Item> DRAGON_STONE_ORE = block(SussyModBlocks.DRAGON_STONE_ORE);
	public static final RegistryObject<Item> DRAGON_STONE_INGOT = REGISTRY.register("dragon_stone_ingot", () -> new DragonStoneIngotItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
