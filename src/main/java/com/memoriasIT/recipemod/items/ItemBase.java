package com.memoriasIT.recipemod.items;

import com.memoriasIT.recipemod.RecipeMod;
import com.memoriasIT.recipemod.init.ModItems;
import com.memoriasIT.recipemod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        RecipeMod.proxy.registerItemRenderer(this, 0, "inventory");

    }
}
