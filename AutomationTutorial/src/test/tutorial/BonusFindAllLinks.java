package test.tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BonusFindAllLinks {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/harisrizwan/Selenium/Chrome/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @Test
    public void testFindLinks(){

    }

    /**
     *
     * @param driver **driver required**
     * @return it returns a list of all clickable links present on the webpage
     */
    public static List<WebElement>clickableLinks(WebDriver driver){
        List<WebElement> linksToClick = new ArrayList <>();
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        elements.addAll(driver.findElements(By.tagName("img")));

        for (WebElement e:elements ){
            if(e.getAttribute("href")!=null){
                linksToClick.add(e);
            }
        }
        return linksToClick;
    }

    public static String linksStatus(URL url){
        
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}


