package lesson.unit.tests.simple_operations.negative_tests;

import org.testng.annotations.DataProvider;

public class DataProviderNegative {

    @DataProvider(name = "Negative Addition Long Test")
    public Object[][] addNegativeLongDataProvider() {
        return new Object[][]{
                {4, 6, 11},
                {48, 19, 55},
                {-178, 98, 6},
                {256, -896, 640},
                {321, -84, -237},
                {-67, -89, 156}
        };
    }

    @DataProvider(name = "Negative Addition Double Test")
    public Object[][] addNegativeDoubleDataProvider() {
        return new Object[][]{
                {3.5, 6.4, 1.9},
                {15.3, 72.14, 87},
                {-178.14, 98.5, 79.63999999999999},
                {256.32, -896.67, 640.3499999999999},
                {321.7, -84.3, -237.39999999999998},
                {-56.8, -78.32, -135}
        };
    }
}
