package lesson.unit.tests.simple_operations.negative_tests;

import lesson.unit.tests.AbstractBaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorAddTestNegative extends AbstractBaseTest {


    @Test(dataProviderClass = DataProviderNegative.class, dataProvider = "Negative Addition Long Test")
    protected void testAddNegativeLong(long a, long b, long expected) {
        System.out.println("Test addition for two long variables: a " + a + " + " + b + " = " + expected);
        assertNotEquals(calculator.sum(a, b), expected);
    }

    @Test(dataProviderClass = DataProviderNegative.class, dataProvider = "Negative Addition Double Test")
    protected void testAddNegativeDouble(double a, double b, double expected) {
        System.out.println("Test addition for two double variables: a " + a + " + " + b + " = " + expected);
        assertNotEquals(calculator.sum(a, b), expected);
    }
}
