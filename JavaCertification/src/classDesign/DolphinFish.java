package classDesign;

public class DolphinFish extends Fish {

    private boolean isMamal = true;

    public DolphinFish(int age){
        super(age);
        this.size=2;

    }


    public void dolphinDetails(){


        System.out.println("Age of Dolphin " + this.getAge());
        System.out.println("Size of Dolphin " + this.size);
        System.out.println("Mamal = " + this.isMamal);
    }




}
