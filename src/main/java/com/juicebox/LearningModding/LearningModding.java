package com.juicebox.LearningModding;

import com.juicebox.LearningModding.handlers.onEntityKilledEventHandler;
import com.juicebox.LearningModding.init.ModBlocks;
import com.juicebox.LearningModding.init.ModItems;
import com.juicebox.LearningModding.init.Recipes;
import com.juicebox.LearningModding.lib.Strings;
import com.juicebox.LearningModding.proxies.CommonProxy;
import com.juicebox.LearningModding.utils.LogHelper;
import com.juicebox.LearningModding.world.WorldGenerationHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Juicebox on 25/06/2015.
 * For LearningModding at https://github.com/xlogisticzz/LearningModding
 * Licensed under GNU GENERAL PUBLIC LICENSE
 */


@Mod(name = Strings.NAME, modid = Strings.MODID, version = Strings.VERSION)
public class LearningModding {

    @Mod.Instance(Strings.MODID)
    public static LearningModding instance;

    @SidedProxy(clientSide = Strings.CLIENTPROXY, serverSide = Strings.COMMONPROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.createItems();
        ModBlocks.createBlocks();
        proxy.preInit(event);
        Recipes.initVanilla();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        MinecraftForge.EVENT_BUS.register(new onEntityKilledEventHandler());

        new WorldGenerationHandler();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
        LogHelper.info("Learning Modding loaded");

    }
}
