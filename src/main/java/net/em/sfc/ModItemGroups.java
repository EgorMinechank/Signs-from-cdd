package net.em.sfc;

import net.em.sfc.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SFC_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SignsFromCdd.MOD_ID, "sfc"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.sfc"))
                    .icon(() -> new ItemStack(ModBlocks.ARROW_DOWN_SIGN)).entries(((displayContext, entries) -> {
                        entries.add(ModBlocks.ARROW_DOWN_SIGN);
                        entries.add(ModBlocks.ARROW_UP_SIGN);
                        entries.add(ModBlocks.ARROW_RIGHT_SIGN);
                        entries.add(ModBlocks.ARROW_LEFT_SIGN);
                        entries.add(ModBlocks.MAGNET_SIGN);
                        entries.add(ModBlocks.STOP_SIGN);
                        entries.add(ModBlocks.BLANK_SIGN);
                    })).build());

    public static void registerItemGroups() {
        SignsFromCdd.LOGGER.info("Registering Item Groups for " + SignsFromCdd.MOD_ID);
    }
}
