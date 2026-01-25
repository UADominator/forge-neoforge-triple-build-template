package dev.dominator.template;

import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Mod(Shared.MODID)
public class Shared {
	public static final String MODID = "template";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);


	public Shared() {
		LOGGER.info(MODID + " - loaded");
	}
}
