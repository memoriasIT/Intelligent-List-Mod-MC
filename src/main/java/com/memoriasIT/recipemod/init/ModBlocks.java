package com.memoriasIT.recipemod.init;

import com.memoriasIT.recipemod.blocks.BlockBase;
import com.memoriasIT.recipemod.blocks.IntelligentListBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block INTELLIGENTLISTBLOCK = new IntelligentListBlock("intelligentlistblock", Material.IRON);

}
