package online.cll.registry.item;

import net.minecraft.item.MusicDiscItem;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Rarity;

public class ModMusicDisc extends MusicDiscItem {

    public static final Settings SETTINGS;

    static {
        SETTINGS = new Settings()
                .maxCount(1)
                .rarity(Rarity.RARE);
    }

    /**
     * ModMusicDisk的构造方法，用于创建ModMusicDisk对象。
     *
     * @param comparatorOutput 红石比较器输出信号强度。
     * @param sound            音乐唱片的声音事件。
     * @param settings         音乐唱片的设置选项。
     * @param lengthInSeconds  音乐唱片的播放时长，单位为秒。
     */
    public ModMusicDisc(int comparatorOutput, SoundEvent sound, Settings settings, int lengthInSeconds) {
        super(comparatorOutput, sound, settings, lengthInSeconds);
    }

    /**
     * ModMusicDisk的构造方法，用于创建ModMusicDisk对象。
     * <p>
     * 红石比较器输出信号强度 -> 15
     *
     * @param sound           音乐唱片的声音事件。
     * @param settings        音乐唱片的设置选项。
     * @param lengthInSeconds 音乐唱片的播放时长，单位为秒。
     */
    public ModMusicDisc(SoundEvent sound, Settings settings, int lengthInSeconds) {
        this(15, sound, settings, lengthInSeconds);
    }
}

