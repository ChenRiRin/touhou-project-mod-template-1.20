package online.cll.registry.item;

import net.minecraft.item.Item;
import online.cll.registry.itemgroup.ModItemGroups;

public class ModItems {
    public static final Item point = ModItem.registry("point", new Item(new Item.Settings().maxCount(128)), ModItemGroups.touhou_project);
    public static final Item power = ModItem.registry("power", new Item(new Item.Settings().maxCount(128)), ModItemGroups.touhou_project);

    public static void registryItem(){
    }


}
