package com.memoriasIT.recipemod.items;


import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class IntelligentList extends ItemBase {

    public IntelligentList(String name) {
        super(name);
    }


    // Open GUI
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        playerIn.experience += 1000;
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }


    // Set tooltip info to element in use
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add("Current Recipe: Diamond Pickaxe");
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
