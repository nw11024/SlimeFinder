package com.zest.slimefinder;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlimeFinder implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("slimefinder");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}
