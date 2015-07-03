package com.juicebox.LearningModding.handlers;

import com.juicebox.LearningModding.init.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

/**
 * Created by JuiceBox on 02/07/2015.
 * For LearningModding at https://github.com/xlogisticzz/LearningModding
 * Licensed under GNU GENERAL PUBLIC LICENSE
 */
public class onEntityKilledEventHandler {

    @SubscribeEvent
    public void onLivingDeathEvent(LivingDeathEvent event) {
        Random rand = new Random();
        Entity entity = event.entity;
        ItemStack itemDropped;
        if (rand.nextInt(10) != 2) {
            return;
        }
        if (entity.worldObj.isRemote) {
            return;
        }
        if (!(event.source.getSourceOfDamage() instanceof EntityPlayer) || event.source.isCreativePlayer()) {
            return;
        }
        if (entity instanceof EntityCreeper) {
            itemDropped = new ItemStack(ModItems.deathstone, 1, 0);
        } else if (entity instanceof EntityEnderman) {
            itemDropped = new ItemStack(ModItems.deathstone, 1, 1);
        } else if (entity instanceof EntityPig) {
            itemDropped = new ItemStack(ModItems.deathstone, 1, 2);
        } else if (entity instanceof EntityPlayer) {
            itemDropped = new ItemStack(ModItems.deathstone, 1, 3);
        } else if (entity instanceof EntitySkeleton) {
            itemDropped = new ItemStack(ModItems.deathstone, 1, 4);
        } else {
            return;
        }

        float f = 0.5F;
        double d0 = (double) (entity.worldObj.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d1 = (double) (entity.worldObj.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        double d2 = (double) (entity.worldObj.rand.nextFloat() * f) + (double) (1.0F - f) * 0.5D;
        EntityItem entityitem = new EntityItem(entity.worldObj, entity.posX + d0, entity.posY + d1, entity.posZ + d2, itemDropped);
        entityitem.setDefaultPickupDelay();
        entity.worldObj.spawnEntityInWorld(entityitem);

    }
}
