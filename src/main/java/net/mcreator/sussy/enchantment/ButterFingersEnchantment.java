
package net.mcreator.sussy.enchantment;

public class ButterFingersEnchantment extends Enchantment {

	public ButterFingersEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public boolean isCurse() {
		return true;
	}

}
