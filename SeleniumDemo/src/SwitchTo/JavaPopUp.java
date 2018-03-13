package SwitchTo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.waitTypes;

public class JavaPopUp {
    WebDriver  driver;
    String  baseUrl;
    waitTypes WT;

    @Before
    public void setUp()  throws Exception {
        System.setProperty("webdriver.chrome.driver","/Users/harisrizwan/Selenium/Chrome/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        baseUrl = "https://letskodeit.teachable.com/p/practice";
        WT = new waitTypes(driver);


    }


    @Test
    public void test() {
        driver.get(baseUrl);
        WebElement el1 = WT.waitForWebElement(By.xpath("//input[@id='name']"),2);
        el1.click();
        el1.sendKeys("haris");
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
        Alert newAlert = driver.switchTo().alert();
        newAlert.accept();
    }

    @After
    public void tearDown() throws InterruptedException{
        driver.close();
    }
}
