package lesson.unit.tests.trigonometry;

import lesson.unit.tests.AbstractBaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorCtgTest extends AbstractBaseTest {

    @DataProvider
    public Object[][] ctgPositiveDoubleDataProvider() {
        return new Object[][]{
                {0.0, 0.0},
                {15.0, 3.7321},
                {90.0, 0.0},
                {180.0, 0.0},
                {270.0, 0.0},
                {360.0, 0.0}
        };
    }

    @Test(dataProvider = "ctgPositiveDoubleDataProvider")
    public void testTg(double a, double expected) {
        System.out.println("Test ctg");
        assertEquals(calculator.ctg(a), expected);
    }
}