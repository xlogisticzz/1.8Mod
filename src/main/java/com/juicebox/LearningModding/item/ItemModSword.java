package com.juicebox.LearningModding.item;

import com.juicebox.LearningModding.ModCreativeTab;
import com.juicebox.LearningModding.lib.Strings;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

/**
 * Created by JuiceBox on 02/07/2015.
 * For LearningModding at https://github.com/xlogisticzz/LearningModding
 * Licensed under GNU GENERAL PUBLIC LICENSE
 */
public class ItemModSword extends ItemSword {

    public ItemModSword(ToolMaterial material, String name) {
        super(material);
        setCreativeTab(ModCreativeTab.tabLearningModding);
        setMaxStackSize(1);
        setUnlocalizedName(name);
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
