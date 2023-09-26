
package net.mcreator.sussy.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DragonStarItem extends Item {
	public DragonStarItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}
}
