package testClasses;

import appcode.SomeClassToTest;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

public class TestNG_softAsserts {

    @Test
    public void testSum(){
        SomeClassToTest tool = new SomeClassToTest();
        SoftAssert sA = new SoftAssert();
        int result = tool.sumNum(2,3);
        sA.assertEquals(result,3);
        System.out.println("this will run after 1st assert");
        sA.assertEquals(result,5);
        System.out.println("this will run after 2nd assert");
        sA.assertAll();
    }
}
