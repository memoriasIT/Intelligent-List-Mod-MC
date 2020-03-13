package com.memoriasIT.recipemod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class IntelligentListBlock extends BlockBase{

    public IntelligentListBlock(String name, Material material) {
        super(name, material);
        setSoundType(SoundType.METAL);
        setHardness(3.0F);    // Time to destroy
        setResistance(40.0F); // To TNT
        setHarvestLevel("pickaxe", 1); // Stone pickaxe can destroy

    }
}
