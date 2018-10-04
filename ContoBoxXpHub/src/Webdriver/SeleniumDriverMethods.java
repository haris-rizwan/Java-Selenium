package Webdriver;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testClasses.LandingPageTest;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SeleniumDriverMethods  {

    WebDriver driver;
    private static final Logger log = LogManager.getLogger(LandingPageTest.class.getName());

    public SeleniumDriverMethods(WebDriver driver){

        this.driver = driver;

    }


    public String takeScreenshot(WebDriver driver, String fileName) {
        String destination = null;
        try {
            fileName = fileName + ".png";
            String directory = "/Users/harisrizwan/IntelliJ WorkSpace/ContoBoxXpHub/Screenshots/";
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File(directory + fileName));
            destination = directory + fileName;
        }
        catch (IOException e){
            log.error("Unable to take screen shot");
        }

        return destination;
    }



    public WebElement waitForElementVisibility(By Locater, int timeOut) {
        WebElement element = null;

        try {
            System.out.println("Waiting for elment in given Time :: " + timeOut + " Seconds");

            WebDriverWait wait = new WebDriverWait(driver, timeOut);
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(Locater));
            System.out.println("Element appeared on the Web Page");


        } catch (Exception e) {
            System.out.println("Unable to locate element in " + timeOut + " Seconds");
        }

        return element;

    }


    public WebElement waitForElementClickable(By Locater, int timeOut) {
        WebElement element = null;

        try {
            System.out.println("Waiting for elment in given Time :: " + timeOut + " Seconds");

            WebDriverWait wait = new WebDriverWait(driver, timeOut);
            element = wait.until(ExpectedConditions.elementToBeClickable(Locater));
            System.out.println("Element appeared on the Web Page");


        } catch (Exception e) {
            System.out.println("Unable to locate element in " + timeOut + " Seconds");
        }

        return element;

    }


    public WebElement waitForElementPresence(By Locater, int timeOut) {
        WebElement element = null;

        try {
            System.out.println("Waiting for elment in given Time :: " + timeOut + " Seconds");

            WebDriverWait wait = new WebDriverWait(driver, timeOut);
            element = wait.until(ExpectedConditions.presenceOfElementLocated(Locater));
            System.out.println("Element appeared on the Web Page");


        } catch (Exception e) {
            System.out.println("Unable to locate element in " + timeOut + " Seconds");
        }

        return element;

    }




    public void clickWhenReady (By Locater, int timeOut) {
        try {
            WebElement element;
            System.out.println("Waiting for element in given Time :: " + timeOut + " Seconds");

            WebDriverWait wait = new WebDriverWait(driver, timeOut);
            element = wait.until(ExpectedConditions.elementToBeClickable(Locater));
            element.click();
            System.out.println("Element clicked");

        } catch (Exception e) {
            System.out.println("Unable to locate element in " + timeOut + " Seconds");
        }


    }

    public WebElement getElement(String locator , String type){
        WebElement element = null;
        type = type.toLowerCase();


        try {
            if (type.equals("id")){
                element = driver.findElement(By.id(locator));


            }
            else if (type.equals("xpath")){
                element=driver.findElement(By.xpath(locator));


            }
            else if (type.equals("classname")){
                element = driver.findElement(By.className(locator));

            }

            else if (type.equals("cssselector")){
                element = driver.findElement(By.cssSelector(locator));

            }

            else if (type.equals("linktext")){
                element = driver.findElement(By.linkText(locator));


            }

            else if (type.equals("name")){
                element = driver.findElement(By.name(locator));


            }

            else if (type.equals("tagname")){
                element = driver.findElement(By.tagName(locator));

            }



            else {
                return element;
            }

            if (element!=null){
                System.out.println("Element found on web page with locater: "+locator+" and type: " + type);
            }
            else {
                System.out.println("Unsupported Locator Type : "+type);
            }

        }catch (Exception e ){

            System.out.println("Unable to locate element with locator: "+locator+" and type: "+ type );

        }

        return element;


    }


    public List<WebElement> getElementList(String locator , String type){
        List<WebElement> elementsList = new ArrayList<WebElement>();
        type = type.toLowerCase();

        if (type.equals("id")){
            elementsList = driver.findElements(By.id(locator));

        }
        else if (type.equals("xpath")){
            elementsList=driver.findElements(By.xpath(locator));

        }
        else if (type.equals("classname")){
            elementsList = driver.findElements(By.className(locator));
        }

        else if (type.equals("cssselector")){
            elementsList = driver.findElements(By.cssSelector(locator));
        }

        else if (type.equals("linktext")){
            elementsList = driver.findElements(By.linkText(locator));

        }

        else if (type.equals("name")){
            elementsList = driver.findElements(By.name(locator));

        }

        else if (type.equals("tagname")){
            elementsList = driver.findElements(By.tagName(locator));
        }



        else {
            System.out.println("Locator Type not supported");
        }

        if (elementsList.isEmpty()){
            System.out.println("unable to Locate elements with locator: "+locator+" type: " +type);
        }
        else {
            System.out.println("Elements located with locator: "+locator+" type: "+type);
        }


        return elementsList;
    }

    public boolean isElementPresent(String locater, String type){
        List<WebElement> elementList = getElementList(locater,type);
        if(elementList.size()>0){
            System.out.println("The element is present with locator: "+ locater);
            return true;

        }
        else {
            System.out.println("The element is not present");
            return false;
        }
    }


    public String getTitle(){
        return driver.getTitle();
    }

    public void elementClick(String locator, String type){

        try {
            WebElement element = getElement(locator,type);
            element.click();
            System.out.println("Element Clicked");
        }
        catch (Exception e){

            System.out.println("Unable to click the element");
        }


    }


    public void sendKeys(String locator, String type,String text){

        try {
            WebElement element = getElement(locator,type);
            element.sendKeys(text);
            System.out.println("Keys sent to element");
        }catch (Exception e){


        }
    }


    public String getText(String locator, String type){

        WebElement element = null;
        String text = null;
        
        try{
             element = getElement(locator,type);
             text = element.getText();
            System.out.println("Got the text of the element");
            
        }catch (Exception e){
            System.out.println("Unable to get text from the element");
        }

        return text;

        
    }


    public boolean isElementDisplayed(String locator, String type){
        WebElement element;
        boolean check = false;
        try {
            element = getElement(locator,type);
            if(element!=null){
                check = element.isDisplayed();
                System.out.println("Element displayed");
            }
        }catch (Exception e){
            System.out.println("Element not displayed");
        }

        return check;
    }






    }














