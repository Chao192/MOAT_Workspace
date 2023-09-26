package net.mcreator.sussy.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class NetherToOverworldProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		while (true) {
			entity.getPersistentData().putDouble("Overworldx", (entity.getPersistentData().getDouble("Netherx") / 8));
			entity.getPersistentData().putDouble("Overworldy", (entity.getPersistentData().getDouble("Nethery") + 0));
			entity.getPersistentData().putDouble("Overworldz", (entity.getPersistentData().getDouble("Netherz") / 8));
			break;
		}
	}
}
