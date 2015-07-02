package com.juicebox.LearningModding.proxies;

import com.juicebox.LearningModding.init.InventoryRender;
import com.juicebox.LearningModding.init.ModItems;
import com.juicebox.LearningModding.lib.Strings;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Juicebox on 25/06/2015.
 * For LearningModding at https://github.com/xlogisticzz/LearningModding
 * Licensed under GNU GENERAL PUBLIC LICENSE
 */

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        ModelBakery.addVariantName(ModItems.deathstone, Strings.MODID + ":" + Strings.DEATHSTONE + "0",
                Strings.MODID + ":" + Strings.DEATHSTONE + "1",
                Strings.MODID + ":" + Strings.DEATHSTONE + "2",
                Strings.MODID + ":" + Strings.DEATHSTONE + "3",
                Strings.MODID + ":" + Strings.DEATHSTONE + "4");
    }

    @Override
    public void init(FMLInitializationEvent event) {
        InventoryRender.init();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }
}
