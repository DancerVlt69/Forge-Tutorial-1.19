package net.kaupenjoe.tutorialmod.loot;

import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.kaupenjoe.tutorialmod.TutorialMod.MOD_ID;

public class ModLootModifiers {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, MOD_ID);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ADD_ITEM =
            LOOT_MODIFIER_SERIALIZERS.register("add_item", AddItemModifier.CODEC);

    /** use this variation of methods to add different loot-items to (different) plants
     * replace/swap     the upper case "ADD_ITEM" for "YOUR_ITEM_FROM_YOUR_PLANT
     *                  and the same for the lower case "add_item"
     * replace/swap     the AddItemModifier.CODEC for YourItemModifier.CODEC
     * see the methods below for any examples
     * use the lower case 'names' to create the needed json files in the data/yourmod/loot_modifiers folder
     * and enter these names into the global_loot_modifiers.json - file in the data/forge/loot_modifiers folder
     * examples for the files and entries you can find in the corresponding folders and files */
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> GLOW_BERRIES_FROM_TALL_GRASS =
            LOOT_MODIFIER_SERIALIZERS.register("glow_berries_from_tall_grass", GlowBerriesFromTallGrass.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> SWEET_BERRIES_FROM_LARGE_FERN =
            LOOT_MODIFIER_SERIALIZERS.register("sweet_berries_from_large_fern", SweetBerriesFromLargeFern.CODEC);


    /** use this methode to add (different) loot from Village-Chests (in different Biomes) */
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> BLUEBERRIES_IN_DESERT_CHESTS =
            LOOT_MODIFIER_SERIALIZERS.register("blueberries_in_desert_chests", BlueberriesInDesertChests.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> BLUEBERRIES_IN_PLAINS_CHESTS =
            LOOT_MODIFIER_SERIALIZERS.register("blueberries_in_plains_chests", BlueberriesInPlainsChests.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> BLUEBERRIES_IN_SNOWY_CHESTS =
            LOOT_MODIFIER_SERIALIZERS.register("blueberries_in_snowy_chests", BlueberriesInSnowyChests.CODEC);


    public static void register(IEventBus bus) {
        LOOT_MODIFIER_SERIALIZERS.register(bus);
    }
}
