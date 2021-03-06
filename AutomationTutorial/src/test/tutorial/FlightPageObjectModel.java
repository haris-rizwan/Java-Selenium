package test.tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.BeforeClass;
import page.classes.FlightPage;
import utlilities.waitTypes;


public class FlightPageObjectModel {
    WebDriver driver;
    String baseUrl;
    waitTypes WT;


    @Before
    public void setUp() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/harisrizwan/Selenium/Chrome/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        baseUrl = "https://www.expedia.com/";
        driver.get(baseUrl);
        WT = new waitTypes(driver);
        WT.clickWhenReady(By.xpath("//button[@id='tab-flight-tab-hp']//span[@class='tab-label']"),3);
        Thread.sleep(3000);

    }

//    @Test
//    public void test()throws InterruptedException{
//        FlightPage.flyingFrom(driver).sendKeys("Karachi");
//        FlightPage.flyingTo(driver).sendKeys("yul");
//        FlightPage.departureDate(driver).sendKeys("04/22/2018");
//        FlightPage.returnDate(driver).sendKeys("05/22/2018");
//        FlightPage.searchButton(driver).click();
//
//        Thread.sleep(5000);
//    }


    @Test
    public void test() throws InterruptedException{
        FlightPage.enterDepartureCity(driver,"yul");
        FlightPage.enterDestinationCity(driver,"Karachi");
        FlightPage.departureDate(driver,"05","14","2018");
        FlightPage.arrivalDate(driver,"06","03","2018");
        Thread.sleep(2000);

    }


    @After
    public void tearDown(){
        driver.quit();
    }

}
