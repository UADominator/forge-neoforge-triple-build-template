package dev.dominator.template.mixins;

import dev.dominator.template.Shared;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class HelloClientMixin {
	@Inject(method = "<init>", at = @At("RETURN"))
	private void sendHello(CallbackInfo ci) {
		Shared.LOGGER.info("Hello Client Mixins");
	}
}
