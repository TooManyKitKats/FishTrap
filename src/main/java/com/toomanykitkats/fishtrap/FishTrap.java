package com.toomanykitkats.fishtrap;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("fishtrap")
public class FishTrap {
    public FishTrap() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}//end class
