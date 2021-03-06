package com.blakebr0.mysticalagradditions.proxy;

import com.blakebr0.mysticalagradditions.blocks.ModBlocks;
import com.blakebr0.mysticalagradditions.items.ModItems;
import com.blakebr0.mysticalagradditions.tinkers.CompatTConstruct;
import com.blakebr0.mysticalagriculture.util.ModChecker;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent event){
		super.preInit(event);
		ModBlocks.initModels();
		ModItems.initModels();
		if(ModChecker.TINKERS){
			CompatTConstruct.initFluidModels();
		}
	}
	
	@Override
	public void init(FMLInitializationEvent event){
		super.init(event);
	}

	@Override
	public void postInit(FMLPostInitializationEvent event){
		super.postInit(event);
	}
}
