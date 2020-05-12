package lesson.unit.tests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.*;

public abstract class AbstractBaseTest {

    protected Calculator calculator;

    @BeforeSuite
    public void setUpSuite() {
        System.out.println("Before Suite");
    }

    @BeforeClass
    public void setUpClass() {
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void setUpMethod() {
        System.out.println("Before Method");
        calculator = new Calculator();
    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println("After Method");
        calculator = null;
    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("After Class");
    }

    @AfterSuite
    public void tearDownSuite() {
        System.out.println("After Suite");
    }
}