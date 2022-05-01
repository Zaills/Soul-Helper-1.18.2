package net.zaills.soulhelper.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.zaills.soulhelper.SoulHelper;
import net.zaills.soulhelper.item.ModItemGroup;
import org.lwjgl.system.CallbackI;

public class ModBlocks {

    public  static  final Block Soul_Block = registerBlock("soul_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.SOUL);

    public  static  final Block Soul_Ore = registerBlock("soul_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.SOUL);

    public  static  final Block Raw_Soul_Block = registerBlock("raw_soul_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.SOUL);

    public  static  final Block Deepslate_Soul_Ore = registerBlock("deepslate_soul_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.SOUL);

    public  static  final Block Netherrack_Soul_Ore = registerBlock("netherrack_soul_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.SOUL);


    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(SoulHelper.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(SoulHelper.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group((group))));
    }

    public static void registerModBlocks(){
        SoulHelper.LOGGER.info("Registering ModBlocks for" + SoulHelper.MOD_ID);
    }

}
