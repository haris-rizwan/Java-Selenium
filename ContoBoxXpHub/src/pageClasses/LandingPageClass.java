package pageClasses;


import ElementRepository.LandingPageRepo;
import Webdriver.SeleniumDriverMethods;
import org.openqa.selenium.WebDriver;

public class LandingPageClass extends SeleniumDriverMethods {
    private WebDriver driver;

    private String Locator_LoginBtn = LandingPageRepo.LOGINBTN.getLocator();
    private String Type_LoginBtn = LandingPageRepo.LOGINBTN.getType();

    private String Locator_RequestBtn = LandingPageRepo.REQUESTBTN.getLocator();
    private String Type_RequestBtn =LandingPageRepo.REQUESTBTN.getType();


    private String Actual_login_Text = "LOG IN";
    private String Actual_request_Text = "REQUEST DEMO";

    public LandingPageClass(WebDriver driver){
        super(driver);
        this.driver = driver;
    }






    public boolean checkLoginBtnPresent(){
        Boolean check = false;
        try {
            check = isElementPresent(Locator_LoginBtn,Type_LoginBtn);

        }catch (Exception e){
            System.out.println("Element is not present ");
        }

        return check;
    }


    public void clickLoginBtn(){

        elementClick(Locator_LoginBtn,Type_LoginBtn);


    }


    public boolean checkRequesBtn(){
        boolean check = false;
        try {
            check = isElementPresent(Locator_RequestBtn,Type_RequestBtn);

        }catch (Exception e){
            System.out.println(e);
        }

        return check;
    }


    public void clickRequestBtn(){

        elementClick(Locator_RequestBtn,Type_RequestBtn);

    }


    public boolean VerifyLoginText(){
         boolean check = false;
         try {
            String text = getText(Locator_LoginBtn,Type_LoginBtn);
            check = Actual_login_Text.equals(text);
         }catch (Exception e){
             System.out.println("text doesnt match");
         }

         return check;
    }



    public boolean VerifyRequestText(){
        boolean check = false;
        try {
            String text = getText(Locator_RequestBtn,Type_RequestBtn);
            check = Actual_request_Text.equals(text);
        }catch (Exception e){
            System.out.println("text doesnt match");
        }

        return check;
    }








}


