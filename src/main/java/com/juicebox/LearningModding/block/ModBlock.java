package com.juicebox.LearningModding.block;

import com.juicebox.LearningModding.ModCreativeTab;
import com.juicebox.LearningModding.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by JuiceBox on 02/07/2015.
 * For LearningModding at https://github.com/xlogisticzz/LearningModding
 * Licensed under GNU GENERAL PUBLIC LICENSE
 */
public class ModBlock extends Block {

    public ModBlock(Material materialIn) {
        super(materialIn);
        setCreativeTab(ModCreativeTab.tabLearningModding);
    }

    public ModBlock() {
        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Strings.MODID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
