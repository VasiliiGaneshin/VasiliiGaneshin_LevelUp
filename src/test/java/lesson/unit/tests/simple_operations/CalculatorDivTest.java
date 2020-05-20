package lesson.unit.tests.simple_operations;

import lesson.unit.tests.AbstractBaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorDivTest extends AbstractBaseTest {

    @DataProvider
    public Object[][] divPositiveLongDataProvider(){
        return new Object[][] {
                { 6, 3, 2},
                {15, 72, 0},
                {-8, 2, -4},
                {48, -8, -6},
                {-6, -2, 3},
                {3, 0, 0},
                {0, 3, 0},
                {4, 1, 4},
                {1, 4, 0}
        };
    }

    @Test(dataProvider = "divPositiveLongDataProvider")
    public void testDivLong(long a,long b, long expected) {
        System.out.println("Test divide for two long variables");
        assertEquals(calculator.div(a, b), expected);
    }

    @DataProvider
    public Object[][] divPositiveDoubleDataProvider(){
        return new Object[][] {
                {3.5, 6.4, 0.546875},
                {72.14, 15.3,4.7150326797385622},
                {-8.14, 2.5, -3.2560000000000002},
                {48.32, -8.67, -5.573241061130335},
                {-6.8, -2.32, 2.931034482758621},
                {3.12, 0, 0},
                {0, 3.12, 0},
                {4.13, 1, 4.13},
                {1, 4.13, 0.24213075060532688}
        };
    }

    @Test(dataProvider = "divPositiveDoubleDataProvider")
    public void testDivDouble(double a, double b, double expected) {
        System.out.println("Test divide for two double variables n");
        assertEquals(calculator.div(a, b),expected);
    }
}
