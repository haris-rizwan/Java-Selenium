package BasicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemo {

	public static void main(String[] args) {
		///Users/harisrizwan/Selenium/Chrome/chromedriver
		String baseUrl = "https://www.google.ca";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/harisrizwan/Selenium/Chrome/chromedriver");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		//input[@name='btnK']
		driver.findElement(By.id("lst-ib")).sendKeys("dunkirk");
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
	
	}

}
