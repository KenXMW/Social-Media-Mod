package com.deadpan.KenxMedia.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemDiscord extends Item {

    public ItemDiscord() {
        this.setMaxStackSize(1);
    }

    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
        if (!world.isRemote){



        }
        return item;
    }

}


