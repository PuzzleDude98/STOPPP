package net.pd98;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import com.terraformersmc.modmenu.config.ModMenuConfig;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class STOPPModMenu implements ModMenuApi {

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {

        return parent -> AutoConfig.getConfigScreen(STOPPPConfig.class, parent).get();

//        return parent -> {
//            ConfigBuilder builder = ConfigBuilder.create()
//                    .setParentScreen(parent)
//                    .setTitle(Text.literal("My Mod Config"));
//
//            ConfigCategory general = builder.getOrCreateCategory(Text.literal("General"));
//            ConfigEntryBuilder entryBuilder = builder.entryBuilder();
//
//            // Example boolean option
//            general.addEntry(entryBuilder
//                    .startStrList(Text.literal("Blocked Servers"), List.of("hypixel.net","localhost")) // default value
//                    .setDefaultValue(List.of("hypixel.net","localhost"))
//                    .setExpanded(true)
//                    .setSaveConsumer(newValue -> {
//                        // Save the new value to your config here
//                        System.out.println("Saved value: " + newValue);
//                    })
//                    .build());
//
//            builder.setSavingRunnable(() -> {
//                // Save your config to disk here
//                System.out.println("Saving config...");
//            });
//
//            return builder.build();
//        };
    }

}
