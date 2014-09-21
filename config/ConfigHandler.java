package com.sydiw.mclib.config;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler
{
    protected static Configuration configuration;

    public static void init(File configFile)
    {
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    public static void loadConfiguration()
    {
        // Pass
    }
}
