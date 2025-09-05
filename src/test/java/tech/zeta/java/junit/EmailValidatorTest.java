package tech.zeta.java.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

        private static EmailValidator validator;

        @BeforeAll static void setup(){
            validator = new EmailValidator();
        }

        @ParameterizedTest
        @ValueSource(strings = {"abc@gmail.com", "xyz@gmail.com"})
        void isValidEmail_validEmails(String email){
            assertTrue(validator.isValidEmail(email));
        }

        @ParameterizedTest
    @ValueSource(strings = {"invalid-email", "valid-email.com", "not-valid@validcom"})
    void isValidEmail_invalidEmails(String email){ assertFalse(validator.isValidEmail(email));}
}