package classDesign;

public class Fish {

    private int age;
    protected int size;


    public Fish(int age){
        this.age =age;
    }

    public int getAge(){
        return age;
    }
}



class shark extends Fish{

    private int numberOfFins = 8 ;

    public shark(int age){
        super(age);
        this.size = 4;
    }


    public void sharkDetails(String [] args){

        System.out.println("age of shark is "+ getAge());
        System.out.println("size of shark " + this.size);
        System.out.println("Number of fins  "+ this.numberOfFins);
    }


    // second method to access the members from parent class

    public void sharkDetails2(String [] args){

        System.out.println("age of shark is "+ this.getAge());
        System.out.println("size of shark " + super.size);
        System.out.println("Number of fins  "+ this.numberOfFins);
    }





}
