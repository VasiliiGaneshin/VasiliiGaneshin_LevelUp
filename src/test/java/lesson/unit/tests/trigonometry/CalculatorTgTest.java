package lesson.unit.tests.trigonometry;

import lesson.unit.tests.AbstractBaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTgTest extends AbstractBaseTest {

    @DataProvider
    public Object[][] tgPositiveDoubleDataProvider(){
        return new Object[][]{
                {0.0, 0.0},
                {1.0, 0.0174},
                {45.0, 1},
                {90.0, 0.0},
                {135.0, -1},
                {180.0, 0.0},
                {225.0, 1},
                {270.0, 0.0},
                {315.0, -1},
                {360.0, 0.0}
        };
    }

    @Test(dataProvider = "tgPositiveDoubleDataProvider")
    public void testTg(double a, double expected){
        System.out.println("Test tg");
        assertEquals(calculator.tg(a), expected);
    }
}
