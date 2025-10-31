package me.clip.placeholderapi;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

/**
 * Minimal stub for compilation in CI environments without access to the
 * PlaceholderAPI repository. The real implementation is provided by the
 * server at runtime.
 */
public final class PlaceholderAPI {
    private PlaceholderAPI() {
        throw new AssertionError();
    }

    public static @NotNull String setPlaceholders(Player player, @NotNull String params) {
        throw new UnsupportedOperationException("PlaceholderAPI is not available at build time");
    }
}
