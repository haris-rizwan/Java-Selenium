package test.tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.classes.HotelPageFactory;

public class HotelPageObjectModel {
    WebDriver driver;
    String baseUrl;
    HotelPageFactory HP;


    @Before
    public void setUp() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/harisrizwan/Selenium/Chrome/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        baseUrl="https://www.expedia.com/";
        driver.get(baseUrl);
        HP = new HotelPageFactory(driver);
        HP.clickHotelTabBtn();

    }

    @Test
    public void test() throws InterruptedException{
        HP.enterDestination("Karachi");
        HP.enterCheckIn("05","22","2018");
        HP.enterCheckOut("06","12","2018");

        Thread.sleep(2000);

    }



    @After
    public void tearDown(){
        driver.quit();
    }

}
