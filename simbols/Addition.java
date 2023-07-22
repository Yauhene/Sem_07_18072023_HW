package simbols;

/**
 * Класс сложения
 */
public class Addition extends Simbols implements SimbolsInterface{
     String simbolAdd;

    /**
     * Конструктор класса
     * @param simbol - символ класса ("+"), принимается от класса Init
     */
    public Addition (String simbol) {
        this.simbolAdd = simbol;
        addSimbol(simbolAdd);
    }

    /**
     * Метод, добавляющий символ класса в список арифметических действий при инициализации
     * @param simbol
     */
    @Override
    public void addSimbol(String simbol) {
          actionsSet.add(simbol);
    }
}
