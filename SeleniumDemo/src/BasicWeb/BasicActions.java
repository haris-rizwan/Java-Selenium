package BasicWeb;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicActions {
	WebDriver driver;
	String baseUrl;
	
   @Before
   public void setUp() throws Exception {
	   System.setProperty("webdriver.gecko.driver", "/Users/harisrizwan/Selenium/Firefox/geckodriver");
	   driver = new FirefoxDriver();
	   baseUrl = "https://letskodeit.com";
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   }
   @Test
   public void test() throws Exception {
	   driver.get(baseUrl);
	   driver.findElement(By.xpath("//button[@id='comp-iiqg1vggactionTitle']")).click();
	   System.out.println("login button clicked");
	   driver.findElement(By.xpath("//input[@id='signUpDialogemailInputinput']")).sendKeys("haris@live.com");
	   driver.findElement(By.xpath("//input[@id='signUpDialogpasswordInputinput']")).sendKeys("hellooo");
   }
   @After
   public void tearDown() throws Exception {
	   driver.quit();
	   
   }
}
