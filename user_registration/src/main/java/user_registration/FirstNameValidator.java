package user_registration;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FirstNameValidator {

    private static String name = "^[A-Z][a-zA-Z]{2,}$";
    private static Pattern pattern = Pattern.compile(name);

    static Scanner scannerObject = new Scanner(System.in);

    public static boolean isValid(String firstName){
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    static void validateFirstName(User user){
        System.out.println("Enter your first Name: ");
        user.firstName = scannerObject.nextLine();

        while(isValid(user.firstName) == false){
            System.out.println("Invalid First Name, please enter again: ");
            user.firstName = scannerObject.nextLine();
        }

        System.out.println("First Name has been successfully saved.");
    }
}
