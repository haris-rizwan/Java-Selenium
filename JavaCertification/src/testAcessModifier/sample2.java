package testAcessModifier;

public class sample2 {

    private static String result = "static variable";

//    static {
//        System.out.println(result);
//    }

    {
        System.out.println("instance block");
    }
    static {
        System.out.println("static block");
    }


    public static void main(String [] args){

        System.out.println(result);


    }


}
