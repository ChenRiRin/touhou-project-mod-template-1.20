package online.cll.registry.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import online.cll.TouhouProjectMod;

public class ModSound {
    public static SoundEvent register(String id, String name) {
        return register(new Identifier(id, name));
    }

    public static SoundEvent register(Identifier id) {
        return register(id, id);
    }

    private static SoundEvent register(Identifier id, Identifier soundEventId) {
        TouhouProjectMod.LOGGER.debug("音效" + id + " 正在加载...");
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(soundEventId));
    }

}
