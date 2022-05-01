package net.zaills.soulhelper.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.zaills.soulhelper.SoulHelper;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item Soul_Ingot = registerItem("soul_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.SOUL)));

    public static final Item Soul_Nugget = registerItem("soul_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.SOUL)));

    public static final Item Soul_Raw = registerItem("soul_raw",
            new Item(new FabricItemSettings().group(ModItemGroup.SOUL)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(SoulHelper.MOD_ID, name), item);
    }

    public static void registerModItem(){
        SoulHelper.LOGGER.info("Registering Mod Items for" + SoulHelper.MOD_ID);
    }

}
