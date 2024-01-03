package user_registration;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FirstNameValidatorTest {
    

    @ParameterizedTest
    @ValueSource(strings = {"Omkar", "Omk", "Omka", "Vis", "Vishal", "Prakash", "Prafulla"})
    void testFirstNameIsValidHappy(String str) {

        try {
            assertTrue(FirstNameValidator.isValid(str)); 
            System.out.println("First Name is valid.");  
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"omkar", "mk", "a", "VK", "L", "prakash", "rP", "oka", "Mk"})
    void testFirstNameIsValidSad(String str) {

        try {
            assertFalse(FirstNameValidator.isValid(str));
            System.out.println("First Name is valid.");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"Kad", "Kada", "Kadam", "Joy", "Bhatt", "Sharma", "Patidar"})
    void testLastNameIsValidHappy(String str) {

        try {
            assertTrue(LastNameValidator.isValid(str));
            System.out.println("Last Name is valid.");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
        
    }

    @ParameterizedTest
    @ValueSource(strings = {"kad", "kada", "Ka", "J", "bH", "SH", "patidar"})
    void testLastNameIsValidSad(String str) {

        try {
            assertFalse(LastNameValidator.isValid(str));
            System.out.println("Last Name is valid.");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"91 9824422365", "10 2342343581", "81 4529832235" })
    void testPhoneNumberIsValidHappy(String str) {

        try {
            assertTrue(PhoneNumberValidator.isValid(str));
            System.out.println("Phone Number is valid.");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"2983456789", "918234567890", "1", "23", "223", "3452", "64322", "986456", "4346543", "75432456", "109363852", "8346109829", "93840573955", "9384057395512"})
    void testPhoneNumberIsValidSad(String str) {

        try {
            assertFalse(PhoneNumberValidator.isValid(str));
            System.out.println("Phone Number is valid.");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"Hell0thee@", "1OmkarK#d", "h!Yther3", "H!YTHER3", "OK*G0tiT"})
    void testPasswordIsValidHappy(String str) {

        try {
            assertTrue(PasswordValidator.isValid(str));
            System.out.println("Password is valid.");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"o", "OK", "oka", "OKAY", "okay5", "PASSWORD", "1iPASSED", "here@M3", "p@ssK3y", "passWor4", "pAssword", "passw0rd", "p@ssword"})
    void testPasswordIsValidSad(String str) {

        try {
            assertFalse(PasswordValidator.isValid(str));
            System.out.println("Password is valid.");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void testEmailIsValid(){
        try {
            assertTrue(EmailValidator.isValid("abc-100@yahoo.com"));
            System.out.println("Email is valid.");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc@yahoo.com",
                            "abc-100@yahoo.com",
                            "abc.100@yahoo.com",
                            "abc111@abc.com",
                            "abc-100@abc.net",
                            "abc.100@abc.com.au",
                            "abc@1.com",
                            "abc@gmail.com.com",
                            "abc+100@gmail.com"})
    void testEmailIsValidHappy(String str) {

        
        try {
            assertTrue(EmailValidator.isValid(str));
            System.out.println("Email is valid.");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc",
                "abc@.com.my",
                "abc123@gmail.a",
                "abc123@.com",
                "abc123@.com.com",
                ".abc@abc.com",
                "abc()*@gmail.com",
                "abc@%*.com",
                "abc..2002@gmail.com",
                "abc.@gmail.com",
                "abc@abc@gmail.com",
                "abc@gmail.com.1a",
                "abc@gmail.com.aa.au"})
    void testEmailIsValidSad(String str) {

        try {
            assertFalse(EmailValidator.isValid(str));
            System.out.println("Email is valid.");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }
}
