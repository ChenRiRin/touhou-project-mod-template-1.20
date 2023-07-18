package online.cll.registry.itemgroup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Rarity;
import online.cll.registry.item.ModItem;

public class ModItemGroups {
    public static final ItemGroup touhou_project =
            ModItemGroup.getItemGroup("touhou_project",
                    new ItemStack(ModItem.registry("group-icon",new Item(new Item.Settings().rarity(Rarity.EPIC)))),
                    Text.translatable("item-group.touhou-project-mod.touhou_project"));


    public static void registryItemGroup(){

    }
}
