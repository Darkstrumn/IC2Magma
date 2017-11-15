package com.lavx64.ic2magma.recipes;

import java.util.List;

import ic2.api.item.IC2Items;
import ic2.api.recipe.Recipes;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

public class RecipesIC2 {

	/**

     * Needs to be called in Init

     * @author lavx64
     * credits for idea to ekul6547

     */


    public static void addRecipes(){
    	IC2RecipeInput magmaBlock = new IC2RecipeInput(new ItemStack(Item.getItemFromBlock(Block.getBlockFromName("magma"))));
    	
    	//TODO: Ask on forum about this deprecated function
    	Recipes.cannerEnrich.addRecipe(new FluidStack(FluidRegistry.getFluid("ic2pahoehoe_lava"), 1000), magmaBlock, new FluidStack(FluidRegistry.LAVA, 1000));
    	//Canning Machine <Pahoehoe Lava, MAGMA BLOCK> : Lava
    
    }

}
