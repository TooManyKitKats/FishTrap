package com.toomanykitkats.fishtrap;
import com.toomanykitkats.fishtrap.init.iteminit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
@Mod("fishtrap")
/* 
* Author: @TooManyKitKats, discord KITKᗩT#0795
* 12/12/2022 fishtrap version 0.0
* Litterally this is just enough to get runClient to launch the game with an empty mod named Fish Trap.
*/
public class FishTrap 
{
    public static final String MOD_ID = "fishtrap";

    public static final CreativeModeTab FISHTRAP_TAB = new CreativeModeTab(MOD_ID) 
    {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() 
        {
            return new ItemStack(iteminit.EXAMPLE_ITEM.get());
        }
    };
        
    public FishTrap() 
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        iteminit.ITEMS.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}//end class
