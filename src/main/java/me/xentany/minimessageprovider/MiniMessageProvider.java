package me.xentany.minimessageprovider;

import net.kyori.adventure.text.minimessage.MiniMessage;

@SuppressWarnings("unused") //api
public interface MiniMessageProvider {

  static MiniMessage getMiniMessage() {
    return MiniMessageProviderPlugin.getMiniMessage();
  }
}