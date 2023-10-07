
package net.mcreator.sussy.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.sussy.init.SussyModEnchantments;

import java.util.List;

public class VampiricEnchantment extends Enchantment {
	public VampiricEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return this != ench && !List.of(Enchantments.MENDING, SussyModEnchantments.HEMORRAGE_ENCHANT.get(), Enchantments.FIRE_ASPECT).contains(ench);
	}
}
