package dev.dominator.template.mixins;

import dev.dominator.template.Shared;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Level.class)
public class HelloSharedMixin {
	@Inject(method = "<init>", at = @At("RETURN"))
	private void sendHello(CallbackInfo ci) {
		Shared.LOGGER.info("Hello Shared Mixins");
	}
}
