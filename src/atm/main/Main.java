package atm.main;

import atm.accaunt.Account;
import atm.console.WelcomeConsole;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        /**adding user information to ArrayList
         * @see Account
         */
        Account.addName();
        Account.addPassword();
        Account.addBalance();
        /**viewing console menu of authorization
         * @see WelcomeConsole
         */
//        System.out.println(Account.USER_NAMES.toString());
//        System.out.println(Account.USER_PASSWORDS.toString());
//        System.out.println(Account.USER_BALANCE.toString());
        WelcomeConsole.AuthorizationConsole();
//        System.out.println(Account.getUserName("user1"));
//        System.out.println(Account.getUserPassword("123456"));
//        BigDecimal bg = new BigDecimal(200);
//        System.out.println(Account.getUserBalance(bg));
//        System.out.println("\n\n");
//        System.out.println(Account.USER_NAMES.get(2));
//        System.out.println(Account.USER_PASSWORDS.get(2));
//        System.out.println(Account.USER_BALANCE.get(2));
//
//
//        System.out.println(UserCheck.checkAccount());

    }
}
