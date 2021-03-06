package ElementRepository;

public enum RequestDemoPageRepo {

    CONTOBOX_LOGO("//div[@id='__next']/div//nav[@class='jsx-1889384911 navbar']//a[@href='/']","XPATH"),
    SIGN_IN_BTN("//div[@id='__next']/div//nav[@class='jsx-1889384911 navbar']/div[@class='jsx-1889384911 navbar-menu']//button[.='Sign in']","XPATH"),
    REQUEST_DEMO_HEADING("//div[@id='__next']/div/div/div[3]/div//h1[@class='jsx-2583690275 title']","XPATH"),
    NAME_FIELD("name","NAME"),
    NAME_Label("[for='name']","cssselector"),
    COMPANY_FIELD("company","NAME"),
    COMPANY_LABLE("[for='company']","cssselector"),
    EMAIL_FIELD("email","NAME"),
    EMAIL_LABLE("[for='email']","cssselector"),
    HEAR_ABOUT_FIELD("source","NAME"),
    HEAR_ABOUT_LABLE("[for='source']","cssselector"),
    MESSAGE_FIELD("message","NAME"),
    MESSAGE_LABLE("[for='message']","cssselector"),
    SEND_REQUEST_BTN("//div[@id='__next']/div/div/div[3]/div//button[.='Send Request']","xpath");







    private final String locator;
    private final String type;

    private RequestDemoPageRepo(String Locator, String Type){
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
