package net.zaills.soulhelper.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.zaills.soulhelper.SoulHelper;
import net.zaills.soulhelper.block.custom.SpeedyBlock;
import net.zaills.soulhelper.item.ModItemGroup;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModBlocks {

    public  static  final Block Soul_Block = registerBlock("soul_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(0.3f)), ModItemGroup.SOUL, "tooltip.soulhelper.soul_block");

    public  static  final Block Soul_Ore = registerBlock("soul_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.SOUL);

    public  static  final Block Raw_Soul_Block = registerBlock("raw_soul_block",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.SOUL);

    public  static  final Block Deepslate_Soul_Ore = registerBlock("deepslate_soul_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.SOUL);

    public  static  final Block Netherrack_Soul_Ore = registerBlock("netherrack_soul_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.SOUL);

    public  static  final Block Speedy_Block = registerBlock("speedy_block",
            new SpeedyBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f)), ModItemGroup.SOUL);


    private static Block registerBlock(String name, Block block, ItemGroup group, String tooltipKey){
        registerBlockItem(name, block, group, tooltipKey);
        return Registry.register(Registry.BLOCK, new Identifier(SoulHelper.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group, String tooltipKey){
        return Registry.register(Registry.ITEM, new Identifier(SoulHelper.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings().group(group)){
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText(tooltipKey));
                }
            });
    }
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
