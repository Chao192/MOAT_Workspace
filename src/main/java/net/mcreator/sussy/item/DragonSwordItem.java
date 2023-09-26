
package net.mcreator.sussy.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.sussy.init.SussyModItems;

public class DragonSwordItem extends SwordItem {
	public DragonSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 4062;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 10f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 28;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SussyModItems.DRAGON_STAR.get()));
			}
		}, 3, -2.4f, new Item.Properties().fireResistant());
	}
}
