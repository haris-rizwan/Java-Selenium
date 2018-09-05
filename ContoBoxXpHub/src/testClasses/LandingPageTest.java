package testClasses;

import Webdriver.WebdriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageClasses.LandingPageClass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LandingPageTest {
    private WebDriver driver;
    private LandingPageClass lp;
    private String BaseUrl = "https://xphub-dev.contobox.com/";


    private DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    private Date date = new Date();
    private String fileName = dateFormat.format(date);

    private static final Logger  log = LogManager.getLogger(LandingPageTest.class.getName());


    @BeforeClass()
    public void classSetUp() {
        driver = WebdriverFactory.getDriverInstance("chrome",BaseUrl);
        lp = new LandingPageClass(driver);
        log.info("driver satrted");




    }

    @BeforeMethod()

    public void testSetup() {
        driver.get("https://xphub-dev.contobox.com");
        System.out.println("=========================before method====================");
    }


    @Test()
    public void test_CheckLoginBtn(){
        boolean check = lp.checkLoginBtnPresent();
        if (!check){
            lp.takeScreenshot(driver,fileName+" test_CheckLoginBtn");
            log.error("Login Button is not available");

        }else {
            log.info("Login Button available");
        }

    }

    @Test(dependsOnMethods = {"test_CheckLoginBtn"})
    public void test_VerifyLoginText(){

            boolean check = lp.VerifyLoginText();
            if(!check){
                lp.takeScreenshot(driver,fileName+" test_VerifyLoginText");
                log.error("The login button text not verified");

            }
            else {
                log.info("login Text verified");
            }

    }


    @Test(dependsOnMethods = {"test_VerifyLoginText"})
    public void test_clickLoginBtn(){
        try {
            lp.clickLoginBtn();
            Thread.sleep(1500);
            String url = driver.getCurrentUrl();
            Assert.assertEquals(url,"https://xphub-dev.contobox.com/auth/sign-in");
            log.info("Login button clicked ");

        }catch (Exception e){

        }
    }



    @Test(dependsOnMethods = {})
    public void test_CheckRequestBtn(){

            boolean check = lp.checkRequesBtn();
            if (!check){
                lp.takeScreenshot(driver,fileName+" test_CheckRequestBtn");
                log.error("Request button not present");
            }
            else {
                log.info("Request button is present ");
            }


    }

    @Test(dependsOnMethods = {"test_CheckRequestBtn"})
    public void test_VerifyRequestText(){

            boolean check = lp.VerifyRequestText();
            if(!check){
                lp.takeScreenshot(driver,fileName+" test_VerifyRequestText");
                log.error("Request button text not verified");

            }else {
                log.info("Request button text verified");
            }

    }


    @Test(dependsOnMethods = {"test_VerifyRequestText"})
    public void test_clickRequestBtn(){
        try {
            lp.clickRequestBtn();
            Thread.sleep(1500);
            String url = driver.getCurrentUrl();
            Assert.assertEquals(url,"https://xphub-dev.contobox.com/demo");
            log.info("Request button clicked ");

        }catch (Exception e){

        }
    }




//        @AfterMethod
//        public void testCleanUp () throws InterruptedException {
//
//            driver.get("https://google.com");
//            Thread.sleep(1000);
//
//
//        }


        @AfterClass
        public void classCleanUp () {

            driver.quit();

        }


}


