package testClasses;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class TestNG_reportersAndLogs {

  @BeforeClass
    public void setUp(){
        Reporter.log("TestNG_ReporterAndLogs>>> This runs before class",true);
  }

  @AfterClass
    public void tearDown(){
      Reporter.log("TestNG_ReporterAndLogs>>> This runs after class",true);


  }

  @BeforeMethod
    public void beforeMethod(){
      Reporter.log("TestNG_ReporterAndLogs>>> This runs before every method",true);

  }

  @AfterMethod
    public void afterMethod(){
      Reporter.log("TestNG_ReporterAndLogs>>> This runs after every method",true);

  }



  @Test
    public void test1(){
      Reporter.log("TestNG_ReporterAndLogs>>> Method 1 running",true);

  }


  @Test
    public void test2(){
      Assert.assertTrue(false);
      Reporter.log("TestNG_ReporterAndLogs>>> Method 2 running",true);

  }

  @Test(dependsOnMethods = "test2")
    public void test3(){
      Reporter.log("TestNG_ReporterAndLogs>>> Method 3 running",true);

  }

}