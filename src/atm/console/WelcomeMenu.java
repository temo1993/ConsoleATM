package atm.console;

import atm.accaunt.Account;
import atm.menu.UserCheck;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WelcomeMenu extends UserCheck{
    protected static String NOW_DATE = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE);
    protected static String NOW_TIME = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME);


    public static void AuthorizationConsole() throws IOException, InterruptedException {
        System.out.println(" ______________WELCOME______________");
        System.out.println("|" + NOW_DATE + "\t\t\t\t" + NOW_TIME + "|");
        System.out.println("|\t\t\t\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t|");
        System.out.println("|Please enter your name and password|");
        System.out.println("|\t\t\t\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t|");
        System.out.print("|Name here: ");
        UserCheck.inputName();
        System.out.println("|\t\t\t\t\t\t\t\t\t|");
        System.out.print("|Password here: ");
        UserCheck.inputPassword();
        System.out.println("|___________________________________|");

        for (int i = 0; i < 100; i++) {
            System.out.print("\rThinking... " + i);
            System.out.flush();
            Thread.sleep(30);
        }
        System.out.println();
        if (UserCheck.checkAccount())
            System.out.println("Welcome " + userName);
            else
            System.out.println("Wrong account details");
    }
}
