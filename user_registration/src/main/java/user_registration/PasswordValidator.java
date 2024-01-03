package user_registration;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PasswordValidator {

    private static String name = "^(?=.*?[A-Z])(?=.*?[0-9])(?=[a-zA-Z0-9]*[^a-zA-Z0-9][a-zA-Z0-9]*$).{8,}$";
    private static Pattern pattern = Pattern.compile(name);

    static Scanner scannerObject = new Scanner(System.in);

    public static boolean isValid(String password) throws UserRegistrationException{
        Matcher matcher = pattern.matcher(password);
        
        if(!matcher.matches()){
            throw new UserRegistrationException("Invalid Password");
        }
        return true;
    }

    static void validatePassword(User user){
        System.out.println("Enter Password: ");
        user.password = scannerObject.nextLine();

        try{
            isValid(user.password);
            System.out.println("Password has been successfully saved.");
        } catch(UserRegistrationException e){
            System.out.println(e.getMessage());
        }
    }
}
