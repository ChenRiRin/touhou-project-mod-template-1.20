package online.cll.registry.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import online.cll.registry.itemgroup.ModItemGroups;

public class ModBlocks {
    public static final Block unname = ModBlock.registry(
            "unname",
            new Block(FabricBlockSettings.create().strength(4f).requiresTool()
            ), ModItemGroups.touhou_project);

    public static void registry(){
    }
}
