package lesson.unit.tests.trigonometry;

import lesson.unit.tests.AbstractBaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorSinTest extends AbstractBaseTest {

    @DataProvider
    public Object[][] sinPositiveDoubleDataProvider() {
        return new Object[][] {
                {0.0, 0.0},
                {15.0, 0.2588 },
                {30.0, 0.5},
                {45.0, 0.7071},
                {90.0, 1.0},
                {180.0, 0.0},
                {270.0, -1.0},
                {360.0, 0.0}
        };
    }

    @Test(dataProvider = "sinPositiveDoubleDataProvider")
    public void testSin(double a, double expected){
        System.out.println("Test sin");
        assertEquals(calculator.sin(a),expected);
    }
}
