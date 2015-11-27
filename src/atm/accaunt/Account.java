package atm.accaunt;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Account {
    protected final static int USERS_IN_SYSTEM = 3;
    public static ArrayList<String> USER_NAMES = new ArrayList<>();
    public static ArrayList<String> USER_PASSWORDS = new ArrayList<>();
    public static ArrayList<BigDecimal> USER_BALANCE = new ArrayList<>();


    // adds user names to strings list
    public static void addName() throws IOException {
        for (int i = 1; i <= USERS_IN_SYSTEM; i++) {
            String path = "src/ATM_Accounts/user" + i + "/user" + i + "name";
            byte[] encoded = Files.readAllBytes(Paths.get(path));
            USER_NAMES.add(new String(encoded));
        }
    }
    // adds user passwords to strings list
    public static void addPassword() throws IOException {
        for (int i = 1; i <= USERS_IN_SYSTEM; i++) {
            String path = "src/ATM_Accounts/user" + i + "/user" + i + "pass";
            byte[] encoded = Files.readAllBytes(Paths.get(path));
            USER_PASSWORDS.add(new String(encoded));
        }
    }
    // adds user balances to decimal list
    public static void addBalance() throws IOException {
        for (int i = 1; i <= USERS_IN_SYSTEM; i++) {
            String path = "src/ATM_Accounts/user" + i + "/user" + i + "balance";
            byte[] encoded = Files.readAllBytes(Paths.get(path));
            String s = new String(encoded);
            BigDecimal userBalance = new BigDecimal(s);
            USER_BALANCE.add(userBalance);
        }
    }



    // gets user name
    public static String getUserName(String chooseUser) throws IOException {
        int index = USER_NAMES.indexOf(chooseUser);
        chooseUser = USER_NAMES.get(index);
        return chooseUser;
    }
    // gets user name
    public static String getUserPassword(String choosePassword) throws IOException {
        int index = USER_PASSWORDS.indexOf(choosePassword);
        choosePassword = USER_PASSWORDS.get(index);
        return choosePassword;
    }
    // gets user name
    public static BigDecimal getUserBalance(BigDecimal chooseAmount) throws IOException {
        int index = USER_BALANCE.indexOf(chooseAmount);
        chooseAmount = USER_BALANCE.get(index);
        return chooseAmount;
    }
}

