package simbols;

import java.util.HashSet;

/**
 * Интрфейс классов-фрифметических действий
 */
public interface SimbolsInterface {
    /**
     * actionsSet - список инициализированных арифметических действий
     */
    public static HashSet<String> actionsSet = new HashSet<>();
    void addSimbol(String simbol);
}
