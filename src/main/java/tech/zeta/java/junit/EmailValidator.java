package tech.zeta.java.junit;

public class EmailValidator {

    boolean isValidEmail(String email){
        return email != null && email.contains("@") && email.contains(".");
    }
}
