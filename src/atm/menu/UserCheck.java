package atm.menu;

import atm.accaunt.Account;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserCheck extends Account{
    protected static String userName;
    protected static String userPassword;
    protected static String nameValue;
    protected static String passwordValue;


    protected static String inputName() throws IOException {
        BufferedReader readName = new BufferedReader(new InputStreamReader(System.in));
        userName = readName.readLine();
        return userName;
    }

    protected static String inputPassword() throws IOException {
        BufferedReader readPassword = new BufferedReader(new InputStreamReader(System.in));
        userPassword = readPassword.readLine();
        return userPassword;
    }

    public static boolean checkAccount(){
        for (int i = 0; i < USERS_IN_SYSTEM; i++) {
            nameValue = USER_NAMES.get(i);
            passwordValue = USER_PASSWORDS.get(i);
            if (userName.equals(nameValue) && userPassword.equals(passwordValue))
                return (userName.equals(nameValue) && userPassword.equals(passwordValue));
        }
        return (userName.equals(nameValue) && userPassword.equals(passwordValue));
    }
}
