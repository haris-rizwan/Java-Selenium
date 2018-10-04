package Overriding_hidden;


// In this example the isBiped() method is overridden
// AT runtime the child version of the overridden method is always executed for an instance regardless of whether the method call is defined in parent or child


public class Marsupial_overrideExample {


    public boolean isBiped(){
        return false;
    }


    public void getmarsupialDescription(){
        System.out.println("Marsupial walks on two legs:   " + isBiped());
    }


    public static void main(String[] args){
        Marsupial_overrideExample man = new Marsupial_overrideExample();
        man.getmarsupialDescription();
    }
}



class Kangroo1 extends Marsupial_overrideExample{


    public  boolean isBiped(){
        return true;
    }



    public void getKangrooDescriptipn(){

        System.out.println("Kangroo hops on two legs:   " +isBiped());
    }


    public static void main (String[] args){

        Kangroo1 joe = new Kangroo1();

        joe.getmarsupialDescription();
        joe.getKangrooDescriptipn();
    }




}