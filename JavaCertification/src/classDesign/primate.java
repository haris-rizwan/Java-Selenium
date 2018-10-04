package classDesign;

public class primate {

    public primate(){
        System.out.println("primate");
    }
}



 class Ape extends primate{

    public Ape(){
        System.out.println("ape");
    }
 }



 class chimpanzee extends Ape{

  public static void main(String [] args){
      new chimpanzee();
  }
 }
