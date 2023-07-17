package online.cll.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import online.cll.TouhouProjectMod;

public class ModItem {
    /**
     * 注册一个自定义物品并添加到一个或多个物品组中
     *
     * @param name       物品的注册名
     * @param item       要注册的物品对象
     * @param itemGroups 要添加物品的物品组（可选）
     * @return 注册的物品对象
     */
    public static Item registry(String name, Item item, ItemGroup... itemGroups) {
        // 将物品注册到ITEM注册表中，使用Mod的唯一标识符和物品的注册名作为Identifier
        Registry.register(Registries.ITEM, new Identifier(TouhouProjectMod.MOD_ID, name), item);

        // 遍历传入的物品组数组，将物品添加到对应的物品组中
        for (var group : itemGroups)
            // 获取物品组对应的RegistryKey
            Registries.ITEM_GROUP.getKey(group).ifPresent(key ->
            ItemGroupEvents.modifyEntriesEvent(key).register(entries ->
            entries.add(item)));

        // 返回注册的物品对象
        return item;
    }
}
