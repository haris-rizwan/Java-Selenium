package BasicWeb;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.waitTypes;

import java.util.List;


public class explicitWaitDemoUtility {

    WebDriver driver;
    String baseUrl;
    /***
     * always define the utilities method intializing variable before all the methods becuase then they will accessible
     * in all the methods
     */
    waitTypes WT;


    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/harisrizwan/Selenium/Chrome/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        baseUrl = "https://letskodeit.teachable.com/p/practice";
        WT = new waitTypes(driver);
    }


    @Test
    public void test(){
        driver.get(baseUrl);
//        WebElement el1 = WT.waitForWebElement(By.xpath("name-not"),2);
        boolean el2 = WT.isElementPresent("//input[@id='user_email']","xpath");

    }


    @After
    public void tearDown(){
        driver.quit();
    }


}
