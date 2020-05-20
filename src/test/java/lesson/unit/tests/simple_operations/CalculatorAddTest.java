package lesson.unit.tests.simple_operations;

import lesson.unit.tests.AbstractBaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorAddTest extends AbstractBaseTest {

    @DataProvider
    public Object[][] addPositiveLongDataProvider() {
        return new Object[][]{
                {4, 6, 10},
                {48, 19, 67},
                {-178, 98, -80},
                {256, -896, -640},
                {321, -84, 237},
                {-67, -89, -156}

        };
    }

    @Test(dataProvider = "addPositiveLongDataProvider")
    public void testAddLong(long a, long b, long expected) {
        System.out.println("Test addition for two long variables: a " + a + " + " + b + " = " + expected);
        assertEquals(calculator.sum(a, b), expected);
    }

    @DataProvider
    public Object[][] addPositiveDoubleDataProvider() {
        return new Object[][]{
                {3.5, 6.4, 9.9},
                {15.3, 72.14, 87.44},
                {-178.14, 98.5, -79.63999999999999},
                {256.32, -896.67, -640.3499999999999},
                {321.7, -84.3, 237.39999999999998},
                {-56.8, -78.32, -135.12}
        };
    }

    @Test(dataProvider = "addPositiveDoubleDataProvider")
    public void testAddDouble(double a, double b, double expected) {
        System.out.println("Test addition for two double variables: a " + a + " + " + b + " = " + expected);
        assertEquals(calculator.sum(a, b), expected);
    }

}
