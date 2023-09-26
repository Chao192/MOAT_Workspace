package net.mcreator.sussy.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class OverWorldToNetherProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		while (true) {
			entity.getPersistentData().putDouble("Netherx", (entity.getPersistentData().getDouble("Overworldx") * 8));
			entity.getPersistentData().putDouble("Nethery", (entity.getPersistentData().getDouble("Overworldy") + 0));
			entity.getPersistentData().putDouble("Netherz", (entity.getPersistentData().getDouble("Overworldz") * 8));
			break;
		}
	}
}
