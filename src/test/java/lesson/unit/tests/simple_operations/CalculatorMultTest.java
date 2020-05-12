package lesson.unit.tests.simple_operations;

import lesson.unit.tests.AbstractBaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorMultTest extends AbstractBaseTest {

    @DataProvider
    public Object[][] multPositiveLongDataProvider() {
        return new Object[][]{
                {3, 6, 18},
                {15, 72, 1080},
                {-8, 7, -56},
                {6, -8, -48},
                {-6, -2, 12},
                {3, 0, 0},
                {0, 3, 0},
                {4, 1, 4},
                {1, 4, 4}
        };
    }

    @Test(dataProvider = "multPositiveLongDataProvider")
    public void testMultLong(long a,long b, long expected) {
        System.out.println("Test multiplication for two long variables");
        assertEquals(calculator.mult(a, b), expected);
    }

    @DataProvider
    public Object[][] multPositiveDoubleDataProvider() {
        return new Object[][]{
                {3.5, 6.4, 22.4},
                {15.3, 72.14, 1103.742},
                {-8.14, 7.5, -61.05},
                {6.32, -8.67, -54.7944},
                {-6.8, -2.32, -15.776},
                {3.12, 0, 0},
                {0, 3.12, 0},
                {4.13, 1, 4.13},
                {1, 4.13, 4.13}
        };
    }

    @Test(dataProvider = "multPositiveDoubleDataProvider")
    public void testMultDouble(double a,double b, double expected) {
        System.out.println("Test multiplication for two double variables");
        assertEquals(calculator.mult(a, b), expected);
    }
}
