package regressionTests;

import org.testng.annotations.*;
import base.baseSuite;
public class TestNG_TestClass1 extends baseSuite{

    @BeforeClass
    public void setUp(){
        System.out.println("\n*********************TestClass1 Start************************");
    }

    @AfterClass
    public void cleanUp(){
        System.out.println("*********************TestClass1 End************************");

    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("TestClass1 -> Runs before Every Method");

    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("TestClass1 -> Runs After Every Method");

    }

    @Test
    public void test1(){
        System.out.println("TestClass1 -> Test case 1");

    }

    @Test
    public void test2(){
        System.out.println("TestClass1 -> Test case 2");

    }
}
