package tech.zeta.java.junit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.logging.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NumberCheckerTest {

    private static NumberChecker numberChecker;
    private static Logger logger;

    @BeforeAll public static void setup(){
        logger= Logger.getLogger(NumberCheckerTest.class.getName());
        numberChecker= new NumberChecker();
        logger.config("Performing all number checks");
    }

    @BeforeEach void init(TestInfo testInfo){
//        logger.entering(testInfo.getTestClass().get().getName(),  testInfo.getTestMethod().get().getName() );
        logger.info("Checking the number for "+ testInfo.getTestMethod().get().getName());
        }

//        @AfterEach void destroy(TestInfo testInfo){
//        logger.exiting(testInfo.getTestClass().get().getName(), testInfo.getTestMethod().get().getName());
//        }

    static Stream<Integer> evenNumbers() { return Stream.of(2, 4, 6, 8, 10);}

    static Stream<Integer> oddNumbers() { return Stream.of(1, 3, 5, 7, 9);}

    // for parametrized checks i.e passing multiple values for check
    @ParameterizedTest
//    @ValueSource(ints = {2, 4, 6, 1, 3, 4}) // A way to pass multiple inputs to the same test
    @MethodSource("evenNumbers") // another method to pass multiple values to the same test
    void isEven(int number) {
        if(number % 2 == 0) assertTrue(numberChecker.isEven(number));
        else assertFalse(numberChecker.isEven(number));
    }

    @ParameterizedTest
//    @ValueSource(ints = {2, 4, 6, 1, 5, 6}) // A way to pass multiple inputs to the same test
    @MethodSource("oddNumbers") // another method to pass multiple values to the same test
    void isOdd(int number) {
        if(number % 2 != 0) assertTrue(numberChecker.isOdd(number));
        else assertFalse(numberChecker.isOdd(number));
    }

    @Test
    void isPrime() {
    }

    @Test
    void isSquare() {
    }
}