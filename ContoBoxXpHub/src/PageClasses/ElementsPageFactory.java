package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPageFactory {

    WebDriver driver;


    @FindBy(linkText = "Dashboard")
    WebElement Dashboardlink;

    @FindBy(linkText = "Campaigns")
    WebElement Campaignslink;

    @FindBy(linkText = "Brands")
    WebElement Brandslink;

    @FindBy(linkText = "Marketplace")
    WebElement Marketplacelink;

    @FindBy(linkText = "Reports")
    WebElement Reportslink;

    @FindBy(xpath = "//button[@class='jsx-1746199279 button  secondary']")
    WebElement createCampaignBtn;

    @FindBy(xpath = "//img[@src='/images/notification-icon.svg']")
    WebElement notificationBtn;

    @FindBy(xpath = "//div[@tabindex='0']")
    WebElement profileBTn;


    public ElementsPageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public void clickDashboardLink(){
        Dashboardlink.click();
    }

    public void clickCampaignslink(){
        Campaignslink.click();
    }

    public void clickReportslink(){
        Reportslink.click();
    }

    public void clickCreateCampaignBtn(){
        createCampaignBtn.click();
    }

    public void clickNotificationBtn(){
        notificationBtn.click();
    }

    public void ProfileBTn(){
        profileBTn.click();
    }


}
