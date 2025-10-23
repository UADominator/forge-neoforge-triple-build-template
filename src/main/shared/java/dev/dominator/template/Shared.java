package dev.dominator.template;

import net.minecraftforge.fml.common.Mod;

import java.util.logging.Logger;

@Mod(Shared.MODID)
public class Shared {
	public static final String MODID = "template";
	public static final Logger LOGGER = Logger.getLogger(MODID);


	public Shared() {
		LOGGER.info(MODID + " - loaded");
	}
}
