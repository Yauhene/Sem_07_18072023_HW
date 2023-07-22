package simbols;

import java.util.HashSet;

/**
 * Класс-предок классов арифметических действий
 */
abstract public class Simbols implements SimbolsInterface {

    /**
     * Метод, возвращающий список инициализированных арифметических действий
     * @return
     */
    public static HashSet<String> getActionsSet() {
        return actionsSet;
    }


}
