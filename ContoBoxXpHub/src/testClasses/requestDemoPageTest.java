package testClasses;

import Webdriver.WebdriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageClasses.RequestDemoPageClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class RequestDemoPageTest {

    WebDriver driver;
    String baseUrl = "https://xphub.contobox.com/demo";
    RequestDemoPageClass rp;



    DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
    LocalDateTime getDate = LocalDateTime.now();
    private String fileName = f.format(getDate);

    private static final Logger log = LogManager.getLogger(RequestDemoPageTest.class.getName());



    @BeforeClass
    public void setUp() throws InterruptedException{
        driver = WebdriverFactory.getDriverInstance("chrome",baseUrl);
        rp = new RequestDemoPageClass(driver);
        log.info("Driver started");



    }



    @Test()
    public void test_LogoPresent(){

        boolean check = rp.checkLogoPresent();
        if(check){
            log.info("Logo Present");
        }else {
            log.error("Logo not present");
            rp.takeScreenshot(driver,fileName);
            Assert.assertTrue(check);
        }

    }


    @Test
    public void test_HeadingPresent(){

        boolean check = rp.checkRequestHeadingPresent();
        if(check){
            log.info("Heading Present");
        }else {
            log.error("Heading not present");
            rp.takeScreenshot(driver,fileName);
            Assert.assertTrue(check);
        }



    }



    @Test
    public void test_SignInBtnPresent(){

        boolean check = rp.checkSignInBtn();
        if(check){
            log.info("SignIn Button is  Present");
        }else {
            log.error("SignIn Button not present");
            rp.takeScreenshot(driver,fileName);
            Assert.assertTrue(check);
        }

    }




    @Test
    public void test_NameFieldPresent(){

        boolean check = rp.checkNameField();
        if(check){
            log.info("Name Field is  Present");
        }else {
            log.error("Name Field is not present");
            rp.takeScreenshot(driver,fileName);
            Assert.assertTrue(check);
        }

    }



    @Test
    public void test_CompanyFieldPresent(){

        boolean check = rp.checkCompanyField();
        if(check){
            log.info("Company Field is  Present");
        }else {
            log.error("Name Field is not present");
            rp.takeScreenshot(driver,fileName);
            Assert.assertTrue(check);
        }

    }




    @Test
    public void test_EmailFieldPresent(){

        boolean check = rp.checkEmailField();
        if(check){
            log.info("Email Field is  Present");
        }else {
            log.error("Email Field is not present");
            rp.takeScreenshot(driver,fileName);
            Assert.assertTrue(check);
        }

    }



    @Test
    public void test_HearAboutUSFieldPresent(){

        boolean check = rp.checkHearAbout();
        if(check){
            log.info("Hear About Field is  Present");
        }else {
            log.error("Hear About Field is not present");
            rp.takeScreenshot(driver,fileName);
            Assert.assertTrue(check);
        }

    }



    @Test
    public void test_MessageFieldPresent(){

        boolean check = rp.checkMessageField();
        if(check){
            log.info("Message Field is  Present");
        }else {
            log.error("Message Field is not present");
            rp.takeScreenshot(driver,fileName);
            Assert.assertTrue(check);
        }

    }



    @Test
    public void test_SendRequestBtnPresent(){

        boolean check = rp.checkSendRequestBtn();
        if(check){
            log.info("Send Request btn  is  Present");
            rp.checktext();

        }else {
            log.error("Send Request btn  is not present");
            rp.takeScreenshot(driver,fileName);
            Assert.assertTrue(check);
        }

    }








    @AfterClass()
    public void tearDown(){
        rp.checktext();
        driver.quit();
    }
}
