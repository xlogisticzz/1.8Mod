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
        float f = rand.nextFloat() * 0.8F + 0.1F;
        float f1 = rand.nextFloat() * 0.8F + 0.1F;
        float f2 = rand.nextFloat() * 0.8F + 0.1F;
        EntityItem entityitem = new EntityItem(entity.worldObj, (double) ((float) entity.posX + f), (double) ((float) entity.posY + f1), (double) ((float) entity.posZ + f2), itemDropped);

        float f3 = 0.05F;
        entityitem.motionX = (double) ((float) rand.nextGaussian() * f3);
        entityitem.motionY = (double) ((float) rand.nextGaussian() * f3 + 0.2F);
        entityitem.motionZ = (double) ((float) rand.nextGaussian() * f3);
        entity.worldObj.spawnEntityInWorld(entityitem);
    }
}
