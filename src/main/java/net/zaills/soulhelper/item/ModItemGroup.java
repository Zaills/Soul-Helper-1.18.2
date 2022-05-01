package net.zaills.soulhelper.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.zaills.soulhelper.SoulHelper;

public class ModItemGroup {
    public static final ItemGroup SOUL = FabricItemGroupBuilder.build(new Identifier(SoulHelper.MOD_ID,"soul"),
            () -> new ItemStack(ModItems.Soul_Ingot));
}
