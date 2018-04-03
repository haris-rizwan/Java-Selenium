package test.tutorial;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utlilities.waitTypes;


import java.net.MalformedURLException;

public class SeleniumGrid_parallelTest extends TestSuiteBase {

 @BeforeClass
    public void setUp() throws MalformedURLException,InterruptedException{


 }


 @Test
    public void test() throws InterruptedException{
        search.clickHotelTabBtn();
        search.enterDestination("Karachi");
       search.enterCheckIn("05","22","2018");
       search.enterCheckOut("06","12","2018");

 }


 @AfterClass
    public void tearDown(){
//        driver.quit();

 }

}
