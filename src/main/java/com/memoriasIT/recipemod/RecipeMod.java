package com.memoriasIT.recipemod;

import com.memoriasIT.recipemod.proxy.CommonProxy;
import com.memoriasIT.recipemod.tab.CreativeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RecipeMod.MODID, version = RecipeMod.VERSION)
public class RecipeMod
{
    // Reference
    public static final String MODID = "recipemod";
    public static final String VERSION = "1.0";

    // Proxy
    public static final String clientProxy = "com.memoriasIT.recipemod.proxy.ClientProxy";
    public static final String commonProxy = "com.memoriasIT.recipemod.proxy.CommonProxy";

    @SidedProxy(clientSide = clientProxy, serverSide = commonProxy)
    public static CommonProxy proxy;

    // Instance
    @Mod.Instance
    public static RecipeMod instance;

    // Tabs
    public static CreativeTab creativeTab;

    // Initialization
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);

        creativeTab = new CreativeTab(CreativeTabs.getNextID(), "RecipeModCreativeTab");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) { proxy.init(event); }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) { proxy.postInit(event);}
}
