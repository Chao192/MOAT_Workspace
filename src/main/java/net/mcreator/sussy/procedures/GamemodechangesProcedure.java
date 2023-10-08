package net.mcreator.sussy.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class GamemodechangesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _player)
			_player.setGameMode(GameType.CREATIVE);
	}
}
