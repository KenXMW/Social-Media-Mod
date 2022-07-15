package com.deadpan.KenxMedia.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInfo extends Block {
    public BlockInfo(Material material) {
        super(material);
    }

    public boolean isOpaqueCube() {
        return false;
    }
}
