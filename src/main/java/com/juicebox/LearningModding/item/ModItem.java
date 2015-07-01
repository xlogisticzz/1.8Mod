package com.juicebox.LearningModding.item;

import com.juicebox.LearningModding.ModCreativeTab;
import com.juicebox.LearningModding.lib.Strings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Juicebox on 25/06/2015.
 * For LearningModding at https://github.com/xlogisticzz/LearningModding
 * Licensed under GNU GENERAL PUBLIC LICENSE
 */

public class ModItem extends Item {


    public ModItem() {
        super();
        setCreativeTab(ModCreativeTab.tabLearningModding);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", Strings.MODID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return String.format("item.%s%s", Strings.MODID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
