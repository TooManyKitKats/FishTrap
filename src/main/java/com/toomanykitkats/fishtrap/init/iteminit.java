package com.toomanykitkats.fishtrap.init;
import org.antlr.v4.parse.ANTLRParser.finallyClause_return;
import com.toomanykitkats.fishtrap.FishTrap;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class iteminit 
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FishTrap.MOD_ID);

    public static final RegistryObject<Item> EXAMPLE_ITEM = register("example_item", () -> new Item(new Item.Properties().tab(FishTrap.FISHTRAP_TAB)));

    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) 
    {
        return ITEMS.register(name, item);
    }
}
