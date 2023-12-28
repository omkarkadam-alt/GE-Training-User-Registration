package user_registration;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidator {
        
    private static String name = "^[a-zA-Z0-9][a-zA-Z0-9_+-]*([.][a-zA-Z0-9_+-]+)?@([a-zA-Z0-9]+)[.]([a-zA-Z]{2,})([.]([a-zA-Z]{2,}))?$";
    private static Pattern pattern = Pattern.compile(name);

    static Scanner scannerObject = new Scanner(System.in);

    public static boolean isValid(String email){
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    static void validateEmail(User user){
        System.out.println("Enter your Email: ");
        user.email = scannerObject.nextLine();

        while(isValid(user.email) == false){
            System.out.println("Invalid Email, please enter again: ");
            user.email = scannerObject.nextLine();
        }

        System.out.println("Email has been successfully saved.");
    }
}



