package com.juicebox.LearningModding.block;

import com.juicebox.LearningModding.ModCreativeTab;
import com.juicebox.LearningModding.init.ModBlocks;
import com.juicebox.LearningModding.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by JuiceBox on 02/07/2015.
 * For LearningModding at https://github.com/xlogisticzz/LearningModding
 * Licensed under GNU GENERAL PUBLIC LICENSE
 */
public class BlockModOre extends ModBlock {

    public BlockModOre(String name, float hardness, float resistance) {
        setCreativeTab(ModCreativeTab.tabLearningModding);
        setHardness(hardness);
        setResistance(resistance);
        setStepSound(Block.soundTypeStone);
        setUnlocalizedName(name);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        if (this == ModBlocks.rubyOre) {
            return ModItems.ruby;
        }
        return super.getItemDropped(state, rand, fortune);
    }

    @Override
    public int quantityDropped(IBlockState state, int fortune, Random random) {
        if (this == ModBlocks.rubyOre) {
            return 2 + random.nextInt(3);
        }
        return super.quantityDropped(state, fortune, random);
    }
}
