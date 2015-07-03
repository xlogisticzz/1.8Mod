package com.juicebox.LearningModding.init;

import com.juicebox.LearningModding.item.ModItem;
import com.juicebox.LearningModding.utils.StringUtils;
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
        InventoryItemRender(ModItems.ruby);
        InventoryItemRender(ModItems.titaniumIngot);
        InventoryItemRender(ModItems.rubySword);
        InventoryItemRender(ModItems.rubyAxe);
        InventoryItemRender(ModItems.rubySpade);
        InventoryItemRender(ModItems.rubyPick);
        InventoryItemRender(ModItems.rubyHoe);
        InventoryItemRenderWithMeta(ModItems.deathstone, 4);
        InventoryBlockRender(ModBlocks.rubyOre);
        InventoryBlockRender(ModBlocks.titaniumOre);
        InventoryBlockRender(ModBlocks.rubyBlock);
        InventoryBlockRender(ModBlocks.titaniumBlock);


    }

    public static void InventoryBlockRender(Block block) {

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(StringUtils.getUnwrappedUnlocalizedName(block.getUnlocalizedName()), "inventory"));
    }

    public static void InventoryItemRender(Item item) {

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(StringUtils.getUnwrappedUnlocalizedName(item.getUnlocalizedName()), "inventory"));
    }

    public static void InventoryItemRenderWithMeta(ModItem item, int maxMeta) {
        for (int i = 0; i <= maxMeta; i++) {
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, i, new ModelResourceLocation(StringUtils.getUnwrappedUnlocalizedName(item.getUnlocalizedName()) + i, "inventory"));
        }
    }
}
