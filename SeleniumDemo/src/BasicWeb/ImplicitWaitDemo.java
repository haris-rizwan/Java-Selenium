package BasicWeb;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWaitDemo {
	WebDriver driver;
	String baseUrl;
	 @Before
	 public void setUp() throws Exception {
		   System.setProperty("webdriver.chrome.driver", "/Users/harisrizwan/Selenium/Chrome/chromedriver");
		   driver = new ChromeDriver();
		   baseUrl = "https://letskodeit.teachable.com/p/practice";
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
}
	 
	 @Test
	 public void test() throws Exception{
		 driver.get(baseUrl);
		 driver.findElement(By.xpath("//a[@class='navbar-link fedora-navbar-link']")).click();
		 driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("kamlesshbannerjee@dhundhun.com");
		 
		 
	 }
	 
	 
	 @After
	 public void tearDown() {
		 driver.quit();
	 }
	 
	 

	 
}
