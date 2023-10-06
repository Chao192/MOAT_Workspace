
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.sussy.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SussyModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.CLERIC) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10),

					new ItemStack(SussyModItems.RINGOF_LUCK.get()), 3, 8, 0.5f));
		}
	}
}
