package tech.zeta.java.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {

    @Test
    void testRiskyMethod() {
        MyClass myClass=new MyClass();
        try{
            myClass.riskyMethod();
            fail("Expected an exception to be thrown");
        }catch (IllegalArgumentException exception){
            assertEquals("Expected Message",exception.getMessage());
            assertTrue(exception instanceof IllegalArgumentException);

        }
    }
}