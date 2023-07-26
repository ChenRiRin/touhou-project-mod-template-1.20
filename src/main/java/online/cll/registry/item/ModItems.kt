package online.cll.registry.item

import net.minecraft.item.Item
import net.minecraft.item.MusicDiscItem
import online.cll.registry.itemgroup.ModItemGroups
import online.cll.registry.sound.ModSounds

object ModItems {

    val POINT = Item(Item.Settings().maxCount(128))
    val POWER = Item(Item.Settings().maxCount(128))
    val U_N_OWEN_WAS_HER: MusicDiscItem = ModMusicDisc(ModSounds.U_N_OWEN_WAS_HER, ModMusicDisc.SETTINGS, 287)

    fun registryItem() {
        ModItem.registry("un-owen-was-her-disc", U_N_OWEN_WAS_HER, ModItemGroups.TOUHOU_PROJECT)
        ModItem.registry("power", POWER, ModItemGroups.TOUHOU_PROJECT)
        ModItem.registry("point", POINT, ModItemGroups.TOUHOU_PROJECT)
    }
}