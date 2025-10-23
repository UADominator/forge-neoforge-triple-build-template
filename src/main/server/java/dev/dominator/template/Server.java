package dev.dominator.template;

import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Shared.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class Server {

	@SubscribeEvent
	public static void onServerStartingEvent(ServerStartingEvent event) {
	}

}
