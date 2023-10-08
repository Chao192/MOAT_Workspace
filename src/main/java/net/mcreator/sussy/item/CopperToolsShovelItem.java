
package net.mcreator.sussy.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class CopperToolsShovelItem extends ShovelItem {
	public CopperToolsShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 190;
			}

			public float getSpeed() {
				return 5.5f;
			}

			public float getAttackDamageBonus() {
				return -0.5f;
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
		}, 1, -3f, new Item.Properties());
	}
}
