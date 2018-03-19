package testClasses;

import org.testng.Assert;
import org.testng.annotations.*;
import appcode.SomeClassToTest;

public class TestNG_dependentMethods {
    SomeClassToTest obj;
    @BeforeClass
    public void setUp()
    {
        obj = new SomeClassToTest();
        System.out.println("*********************Pirority Methods class Start************************");
    }

    @AfterClass
    public void cleanUp(){
        System.out.println("*********************Pirority Methods  End************************");

    }


    @Test(dependsOnMethods = {"test2"})
    public void test1(){
        System.out.println("TestClass2 -> Test case 1");

    }

    @Test
    public void test2(){
        int res = obj.sumNum(2,3);
        Assert.assertEquals(res,5);
        System.out.println("TestClass2 -> Test case 2");

    }

    @Test(dependsOnMethods = {"test1"})
    public void test3(){
        System.out.println("TestClass2 -> Test case 3");

    }

    @Test
    public void test4(){
        System.out.println("TestClass2 -> Test case 4");

    }

}
