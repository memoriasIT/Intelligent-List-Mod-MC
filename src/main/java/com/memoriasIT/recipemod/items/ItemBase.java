package com.memoriasIT.recipemod.items;

import com.memoriasIT.recipemod.RecipeMod;
import com.memoriasIT.recipemod.init.ModItems;
import com.memoriasIT.recipemod.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public abstract class ItemBase extends Item implements IHasModel {

    // Constructor
    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(RecipeMod.creativeTab);

        ModItems.ITEMS.add(this);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    @Override
    public void registerModels() {
        RecipeMod.proxy.registerItemRenderer(this, 0, "inventory");

    }

}
