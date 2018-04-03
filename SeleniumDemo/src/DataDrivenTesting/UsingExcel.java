package DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import utilities.Constants;
import utilities.ExcelUtility;
import utilities.waitTypes;

import java.util.Arrays;

public class UsingExcel {
    WebDriver driver;
    waitTypes wt;

    @BeforeClass
    public void setUp() throws Exception{
        System.setProperty("webdriver.chrome.driver","/Users/harisrizwan/Selenium/Chrome/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Constants.URL);
        wt = new waitTypes(driver);
        wt.waitForWebElement(By.xpath("//div[@id='mainPageinlineContent']/div[@class='style-j4dnywzf']/a[@role='button']"),2).click();
//
        Thread.sleep(2000);
        ExcelUtility.setExcelFile(Constants.FilePath+Constants.FileNName,"loginTest");

    }

    @DataProvider(name = "LoginData")
    public Object[][] dataProvider(){
        Object[][] testValues= ExcelUtility.getTestData("Invalid_login");
        System.out.println(Arrays.deepToString(testValues));
        return testValues;
    }


    @Test(dataProvider = "LoginData")
    public void test(String username, String password){
        driver.findElement(By.xpath("//a[@class='navbar-link fedora-navbar-link']")).click();
        wt.waitForWebElement(By.id("user_email"),2).sendKeys(username);
        wt.waitForWebElement(By.id("user_password"),2).sendKeys(password);
        driver.findElement(By.name("commit")).click();
        boolean check = wt.isElementPresent("//div[@class='alert alert-danger']","xpath");
        Assert.assertTrue(check);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }



}
