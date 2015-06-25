package com.juicebox;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Juicebox on 25/06/2015.
 * For 1.8 Mod at https://github.com/xlogisticzz/1.8Mod
 * Licensed under GNU GENERAL PUBLIC LICENSE
 */

public class ModCreativeTab {

    public static CreativeTabs tabModCreativeTab = new CreativeTabs("tabModCreativeTab") {
        @Override
        public Item getTabIconItem() {
            return Items.clock;
        }
    };
}
