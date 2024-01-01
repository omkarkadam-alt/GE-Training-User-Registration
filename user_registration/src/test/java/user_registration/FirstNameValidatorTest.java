package user_registration;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FirstNameValidatorTest {

    @ParameterizedTest
    @ValueSource(strings = {"Omkar", "Omk", "Omka", "Vis", "Vishal", "Prakash", "Prafulla"})
    void testFirstNameIsValidHappy(String str) {

        assertTrue(FirstNameValidator.isValid(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"omkar", "mk", "a", "VK", "L", "prakash", "rP", "oka", "Mk"})
    void testFirstNameIsValidSad(String str) {

        assertFalse(FirstNameValidator.isValid(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Kad", "Kada", "Kadam", "Joy", "Bhatt", "Sharma", "Patidar"})
    void testLastNameIsValidHappy(String str) {

        assertTrue(LastNameValidator.isValid(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"kad", "kada", "Ka", "J", "bH", "SH", "patidar"})
    void testLastNameIsValidSad(String str) {

        assertFalse(LastNameValidator.isValid(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"91 9824422365", "10 2342343581", "81 4529832235" })
    void testPhoneNumberIsValidHappy(String str) {

        assertTrue(PhoneNumberValidator.isValid(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"2983456789", "918234567890", "1", "23", "223", "3452", "64322", "986456", "4346543", "75432456", "109363852", "8346109829", "93840573955", "9384057395512"})
    void testPhoneNumberIsValidSad(String str) {

        assertFalse(PhoneNumberValidator.isValid(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Hell0thee@", "1OmkarK#d", "h!Yther3", "H!YTHER3", "OK*G0tiT"})
    void testPasswordIsValidHappy(String str) {

        assertTrue(PasswordValidator.isValid(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"o", "OK", "oka", "OKAY", "okay5", "PASSWORD", "1iPASSED", "here@M3", "p@ssK3y", "passWor4", "pAssword", "passw0rd", "p@ssword"})
    void testPasswordIsValidSad(String str) {

        assertFalse(PasswordValidator.isValid(str));
    }

    @Test
    void testEmailIsValid(){
        assertTrue(EmailValidator.isValid("abc-100@yahoo.com"));
    }
}
