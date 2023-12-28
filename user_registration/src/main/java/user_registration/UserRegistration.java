package user_registration;

import java.util.Scanner;

public class UserRegistration {

    static User user = new User();

    static Scanner scannerObject = new Scanner(System.in);

    public static void getInput(){
        FirstNameValidator.validateFirstName(user);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");

        getInput();
    }
}
