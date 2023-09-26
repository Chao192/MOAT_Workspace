
package net.mcreator.sussy.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

public class EmeraldHammerToolItem extends SwordItem {
	public EmeraldHammerToolItem() {
		super(new Tier() {
			public int getUses() {
				return 1562;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return 11f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -3.1f, new Item.Properties());
	}
}
