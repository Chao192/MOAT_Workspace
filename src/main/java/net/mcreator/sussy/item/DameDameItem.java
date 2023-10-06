
package net.mcreator.sussy.item;

import net.minecraft.network.chat.Component;

public class DameDameItem extends RecordItem {

	public DameDameItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sussy:bakamitai")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5800);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("I've been a fool..."));
	}

}
