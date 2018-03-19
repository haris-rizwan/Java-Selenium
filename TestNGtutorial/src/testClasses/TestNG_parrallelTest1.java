package testClasses;

import org.testng.annotations.Test;

public class TestNG_parrallelTest1 {


    @Test
    public void test1() throws InterruptedException{
        System.out.println("parrallelTest1>>>>> test1");
        Thread.sleep(6000);
        System.out.println("parrallelTest1>>>>> test1 >>>>>second step");


    }

    @Test
    public void test2(){
        System.out.println("parrallelTest1>>>>> test2");
    }
}
