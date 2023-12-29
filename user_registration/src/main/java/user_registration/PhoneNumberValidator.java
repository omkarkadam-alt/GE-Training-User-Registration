package user_registration;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PhoneNumberValidator {
    
        private static String name = "^[0-9]{2}[ ][0-9]{10}$";
        private static Pattern pattern = Pattern.compile(name);
    
        static Scanner scannerObject = new Scanner(System.in);
    
        public static boolean isValid(String phoneNumber){
            Matcher matcher = pattern.matcher(phoneNumber);
            return matcher.matches();
        }
    
        static void validatePhoneNumber(User user){
            System.out.println("Enter your Phone Number: ");
            user.phoneNumber = scannerObject.nextLine();
    
            while(isValid(user.phoneNumber) == false){
                System.out.println("Invalid Phone Number, please enter again: ");
                user.phoneNumber = scannerObject.nextLine();
            }
    
            System.out.println("Phone Number has been successfully saved.");
        }
    }
    
