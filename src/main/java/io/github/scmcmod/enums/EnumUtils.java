package io.github.scmcmod.enums;
import java.util.Optional;
import java.util.function.Function;

/**
 * Some generic utility methods for working with enums.
 *
 * @author ROMVoid95
 * 
 */
public final class EnumUtils {
    private EnumUtils() {throw new IllegalAccessError("Utility class");}

    public static <T extends Enum<T>> Optional<T> fromString(Class<T> enumClass, String value) {
        return fromString(enumClass, value, true);
    }

    public static <T extends Enum<T>> Optional<T> fromString(Class<T> enumClass, String value, boolean ignoreCase) {
        for (T t : enumClass.getEnumConstants())
            if ((ignoreCase && t.name().equalsIgnoreCase(value)) || t.name().equals(value))
                return Optional.of(t);

        return Optional.empty();
    }

    public static <T extends Enum<T>> Optional<T> fromIndex(Class<T> enumClass, int value, Function<T, Integer> getter) {
        for (T t : enumClass.getEnumConstants())
            if (getter.apply(t) == value)
                return Optional.of(t);

        return Optional.empty();
    }

    public static <T extends Enum<T>> Optional<T> fromOrdinal(Class<T> enumClass, int value) {
        if (value < 0 || value >= enumClass.getEnumConstants().length)
            return Optional.empty();
        return Optional.of(enumClass.getEnumConstants()[value]);
    }
}
