
package net.mcreator.sussy.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class HologramItem extends RecordItem {
	public HologramItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sussy:hologramaudio")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 820);
	}
}
