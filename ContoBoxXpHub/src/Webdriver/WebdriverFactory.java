package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverFactory {



    public static WebDriver getDriverInstance(String browser,String url){
        WebDriver driver = null;
        if(browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","/Users/harisrizwan/Selenium/Chrome/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(url);
            return driver;
        }

        else if(browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver","/Users/harisrizwan/Selenium/Firefox/geckodriver");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get(url);
            return driver;
        }

        else {
            System.setProperty("webdriver.chrome.driver","/Users/harisrizwan/Selenium/Chrome/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(url);
            return driver;
        }
    }


}
