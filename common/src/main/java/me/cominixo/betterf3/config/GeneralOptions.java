package me.cominixo.betterf3.config;

/**
 * General Options for the config.
 */
public final class GeneralOptions {

  private GeneralOptions() {
    // Do nothing
  }

  /**
   * Disables the mod.
   */
  public static boolean disableMod = false;
  /**
   * Places a space between every module.
   */
  public static boolean spaceEveryModule = false;
  /**
   * Places a shadow behind the text.
   */
  public static boolean shadowText = true;
  /**
   * Enables the sliding animation.
   */
  public static boolean enableAnimations = true;
  /**
   * The sliding animation speed.
   */
  public static double animationSpeed = 1;
  /**
   * Sets the font scale.
   */
  public static double fontScale = 1;
  /**
   * Sets the background color.
   */
  public static int backgroundColor = 0x6F505050;
  /**
   * Hides the sidebar while looking at the F3 menu.
   */
  public static boolean hideSidebar = true;

  /**
   * Hides the bossbar while looking at the F3 menu.
   */
  public static boolean hideBossbar = true;

  /**
   * Always shows the profiler when using F3.
   */
  public static boolean alwaysEnableProfiler = false;

  /**
   * Always shows the TPS graph when using F3.
   */
  public static boolean alwaysEnableTPS = false;
}
