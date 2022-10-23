package net.kaupenjoe.tutorialmod.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import static net.kaupenjoe.tutorialmod.TutorialMod.MOD_ID;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_ZIRCON_TOOL
                = tag("needs_zircon_tool");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}
