
package net.mcreator.sussy.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class CopperToolsSwordItem extends SwordItem {
	public CopperToolsSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 5f;
			}

			public float getAttackDamageBonus() {
				return 1.5f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.COPPER_INGOT));
			}
		}, 3, -2.3f, new Item.Properties());
	}
}
