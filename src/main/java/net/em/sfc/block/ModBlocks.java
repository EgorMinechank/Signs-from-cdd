package net.em.sfc.block;

import net.em.sfc.SignsFromCdd;
import net.em.sfc.block.custom.SignBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    // Только объявление переменной, без инициализации
    public static final Block ARROW_DOWN_SIGN;
    public static final Block ARROW_UP_SIGN;
    public static final Block ARROW_RIGHT_SIGN;
    public static final Block ARROW_LEFT_SIGN;
    public static final Block MAGNET_SIGN;
    public static final Block STOP_SIGN;
    public static final Block BLANK_SIGN;

    static {
        // Инициализация в статическом блоке
        ARROW_DOWN_SIGN = registerBlock("arrow_down_sign",
                new SignBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)
                        .sounds(BlockSoundGroup.NETHERITE)
                        .nonOpaque()
                        .strength(0.5f)
                        .requiresTool()
                        .breakInstantly()));

        ARROW_UP_SIGN = registerBlock("arrow_up_sign",
                new SignBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)
                        .sounds(BlockSoundGroup.NETHERITE)
                        .nonOpaque()
                        .strength(0.5f)
                        .requiresTool()
                        .breakInstantly()));

        ARROW_RIGHT_SIGN = registerBlock("arrow_right_sign",
                new SignBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)
                        .sounds(BlockSoundGroup.NETHERITE)
                        .nonOpaque()
                        .strength(0.5f)
                        .requiresTool()
                        .breakInstantly()));

        ARROW_LEFT_SIGN = registerBlock("arrow_left_sign",
                new SignBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)
                        .sounds(BlockSoundGroup.NETHERITE)
                        .nonOpaque()
                        .strength(0.5f)
                        .requiresTool()
                        .breakInstantly()));

        MAGNET_SIGN = registerBlock("magnet_sign",
                new SignBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)
                        .sounds(BlockSoundGroup.NETHERITE)
                        .nonOpaque()
                        .strength(0.5f)
                        .requiresTool()
                        .breakInstantly()));

        STOP_SIGN = registerBlock("stop_sign",
                new SignBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)
                        .sounds(BlockSoundGroup.NETHERITE)
                        .nonOpaque()
                        .strength(0.5f)
                        .requiresTool()
                        .breakInstantly()));

        BLANK_SIGN = registerBlock("blank_sign",
                new SignBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)
                        .sounds(BlockSoundGroup.NETHERITE)
                        .nonOpaque()
                        .strength(0.5f)
                        .requiresTool()
                        .breakInstantly()));
    }

    private static Block registerBlock(String name, Block block) {
        // Регистрация блока
        Block registeredBlock = Registry.register(Registries.BLOCK,
                new Identifier(SignsFromCdd.MOD_ID, name), block);

        // Регистрация предмета блока
        Registry.register(Registries.ITEM, new Identifier(SignsFromCdd.MOD_ID, name),
                new BlockItem(registeredBlock, new FabricItemSettings()));

        return registeredBlock;
    }

    public static void registerModBlocks() {
        // Инициализация происходит в статическом блоке
    }
}