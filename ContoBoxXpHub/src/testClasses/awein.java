package testClasses;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class awein{


 public static void main(String [] args){

     System.setProperty("webdriver.chrome.driver","/Users/harisrizwan/Selenium/Chrome/chromedriver");
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://xphub.contobox.com/demo");

     WebElement el = driver.findElement(By.cssSelector("[for='name']"));

     System.out.println(el.getText());


     driver.quit();
 }




}
