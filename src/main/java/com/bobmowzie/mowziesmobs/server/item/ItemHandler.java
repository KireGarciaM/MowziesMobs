package com.bobmowzie.mowziesmobs.server.item;

import com.bobmowzie.mowziesmobs.MowziesMobs;
import com.bobmowzie.mowziesmobs.server.block.BlockHandler;
import com.bobmowzie.mowziesmobs.server.creativetab.CreativeTabHandler;
import com.bobmowzie.mowziesmobs.server.entity.barakoa.MaskType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.ObjectHolder;

import java.util.List;

@ObjectHolder(MowziesMobs.MODID)
@Mod.EventBusSubscriber(modid = MowziesMobs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class ItemHandler {
    private ItemHandler() {}

    public static final ItemFoliaathSeed FOLIAATH_SEED = null;
    public static final ItemTestStructure TEST_STRUCTURE = null;
    public static final ItemMobRemover MOB_REMOVER = null;
    public static final ItemWroughtAxe WROUGHT_AXE = null;
    public static final ItemWroughtHelm WROUGHT_HELMET = null;
    public static final ItemBarakoaMask BARAKOA_MASK_FURY = null;
    public static final ItemBarakoaMask BARAKOA_MASK_FEAR = null;
    public static final ItemBarakoaMask BARAKOA_MASK_RAGE = null;
    public static final ItemBarakoaMask BARAKOA_MASK_BLISS = null;
    public static final ItemBarakoaMask BARAKOA_MASK_MISERY = null;
    public static final ItemBarakoMask BARAKO_MASK = null;
    public static final ItemDart DART = null;
    public static final ItemSpear SPEAR = null;
    public static final ItemBlowgun BLOWGUN = null;
    public static final ItemSpawnEgg SPAWN_EGG = null;
    public static final ItemGrantSunsBlessing GRANT_SUNS_BLESSING = null;
    public static final ItemIceCrystal ICE_CRYSTAL = null;
    public static final ItemEarthTalisman EARTH_TALISMAN = null;
    public static final ItemCapturedGrottol CAPTURED_GROTTOL = null;
    public static final ItemGlowingJelly GLOWING_JELLY = null;
    public static final ItemNagaFang NAGA_FANG = null;
    public static final ItemNagaFangDagger NAGA_FANG_DAGGER = null;
    public static final ItemLogo LOGO = null;

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new ItemFoliaathSeed(new Item.Properties().group(CreativeTabHandler.INSTANCE.creativeTab)).setRegistryName("foliaath_seed"),
                //new ItemTestStructure(),
                new ItemMobRemover(new Item.Properties().group(CreativeTabHandler.INSTANCE.creativeTab)).setRegistryName("mob_remover"),
                new ItemWroughtAxe(new Item.Properties().group(CreativeTabHandler.INSTANCE.creativeTab)).setRegistryName("wrought_axe"),
                new ItemWroughtHelm(),
                new ItemBarakoMask(),
                new ItemDart(new Item.Properties().group(CreativeTabHandler.INSTANCE.creativeTab)).setRegistryName("dart"),
                new ItemSpear(new Item.Properties().group(CreativeTabHandler.INSTANCE.creativeTab)).setRegistryName("spear"),
                new ItemBlowgun(),
                new ItemSpawnEgg(),
                new ItemGrantSunsBlessing(),
                new ItemIceCrystal(),
                new ItemEarthTalisman(),
                new ItemCapturedGrottol()
                    .setRegistryName("captured_grottol"),
                new ItemGlowingJelly(1, 0.1f, false),
                new ItemNagaFang(),
                new ItemNagaFangDagger(),
                new ItemLogo(),
                new BlockItem(BlockHandler.PAINTED_ACACIA).setRegistryName(BlockHandler.PAINTED_ACACIA.getRegistryName()),
                new BlockItem(BlockHandler.PAINTED_ACACIA_SLAB).setRegistryName(BlockHandler.PAINTED_ACACIA_SLAB.getRegistryName())
        );
        for (MaskType mask : MaskType.values()) {
            event.getRegistry().register(new ItemBarakoaMask(mask));
        }
    }

    public static void addItemText(Item item, List<String> lines) {
        String keyStart = item.getTranslationKey() + ".text.";
        for (int line = 0;; line++) {
            String key = keyStart + line;
            if (I18n.canTranslate(key)) {
                lines.add(I18n.translateToLocal(key));
            } else {
                break;
            }
        }
    }
}