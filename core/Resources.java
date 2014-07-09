package gravestone.core;

import net.minecraft.util.ResourceLocation;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class Resources {

    private Resources() {
    }
    private static final String MOD_NAME = ModInfo.ID.toLowerCase();
    private static final String GUI_LOCATION = MOD_NAME + ":textures/gui/";
    private static final String BLOCK_LOCATION = MOD_NAME + ":textures/blocks/";
    private static final String ENTITY_LOCATION = MOD_NAME + ":textures/entities/";
    private static final String GRAVES_LOCATION = MOD_NAME + ":textures/graves/";
    private static final String MEMORIALS_LOCATION = MOD_NAME + ":textures/memorials/";
    private static final String PEDESTALS_LOCATION = MOD_NAME + ":textures/memorials/pedestal/";
    // localization path
    public static final String LOCALIZATION_LOCATION = "/assets/" + MOD_NAME + "/lang/";
    // blocks
    public static final String NIGHT_STONE      = "nether_brick";
    public static final String THUNDER_STONE    = "stonebrick";
    public static final String BONE_BLOCK       = MOD_NAME  + ":bone_block";
    public static final String SKULL_BONE_BLOCK = MOD_NAME  + ":skull_bone_block";
    public static final String PENTAGRAM_ICO    = MOD_NAME  + ":pentagram";
    public static final ResourceLocation PENTAGRAM = new ResourceLocation(BLOCK_LOCATION  + "pentagram.png");
    public static final ResourceLocation CANDLE = new ResourceLocation(BLOCK_LOCATION  + "candle.png");
    public static final String ALTAR_BOTTOM = MOD_NAME  + ":altar_bottom";
    public static final String ALTAR_TOP = MOD_NAME  + ":altar_top";
    public static final String ALTAR_SIDE = MOD_NAME  + ":altar_side";
    // items
    public static final String CHISEL = MOD_NAME + ":chisel";
    public static final String CORPSE_VILLAGER = MOD_NAME + ":villager_corpse";
    public static final String CORPSE_DOG = MOD_NAME + ":dog_corpse";
    public static final String CORPSE_CAT = MOD_NAME + ":cat_corpse";
    public static final String CORPSE_HORSE = MOD_NAME + ":horse_corpse";
    // entities
    public static final ResourceLocation UNDERTAKER = new ResourceLocation(ENTITY_LOCATION + "undertaker.png");
    public static final ResourceLocation ZOMBIE_DOG = new ResourceLocation(ENTITY_LOCATION + "ZombieDog.png");
    public static final ResourceLocation ZOMBIE_OZELOT = new ResourceLocation(ENTITY_LOCATION + "ZombieOzelot.png");
    public static final ResourceLocation ZOMBIE_CAT_BLACK = new ResourceLocation(ENTITY_LOCATION + "ZombieCatBlack.png");
    public static final ResourceLocation ZOMBIE_CAT_RED = new ResourceLocation(ENTITY_LOCATION + "ZombieCatRed.png");
    public static final ResourceLocation ZOMBIE_CAT_SIAMESE = new ResourceLocation(ENTITY_LOCATION + "ZombieCatSiamese.png");
    public static final ResourceLocation SKELETON_DOG = new ResourceLocation(ENTITY_LOCATION + "SkeletonDog.png");
    public static final ResourceLocation SKELETON_CAT = new ResourceLocation(ENTITY_LOCATION + "SkeletonCat.png");
    public static final ResourceLocation SKULL_CRAWLER = new ResourceLocation(ENTITY_LOCATION + "SkullCrawler.png");
    public static final ResourceLocation WITHER_SKULL_CRAWLER = new ResourceLocation(ENTITY_LOCATION + "WitherSkullCrawler.png");
    public static final ResourceLocation ZOMBIE_SKULL_CRAWLER = new ResourceLocation(ENTITY_LOCATION + "ZombieSkullCrawler.png");

    // models - graves
    // vertical plates
    public static final ResourceLocation GRAVE_WOODEN_VERTICAL_PLATE = new ResourceLocation(GRAVES_LOCATION + "WoodenVerticalPlateGraveStone.png");
    public static final ResourceLocation GRAVE_SANDSTONE_VERTICAL_PLATE = new ResourceLocation(GRAVES_LOCATION + "SandstoneVerticalPlateGraveStone.png");
    public static final ResourceLocation GRAVE_STONE_VERTICAL_PLATE = new ResourceLocation(GRAVES_LOCATION + "StoneVerticalPlateGraveStone.png");
    public static final ResourceLocation GRAVE_MOSSY_VERTICAL_PLATE = new ResourceLocation(GRAVES_LOCATION + "MossyVerticalPlateGraveStone.png");
    public static final ResourceLocation GRAVE_IRON_VERTICAL_PLATE = new ResourceLocation(GRAVES_LOCATION + "IronVerticalPlateGraveStone.png");
    public static final ResourceLocation GRAVE_GOLDEN_VERTICAL_PLATE = new ResourceLocation(GRAVES_LOCATION + "GoldenVerticalPlateGraveStone.png");
    public static final ResourceLocation GRAVE_DIAMOND_VERTICAL_PLATE = new ResourceLocation(GRAVES_LOCATION + "DiamondVerticalPlateGraveStone.png");
    public static final ResourceLocation GRAVE_EMERALD_VERTICAL_PLATE = new ResourceLocation(GRAVES_LOCATION + "EmeraldVerticalPlateGraveStone.png");
    public static final ResourceLocation GRAVE_OBSIDIAN_VERTICAL_PLATE = new ResourceLocation(GRAVES_LOCATION + "ObsidianVerticalPlateGraveStone.png");
    public static final ResourceLocation GRAVE_QUARTZ_VERTICAL_PLATE = new ResourceLocation(GRAVES_LOCATION + "QuartzVerticalPlateGraveStone.png");
    public static final ResourceLocation GRAVE_LAPIS_VERTICAL_PLATE = new ResourceLocation(GRAVES_LOCATION + "LapisVerticalPlateGraveStone.png");
    public static final ResourceLocation GRAVE_REDSTONE_VERTICAL_PLATE = new ResourceLocation(GRAVES_LOCATION + "RedstoneVerticalPlateGraveStone.png");
    public static final ResourceLocation GRAVE_ICE_VERTICAL_PLATE = new ResourceLocation(GRAVES_LOCATION + "IceVerticalPlateGraveStone.png");
    // crosses
    public static final ResourceLocation GRAVE_WOODEN_CROSS = new ResourceLocation(GRAVES_LOCATION + "WoodenCrossGrave.png");
    public static final ResourceLocation GRAVE_SANDSTONE_CROSS = new ResourceLocation(GRAVES_LOCATION + "SandstoneCrossGrave.png");
    public static final ResourceLocation GRAVE_STONE_CROSS = new ResourceLocation(GRAVES_LOCATION + "StoneCrossGrave.png");
    public static final ResourceLocation GRAVE_MOSSY_CROSS = new ResourceLocation(GRAVES_LOCATION + "MossyCrossGrave.png");
    public static final ResourceLocation GRAVE_IRON_CROSS = new ResourceLocation(GRAVES_LOCATION + "IronCrossGrave.png");
    public static final ResourceLocation GRAVE_GOLDEN_CROSS = new ResourceLocation(GRAVES_LOCATION + "GoldenCrossGrave.png");
    public static final ResourceLocation GRAVE_DIAMOND_CROSS = new ResourceLocation(GRAVES_LOCATION + "DiamondCrossGrave.png");
    public static final ResourceLocation GRAVE_EMERALD_CROSS = new ResourceLocation(GRAVES_LOCATION + "EmeraldCrossGrave.png");
    public static final ResourceLocation GRAVE_LAPIS_CROSS = new ResourceLocation(GRAVES_LOCATION + "LapisCrossGrave.png");
    public static final ResourceLocation GRAVE_REDSTONE_CROSS = new ResourceLocation(GRAVES_LOCATION + "RedstoneCrossGrave.png");
    public static final ResourceLocation GRAVE_OBSIDIAN_CROSS = new ResourceLocation(GRAVES_LOCATION + "ObsidianCrossGrave.png");
    public static final ResourceLocation GRAVE_QUARTZ_CROSS = new ResourceLocation(GRAVES_LOCATION + "QuartzCrossGrave.png");
    public static final ResourceLocation GRAVE_ICE_CROSS = new ResourceLocation(GRAVES_LOCATION + "IceCrossGrave.png");
    // horisontal plates
    public static final ResourceLocation GRAVE_WOODEN_HORISONTAL_PLATE = new ResourceLocation(GRAVES_LOCATION + "WoodenHorisontalPlateGraveStone.png");
    public static final ResourceLocation GRAVE_SANDSTONE_HORISONTAL_PLATE = new ResourceLocation(GRAVES_LOCATION + "SandstoneHorisontalPlateGraveStone.png");
    public static final ResourceLocation GRAVE_STONE_HORISONTAL_PLATE = new ResourceLocation(GRAVES_LOCATION + "StoneHorisontalPlateGraveStone.png");
    public static final ResourceLocation GRAVE_MOSSY_HORISONTAL_PLATE = new ResourceLocation(GRAVES_LOCATION + "MossyHorisontalPlateGraveStone.png");
    public static final ResourceLocation GRAVE_IRON_HORISONTAL_PLATE = new ResourceLocation(GRAVES_LOCATION + "IronHorisontalPlateGraveStone.png");
    public static final ResourceLocation GRAVE_GOLDEN_HORISONTAL_PLATE = new ResourceLocation(GRAVES_LOCATION + "GoldenHorisontalPlateGraveStone.png");
    public static final ResourceLocation GRAVE_DIAMOND_HORISONTAL_PLATE = new ResourceLocation(GRAVES_LOCATION + "DiamondHorisontalPlateGraveStone.png");
    public static final ResourceLocation GRAVE_EMERALD_HORISONTAL_PLATE = new ResourceLocation(GRAVES_LOCATION + "EmeraldHorisontalPlateGraveStone.png");
    public static final ResourceLocation GRAVE_OBSIDIAN_HORISONTAL_PLATE = new ResourceLocation(GRAVES_LOCATION + "ObsidianHorisontalPlateGraveStone.png");
    public static final ResourceLocation GRAVE_QUARTZ_HORISONTAL_PLATE = new ResourceLocation(GRAVES_LOCATION + "QuartzHorisontalPlateGraveStone.png");
    public static final ResourceLocation GRAVE_LAPIS_HORISONTAL_PLATE = new ResourceLocation(GRAVES_LOCATION + "LapisHorisontalPlateGraveStone.png");
    public static final ResourceLocation GRAVE_REDSTONE_HORISONTAL_PLATE = new ResourceLocation(GRAVES_LOCATION + "RedstoneHorisontalPlateGraveStone.png");
    public static final ResourceLocation GRAVE_ICE_HORISONTAL_PLATE = new ResourceLocation(GRAVES_LOCATION + "IceHorisontalPlateGraveStone.png");
    // dog graves
    public static final ResourceLocation GRAVE_WOODEN_DOG_STATUE = new ResourceLocation(GRAVES_LOCATION + "WoodenDogGrave.png");
    public static final ResourceLocation GRAVE_SANDSTONE_DOG_STATUE = new ResourceLocation(GRAVES_LOCATION + "SandstoneDogGrave.png");
    public static final ResourceLocation GRAVE_STONE_DOG_STATUE = new ResourceLocation(GRAVES_LOCATION + "StoneDogGrave.png");
    public static final ResourceLocation GRAVE_MOSSY_DOG_STATUE = new ResourceLocation(GRAVES_LOCATION + "MossyDogGrave.png");
    public static final ResourceLocation GRAVE_IRON_DOG_STATUE = new ResourceLocation(GRAVES_LOCATION + "IronDogGrave.png");
    public static final ResourceLocation GRAVE_GOLDEN_DOG_STATUE = new ResourceLocation(GRAVES_LOCATION + "GoldenDogGrave.png");
    public static final ResourceLocation GRAVE_DIAMOND_DOG_STATUE = new ResourceLocation(GRAVES_LOCATION + "DiamondDogGrave.png");
    public static final ResourceLocation GRAVE_EMERALD_DOG_STATUE = new ResourceLocation(GRAVES_LOCATION + "EmeraldDogGrave.png");
    public static final ResourceLocation GRAVE_LAPIS_DOG_STATUE = new ResourceLocation(GRAVES_LOCATION + "LapisDogGrave.png");
    public static final ResourceLocation GRAVE_REDSTONE_DOG_STATUE = new ResourceLocation(GRAVES_LOCATION + "RedstoneDogGrave.png");
    public static final ResourceLocation GRAVE_OBSIDIAN_DOG_STATUE = new ResourceLocation(GRAVES_LOCATION + "ObsidianDogGrave.png");
    public static final ResourceLocation GRAVE_QUARTZ_DOG_STATUE = new ResourceLocation(GRAVES_LOCATION + "QuartzDogGrave.png");
    public static final ResourceLocation GRAVE_ICE_DOG_STATUE = new ResourceLocation(GRAVES_LOCATION + "IceDogGrave.png");
    // cats graves
    public static final ResourceLocation GRAVE_WOODEN_CAT_STATUE = new ResourceLocation(GRAVES_LOCATION + "WoodenCatGrave.png");
    public static final ResourceLocation GRAVE_SANDSTONE_CAT_STATUE = new ResourceLocation(GRAVES_LOCATION + "SandstoneCatGrave.png");
    public static final ResourceLocation GRAVE_STONE_CAT_STATUE = new ResourceLocation(GRAVES_LOCATION + "StoneCatGrave.png");
    public static final ResourceLocation GRAVE_MOSSY_CAT_STATUE = new ResourceLocation(GRAVES_LOCATION + "MossyCatGrave.png");
    public static final ResourceLocation GRAVE_IRON_CAT_STATUE = new ResourceLocation(GRAVES_LOCATION + "IronCatGrave.png");
    public static final ResourceLocation GRAVE_GOLDEN_CAT_STATUE = new ResourceLocation(GRAVES_LOCATION + "GoldenCatGrave.png");
    public static final ResourceLocation GRAVE_DIAMOND_CAT_STATUE = new ResourceLocation(GRAVES_LOCATION + "DiamondCatGrave.png");
    public static final ResourceLocation GRAVE_EMERALD_CAT_STATUE = new ResourceLocation(GRAVES_LOCATION + "EmeraldCatGrave.png");
    public static final ResourceLocation GRAVE_LAPIS_CAT_STATUE = new ResourceLocation(GRAVES_LOCATION + "LapisCatGrave.png");
    public static final ResourceLocation GRAVE_REDSTONE_CAT_STATUE = new ResourceLocation(GRAVES_LOCATION + "RedstoneCatGrave.png");
    public static final ResourceLocation GRAVE_OBSIDIAN_CAT_STATUE = new ResourceLocation(GRAVES_LOCATION + "ObsidianCatGrave.png");
    public static final ResourceLocation GRAVE_QUARTZ_CAT_STATUE = new ResourceLocation(GRAVES_LOCATION + "QuartzCatGrave.png");
    public static final ResourceLocation GRAVE_ICE_CAT_STATUE = new ResourceLocation(GRAVES_LOCATION + "IceCatGrave.png");
    // horses graves
    public static final ResourceLocation GRAVE_WOODEN_HORSE_STATUE = new ResourceLocation(GRAVES_LOCATION + "WoodenHorseGrave.png");
    public static final ResourceLocation GRAVE_SANDSTONE_HORSE_STATUE = new ResourceLocation(GRAVES_LOCATION + "SandstoneHorseGrave.png");
    public static final ResourceLocation GRAVE_STONE_HORSE_STATUE = new ResourceLocation(GRAVES_LOCATION + "StoneHorseGrave.png");
    public static final ResourceLocation GRAVE_MOSSY_HORSE_STATUE = new ResourceLocation(GRAVES_LOCATION + "MossyHorseGrave.png");
    public static final ResourceLocation GRAVE_IRON_HORSE_STATUE = new ResourceLocation(GRAVES_LOCATION + "IronHorseGrave.png");
    public static final ResourceLocation GRAVE_GOLDEN_HORSE_STATUE = new ResourceLocation(GRAVES_LOCATION + "GoldenHorseGrave.png");
    public static final ResourceLocation GRAVE_DIAMOND_HORSE_STATUE = new ResourceLocation(GRAVES_LOCATION + "DiamondHorseGrave.png");
    public static final ResourceLocation GRAVE_EMERALD_HORSE_STATUE = new ResourceLocation(GRAVES_LOCATION + "EmeraldHorseGrave.png");
    public static final ResourceLocation GRAVE_LAPIS_HORSE_STATUE = new ResourceLocation(GRAVES_LOCATION + "LapisHorseGrave.png");
    public static final ResourceLocation GRAVE_REDSTONE_HORSE_STATUE = new ResourceLocation(GRAVES_LOCATION + "RedstoneHorseGrave.png");
    public static final ResourceLocation GRAVE_OBSIDIAN_HORSE_STATUE = new ResourceLocation(GRAVES_LOCATION + "ObsidianHorseGrave.png");
    public static final ResourceLocation GRAVE_QUARTZ_HORSE_STATUE = new ResourceLocation(GRAVES_LOCATION + "QuartzHorseGrave.png");
    public static final ResourceLocation GRAVE_ICE_HORSE_STATUE = new ResourceLocation(GRAVES_LOCATION + "IceHorseGrave.png");
    // swords graves
    public static final ResourceLocation GRAVE_WOODEN_SWORD = new ResourceLocation(GRAVES_LOCATION + "WoodenSwordGrave.png");
    public static final ResourceLocation GRAVE_STONE_SWORD = new ResourceLocation(GRAVES_LOCATION + "StoneSwordGrave.png");
    public static final ResourceLocation GRAVE_IRON_SWORD = new ResourceLocation(GRAVES_LOCATION + "IronSwordGrave.png");
    public static final ResourceLocation GRAVE_GOLDEN_SWORD = new ResourceLocation(GRAVES_LOCATION + "GoldenSwordGrave.png");
    public static final ResourceLocation GRAVE_DIAMOND_SWORD = new ResourceLocation(GRAVES_LOCATION + "DiamondSwordGrave.png");

    // models - memorials
    public static final ResourceLocation MEMORIAL_CROSS = new ResourceLocation(MEMORIALS_LOCATION + "ModelMemorialCross.png");
    public static final ResourceLocation MEMORIAL_OBELISK = new ResourceLocation(MEMORIALS_LOCATION + "ModelMemorialObelisk.png");
    // steve memorials
    public static final ResourceLocation MEMORIAL_WOODEN_STEVE_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "WoodenSteveMemorial.png");
    public static final ResourceLocation MEMORIAL_SANDSTONE_STEVE_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "SandstoneSteveMemorial.png");
    public static final ResourceLocation MEMORIAL_STONE_STEVE_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "StoneSteveMemorial.png");
    public static final ResourceLocation MEMORIAL_MOSSY_STEVE_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "MossySteveMemorial.png");
    public static final ResourceLocation MEMORIAL_IRON_STEVE_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "IronSteveMemorial.png");
    public static final ResourceLocation MEMORIAL_GOLDEN_STEVE_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "GoldenSteveMemorial.png");
    public static final ResourceLocation MEMORIAL_DIAMOND_STEVE_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "DiamondSteveMemorial.png");
    public static final ResourceLocation MEMORIAL_EMERALD_STEVE_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "EmeraldSteveMemorial.png");
    public static final ResourceLocation MEMORIAL_LAPIS_STEVE_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "LapisSteveMemorial.png");
    public static final ResourceLocation MEMORIAL_REDSTONE_STEVE_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "RedstoneSteveMemorial.png");
    public static final ResourceLocation MEMORIAL_OBSIDIAN_STEVE_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "ObsidianSteveMemorial.png");
    public static final ResourceLocation MEMORIAL_QUARTZ_STEVE_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "QuartzSteveMemorial.png");
    public static final ResourceLocation MEMORIAL_ICE_STEVE_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "IceSteveMemorial.png");
    // villagers memorials
    public static final ResourceLocation MEMORIAL_WOODEN_VILLAGER_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "WoodenVillagerMemorial.png");
    public static final ResourceLocation MEMORIAL_SANDSTONE_VILLAGER_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "SandstoneVillagerMemorial.png");
    public static final ResourceLocation MEMORIAL_STONE_VILLAGER_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "StoneVillagerMemorial.png");
    public static final ResourceLocation MEMORIAL_MOSSY_VILLAGER_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "MossyVillagerMemorial.png");
    public static final ResourceLocation MEMORIAL_IRON_VILLAGER_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "IronVillagerMemorial.png");
    public static final ResourceLocation MEMORIAL_GOLDEN_VILLAGER_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "GoldenVillagerMemorial.png");
    public static final ResourceLocation MEMORIAL_DIAMOND_VILLAGER_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "DiamondVillagerMemorial.png");
    public static final ResourceLocation MEMORIAL_EMERALD_VILLAGER_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "EmeraldVillagerMemorial.png");
    public static final ResourceLocation MEMORIAL_LAPIS_VILLAGER_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "LapisVillagerMemorial.png");
    public static final ResourceLocation MEMORIAL_REDSTONE_VILLAGER_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "RedstoneVillagerMemorial.png");
    public static final ResourceLocation MEMORIAL_OBSIDIAN_VILLAGER_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "ObsidianVillagerMemorial.png");
    public static final ResourceLocation MEMORIAL_QUARTZ_VILLAGER_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "QuartzVillagerMemorial.png");
    public static final ResourceLocation MEMORIAL_ICE_VILLAGER_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "IceVillagerMemorial.png");
    // angels memorials
    public static final ResourceLocation MEMORIAL_WOODEN_ANGEL_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "WoodenAngelMemorial.png");
    public static final ResourceLocation MEMORIAL_SANDSTONE_ANGEL_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "SandstoneAngelMemorial.png");
    public static final ResourceLocation MEMORIAL_STONE_ANGEL_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "StoneAngelMemorial.png");
    public static final ResourceLocation MEMORIAL_MOSSY_ANGEL_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "MossyAngelMemorial.png");
    public static final ResourceLocation MEMORIAL_IRON_ANGEL_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "IronAngelMemorial.png");
    public static final ResourceLocation MEMORIAL_GOLDEN_ANGEL_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "GoldenAngelMemorial.png");
    public static final ResourceLocation MEMORIAL_DIAMOND_ANGEL_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "DiamondAngelMemorial.png");
    public static final ResourceLocation MEMORIAL_EMERALD_ANGEL_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "EmeraldAngelMemorial.png");
    public static final ResourceLocation MEMORIAL_LAPIS_ANGEL_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "LapisAngelMemorial.png");
    public static final ResourceLocation MEMORIAL_REDSTONE_ANGEL_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "RedstoneAngelMemorial.png");
    public static final ResourceLocation MEMORIAL_OBSIDIAN_ANGEL_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "ObsidianAngelMemorial.png");
    public static final ResourceLocation MEMORIAL_QUARTZ_ANGEL_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "QuartzAngelMemorial.png");
    public static final ResourceLocation MEMORIAL_ICE_ANGEL_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "IceAngelMemorial.png");
    // dogs memorials
    public static final ResourceLocation MEMORIAL_WOODEN_DOG_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "WoodenDogMemorial.png");
    public static final ResourceLocation MEMORIAL_SANDSTONE_DOG_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "SandstoneDogMemorial.png");
    public static final ResourceLocation MEMORIAL_STONE_DOG_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "StoneDogMemorial.png");
    public static final ResourceLocation MEMORIAL_MOSSY_DOG_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "MossyDogMemorial.png");
    public static final ResourceLocation MEMORIAL_IRON_DOG_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "IronDogMemorial.png");
    public static final ResourceLocation MEMORIAL_GOLDEN_DOG_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "GoldenDogMemorial.png");
    public static final ResourceLocation MEMORIAL_DIAMOND_DOG_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "DiamondDogMemorial.png");
    public static final ResourceLocation MEMORIAL_EMERALD_DOG_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "EmeraldDogMemorial.png");
    public static final ResourceLocation MEMORIAL_LAPIS_DOG_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "LapisDogMemorial.png");
    public static final ResourceLocation MEMORIAL_REDSTONE_DOG_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "RedstoneDogMemorial.png");
    public static final ResourceLocation MEMORIAL_OBSIDIAN_DOG_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "ObsidianDogMemorial.png");
    public static final ResourceLocation MEMORIAL_QUARTZ_DOG_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "QuartzDogMemorial.png");
    public static final ResourceLocation MEMORIAL_ICE_DOG_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "IceDogMemorial.png");
    // cats memorials
    public static final ResourceLocation MEMORIAL_WOODEN_CAT_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "WoodenCatMemorial.png");
    public static final ResourceLocation MEMORIAL_SANDSTONE_CAT_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "SandstoneCatMemorial.png");
    public static final ResourceLocation MEMORIAL_STONE_CAT_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "StoneCatMemorial.png");
    public static final ResourceLocation MEMORIAL_MOSSY_CAT_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "MossyCatMemorial.png");
    public static final ResourceLocation MEMORIAL_IRON_CAT_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "IronCatMemorial.png");
    public static final ResourceLocation MEMORIAL_GOLDEN_CAT_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "GoldenCatMemorial.png");
    public static final ResourceLocation MEMORIAL_DIAMOND_CAT_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "DiamondCatMemorial.png");
    public static final ResourceLocation MEMORIAL_EMERALD_CAT_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "EmeraldCatMemorial.png");
    public static final ResourceLocation MEMORIAL_LAPIS_CAT_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "LapisCatMemorial.png");
    public static final ResourceLocation MEMORIAL_REDSTONE_CAT_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "RedstoneCatMemorial.png");
    public static final ResourceLocation MEMORIAL_OBSIDIAN_CAT_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "ObsidianCatMemorial.png");
    public static final ResourceLocation MEMORIAL_QUARTZ_CAT_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "QuartzCatMemorial.png");
    public static final ResourceLocation MEMORIAL_ICE_CAT_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "IceCatMemorial.png");
    // creepers memorials
    public static final ResourceLocation MEMORIAL_WOODEN_CREEPER_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "WoodenCreeperMemorial.png");
    public static final ResourceLocation MEMORIAL_SANDSTONE_CREEPER_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "SandstoneCreeperMemorial.png");
    public static final ResourceLocation MEMORIAL_STONE_CREEPER_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "StoneCreeperMemorial.png");
    public static final ResourceLocation MEMORIAL_MOSSY_CREEPER_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "MossyCreeperMemorial.png");
    public static final ResourceLocation MEMORIAL_IRON_CREEPER_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "IronCreeperMemorial.png");
    public static final ResourceLocation MEMORIAL_GOLDEN_CREEPER_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "GoldenCreeperMemorial.png");
    public static final ResourceLocation MEMORIAL_DIAMOND_CREEPER_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "DiamondCreeperMemorial.png");
    public static final ResourceLocation MEMORIAL_EMERALD_CREEPER_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "EmeraldCreeperMemorial.png");
    public static final ResourceLocation MEMORIAL_LAPIS_CREEPER_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "LapisCreeperMemorial.png");
    public static final ResourceLocation MEMORIAL_REDSTONE_CREEPER_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "RedstoneCreeperMemorial.png");
    public static final ResourceLocation MEMORIAL_OBSIDIAN_CREEPER_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "ObsidianCreeperMemorial.png");
    public static final ResourceLocation MEMORIAL_QUARTZ_CREEPER_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "QuartzCreeperMemorial.png");
    public static final ResourceLocation MEMORIAL_ICE_CREEPER_STATUE = new ResourceLocation(MEMORIALS_LOCATION + "IceCreeperMemorial.png");
    // models - parts
    public static final ResourceLocation CREEPER_AURA = new ResourceLocation("textures/entity/creeper/creeper_armor.png");
    public static final ResourceLocation SWORD_AURA = new ResourceLocation("textures/misc/enchanted_item_glint.png");
    public static final ResourceLocation STEVE_ARMOR = new ResourceLocation(MEMORIALS_LOCATION + "ModelSteveStatueMemorialArmor.png");
    public static final ResourceLocation SMALL_PEDESTAL = new ResourceLocation(MEMORIALS_LOCATION + "ModelSmallPedestal.png");
    // pedestals
    public static final ResourceLocation MEMORIAL_WOODEN_BIG_PEDESTAL = new ResourceLocation(PEDESTALS_LOCATION + "WoodenBigPedestal.png");
    public static final ResourceLocation MEMORIAL_SANDSTONE_BIG_PEDESTAL = new ResourceLocation(PEDESTALS_LOCATION + "SandstoneBigPedestal.png");
    public static final ResourceLocation MEMORIAL_STONE_BIG_PEDESTAL = new ResourceLocation(PEDESTALS_LOCATION + "StoneBigPedestal.png");
    public static final ResourceLocation MEMORIAL_MOSSY_BIG_PEDESTAL = new ResourceLocation(PEDESTALS_LOCATION + "MossyBigPedestal.png");
    public static final ResourceLocation MEMORIAL_IRON_BIG_PEDESTAL = new ResourceLocation(PEDESTALS_LOCATION + "IronBigPedestal.png");
    public static final ResourceLocation MEMORIAL_GOLDEN_BIG_PEDESTAL = new ResourceLocation(PEDESTALS_LOCATION + "GoldenBigPedestal.png");
    public static final ResourceLocation MEMORIAL_DIAMOND_BIG_PEDESTAL = new ResourceLocation(PEDESTALS_LOCATION + "DiamondBigPedestal.png");
    public static final ResourceLocation MEMORIAL_EMERALD_BIG_PEDESTAL = new ResourceLocation(PEDESTALS_LOCATION + "EmeraldBigPedestal.png");
    public static final ResourceLocation MEMORIAL_LAPIS_BIG_PEDESTAL = new ResourceLocation(PEDESTALS_LOCATION + "LapisBigPedestal.png");
    public static final ResourceLocation MEMORIAL_REDSTONE_BIG_PEDESTAL = new ResourceLocation(PEDESTALS_LOCATION + "RedstoneBigPedestal.png");
    public static final ResourceLocation MEMORIAL_OBSIDIAN_BIG_PEDESTAL = new ResourceLocation(PEDESTALS_LOCATION + "ObsidianBigPedestal.png");
    public static final ResourceLocation MEMORIAL_QUARTZ_BIG_PEDESTAL = new ResourceLocation(PEDESTALS_LOCATION + "QuartzBigPedestal.png");
    public static final ResourceLocation MEMORIAL_ICE_BIG_PEDESTAL = new ResourceLocation(PEDESTALS_LOCATION + "IceBigPedestal.png");
    
    // haunted chest
    public static final ResourceLocation CHRISTMAS_CHEST = new ResourceLocation("textures/entity/chest/christmas.png");
    public static final ResourceLocation DEFAULT_CHEST = new ResourceLocation("textures/entity/chest/normal.png");
    
    // skull candle
    public static final ResourceLocation SKELETON_SKULL_CANDLE = new ResourceLocation(BLOCK_LOCATION + "SkeletonSkullCandle.png");
    public static final ResourceLocation WITHER_SKULL_CANDLE = new ResourceLocation(BLOCK_LOCATION + "WitherSkullCandle.png");
    public static final ResourceLocation ZOMBIE_SKULL_CANDLE = new ResourceLocation(BLOCK_LOCATION + "ZombieSkullCandle.png");
}
