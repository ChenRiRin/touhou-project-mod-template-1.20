package online.cll.registry.itemgroup

import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.text.Text
import net.minecraft.util.Rarity// 稀有度
import online.cll.registry.item.ModItem

object ModItemGroups {
    val TOUHOU_PROJECT: ItemGroup = ModItemGroup.registry("touhou_project",
            ItemStack(ModItem.registry("group-icon", Item(Item.Settings().rarity(Rarity.EPIC)))),
            Text.translatable("item-group.touhou-project-mod.touhou_project"))

    fun registryItemGroup() {}
}
