package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPageFactory {
    WebDriver driver;

    @FindBy(xpath = "//button[@class='jsx-1746199279 button  secondary']")
    WebElement SignInBtn;

    @FindBy(name = "email")
    WebElement userEmail;

    @FindBy(name = "password")
    WebElement userPassword;

    @FindBy(name = "remember")
    WebElement rememberMe;

    @FindBy(xpath = "//button[@class='jsx-1746199279 button container secondary']")
    WebElement SignInBtn2;

    @FindBy(xpath = "//span[@tabindex='0']")
    WebElement forgotPassword;


    public  SignInPageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    public void clickOnSignIn(){
        SignInBtn.click();
    }



    public void enterEmail(String email){
        userEmail.sendKeys(email);
    }


    public void enterPassword(String password){
        userPassword.sendKeys(password);
    }


    public void clickRememberMe(){
        rememberMe.click();
    }

    public void clickSignIn2(){
        SignInBtn2.click();
    }

    public boolean isRememberMeChecked(){
        return rememberMe.isSelected();
    }


}
