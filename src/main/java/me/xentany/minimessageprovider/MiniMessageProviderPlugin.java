package me.xentany.minimessageprovider;

import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.InvocationTargetException;

public final class MiniMessageProviderPlugin extends JavaPlugin {

  private static MiniMessage miniMessage;

  @Override
  public void onEnable() {
    miniMessage = fetchMiniMessageInstance();
  }

  @SuppressWarnings("JavaReflectionMemberAccess")
  private static MiniMessage fetchMiniMessageInstance() {
    try {
      var miniMessageClass = MiniMessage.class;
      var miniMessageMethod = miniMessageClass.getDeclaredMethod("miniMessage");
      return (MiniMessage) miniMessageMethod.invoke(null);
    } catch (final NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
      return MiniMessage.get();
    }
  }

  static MiniMessage get() {
    return miniMessage;
  }
}