package net.em.sfc;

import net.em.sfc.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SignsFromCdd implements ModInitializer {
	public static final String MOD_ID = "signs-for-gorod145";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModBlocks.registerModBlocks();

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ARROW_DOWN_SIGN, RenderLayer.getCutout());
	}
}