package BasicWeb;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWaitDemo {

    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/harisrizwan/Selenium/Chrome/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        baseUrl = "https://letskodeit.teachable.com/p/practice";
    }


    @Test
    public void test(){
        driver.get(baseUrl);
        WebElement login = driver.findElement(By.xpath("//a[@class='navbar-link fedora-navbar-link']"));
        login.click();

        WebDriverWait wait;
        wait = new WebDriverWait(driver,3);

        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='user_email']")));

        email.sendKeys("kamlesshbannerjee@dhundhun.com");
    }


    @After
    public void tearDown(){
        driver.quit();
    }


}
