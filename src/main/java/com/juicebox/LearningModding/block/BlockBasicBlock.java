package com.juicebox.LearningModding.block;

import com.juicebox.LearningModding.ModCreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by JuiceBox on 03/07/2015.
 * For LearningModding at https://github.com/xlogisticzz/LearningModding
 * Licensed under GNU GENERAL PUBLIC LICENSE
 */
public class BlockBasicBlock extends ModBlock {

    public BlockBasicBlock(Material material, String name, float hardness, float resistance) {
        super(material);
        setCreativeTab(ModCreativeTab.tabLearningModding);
        setHardness(hardness);
        setResistance(resistance);
        setStepSound(Block.soundTypeStone);
        setUnlocalizedName(name);
    }
}
