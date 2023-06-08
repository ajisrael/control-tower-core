package control.tower.core.utils;

public class Helper {

    public static boolean isNullOrBlank(String string) {
        return string == null || string.isBlank();
    }

    public static void throwErrorIfEntityDoesNotExist(Object entity, String message) {
        if (entity == null) {
            throw new IllegalStateException(message);
        }
    }
}
