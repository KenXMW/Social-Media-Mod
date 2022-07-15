package com.deadpan.KenxMedia.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockYoutube extends Block {
    public BlockYoutube(Material material) {
        super(material);
    }

    public boolean isOpaqueCube() {
        return false;
    }
}
