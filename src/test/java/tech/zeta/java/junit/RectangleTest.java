package tech.zeta.java.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private static Rectangle rectangle;

    @BeforeAll static void setup(){
        rectangle = new Rectangle();
    }

    @ParameterizedTest
    @CsvSource({
            "2, 3, 6",
            "4, 5, 20",
            "1.5, 2.5, 3.75"
    })
    void calculateArea_validInput(double length, double width, double expectedArea) {
        assertEquals(expectedArea, rectangle.calculateArea(length, width));
    }

    @ParameterizedTest
    @CsvSource({
            "2, 3, 7",
            "4, 5, 21",
            "1.5, 2.5, 4.75"
    })
    void calculateArea_invalidInput(double length, double width, double unexpectedArea) {
        assertNotEquals(unexpectedArea, rectangle.calculateArea(length, width));
    }

    @ParameterizedTest
    @CsvSource({
            "-2, 3",
            "4, -5",
            "1.5, 0"
    })
    void calculateArea_exceptionInput(double length, double width) {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            rectangle.calculateArea(length, width);
        });
        assertEquals("Dimensions must be > 0", exception.getMessage());
    }

    @Disabled("This test method needs further implementation")
     @Test void someTest(){
        assertEquals(12, 10);
    }

}