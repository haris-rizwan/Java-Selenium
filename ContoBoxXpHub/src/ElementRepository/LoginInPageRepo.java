package ElementRepository;

public enum LoginInPageRepo {

    CONTOBOX_HEADING("//div[@id='__next']/div//form/div[.='Contobox Login']","XPATH"),
    EMIAL_FIELD("email","NAME"),
    PASSWORD_FIELD("password","NAME"),
    REMEMBER_ME("remember","NAME"),
    SIGN_IN_BTN("//div[@id='__next']/div//form/button[.='Sign in']","XPATH"),
    FORGOT_PASSWORD("//div[@id='__next']/div//form//span[@role='button']","XPATH"),
    CONTOBOX_LOGO("//div[@id='__next']/div//nav[@class='jsx-1889384911 navbar']//a[@href='/']","XPATH"),
    Request_Demo("//div[@id='__next']/div//nav[@class='jsx-1889384911 navbar']/div[@class='jsx-1889384911 navbar-menu']//button[.='Request Demo']","Xpath");

    private final String locator;
    private final String type;

    private LoginInPageRepo(String Locator, String Type){
        this.locator = Locator;
        this.type = Type;
    }


    public String getLocator() {
        return locator;
    }

    public String getType() {
        return type;
    }



}
