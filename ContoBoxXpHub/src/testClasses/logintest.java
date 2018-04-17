package testClasses;

import PageClasses.ElementsPageFactory;
import PageClasses.SignInPageFactory;
import Utilities.WebdriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class logintest {
    WebDriver driver;
    String baseUrl;
    SignInPageFactory el;


    @BeforeClass
    public void setUp() throws InterruptedException{
        driver = WebdriverFactory.getDriverInstance("firefox");
        baseUrl = "http://xphub.contobox.com:3000/";
        el = new SignInPageFactory(driver);
        driver.get(baseUrl);
        Thread.sleep(3000);

    }


    @Test
    public void test() throws InterruptedException{
        el.clickOnSignIn();
        Thread.sleep(4000);
        el.enterEmail("hrizwan@crucialinteractive.com");
        Thread.sleep(3000);
    }



    @AfterClass
    public  void tearDown(){
        driver.quit();
    }
}
