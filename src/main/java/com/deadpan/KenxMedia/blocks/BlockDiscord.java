package com.deadpan.KenxMedia.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class BlockDiscord extends Block {

    public BlockDiscord(Material material) {
        super(material);
    }

    public boolean isOpaqueCube() {return false;}

    public boolean onBlockActivated(World world, EntityPlayer player) {
        if(world.isRemote) {
            player.addChatComponentMessage(new ChatComponentText("Test"));
        }
        return true;
    }

}
