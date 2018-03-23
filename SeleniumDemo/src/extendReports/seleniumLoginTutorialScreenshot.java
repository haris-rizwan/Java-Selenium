package extendReports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.ExtentFactory;
import utilities.waitTypes;
import utilities.ScreenShots;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class seleniumLoginTutorialScreenshot {


    WebDriver driver;
    String baseUrl;
    waitTypes wt;
    ExtentReports reports;
    ExtentTest test;

    @BeforeClass
    public void classSetup() {
//        reports = new ExtentReports("/Users/harisrizwan/Desktop/report.html");
        reports = ExtentFactory.getInstance();
        test = reports.startTest("Verifying login test");
        System.setProperty("webdriver.chrome.driver", "/Users/harisrizwan/Selenium/Chrome/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        test.log(LogStatus.INFO, "Chrome instance opened and window maximized");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        baseUrl = "https://letskodeit.com";
        wt = new waitTypes(driver);
    }

    @Test
    public void testLogin() throws InterruptedException {

        driver.get(baseUrl);
        test.log(LogStatus.INFO, "Website opened ");
        test.log(LogStatus.INFO, "Test start");
        wt.waitForWebElement(By.id("comp-iiqg1vggactionTitle"), 2).click();
        wt.waitForWebElement(By.id("signUpDialogswitchDialogLink"), 2).click();
        wt.waitForWebElement(By.id("memberLoginDialogemailInputinput"), 2).sendKeys("test@email.com");
        wt.waitForWebElement(By.id("memberLoginDialogpasswordInputinput"), 2).sendKeys("abcabc11");
        wt.waitForWebElement(By.id("memberLoginDialogoklink"), 2).click();

        WebElement welcomeText = null;

        try {
            welcomeText = wt.waitForWebElement(By.xpath("//div[@id='comp-iiqg1vggmemberTitle']"), 3);

        } catch (NoSuchElementException e) {
            test.log(LogStatus.INFO, "Log in failed");
        }

        Assert.assertTrue(welcomeText != null);
        test.log(LogStatus.PASS, "Log in successful");

    }

    @AfterMethod
    public void tearDown(ITestResult testResult) throws IOException{
        if (testResult.getStatus()== ITestResult.FAILURE){
            String path = ScreenShots.takeScreenshot(driver,testResult.getName());
            String imagePath = test.addScreenCapture(path);
            test.log(LogStatus.FAIL,"Verify text failed",imagePath);
        }

        driver.quit();
        reports.endTest(test);
        reports.flush();
    }
}
