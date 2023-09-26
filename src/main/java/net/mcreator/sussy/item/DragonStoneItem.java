
package net.mcreator.sussy.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DragonStoneItem extends Item {
	public DragonStoneItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
