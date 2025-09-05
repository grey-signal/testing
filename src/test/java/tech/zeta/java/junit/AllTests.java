package tech.zeta.java.junit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite @SelectClasses({CalculatorTest.class,
        EmailValidator.class,
        ImmutableStringTest.class,
        MyClassTest.class,
        NumberCheckerTest.class,
        PersonTest.class,
        RectangleTest.class,
        StringAssertionTest.class,
})
public class AllTests {



}
