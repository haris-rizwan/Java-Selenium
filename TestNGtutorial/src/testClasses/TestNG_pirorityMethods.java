package testClasses;

import org.testng.annotations.*;

public class TestNG_pirorityMethods {
    @BeforeClass
    public void setUp()
    {
        System.out.println("*********************Pirority Methods class Start************************");
    }

    @AfterClass
    public void cleanUp(){
        System.out.println("*********************Pirority Methods  End************************");

    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Pirority Methods  -> Runs before Every Method");

    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Pirority Methods  -> Runs After Every Method");

    }

    @Test(priority=1)
    public void test1(){
        System.out.println("TestClass2 -> Test case 1");

    }

    @Test(priority=0)
    public void test2(){
        System.out.println("TestClass2 -> Test case 2");

    }

}
