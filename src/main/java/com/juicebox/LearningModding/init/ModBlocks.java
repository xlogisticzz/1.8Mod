package com.juicebox.LearningModding.init;

import com.juicebox.LearningModding.block.ModBlock;
import com.juicebox.LearningModding.block.ModOreBlock;
import com.juicebox.LearningModding.lib.Strings;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by JuiceBox on 02/07/2015.
 * For LearningModding at https://github.com/xlogisticzz/LearningModding
 * Licensed under GNU GENERAL PUBLIC LICENSE
 */
public class ModBlocks {

    public static ModBlock rubyOre;
    public static ModBlock titaniumOre;


    public static void createBlocks() {
        rubyOre = new ModOreBlock(Strings.RUBYORE, 3F, 5F);
        titaniumOre = new ModOreBlock(Strings.TITANIUMORE, 4F, 5F);


        GameRegistry.registerBlock(rubyOre, Strings.RUBYORE);
        GameRegistry.registerBlock(titaniumOre, Strings.TITANIUMORE);

    }


}
