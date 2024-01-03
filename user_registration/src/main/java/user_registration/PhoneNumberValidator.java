package user_registration;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PhoneNumberValidator {
    
        private static String name = "^[0-9]{2}[ ][0-9]{10}$";
        private static Pattern pattern = Pattern.compile(name);
    
        static Scanner scannerObject = new Scanner(System.in);
    
        public static boolean isValid(String phoneNumber) throws UserRegistrationException{
            Matcher matcher = pattern.matcher(phoneNumber);
            if(!matcher.matches()){
                throw new UserRegistrationException("Invalid Phone Number");
            }
            return true;
        }
    
        static void validatePhoneNumber(User user) {
            System.out.println("Enter your Phone Number: ");
            user.phoneNumber = scannerObject.nextLine();
    
            try {
                isValid(user.phoneNumber);
                System.out.println("Phone Number has been successfully saved.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
