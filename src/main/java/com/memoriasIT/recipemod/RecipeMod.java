package com.memoriasIT.recipemod;

import com.memoriasIT.recipemod.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = RecipeMod.MODID, version = RecipeMod.VERSION)
public class RecipeMod
{
    public static final String MODID = "recipemod";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "com.memoriasIT.recipemod.proxy.ClientProxy", serverSide = "com.memoriasIT.recipemod.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
    }
}
