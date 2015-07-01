package com.juicebox.LearningModding;

import com.juicebox.LearningModding.init.ModItems;
import com.juicebox.LearningModding.lib.Strings;
import com.juicebox.LearningModding.proxies.CommonProxy;
import com.juicebox.LearningModding.utils.LogHelper;
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
        proxy.preInit(event);
        ModItems.createItems();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
        LogHelper.info("Learning Modding loaded");

    }
}
