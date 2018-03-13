package test.tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BonusFindAllLinks {
   private WebDriver driver;
   private String baseUrl;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/harisrizwan/Selenium/Chrome/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        baseUrl = "https://www.expedia.com/";

    }

    @Test
    public void testFindLinks(){
        driver.get(baseUrl);
        List<WebElement> linkList = clickableLinks(driver);
        for (WebElement link:linkList){
            String url = link.getAttribute("href");
            try {
                System.out.println("URL "+ url +" returned " + linksStatus(new URL(url)));
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

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

    /**
     *
     * @param url **requires a string of url****
     * @return **it will return the response message when url is processed
     */

    public static String linksStatus(URL url){
        try{
            /*first create an object of HttpURlConnection and open a connection with url which passe
            * as an argument*/
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            /*then connect */
            http.connect();
            /*create a string variable to store the response message*/
            String responseMessage = http.getResponseMessage();
            http.disconnect();
            return responseMessage;

        }
        catch (Exception e){
            return e.getMessage();
        }
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}


