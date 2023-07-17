package online.cll.item;

import net.minecraft.item.Item;
import online.cll.TouhouProjectMod;

import java.util.ArrayList;

public class ModItems {
    public static final ReAddList<Item> list =
            new ReAddList<Item>()
                    .reAdd(ModItem.registry("point", new Item(new Item.Settings().maxCount(128))))
                    .reAdd(ModItem.registry("power", new Item(new Item.Settings().maxCount(128))));


    public static void registryItem(){
        for (Object i : list) TouhouProjectMod.LOGGER.debug(i.toString() + " Loading...");
    }

    private static class ReAddList<E> extends ArrayList<E>{
        public ReAddList<E> reAdd(E e){
            add(e);
            return this;
        }
    }
}
