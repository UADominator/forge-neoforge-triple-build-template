package dev.dominator.template;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = Shared.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Client {

	@SubscribeEvent
	public static void onClientSetupEvent(FMLClientSetupEvent event) {
	}
}
