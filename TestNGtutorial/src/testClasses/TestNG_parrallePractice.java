package testClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utlilities.waitTypes;

public class TestNG_parrallePractice {
    WebDriver driver;
    String baseUrl;
    waitTypes wt;

    @Parameters({"browser"})
    @BeforeClass
    public void setUp (String browser) throws InterruptedException {
        baseUrl = "https://letskodeit.teachable.com";
        System.out.println(browser);
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","/Users/harisrizwan/Selenium/Chrome/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            wt = new waitTypes(driver);
            driver.get(baseUrl);
            Thread.sleep(4000);
        } else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.firefox.driver","/Users/harisrizwan/Selenium/firefox/geckodriver");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            wt = new waitTypes(driver);
            driver.get(baseUrl);
            Thread.sleep(4000);

        }
    }

    @Test
    public void test1() throws InterruptedException{
          wt.waitForWebElement(By.xpath("//a[@class='navbar-link fedora-navbar-link']"),3).click();
          wt.waitForWebElement(By.id("user_email"),3).sendKeys("haris@hmnm.com");
          wt.waitForWebElement(By.id("user_password"),3).sendKeys("2223ewqewqe");
          wt.waitForWebElement(By.name("commit"),2).click();
//        driver.findElement(By.xpath("//a[@class='navbar-link fedora-navbar-link']")).click();
//        driver.findElement(By.id("user_email")).sendKeys("h@ht.com");
//        driver.findElement(By.id("user_password")).sendKeys("1234qwe");
//        driver.findElement(By.name("commit"));



    }

    @AfterClass
    public void tearDown(){
        driver.quit();

    }
}