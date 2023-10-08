
package net.mcreator.sussy.command;

@Mod.EventBusSubscriber
public class GmCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("gmc").requires(s -> s.hasPermission(4))

		);
	}

}
