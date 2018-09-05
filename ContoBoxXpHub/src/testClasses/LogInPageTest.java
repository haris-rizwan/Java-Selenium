package testClasses;

import Webdriver.WebdriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pageClasses.LandingPageClass;
import pageClasses.LoginPageClass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogInPageTest {
    WebDriver driver;
    LoginPageClass lp;
    LandingPageClass landPage;
    private String BaseUrl = "https://xphub-dev.contobox.com/";


    private DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    private Date date = new Date();
    private String fileName = dateFormat.format(date);

    private static final Logger log = LogManager.getLogger(LandingPageTest.class.getName());


    @BeforeClass
    public void setUp() throws InterruptedException {

        driver = WebdriverFactory.getDriverInstance("chrome",BaseUrl);
        lp = new LoginPageClass(driver);
        landPage=new LandingPageClass(driver);
        log.info("driver started");

    }


    @BeforeMethod
    public void testSetup() throws InterruptedException{
        landPage.clickLoginBtn();
        Thread.sleep(1500);

    }

    @AfterMethod
    public void testClearup(){
        driver.get(BaseUrl);
    }
//
    @Test
    public void test_logoPresent(){
            boolean check = lp.checkLogoPresent();
            if (check) {
                log.info("Logo is present");
            } else {
                log.error("Logo not present");
                lp.takeScreenshot(driver, fileName + "test_logoPresent");
                Assert.assertTrue(check);
            }
    }


    @Test(dependsOnMethods = {"test_logoPresent"})
    public void test_clickLogo() throws InterruptedException{
        lp.clickLogo();
        Thread.sleep(1000);
        boolean check = landPage.checkLoginBtnPresent();
        if (check){
            log.info("Logo clicked and redirecting to main landing page");
        }
        else {

            log.error("Logo click error");

        }
    }

    @Test
    public void test_headingPresent(){
        boolean check = lp.checkContoHeadingPresent();
        if (check){
            log.info("Heading present");
        }
        else {
            log.error("heading not present");
            lp.takeScreenshot(driver,fileName+"test_headingPresent");
            Assert.assertTrue(check);
        }
    }

    @Test(dependsOnMethods = "test_headingPresent")
    public void test_verifyHeadingText(){
        boolean check = lp.VerifyHeadingText();
        if (check){
            log.info("Heading text verified");
        }
        else {
            log.error("Heading text no verified ");
            lp.takeScreenshot(driver,fileName+"test_verifyHeadingText");
        }
    }

    @Test
    public void test_checkRequestDemoBtn(){
        boolean check = lp.checkRequestDemoPresent();
        if (check){
            log.info("Request demo button is present");
        }else {
            log.error("Request button is not present");
            lp.takeScreenshot(driver,fileName+"test_checkRequestDemoBtn");
            Assert.assertTrue(check);
        }
    }


    @Test(dependsOnMethods = "test_checkRequestDemoBtn")
    public void test_verifyRequestBtnText(){
        boolean check = lp.VerifyRequestBtnText();
        if (check){
            log.info("Request Button text verified");
        }
        else {
            log.error("Request Button text not verified ");
            lp.takeScreenshot(driver,fileName+"test_verifyRequestBtnText");
        }
    }


    @Test(dependsOnMethods = {"test_checkRequestDemoBtn"})
    public void test_clickRequestBtn() throws InterruptedException{
        lp.clickRequestBtn();
        Thread.sleep(1000);
        String url = driver.getCurrentUrl();
        boolean check = url.equals("https://xphub-dev.contobox.com/demo");
        if (check){
            log.info("Request button clicked and redirects to request page");
        }else {
            log.error("Request button click failure ");
            lp.takeScreenshot(driver,fileName+"test_clickRequestBtn");
        }
    }


    @Test
    public void test_checkEmailField(){
        boolean check = lp.checkEmailFieldPresent();
        if (check){
            log.info("Email field is present");
        }else {
            log.error("Email field is not present");
            lp.takeScreenshot(driver,fileName+"test_checkEmailField");
        }
    }


    @Test
    public void test_checkPasswordField(){
        boolean check = lp.checkPasswordPresent();
        if (check){
            log.info("Password field is present");
        }else {
            log.error("Field is not present");
            lp.takeScreenshot(driver,fileName+"test_checkPasswordField");
        }
    }


    @Test
    public void test_checkRememberMeCheckBox(){
        boolean check = lp.checkRemenberMePresent();
        if (check){
            log.info("Remember me is present");
        }else {
            log.error("Remeber me is not present");
            lp.takeScreenshot(driver,fileName+"test_checkRememberMeCheckBox");
        }
    }


    @Test
    public void test_checkSignInBtn(){
        boolean check = lp.checkSignInPresent();
        if (check){
            log.info("Sign In button is present");
        }else {
            log.error("Sign In button not present");
            lp.takeScreenshot(driver,fileName+"test_checkSignInBtn");
        }
    }


    @Test
    public void test_checkForgotPasswordField(){
        boolean check = lp.checkFogetPasswordPresent();
        if (check){
            log.info("Forgot password field is present");
        }else {
            log.error("Forgot password field is not present");
            lp.takeScreenshot(driver,fileName+"test_checkRequestDemoBtn");
        }
    }










    @AfterClass
public void clearUP(){
        driver.quit();
}



}


