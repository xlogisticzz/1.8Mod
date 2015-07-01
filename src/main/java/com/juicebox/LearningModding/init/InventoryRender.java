package com.juicebox.LearningModding.init;

import com.juicebox.LearningModding.item.ModItem;
import com.juicebox.LearningModding.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by Juicebox on 01/07/2015.
 * For LearningModding at https://github.com/xlogisticzz/LearningModding
 * Licensed under GNU GENERAL PUBLIC LICENSE
 */
public class InventoryRender {

    public static void init() {
        InventoryItemRender(ModItems.test);
        InventoryItemRender(ModItems.ruby);
    }

    public static void InventoryBlockRender(Block block, String blockName) {

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Strings.MODID + ":" + blockName, "inventory"));
    }

    public static void InventoryItemRender(ModItem item) {

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getUnwrappedUnlocalizedName(item.getUnlocalizedName()), "inventory"));
    }
}
