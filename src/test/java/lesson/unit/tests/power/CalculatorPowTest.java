package lesson.unit.tests.power;

import lesson.unit.tests.AbstractBaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorPowTest extends AbstractBaseTest {

    @DataProvider
    public Object[][] powPositiveDoubleDataProvider() {
        return new Object[][] {
                {1, 1, 1},
                {2, 3, 8},
                {4.3, 2, 18.49},
                {3.12,2, 9.7344}
        };
    }

    @Test(dataProvider = "powPositiveDoubleDataProvider")
    public void testSin(double a, double b, double expected){
        System.out.println("Test pow");
        assertEquals(calculator.pow(a, b),expected);
    }
}
