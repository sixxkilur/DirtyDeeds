package com.Lite.Transmute;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

@Mod(modid="Trans", name="Transmute", version="1.0")
public class Transmute
{

//public class Main

@Mod.Instance("Trans")
public static Transmute instance;

@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	//Smelt Leather_helmet back to Leather x3
GameRegistry.addSmelting(Items.leather_helmet, new ItemStack(Items.leather, 3, 0), 0.1F);
/*
GameRegistry.addSmelting(Items.field_151028_Y, new ItemStack(Items.field_151042_j, 3, 0), 0.1F);
GameRegistry.addSmelting(Items.field_151169_ag, new ItemStack(Items.field_151043_k, 3, 0), 0.1F);
GameRegistry.addSmelting(Items.field_151161_ac, new ItemStack(Items.field_151045_i, 3, 0), 0.1F);

GameRegistry.addSmelting(Items.field_151027_R, new ItemStack(Items.field_151116_aA, 5, 0), 0.1F);
GameRegistry.addSmelting(Items.field_151030_Z, new ItemStack(Items.field_151042_j, 5, 0), 0.1F);
GameRegistry.addSmelting(Items.field_151171_ah, new ItemStack(Items.field_151043_k, 5, 0), 0.1F);
GameRegistry.addSmelting(Items.field_151163_ad, new ItemStack(Items.field_151045_i, 5, 0), 0.1F);

GameRegistry.addSmelting(Items.field_151026_S, new ItemStack(Items.field_151116_aA, 4, 0), 0.1F);
GameRegistry.addSmelting(Items.field_151165_aa, new ItemStack(Items.field_151042_j, 4, 0), 0.1F);
GameRegistry.addSmelting(Items.field_151149_ai, new ItemStack(Items.field_151043_k, 4, 0), 0.1F);
GameRegistry.addSmelting(Items.field_151173_ae, new ItemStack(Items.field_151045_i, 4, 0), 0.1F);

GameRegistry.addSmelting(Items.field_151021_T, new ItemStack(Items.field_151116_aA, 2, 0), 0.1F);
GameRegistry.addSmelting(Items.field_151167_ab, new ItemStack(Items.field_151042_j, 2, 0), 0.1F);
GameRegistry.addSmelting(Items.field_151151_aj, new ItemStack(Items.field_151043_k, 2, 0), 0.1F);
GameRegistry.addSmelting(Items.field_151175_af, new ItemStack(Items.field_151045_i, 2, 0), 0.1F);



GameRegistry.addSmelting(Items.field_151036_c, new ItemStack(Items.field_151042_j, 1, 0), 0.1F);
GameRegistry.addSmelting(Items.field_151006_E, new ItemStack(Items.field_151043_k, 1, 0), 0.1F);
GameRegistry.addSmelting(Items.field_151056_x, new ItemStack(Items.field_151045_i, 1, 0), 0.1F);

GameRegistry.addSmelting(Items.field_151035_b, new ItemStack(Items.field_151042_j, 1, 0), 0.1F);
GameRegistry.addSmelting(Items.field_151005_D, new ItemStack(Items.field_151043_k, 1, 0), 0.1F);
GameRegistry.addSmelting(Items.field_151046_w, new ItemStack(Items.field_151045_i, 1, 0), 0.1F);

GameRegistry.addSmelting(Items.field_151040_l, new ItemStack(Items.field_151042_j, 1, 0), 0.1F);
GameRegistry.addSmelting(Items.field_151010_B, new ItemStack(Items.field_151043_k, 1, 0), 0.1F);
GameRegistry.addSmelting(Items.field_151048_u, new ItemStack(Items.field_151045_i, 1, 0), 0.1F);*/
}

@Mod.EventHandler
public void load(FMLInitializationEvent event) {}

@Mod.EventHandler
public void postInit(FMLPostInitializationEvent event) {}
}
