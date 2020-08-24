package me.hsgamer.topin.exampleaddon;

import me.hsgamer.topin.addon.object.Addon;

public final class MainAddon extends Addon {

  /**
   * Called when loading the addon
   *
   * @return whether the addon is loaded properly
   */
  @Override
  public boolean onLoad() {
    return true;
  }

  /**
   * Called when enabling the addon
   */
  @Override
  public void onEnable() {
    // Enable logic
  }

  /**
   * Called after all addons were loaded
   */
  @Override
  public void onPostEnable() {
    // Post Enable logic
  }

  /**
   * Called when disabling the addon
   */
  @Override
  public void onDisable() {
    // Disable logic
  }


  /**
   * Called when reloading
   */
  @Override
  public void onReload() {
    // Reload logic
  }
}