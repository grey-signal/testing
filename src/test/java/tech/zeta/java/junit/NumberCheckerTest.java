package tech.zeta.java.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.logging.LogManager;

import static org.junit.jupiter.api.Assertions.*;

class NumberCheckerTest {

    private  NumberChecker numberChecker;

    private static Logger logger;

    @BeforeAll public void setup(){
        logger= LogManager.getLogManager().getLogger(NumberCheckerTest.class);
        numberChecker= new NumberChecker();
    }

    @Test
    void isEven() {
    }

    @Test
    void isOdd() {
    }

    @Test
    void isPrime() {
    }

    @Test
    void isSquare() {
    }
}