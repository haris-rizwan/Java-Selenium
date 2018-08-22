package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LandingPage {
    WebDriver driver;

    @FindBy(xpath = "//div[@id='main-wrapper']/div/div/div[1]/div//button[.='Log in']")
    WebElement LoginBtn;

    @FindBy(xpath = "//div[@id='main-wrapper']/div/div/div[1]/div//button[.='Request demo']" )
    WebElement RequestDemoBtn;


    public LandingPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    public void clickLoginBtn(){
        LoginBtn.click();
    }


    public void clickRequestDemo(){
        RequestDemoBtn.click();
    }


}


