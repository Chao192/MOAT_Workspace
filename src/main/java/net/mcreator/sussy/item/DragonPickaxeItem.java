
package net.mcreator.sussy.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.sussy.init.SussyModItems;

public class DragonPickaxeItem extends PickaxeItem {
	public DragonPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 4062;
			}

			public float getSpeed() {
				return 13f;
			}

			public float getAttackDamageBonus() {
				return 2f;
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
		}, 1, -3f, new Item.Properties().fireResistant());
	}
}
