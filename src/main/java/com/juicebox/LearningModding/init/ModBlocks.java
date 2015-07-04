package com.juicebox.LearningModding.init;

import com.juicebox.LearningModding.block.BlockBasicBlock;
import com.juicebox.LearningModding.block.BlockModOre;
import com.juicebox.LearningModding.block.BlockTest;
import com.juicebox.LearningModding.block.ModBlock;
import com.juicebox.LearningModding.lib.Strings;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by JuiceBox on 02/07/2015.
 * For LearningModding at https://github.com/xlogisticzz/LearningModding
 * Licensed under GNU GENERAL PUBLIC LICENSE
 */
public class ModBlocks {

    public static ModBlock rubyOre;
    public static ModBlock titaniumOre;
    public static ModBlock rubyBlock;
    public static ModBlock titaniumBlock;
    public static ModBlock test;


    public static void createBlocks() {
        rubyOre = new BlockModOre(Strings.RUBYORE, 3F, 5F);
        titaniumOre = new BlockModOre(Strings.TITANIUMORE, 4F, 5F);
        rubyBlock = new BlockBasicBlock(Material.iron, Strings.RUBYBLOCK, 4F, 6F);
        titaniumBlock = new BlockBasicBlock(Material.iron, Strings.TITANIUMBLOCK, 5F, 7F);
        test = new BlockTest();


        GameRegistry.registerBlock(rubyOre, Strings.RUBYORE);
        GameRegistry.registerBlock(titaniumOre, Strings.TITANIUMORE);
        GameRegistry.registerBlock(rubyBlock, Strings.RUBYBLOCK);
        GameRegistry.registerBlock(titaniumBlock, Strings.TITANIUMBLOCK);
        GameRegistry.registerBlock(test, Strings.TEST);

    }
}
