package user_registration;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PasswordValidator {

    private static String name = "^(?=.*?[A-Z]).{8,}$";
    private static Pattern pattern = Pattern.compile(name);

    static Scanner scannerObject = new Scanner(System.in);

    public static boolean isValid(String password){
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    static void validatePassword(User user){
        System.out.println("Enter Password: ");
        user.password = scannerObject.nextLine();

        while(isValid(user.password) == false){
            System.out.println("Invalid Password, please enter again: ");
            user.password = scannerObject.nextLine();
        }

        System.out.println("Password has been successfully saved.");
    }
}
