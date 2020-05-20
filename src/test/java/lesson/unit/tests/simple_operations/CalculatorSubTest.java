package lesson.unit.tests.simple_operations;

import lesson.unit.tests.AbstractBaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorSubTest extends AbstractBaseTest {

    @DataProvider
    public Object[][] subPositiveLongDataProvider() {
        return new Object[][] {
                {4, 6, -2},
                {48, 19, 29},
                {-178, 98, -276},
                {256, -896, 1152},
                {-67, -89, 22}
        };
    }

    @Test(dataProvider = "subPositiveLongDataProvider")
    public void testSubLong(long a, long b, long expected) {
        System.out.println("Test substraction for two long variables");
        assertEquals(calculator.sub(a,b), expected);
    }

    @DataProvider
    public Object[][] subPositiveDoubleDataProvider() {
        return new Object[][] {
                {3.5, 6.4, -2.9},
                {72.14, 15.2, 56.94},
                {-178.14, 98.5, -276.64},
                {256.32, -896.67, 1152.99},
                {-56.8, -78.32, 21.52}
        };
    }

    @Test(dataProvider = "subPositiveDoubleDataProvider")
    public void testSubDouble(double a, double b, double expected) {
        System.out.println("Test substraction for two double variables");
        assertEquals(calculator.sub(8.2,3.6), 4.6);
    }
}
