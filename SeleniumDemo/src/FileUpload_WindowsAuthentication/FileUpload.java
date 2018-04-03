package FileUpload_WindowsAuthentication;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.waitTypes;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUpload {
  WebDriver driver;
  String baseUrl;
  waitTypes wt;
  String email;
  String password;
  @BeforeClass
    public void setUp() throws InterruptedException{
      System.setProperty("webdriver.chrome.driver","/Users/harisrizwan/Selenium/Chrome/chromedriver");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      baseUrl = "https://outlook.live.com";
      driver.get(baseUrl);
      wt = new waitTypes(driver);
      email = "harisrizwan@live.com";
      password = "";
      driver.findElement(By.className("buttonLargeBlue")).click();
  }


  @Test
  public void test() throws InterruptedException,AWTException{

      driver.findElement(By.name("loginfmt")).sendKeys(email);
      driver.findElement(By.id("idSIButton9")).click();
      Thread.sleep(1000);
      driver.findElement(By.name("passwd")).sendKeys(password);
      driver.findElement(By.id("idSIButton9")).click();
      Thread.sleep(10000);
      driver.findElement(By.xpath("//button[@autoid='_fce_1']")).click();
      wt.waitForWebElement(By.xpath("//div[@autoid='_mcp_9']//div[@autoid='_rw_0']//div[@class='_rw_u allowTextSelection']//span[@class='findControlWrapper']//div[@class='_fp_F']//form[@autocomplete='off']//input[@autoid='_fp_5']"),3).sendKeys(email);
      driver.findElement(By.xpath("//input[@autoid='_mcp_c']")).sendKeys("TEst upload file");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//html//div[@autoid='_n_8']/div[@class='_n_X']/div[@class='_n_X']//div[2]/div[1]/button[1]")).click();
      wt.waitForWebElement(By.xpath("//button[@autoid='_av_f']"),2).click();
      Thread.sleep(3000);



      String add ="/Users/harisrizwan/Desktop/test.png";
      StringSelection path = new StringSelection(add);

//      copy to clipboard

      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path,null);
//
      Robot robot = new Robot();
      robot.delay(1000);

      // switch focus to chrome instance

      robot.keyPress(KeyEvent.VK_META);
      robot.delay(1000);
      robot.keyPress(KeyEvent.VK_TAB);
      robot.keyRelease(KeyEvent.VK_META);
      robot.keyRelease(KeyEvent.VK_TAB);
      robot.delay(3000);

      // open the go to window

      robot.keyPress(KeyEvent.VK_META);
      robot.delay(1000);
      robot.keyPress(KeyEvent.VK_SHIFT);
      robot.delay(1000);
      robot.keyPress(KeyEvent.VK_G);
      robot.keyRelease(KeyEvent.VK_G);
      robot.keyRelease(KeyEvent.VK_SHIFT);
      robot.keyRelease(KeyEvent.VK_META);
      robot.delay(5000);


      // copy the file path

      robot.keyPress(KeyEvent.VK_BACK_SPACE);
      robot.keyRelease(KeyEvent.VK_BACK_SPACE);
      robot.delay(2000);

      robot.keyPress(KeyEvent.VK_H);
      robot.keyRelease(KeyEvent.VK_H);

      robot.delay(1000);



      // hit enter twice to select the file



//      wt.waitForWebElement(By.xpath("//button[@autoid='_av_2']"),1).click();
//      wt.waitForWebElement(By.xpath("//div[@class='ms-border-color-neutralTertiary ms-bg-color-white _mcp_73 _mcp_83']//div[@class='_mcp_g1 _mcp_x1 ms-bg-color-white ms-border-color-neutralTertiaryAlt']//div[@class='_mcp_i1']//div[@class='_mcp_I2']//button[@autoid='_mcp_g']"),2).click();








  }

  @AfterClass
    public void tearDown(){
//        driver.quit();
  }
}



