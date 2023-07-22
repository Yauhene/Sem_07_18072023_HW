package view;

import java.util.HashMap;

public class UserDialogBuilder {
    private HashMap actionsMap;

    public UserDialogBuilder setActionsMap(HashMap actionsMap) {
        this.actionsMap = actionsMap;
        return this;
    }

    public UserDialog createUserDialog() {
        return new UserDialog(actionsMap);
    }
}