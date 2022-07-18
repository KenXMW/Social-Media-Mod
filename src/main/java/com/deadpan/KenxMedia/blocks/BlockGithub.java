package com.deadpan.KenxMedia.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockGithub extends Block {
    public BlockGithub(Material material) {
        super(material);
    }

    public boolean isOpaqueCube() {
        return false;
    }
}
