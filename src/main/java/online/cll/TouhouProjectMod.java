package online.cll;

import net.fabricmc.api.ModInitializer;
import online.cll.registry.item.ModItems;
import online.cll.registry.itemgroup.ModItemGroups;
import online.cll.registry.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TouhouProjectMod implements ModInitializer {
    public static final String MOD_ID = "touhou-project-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    @Override
    public void onInitialize() {
        // 主函数
        ModItemGroups.INSTANCE.registryItemGroup();
        ModItems.INSTANCE.registryItem();
        ModSounds.INSTANCE.registrySoundEvent();
    }
}