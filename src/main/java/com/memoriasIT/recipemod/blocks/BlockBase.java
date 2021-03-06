package com.memoriasIT.recipemod.blocks;

import com.memoriasIT.recipemod.RecipeMod;
import com.memoriasIT.recipemod.init.ModBlocks;
import com.memoriasIT.recipemod.init.ModItems;
import com.memoriasIT.recipemod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(String name, Material material){
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(RecipeMod.creativeTab);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        RecipeMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
