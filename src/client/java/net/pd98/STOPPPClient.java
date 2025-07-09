package net.pd98;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.Toml4jConfigSerializer;
import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class STOPPPClient implements ClientModInitializer {

	public static final String MOD_ID = "stoppp";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitializeClient() {
		LOGGER.info("Reporting for duty!");
		AutoConfig.register(STOPPPConfig.class, Toml4jConfigSerializer::new);
	}
}