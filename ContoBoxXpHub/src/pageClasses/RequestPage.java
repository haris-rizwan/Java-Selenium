package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestPage {
    WebDriver driver;

    @FindBy(name = "name")
    WebElement nameField;

    @FindBy(name = "company")
    WebElement companyField;

    @FindBy(name="email")
    WebElement emailField;

    @FindBy(name="source")
    WebElement sourceField;

    @FindBy(name = "message")
    WebElement messageField;

    @FindBy(xpath = "//div[@id='__next']/div/div/div[3]/div//button[.='Send Request']")
    WebElement sendRequestBtn;

    @FindBy(xpath = "//div[@id='__next']/div//nav[@class='jsx-1889384911 navbar']/div[@class='jsx-1889384911 navbar-menu']//button[.='Sign in']")
    WebElement signInBtn;

    @FindBy(xpath = "//div[@id='__next']/div//nav[@class='jsx-1889384911 navbar']//a[@href='/']")
    WebElement contoBoxLogo;

    public RequestPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }


    public void enterName(String Name){
        nameField.sendKeys(Name);
    }

    public void enterEmail(String email){
        emailField.sendKeys(email);
    }

    public void enterCompnay(String company){
        companyField.sendKeys(company);
    }

    public void enterSourceField(String source){
        sourceField.sendKeys(source);
    }


    public void setMessageField(String message){
        sourceField.sendKeys(message);

    }

    public void clickSignInBt(){
        signInBtn.click();

    }


    public void clickContoboxBtn(){
        contoBoxLogo.click();
    }

}
