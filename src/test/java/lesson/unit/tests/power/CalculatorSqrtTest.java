package lesson.unit.tests.power;

import lesson.unit.tests.AbstractBaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorSqrtTest extends AbstractBaseTest {

    @DataProvider
    public Object[][] sqrtPostiveDoubleDataProvider() {
        return new Object[][] {
                {0, 0},
                {9, 3},
                {144, 12},
                {265.69, 16.3},
        };
    }

    @Test(dataProvider = "sqrtPostiveDoubleDataProvider")
    public void sqrtTest(double a, double expected){
        System.out.println("Test sqrt");
        assertEquals(calculator.sqrt(a), expected);
    }
}
