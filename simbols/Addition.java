package simbols;

/**
 * Класс сложения
 */
public class Addition extends Simbols implements SimbolsInterface{
     String actionSimbol;
     String actionName = "Addition (сложение)";

    /**
     * Конструктор класса
     * @param simbol - символ класса ("+"), принимается от класса Init
     */
    public Addition (String simbol) {
        this.actionSimbol = simbol;
        this.actionName = actionName;
        addSimbol(actionSimbol,actionName);

    }

    public String getActionName() {
        System.out.println("Попытка вывода actionName");
        return actionName;
    }

    public String getSimbol() {
        return actionSimbol;
    }


//    @Override
//    public void addSimbol(String simbol, String name) {
//          actionsMap.put(actionSimbol, actionName);
//    }

    @Override
    public String toString() {

//        return super.toString();
        return  null;
    }

    public static int action(int num1, int num2) {
        return (num1 + num2);
    }
}
