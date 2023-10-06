
package net.mcreator.sussy.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class OmniHoeItem extends HoeItem {
	public OmniHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 69420;
			}

			public float getSpeed() {
				return 14f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 0, -3f, new Item.Properties().fireResistant());
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
