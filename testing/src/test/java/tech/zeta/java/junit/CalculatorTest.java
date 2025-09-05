package tech.zeta.java.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    static Calculator calc;
    @BeforeAll static void setup(){
        System.out.println("BeforeAll");
        calc= new Calculator();
    }

    @BeforeEach void init(){
        System.out.println("BeforeEach");
    }

    @AfterEach void destroy(){
        System.out.println("AFterEach");
    }

    @AfterAll static void tearDown(){
        System.out.println("AfterAll");
    }

    @Test
    void sum() {
        System.out.println("Inside sum");
        double result=calc.sum(12,26);
        assertEquals(38,result);
    }

    @Test
    void testDifference() {
        System.out.println("Inside difference");
        double result=calc.difference(12,26);
        assertEquals(-14,result);
    }

    @Test
    void testProduct() {
        System.out.println("Inside product");
        double result=calc.product(12,26);
        assertEquals(312,result);
    }

    @Test
    void testIsPositive() {
        System.out.println("Inside isPositive");
        assertTrue(calc.isPositive(50));
    }

    @Test
    void testIsNegative() {
        System.out.println("Inside isNegative");
        assertFalse(calc.isNegative(50));
    }

    @Test
    void testDivision() {
        System.out.println("Inside division");
        assertThrows(IllegalArgumentException.class,()-> calc.division(12,0));
    }


}