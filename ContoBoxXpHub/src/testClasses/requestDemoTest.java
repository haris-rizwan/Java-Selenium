package testClasses;

import pageClasses.LandingPage;
import Utilities.WebdriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class requestDemoTest {

    WebDriver driver;
    String baseUrl;
    LandingPage Lp;


    @BeforeClass
    public void setUp() throws InterruptedException{

        driver = WebdriverFactory.getDriverInstance("Chrome");
        driver.manage().window().maximize();
        baseUrl ="https://xphub-dev.contobox.com/";
        Lp = new LandingPage(driver);
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


    }

    @Test()
    public void test() throws InterruptedException{
        Lp.clickRequestDemo();
        Thread.sleep(3300);
    }


    @AfterClass()
    public void tearDown(){
        driver.quit();
    }
}
