package testAcessModifier;



public class sample1 {

    private String name = "torchie";
    {
        System.out.println(name);
    }

    private static int count = 0;

    static {
        System.out.println(count);
    }
    static {
        count+=10;
        System.out.println(count);
    }

    public sample1(){
        System.out.println("constructor");
    }



    public static void main(String [] args){

        sample1 newobj = new sample1();

//        System.out.println(sample1.count);

        sample2 obje2 = new sample2();

    }
}
