package tech.zeta.java.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringAssertionTest {
    @Test void testSameObject(){
        String first="hello";
        String second= "hello";
        assertSame(first,second,"Both strings should not be same");

    }
}
