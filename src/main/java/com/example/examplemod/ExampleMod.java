package com.example.examplemod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";
    
    @EventHandler
    
    
    public void randomName(FMLPreInitializationEvent event) //really does not matter on the name of the public void :p
    {
    	ModMetadata m = event.getModMetadata(); //This is required or it will not work
    	m.autogenerated = false; //This is required otherwise it will not work
    	m.logoFile = "logo.png";
    //m.screenshots = "logo.png";
    	m.modId = "examplemod";
    	m.version = "�61.0";
    	//mc.version = "1.7.2";
    	m.name = "�4ExampleMod";
    	m.url = "�bhttp://www.bulletlabs.org/MCD/Mods/Dirt";
    	m.updateUrl = "�bhttp://www.bulletlabs.org/MCD/Mods/DirtyDeeds.zip";
    	m.description = "�5Poor Man's Tricks";
    	m.authorList.add("�eSiXxKilLuR");
    	//m.authorList.add("");
    	m.credits = "�aDeadEyez98 �8for �eBeta testing!";
    	///m.dependencies = [ "mod_MinecraftForge" ];
    	//m.mcversion = "1.7.2";
    	//m.useDependencyInformation = true;
    	//m.parentMod.canBeDisabled();
    	//= com.dirt.dirtydeeds.DirtyD;
    	
    			
    	/*parentModparent": "mod_BuildCraftCore",
        "requiredMods": [ "Forge", "mod_BuildCraftCore" ],
        "dependencies": [ "mod_BuildCraftCore" ],
        "dependants": [ "MySpecialSubMod" ],
        */
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    
    	//Shapeless
    	// IRecipie = make diamond from dirt
    	GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 1), new Object[]{
    		new ItemStack(Blocks.sand, 1), 
    		});
    	
    	
    	//Shaped
    	
    	//GameRegistry.addShapedRecipe(new ItemStack(Items.golden_sword, 1)
    	//new object[] {new ItemStack(Blocks.sand, 1),});
    	
    	
    	
    	//make golden sword from 1 stick, 2 blocks of dirt v.1.7.2
    	GameRegistry.addShapedRecipe(new ItemStack(Items.golden_sword, 1),
    			new Object[]{ "X1X", "X4X", "X7X", 
    		Character.valueOf('1'), new ItemStack(Blocks.dirt, 1), 
    		Character.valueOf('4'), new ItemStack(Blocks.dirt, 1), 
    		Character.valueOf('7'), new ItemStack(Items.stick, 1), 
    	});}
    	
    	/*GameRegistry.addShapedRecipe(new ItemStack(sword),
    				new Object[] {	" XX",
    							" x ",
    							" x ",
    							" / ",
    							'X', Items.ingot,	
    							'/', net.minecraft.init.Items.stick
    						   });*/
    	  
    	//FRecipe = make bow from stick
    	//GameRegistry.addSmelting(Items.stick , new ItemStack(Items.bow), 1.0f);
    	//FRecipe = make diamond sword from dirt
    	//GameRegistry.addSmelting(Blocks.dirt , new ItemStack(Items.diamond_sword), 1.0f);
    	 //FurnaceRecipes.smelting().func_151396_a(Items.stick, new ItemStack(Items.bow), 0.1F);
    
    
    	
    		
}