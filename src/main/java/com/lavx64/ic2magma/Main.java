package com.lavx64.ic2magma;

import com.lavx64.ic2magma.proxy.CommonProxy;
import com.lavx64.ic2magma.recipes.RecipesIC2;
import com.lavx64.ic2magma.util.Reference;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID,
	 name = Reference.NAME,
	 version = Reference.VERSION)

public class Main {
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT,
				serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		if (Loader.isModLoaded("ic2")) {
            RecipesIC2.addRecipes();
        }
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
		
	}
	
}
