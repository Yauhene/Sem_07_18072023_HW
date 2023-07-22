import simbols.Init;
import simbols.SimbolsInterface;
import view.UserDialog;

import java.util.HashMap;


public class Calculator {
    private static HashMap<String, String> aMap;
    public static void main(String[] args) {
        Init init = new Init();
        aMap = SimbolsInterface.getActionsMap();
        UserDialog userDialog = new UserDialog(aMap);
    }
}
