package online.cll.registry.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import online.cll.TouhouProjectMod;
import online.cll.registry.item.ModItem;


/**
 * ModBlock 类提供了注册自定义方块及其物品形式的方法。
 */
public class ModBlock {

    /**
     * 通过该方法注册自定义方块及其物品形式到游戏中。
     *
     * @param name       方块的注册名称，用于在游戏中唯一标识该方块
     * @param block      要注册的方块对象
     * @param itemGroups 可选参数，表示方块对应的物品在创造模式下所属的物品组（ItemGroup）列表
     * @return 返回注册后的方块对象
     */
    public static Block registry(String name, Block block, ItemGroup... itemGroups) {
        ModItem.registry(name, block.asItem(), itemGroups);
        return Registry.register(Registries.BLOCK, new Identifier(TouhouProjectMod.MOD_ID,name), block);
    }
}

