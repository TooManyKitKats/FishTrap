package com.toomanykitkats.fishtrap;

import net.minecraftforge.common.MinecraftForge;

public class FishTrap {
    public FishTrap() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}//end class
