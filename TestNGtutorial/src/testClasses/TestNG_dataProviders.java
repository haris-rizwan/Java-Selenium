package testClasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_dataProviders {
//    @DataProvider(name = "DataSet")
//    public Object[][] getData(){
//        return new Object[][]{
//                {"BMW","m3"},
//                {"Audi","A6"},
//                {"Jeep","wrangler"}
//        };
//    }


  @Test(dataProvider = "DataSet",dataProviderClass = TestNG_TestData.class)
    public void testMethod1(String input1,String input2){
      System.out.println("First input " + input1);
      System.out.println("Second input " + input2);
  }

}
