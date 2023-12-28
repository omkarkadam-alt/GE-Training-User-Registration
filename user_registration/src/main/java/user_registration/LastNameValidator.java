package user_registration;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class LastNameValidator {
    
    private static String name = "^[A-Z][a-zA-Z]{2,}$";
    private static Pattern pattern = Pattern.compile(name);

    static Scanner scannerObject = new Scanner(System.in);

    public static boolean isValid(String lastName){
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    static void validateLastName(User user){
        System.out.println("Enter your last Name: ");
        user.lastName = scannerObject.nextLine();

        while(isValid(user.lastName) == false){
            System.out.println("Invalid Last Name, please enter again: ");
            user.lastName = scannerObject.nextLine();
        }

        System.out.println("Last Name has been successfully saved.");
    }
}
