package dev.dominator.template.mixins;

import dev.dominator.template.Shared;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class HelloServerMixin {
	@Inject(method = "<init>", at = @At("RETURN"))
	private void sendHello(CallbackInfo ci) {
		Shared.LOGGER.info("Hello Server Mixins");
	}
}
