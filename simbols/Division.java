package simbols;

public class Division extends Simbols implements SimbolsInterface {
    String simbolDiv;

    public Division (String simbol) {
        this.simbolDiv = simbol;
        addSimbol(simbolDiv);
    }

    @Override
    public void addSimbol(String simbol) {
        actionsSet.add(simbol);
    }
}
