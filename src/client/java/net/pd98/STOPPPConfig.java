package net.pd98;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

import java.util.List;

@Config(name="stoppp")
public class STOPPPConfig implements ConfigData {
    public List<String> blockedServers = List.of("hypixel.net");

    @ConfigEntry.Gui.Excluded
    public String errorTextLine1 = "WHOA WHOA WHOA THERE";

    @ConfigEntry.Gui.Excluded
    public String errorTextLine2 = "That was a close one buddy.";
}
