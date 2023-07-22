package simbols;

public class Init extends Simbols implements SimbolsInterface{
    public Init() {

        Addition addition = new Addition("+");
        Multiplication multiplication = new Multiplication("*");
        Division division = new Division("/");
        System.out.println("actionsSet: " + getActionsSet());
    }

    @Override
    public void addSimbol(String simbol) {
        //actionsSet.add();
    }
}
