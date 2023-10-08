
package net.mcreator.sussy.enchantment;

public class VampiricEnchantment extends Enchantment {

	public VampiricEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return this != ench && !List.of(Enchantments.MENDING, SussyModEnchantments.HEMORRAGE_ENCHANT.get(), Enchantments.FIRE_ASPECT).contains(ench);
	}

}
