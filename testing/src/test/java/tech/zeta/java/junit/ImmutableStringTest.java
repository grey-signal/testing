package tech.zeta.java.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImmutableStringTest {
    @Test void testToUpperCase(){
        ImmutableString original= new ImmutableString("hello");
        ImmutableString upperCase= original.toUpperCase();

        assertNotSame(original,upperCase,"toUpperCase should return new object");
        assertEquals("HELLO",upperCase.getValue(),"The value should be upper case");
    }

}