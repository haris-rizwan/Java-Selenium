package testClasses;

import org.testng.annotations.DataProvider;

public class TestNG_TestData {

    @DataProvider(name = "DataSet")
    public Object[][] getData(){
        return new Object[][]{
                {"BMW","m3"},
                {"Audi","A6"},
                {"Jeep","wrangler"}
        };
    }

}
