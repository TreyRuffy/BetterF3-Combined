package me.cominixo.betterf3.config.gui;

import me.cominixo.betterf3.config.GeneralOptions;
import me.cominixo.betterf3.config.ModConfigFile;
import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

/**
 * The General Options screen.
 */
public final class GeneralOptionsScreen {

  private GeneralOptionsScreen() {
    // Do nothing
  }

  /**
   * Gets the config builder.
   *
   * @param parent the previous screen
   * @return the config builder
   */
  public static ConfigBuilder configBuilder(final Screen parent) {

    final ConfigBuilder builder = ConfigBuilder.create()
    .setParentScreen(parent)
    .setTitle(Text.translatable("config.betterf3.title"));

    builder.setSavingRunnable(ModConfigFile.saveRunnable);

    final ConfigEntryBuilder entryBuilder = builder.entryBuilder();

    final ConfigCategory general = builder.getOrCreateCategory(Text.translatable("config.betterf3.title.general"));

    general.addEntry(entryBuilder.startBooleanToggle(Text.translatable("config.betterf3.disable"), GeneralOptions.disableMod)
    .setDefaultValue(false)
    .setTooltip(Text.translatable("config.betterf3.disable.tooltip"))
    .setSaveConsumer(newValue -> GeneralOptions.disableMod = newValue)
    .build());

    general.addEntry(entryBuilder.startBooleanToggle(Text.translatable("config.betterf3.space_modules"), GeneralOptions.spaceEveryModule)
    .setDefaultValue(false)
    .setTooltip(Text.translatable("config.betterf3.space_modules.tooltip"))
    .setSaveConsumer(newValue -> GeneralOptions.spaceEveryModule = newValue)
    .build());

    general.addEntry(entryBuilder.startBooleanToggle(Text.translatable("config.betterf3.shadow_text"), GeneralOptions.shadowText)
    .setDefaultValue(true)
    .setTooltip(Text.translatable("config.betterf3.shadow_text.tooltip"))
    .setSaveConsumer(newValue -> GeneralOptions.shadowText = newValue)
    .build());

    general.addEntry(entryBuilder.startBooleanToggle(Text.translatable("config.betterf3.animations"), GeneralOptions.enableAnimations)
    .setDefaultValue(true)
    .setTooltip(Text.translatable("config.betterf3.animations.tooltip"))
    .setSaveConsumer(newValue -> GeneralOptions.enableAnimations = newValue)
    .build());

    general.addEntry(entryBuilder.startDoubleField(Text.translatable("config.betterf3.animationSpeed"), GeneralOptions.animationSpeed)
    .setDefaultValue(1)
    .setMin(1).setMax(3)
    .setTooltip(Text.translatable("config.betterf3.animationSpeed.tooltip"))
    .setSaveConsumer(newValue -> GeneralOptions.animationSpeed = newValue)
    .build());

    general.addEntry(entryBuilder.startDoubleField(Text.translatable("config.betterf3.fontScale"), GeneralOptions.fontScale)
    .setDefaultValue(1)
    .setMin(0.1).setMax(2)
    .setTooltip(Text.translatable("config.betterf3.fontScale.tooltip"))
    .setSaveConsumer(newValue -> GeneralOptions.fontScale = newValue)
    .build());

    general.addEntry(entryBuilder.startColorField(Text.translatable("config.betterf3.color.background"), GeneralOptions.backgroundColor)
    .setDefaultValue(0x6F505050)
    .setAlphaMode(true)
    .setTooltip(Text.translatable("config.betterf3.color.background.tooltip"))
    .setSaveConsumer(newValue -> GeneralOptions.backgroundColor = newValue)
    .build());

    general.addEntry(entryBuilder.startBooleanToggle(Text.translatable("config.betterf3.sidebar"), GeneralOptions.hideSidebar)
    .setDefaultValue(true)
    .setTooltip(Text.translatable("config.betterf3.sidebar.tooltip"))
    .setSaveConsumer(newValue -> GeneralOptions.hideSidebar = newValue)
    .build());

    general.addEntry(entryBuilder.startBooleanToggle(Text.translatable("config.betterf3.bossbar"), GeneralOptions.hideBossbar)
    .setDefaultValue(true)
    .setTooltip(Text.translatable("config.betterf3.bossbar.tooltip"))
    .setSaveConsumer(newValue -> GeneralOptions.hideBossbar = newValue)
    .build());

    general.addEntry(entryBuilder.startBooleanToggle(Text.translatable("config.betterf3.always_enable_profiler"), GeneralOptions.alwaysEnableProfiler)
    .setDefaultValue(false)
    .setTooltip(Text.translatable("config.betterf3.always_enable_profiler.tooltip"))
    .setSaveConsumer(newValue -> GeneralOptions.alwaysEnableProfiler = newValue)
    .build());

    general.addEntry(entryBuilder.startBooleanToggle(Text.translatable("config.betterf3.always_enable_tps_graph"), GeneralOptions.alwaysEnableTPS)
    .setDefaultValue(false)
    .setTooltip(Text.translatable("config.betterf3.always_enable_tps_graph.tooltip"))
    .setSaveConsumer(newValue -> GeneralOptions.alwaysEnableTPS = newValue)
    .build());

    builder.transparentBackground();
    return builder;
  }
}
