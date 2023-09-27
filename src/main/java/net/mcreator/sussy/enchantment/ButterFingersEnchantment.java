
package net.mcreator.sussy.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;

public class ButterFingersEnchantment extends Enchantment {
	public ButterFingersEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public boolean isCurse() {
		return true;
	}
}
