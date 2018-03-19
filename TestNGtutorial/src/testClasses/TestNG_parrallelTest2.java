package testClasses;

import org.testng.annotations.Test;

public class TestNG_parrallelTest2 {
    @Test
    public void test1() throws InterruptedException{
        System.out.println("parrallelTest2>>>>> test1");
        Thread.sleep(6000);
        System.out.println("parrallelTest2>>>>> test1 >>>>>second step");
    }

    @Test
    public void test2(){
        System.out.println("parrallelTest2>>>>> test2");
    }

}

