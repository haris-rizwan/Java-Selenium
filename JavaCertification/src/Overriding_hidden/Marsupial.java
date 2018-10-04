package Overriding_hidden;



// In this example the isBiped() method is hidden ,


// In hidden methods at runtime parent version of the hidden method is always executed if the call to the method is defined in parent class

public class Marsupial {


    public static boolean isBiped(){
        return false;
    }


    public void getmarsupialDescription(){
        System.out.println("Marsupial walks on two legs:   " + isBiped());
    }
}




class Kangroo extends Marsupial{


    public static boolean isBiped(){
        return true;
    }



    public void getKangrooDescriptipn(){

        System.out.println("Kangroo hops on two legs:   " +isBiped());
    }


    public static void main (String[] args){

        Kangroo joe = new Kangroo();

        joe.getmarsupialDescription();
        joe.getKangrooDescriptipn();
    }




        }
