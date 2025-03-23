package me.xentany.minimessageprovider;

import net.kyori.adventure.text.minimessage.MiniMessage;

public interface MiniMessageProvider {

  static MiniMessage get() {
    return MiniMessageProviderPlugin.get();
  }
}