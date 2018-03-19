package testClasses;

import org.testng.annotations.*;

public class TestNG_Class2 {

    @BeforeClass
    public void setUp(){
        System.out.println("*********************TestClass2 Start************************");
    }

    @AfterClass
    public void cleanup(){
        System.out.println("*********************TestClass2 End************************");

    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("TestClass2 -> Runs before Every Method");

    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("TestClass2 -> Runs After Every Method");

    }

    @Test
    public void test1(){
        System.out.println("TestClass2 -> Test case 1");

    }

    @Test
    public void test2(){
        System.out.println("TestClass2 -> Test case 2");

    }
}