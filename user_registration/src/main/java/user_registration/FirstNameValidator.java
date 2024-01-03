package user_registration;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FirstNameValidator {

    private static String name = "^[A-Z][a-zA-Z]{2,}$";
    private static Pattern pattern = Pattern.compile(name);

    static Scanner scannerObject = new Scanner(System.in);

    public static boolean isValid(String firstName) throws UserRegistrationException{
        Matcher matcher = pattern.matcher(firstName);
        if(!matcher.matches()){
            throw new UserRegistrationException("Invalid First Name");
        }
        return true;
    }

    static void validateFirstName(User user) {
        System.out.println("Enter your first Name: ");
        user.firstName = scannerObject.nextLine();

        try {
            isValid(user.firstName);
            System.out.println("First Name has been successfully saved.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
