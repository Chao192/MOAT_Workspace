
package net.mcreator.sussy.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class ButterItem extends Item {
	public ButterItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.5f).alwaysEat().build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Almost Useless"));
	}
}