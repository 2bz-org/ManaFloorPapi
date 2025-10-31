package org.bukkit;

/**
 * Minimal stub for compilation only. The actual Bukkit API provides a much
 * richer contract at runtime.
 */
public interface OfflinePlayer {
    default String getName() {
        return null;
    }
}
