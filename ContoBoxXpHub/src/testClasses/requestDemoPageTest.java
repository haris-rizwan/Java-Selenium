package testClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageClasses.LandingPageClass;

public class requestDemoPageTest {

    WebDriver driver;
    String baseUrl;
    LandingPageClass Lp;


    @BeforeClass
    public void setUp() throws InterruptedException{



    }

    @Test()
    public void test() throws InterruptedException{
    }


    @AfterClass()
    public void tearDown(){
        driver.quit();
    }
}
