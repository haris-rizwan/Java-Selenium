package pageClasses;

import ElementRepository.LoginInPageRepo;
import Webdriver.SeleniumDriverMethods;
import org.openqa.selenium.WebDriver;

public class LoginPageClass extends SeleniumDriverMethods {

    WebDriver driver;

    private String Locator_ContoboxHeading = LoginInPageRepo.CONTOBOX_HEADING.getLocator();
    private String Type_ContoboxHeading=LoginInPageRepo.CONTOBOX_HEADING.getType();
    private String Locator_EmailField=LoginInPageRepo.EMIAL_FIELD.getLocator();
    private String Type_EmailField=LoginInPageRepo.EMIAL_FIELD.getType();
    private String Locator_PaswwordField=LoginInPageRepo.PASSWORD_FIELD.getLocator();
    private String Type_PasswordField=LoginInPageRepo.PASSWORD_FIELD.getType();
    private String Locator_RememberField=LoginInPageRepo.REMEMBER_ME.getLocator();
    private String Type_RememberField=LoginInPageRepo.REMEMBER_ME.getType();
    private String Locator_SignInBtn=LoginInPageRepo.SIGN_IN_BTN.getLocator();
    private String Type_SignInBtn=LoginInPageRepo.SIGN_IN_BTN.getType();
    private String Locator_ForgotPassword=LoginInPageRepo.FORGOT_PASSWORD.getLocator();
    private String Type_ForgotPassword=LoginInPageRepo.FORGOT_PASSWORD.getType();
    private String Locator_ContoboxLogo=LoginInPageRepo.CONTOBOX_LOGO.getLocator();
    private String Type_ContoboxLogo=LoginInPageRepo.CONTOBOX_LOGO.getType();
    private String Locator_RequestDemoBtn=LoginInPageRepo.Request_Demo.getLocator();
    private String Type_RequestDemoBtn=LoginInPageRepo.Request_Demo.getType();

    private String headingText = "Contobox Login";
    private String RequestDemotext = "Request Demo";
    private String emailPlaceHolder="Email";
    private String passwordPlaceHoldeer = "Password";
    private String rememberMeText="Remember me";
    private String SignInText = "SIGN IN";
    private String ForgotpasswordText ="Forgot password?";






    public LoginPageClass(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public boolean checkLogoPresent(){
        return isElementPresent(Locator_ContoboxLogo,Type_ContoboxLogo);
    }

    public void clickLogo(){
        elementClick(Locator_ContoboxLogo,Type_ContoboxLogo);
    }


    public boolean checkContoHeadingPresent(){
        return isElementPresent(Locator_ContoboxHeading,Type_ContoboxHeading);
    }

    public boolean VerifyHeadingText(){
        boolean check = false;
        try {
            String text = getText(Locator_ContoboxHeading,Type_ContoboxHeading);
            check = headingText.equals(text);
        }catch (Exception e){
            System.out.println("text doesnt match");
        }

        return check;
    }

    public boolean checkRequestDemoPresent(){
        return isElementPresent(Locator_RequestDemoBtn,Type_RequestDemoBtn);
    }

    public boolean VerifyRequestBtnText(){
        boolean check = false;
        try {
            String text = getText(Locator_RequestDemoBtn,Type_RequestDemoBtn);
            check = RequestDemotext.equals(text);
        }catch (Exception e){
            System.out.println("text does not match");
        }

        return check;
    }

    public void clickRequestBtn(){
        elementClick(Locator_RequestDemoBtn,Type_RequestDemoBtn);
    }

    public boolean checkEmailFieldPresent(){
        return isElementPresent(Locator_EmailField,Type_EmailField);
    }

    public boolean checkPasswordPresent(){
        return isElementPresent(Locator_PaswwordField,Type_PasswordField);
    }

    public boolean checkRemenberMePresent(){
        return isElementPresent(Locator_RememberField,Type_RememberField);
    }

    public boolean checkSignInPresent(){
        return isElementPresent(Locator_SignInBtn,Type_SignInBtn);
    }

    public boolean checkFogetPasswordPresent(){
        return isElementPresent(Locator_ForgotPassword,Type_ForgotPassword);
    }







}
