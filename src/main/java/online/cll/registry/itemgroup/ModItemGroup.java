package online.cll.registry.itemgroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import online.cll.TouhouProjectMod;

public class ModItemGroup {

    // 创建一个新的物品组
    public static ItemGroup registry(String name, ItemStack icon, Text displayName) {
        var ret = new ItemGroup.Builder(ItemGroup.Row.TOP, 2).displayName(displayName).icon(() -> icon).build();
        TouhouProjectMod.LOGGER.debug(name + " Loading...");
        Registry.register(Registries.ITEM_GROUP, new Identifier(TouhouProjectMod.MOD_ID, name), ret);
        return ret;
    }

}
