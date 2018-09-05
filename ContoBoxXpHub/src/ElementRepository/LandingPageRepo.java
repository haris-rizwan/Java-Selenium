package ElementRepository;


public enum LandingPageRepo{


        LOGINBTN("//div[@id='main-wrapper']/div/div/div[1]/div//button[.='Log in']","XPATH"),
        REQUESTBTN("//div[@id='main-wrapper']/div/div/div[1]/div//button[.='Request demo']","XPATH");

    private final String locator;
    private final String type;

     private LandingPageRepo(String Locator, String Type){
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




