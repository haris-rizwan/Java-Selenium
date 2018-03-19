package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import appcode.SomeClassToTest;

public class TestNgAnnotations {

    /*
    Default order of test method running is by the test names alphabatically
     */

    @Test
    public void testSum(){
        SomeClassToTest tool = new SomeClassToTest();
        int result = tool.sumNum(2,3);
        Assert.assertEquals(result,5);
        System.out.println("this is sum test method");

    }

    @Test
    public void testString(){
        SomeClassToTest obj = new SomeClassToTest();
        String expectedString = "Hello World";
        String result =obj.addString("Hello","World");
        Assert.assertEquals(expectedString,result);
        System.out.println("this is String test method");
    }

    @Test
    public void testArray(){
        int[] expectedArray = {1,2,3};
        SomeClassToTest obj = new SomeClassToTest();
        int [] result = obj.getArray();
        Assert.assertEquals(result,expectedArray);
        System.out.println("this is  Array test method ");
    }

}
