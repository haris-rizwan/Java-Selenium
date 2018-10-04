package pageClasses;

import ElementRepository.RequestDemoPageRepo;
import Webdriver.SeleniumDriverMethods;
import org.openqa.selenium.WebDriver;

public class RequestDemoPageClass extends SeleniumDriverMethods {
    WebDriver driver;


    // Getting the Locators and type of locators of all elements on the page in private variables from the repository

    private String Locator_ContoboxLogo = RequestDemoPageRepo.CONTOBOX_LOGO.getLocator();
    private String Type_Contoboxlogo = RequestDemoPageRepo.CONTOBOX_LOGO.getType();
    private String Locator_RequestDemo_heading = RequestDemoPageRepo.REQUEST_DEMO_HEADING.getLocator();
    private String Type_RequestDemo_heading = RequestDemoPageRepo.REQUEST_DEMO_HEADING.getType();
    private String Locator_SignInBtn = RequestDemoPageRepo.SIGN_IN_BTN.getLocator();
    private String Type_SignInBtn = RequestDemoPageRepo.SIGN_IN_BTN.getType();
    private String Locator_NameField = RequestDemoPageRepo.NAME_FIELD.getLocator();
    private String Type_NameField = RequestDemoPageRepo.NAME_FIELD.getType();
    private String Locator_CompanyField = RequestDemoPageRepo.COMPANY_FIELD.getLocator();
    private String Type_CompanyField = RequestDemoPageRepo.COMPANY_FIELD.getType();
    private String Locator_EmailField = RequestDemoPageRepo.EMAIL_FIELD.getLocator();
    private String Type_EmailField = RequestDemoPageRepo.EMAIL_FIELD.getType();
    private String Locator_HearAboutUs = RequestDemoPageRepo.HEAR_ABOUT_FIELD.getLocator();
    private String Type_HearAboutUs = RequestDemoPageRepo.HEAR_ABOUT_FIELD.getType();
    private String Locator_MessageField = RequestDemoPageRepo.MESSAGE_FIELD.getLocator();
    private String Type_MessageField = RequestDemoPageRepo.MESSAGE_FIELD.getType();
    private String Locator_sendRequestBtn = RequestDemoPageRepo.SEND_REQUEST_BTN.getLocator();
    private String Type_sendRequestBtn = RequestDemoPageRepo.SEND_REQUEST_BTN.getType();


    // Getting locators of lables of the form



    // Texts on the webpage

    private String Actual_heading = "Request Demo";
    private String Actual_signIn = "Sign in";
    private String Actual_NamePlaceHolder = "";
    private String Actual_ComapnyPlaceholder ="";
    private String Actual_EmailPlaceHolder = "";
    private String Actual_howDidYouPlaceHolder = "";
    private String Actual_messagePlcaeHolder = "";
    private String Actual_SendRequest = "";







    public RequestDemoPageClass(WebDriver driver){
        super(driver);
        this.driver = driver;
    }



   public boolean checkLogoPresent(){
        return isElementPresent(Locator_ContoboxLogo,Type_Contoboxlogo);
    }

    public boolean checkRequestHeadingPresent(){
        return isElementPresent(Locator_RequestDemo_heading,Type_RequestDemo_heading);
    }

    public boolean checkSignInBtn(){return isElementPresent(Locator_SignInBtn,Type_SignInBtn);}

    public boolean checkNameField(){return isElementPresent(Locator_NameField,Type_NameField); }

    public boolean checkCompanyField(){return isElementPresent(Locator_CompanyField,Type_CompanyField);}

    public boolean checkEmailField(){return isElementPresent(Locator_EmailField,Type_EmailField);}

    public boolean checkHearAbout(){return isElementPresent(Locator_HearAboutUs,Type_HearAboutUs);}

    public boolean checkMessageField(){return isElementPresent(Locator_MessageField,Type_MessageField);}

    public boolean checkSendRequestBtn(){return isElementPresent(Locator_sendRequestBtn,Type_sendRequestBtn);}

    public void checktext() {

        System.out.println(getText(RequestDemoPageRepo.NAME_Label.getLocator(),RequestDemoPageRepo.NAME_Label.getType()));
        System.out.println(getText(RequestDemoPageRepo.COMPANY_LABLE.getLocator(),RequestDemoPageRepo.COMPANY_LABLE.getType()));
        System.out.println(getText(RequestDemoPageRepo.EMAIL_LABLE.getLocator(),RequestDemoPageRepo.EMAIL_LABLE.getType()));
    }

}
