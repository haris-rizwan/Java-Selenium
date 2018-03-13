package ActionClass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClass {
    WebDriver driver;
    String baseUrl;
    JavascriptExecutor js;

    @Before
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver","/Users/harisrizwan/Selenium/Chrome/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        baseUrl = "https://letskodeit.teachable.com/p/practice";
        js = (JavascriptExecutor)driver;
    }


    @Test
    public void test() throws InterruptedException{
        driver.get(baseUrl);
        js.executeScript("window.scroll(0,700)");
        Thread.sleep(2000);
        Actions mouseOver = new Actions(driver);
        WebElement el1 = driver.findElement(By.id("mousehover"));

        mouseOver.moveToElement(el1).perform();
        Thread.sleep(3000);

        WebElement subEl = driver.findElement(By.xpath("//a[@href='#top']"));
        mouseOver.moveToElement(subEl).click().perform();
        Thread.sleep(2000);

    }


    @After
    public void tearDown(){
        driver.close();
    }
}
