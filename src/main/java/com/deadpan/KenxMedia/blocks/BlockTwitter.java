package com.deadpan.KenxMedia.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTwitter extends Block {
    public BlockTwitter(Material material) {
        super(material);
    }

    public boolean isOpaqueCube() {
        return false;
    }
}
