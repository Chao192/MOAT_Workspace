
package net.mcreator.sussy.enchantment;

public class CriticalStrikeEnchantment extends Enchantment {

	public CriticalStrikeEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return this != ench && !List.of(Enchantments.SWEEPING_EDGE).contains(ench);
	}

}
