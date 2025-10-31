package me.clip.placeholderapi.expansion;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

/**
 * Minimal stub for the PlaceholderExpansion base class. The actual
 * implementation is provided by PlaceholderAPI at runtime.
 */
public abstract class PlaceholderExpansion {

    public abstract @NotNull String getIdentifier();

    public abstract @NotNull String getAuthor();

    public abstract @NotNull String getVersion();

    public boolean persist() {
        return false;
    }

    public boolean canRegister() {
        return false;
    }

    public String onPlaceholderRequest(Player player, @NotNull String params) {
        return null;
    }

    public String onRequest(OfflinePlayer player, @NotNull String params) {
        if (player instanceof Player) {
            return onPlaceholderRequest((Player) player, params);
        }
        return null;
    }
}
