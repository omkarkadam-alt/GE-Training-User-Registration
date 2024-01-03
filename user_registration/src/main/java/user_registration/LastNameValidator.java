package user_registration;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class LastNameValidator {
    
    private static String name = "^[A-Z][a-zA-Z]{2,}$";
    private static Pattern pattern = Pattern.compile(name);

    static Scanner scannerObject = new Scanner(System.in);

    public static boolean isValid(String lastName) throws UserRegistrationException{
        Matcher matcher = pattern.matcher(lastName);
        if(!matcher.matches()){
            throw new UserRegistrationException("Invalid Last Name");
        }
        return true;
    }

    static void validateLastName(User user){
        System.out.println("Enter your last Name: ");
        user.lastName = scannerObject.nextLine();

        try{
            isValid(user.lastName);
            System.out.println("Last Name has been successfully saved.");
        } catch(UserRegistrationException e){
            System.out.println(e.getMessage());
        }
    }
}
