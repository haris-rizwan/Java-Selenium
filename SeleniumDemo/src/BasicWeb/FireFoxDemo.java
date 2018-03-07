package BasicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDemo {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/harisrizwan/Selenium/Firefox/geckodriver");
		String baseUrl = "https://www.google.com"; 
		driver = new FirefoxDriver();
		
		driver.get(baseUrl);
		
		driver.findElement(By.id("lst-ib")).sendKeys("dunkirk");
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		

	}

}
