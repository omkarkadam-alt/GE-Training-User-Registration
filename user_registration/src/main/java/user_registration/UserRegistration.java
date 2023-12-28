package user_registration;

public class UserRegistration {

    static User user = new User();

    public static void getInput(){
        FirstNameValidator.validateFirstName(user);
        LastNameValidator.validateLastName(user);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");

        getInput();

    }
}
