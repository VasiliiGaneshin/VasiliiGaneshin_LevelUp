package lesson.unit.tests.trigonometry;

import lesson.unit.tests.AbstractBaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorCosTest extends AbstractBaseTest {


    @DataProvider
    public Object[][] cosPositiveDoubleDataProvider() {
        return new Object[][] {
                {0.0, 0.0},
                {30.0, 0.866},
                {60.0, 0.5 },
                {45.0, 0.7071},
                {90.0, 0.0},
                {180.0, -1.0},
                {270.0, 0.0},
                {360.0, 1.0}
        };
    }

    @Test(dataProvider = "cosPositiveDoubleDataProvider")
    public void testCos(double a, double expected){
        System.out.println("Test cos");
        assertEquals(calculator.cos(a),expected);
    }
}