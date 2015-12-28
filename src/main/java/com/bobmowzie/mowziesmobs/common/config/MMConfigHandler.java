package com.bobmowzie.mowziesmobs.common.config;

import net.ilexiconn.llibrary.common.config.IConfigHandler;
import net.minecraftforge.common.config.Configuration;

import static net.minecraftforge.common.config.Configuration.CATEGORY_GENERAL;

public class MMConfigHandler implements IConfigHandler
{
    public static int spawnrateFoliaath;
    public static int spawnrateWroughtnaut;
    public static int spawnrateBarakoa;

    public void loadConfig(Configuration config)
    {
        spawnrateFoliaath = config.getInt("Foliaath Spawnrate", CATEGORY_GENERAL, 20, 0, 100, "");
        spawnrateWroughtnaut = config.getInt("Wroughtnaut Spawnrate", CATEGORY_GENERAL, 50, 0, 100, "Smaller number is more Wroughtnauts, 0 to disable spawning");
        spawnrateBarakoa = config.getInt("Barakoa Spawnrate", CATEGORY_GENERAL, 3, 0, 100, "");
    }
}
