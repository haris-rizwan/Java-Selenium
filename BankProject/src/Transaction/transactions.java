package Transaction;

import java.security.InvalidParameterException;

public class transactions {

    public double withdraw(double amount,double CurrentBalance){
        double remaining_amount = 0.0;
        try {
            if (CurrentBalance>0&&CurrentBalance>amount){
                remaining_amount = CurrentBalance - amount;
                System.out.println("Your Balance is " + remaining_amount);
            }else {
                System.out.println("Insufficient Funds");
                System.out.println("Your Balance is " + CurrentBalance);
            }
        }catch (InvalidParameterException e){
            System.out.println("Please enter correct amount in numbers");

        }

        return remaining_amount;
    }


    public double deposit(double amount,double CurrentBalance){
        double updatedBalance = 0.0;
        try {
            if (amount>0){
                updatedBalance = CurrentBalance+amount;
                System.out.println("Your new balance is " + updatedBalance);

            }else {
                System.out.println("Please enter a correct amount ");
                updatedBalance = CurrentBalance;
            }

        }catch (InvalidParameterException e){
            System.out.println("Please enter correct amount in numbers");

        }
        return updatedBalance;
    }


    public static void main(String [] args){

        transactions A = new transactions();
//         double x =A.withdraw(500,0);
        double y = A.deposit(0,700);
        System.out.println(y);

    }
}



