package com.bohou.bomusicmod;

import com.bohou.bomusicmod.item.MusicItemGroup;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BOMusicMod implements ModInitializer {

	public static final String MOD_ID = "bomusicmod";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		// 注册物品栏
		MusicItemGroup.registerModItemGroup();

		LOGGER.info("Hello Fabric world!");
	}
}