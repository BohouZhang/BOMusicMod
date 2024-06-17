package com.bohou.bomusicmod.item;

import com.bohou.bomusicmod.BOMusicMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

/**
 * 音乐模组的物品栏
 * @author Bohou.Zhang
 */
public class MusicItemGroup {

    /**
     * 物品栏注册方法
     */
    public static void registerModItemGroup() {

    }

    public static final ItemGroup MUSIC_ITEM_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(BOMusicMod.MOD_ID, "bo_music_item_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.bo_music_item_group"))
                    .icon(() -> new ItemStack(Items.NOTE_BLOCK))
                    .entries(((displayContext, entries) -> {
                        entries.add(Items.NOTE_BLOCK);
                    }))
                    .build()
    );

}
