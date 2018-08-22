package testClasses;

import Utilities.WebdriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class LandingPage {
    private WebDriver driver;
    private String baseUrl;


    @BeforeClass()
    public void setUp(){
//        driver = WebdriverFactory.getDriverInstance("chrome");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        baseUrl = "https://xphub-dev.contobox.com/";

        System.out.println("*************setup*************");

    }


    @BeforeTest()
    public void testSetup(){
       System.out.println("++++++++++++++Before test++++++++++");
    }


    @Test()
    public void test1(){

        System.out.println("TEST1");

    }



    @Test
    public void test2(){

        System.out.println("test2");
    }


    @AfterTest
    public void testCleanUp(){

        System.out.println("---------------After Test-----------");;



    }



  @AfterClass
    public void tearDown(){

//        driver.quit();

      System.out.println("After class");
  }










}

