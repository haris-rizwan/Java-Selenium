package pageClasses;

import ElementRepository.LandingPageRepo;

public class testEnum {

    public static void main(String [] args){

        LandingPageRepo hello = LandingPageRepo.LOGINBTN;
        System.out.println(hello.getLocator());
        System.out.println(hello.getType());
    }
}
