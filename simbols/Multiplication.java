package simbols;

public class Multiplication extends Simbols implements SimbolsInterface {
    String simbolMult;

    public Multiplication (String simbol) {
        this.simbolMult = simbol;
        addSimbol(simbolMult);
    }

    @Override
    public void addSimbol(String simbol) {
        actionsSet.add(simbol);
    }
}
