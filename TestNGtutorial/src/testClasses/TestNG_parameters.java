package testClasses;

import appcode.SomeClassToTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_parameters {

    @Parameters({"system"})
    @BeforeClass
    public void setUp(String system) {
        System.out.println("we are using "+system+" for are test case");
    }

    @Test
    @Parameters({"browser"})
    public void test1(String browser) {
        System.out.println("The browser that we are using is "+browser);

    }
}
