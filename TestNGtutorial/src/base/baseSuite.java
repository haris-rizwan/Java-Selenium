package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class baseSuite {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("////////////////////Before Suite Setup//////////////////");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("|||||||||||||||||Base Suite common Class Startup requirements|||||||||||||||");

    }

    @AfterClass
    public void afterClass(){
        System.out.println("|||||||||||||||||Base Suite common Class End requirements|||||||||||||||");

    }


    @AfterSuite
    public void afterSuite(){
     System.out.println("<<<<<<<<<<<<<<<<<<<<<<<After Suite Clean Up >>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }


}

