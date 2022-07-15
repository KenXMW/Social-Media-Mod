package com.deadpan.KenxMedia.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class BlockDiscord extends Block {

    public BlockDiscord(Material material) {
        super(material);
        this.onBlockClicked();
    }

    public boolean isOpaqueCube() {
        return false;
    }
}
