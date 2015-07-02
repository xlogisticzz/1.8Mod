package com.juicebox.LearningModding.item;

import com.juicebox.LearningModding.lib.Strings;
import com.juicebox.LearningModding.utils.StringUtils;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

/**
 * Created by JuiceBox on 02/07/2015.
 * For LearningModding at https://github.com/xlogisticzz/LearningModding
 * Licensed under GNU GENERAL PUBLIC LICENSE
 */
public class ItemDeathstone extends ModItem {

    public ItemDeathstone() {
        setUnlocalizedName(Strings.DEATHSTONE);
        setHasSubtypes(true);
        setMaxStackSize(1);
    }

    @Override
    public int getMetadata(int damage) {
        return damage;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName() + stack.getItemDamage();
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs par2CreativeTabs, List par3List) {
        for (int i = 0; i < 5; i++) {
            par3List.add(new ItemStack(item, 1, i));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        /* DAMAGE VALUES START AT 0 */
        if (par1ItemStack.getItemDamage() == 4) {
            ItemStack nextCrafted = new ItemStack(par1ItemStack.getItem(), 1, 0);
            par3List.add("Next Item crafted is " + StringUtils.localize(nextCrafted.getUnlocalizedName() + ".name"));
        } else {
            ItemStack nextCrafted = new ItemStack(par1ItemStack.getItem(), 1, par1ItemStack.getItemDamage() + 1);
            par3List.add("Next Item crafted is " + StringUtils.localize(nextCrafted.getUnlocalizedName() + ".name"));
        }
    }

    @Override
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
        int id = par1ItemStack.getItemDamage();
        switch (id) {
            case 0:
                if (par2EntityLivingBase instanceof EntityCreeper) {
                    par2EntityLivingBase.setHealth(0);
                    return true;
                } else {
                    return false;
                }
            case 1:
                if (par2EntityLivingBase instanceof EntityEnderman) {
                    par2EntityLivingBase.setHealth(0);
                    return true;
                } else {
                    return false;
                }
            case 2:
                if (par2EntityLivingBase instanceof EntityPig) {
                    par2EntityLivingBase.setHealth(0);
                    return true;
                } else {
                    return false;
                }
            case 3:
                if (par2EntityLivingBase instanceof EntityPlayer) {
                    par2EntityLivingBase.setHealth(0);
                    return true;
                } else {
                    return false;
                }
            case 4:
                if (par2EntityLivingBase instanceof EntitySkeleton) {
                    par2EntityLivingBase.setHealth(0);
                    return true;
                } else {
                    return false;
                }

            default:
                return false;
        }
    }

}
