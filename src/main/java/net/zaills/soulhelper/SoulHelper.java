package net.zaills.soulhelper;

import net.fabricmc.api.ModInitializer;
import net.zaills.soulhelper.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SoulHelper implements ModInitializer {

	public static final String MOD_ID = "soulhelper";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItem();

	}
}
