package utilities;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {
 public  static ExtentReports getInstance(){
    ExtentReports extent;
    String Path = "/Users/harisrizwan/Desktop/report.html";
    extent = new ExtentReports(Path,false);
    extent.addSystemInfo("Selenium Version","3.2");
    extent.addSystemInfo("Platform","Mac");

    return extent;
 }

}
