package com.juicebox.LearningModding.init;

import com.juicebox.LearningModding.block.ModBlock;
import com.juicebox.LearningModding.item.ModItem;
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
        InventoryItemRenderWithMeta(ModItems.deathstone, 4);
        InventoryBlockRender(ModBlocks.rubyOre);
        InventoryBlockRender(ModBlocks.titaniumOre);
        InventoryBlockRender(ModBlocks.rubyBlock);
        InventoryBlockRender(ModBlocks.titaniumBlock);


        // TODO More elegant solution for registering tools to render item
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.rubySword, 0, new ModelResourceLocation(ModItems.rubySword.getUnwrappedUnlocalizedName(ModItems.rubySword.getUnlocalizedName()), "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.rubyAxe, 0, new ModelResourceLocation(ModItems.rubyAxe.getUnwrappedUnlocalizedName(ModItems.rubyAxe.getUnlocalizedName()), "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.rubySpade, 0, new ModelResourceLocation(ModItems.rubySpade.getUnwrappedUnlocalizedName(ModItems.rubySpade.getUnlocalizedName()), "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.rubyPick, 0, new ModelResourceLocation(ModItems.rubyPick.getUnwrappedUnlocalizedName(ModItems.rubyPick.getUnlocalizedName()), "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.rubyHoe, 0, new ModelResourceLocation(ModItems.rubyHoe.getUnwrappedUnlocalizedName(ModItems.rubyHoe.getUnlocalizedName()), "inventory"));
    }

    public static void InventoryBlockRender(ModBlock block) {

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getUnwrappedUnlocalizedName(block.getUnlocalizedName()), "inventory"));
    }

    public static void InventoryItemRender(ModItem item) {

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getUnwrappedUnlocalizedName(item.getUnlocalizedName()), "inventory"));
    }

    public static void InventoryItemRenderWithMeta(ModItem item, int maxMeta) {
        for (int i = 0; i <= maxMeta; i++) {
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, i, new ModelResourceLocation(item.getUnwrappedUnlocalizedName(item.getUnlocalizedName()) + i, "inventory"));
        }
    }
}
