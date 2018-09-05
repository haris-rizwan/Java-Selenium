package Account;

import Transaction.transactions;

import java.security.InvalidParameterException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;


public class account {
    private String FirstName;
    private String LastName;
    private long  AccountNumber = 4425972858l;
    private long SIN_Number;
    private double balance;
    private String Dob;
    protected static int NumberOfAccounts;

    private List<String> Monthly_Statement;

    public List <String> getMonthly_Statement() {
        return Monthly_Statement;
    }

    public void setMonthly_Statement(String value) {
        Monthly_Statement.add(value);
    }

    public static int getNumberOfAccounts() {
        return NumberOfAccounts;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public long getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        AccountNumber = accountNumber;
    }

    public long getSIN_Number() {
        return SIN_Number;
    }

    public void setSIN_Number(long SIN_Number) {
        this.SIN_Number = SIN_Number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String dob) {
        Dob =  dob;
    }

    public account(String name, String LastName, String DateofBirth, long sinNumber, double firstDeposit){

        this.FirstName = name;
        this.LastName = LastName;
        this.Dob = DateofBirth;
        this.SIN_Number = sinNumber;
        this.balance = firstDeposit;
        this.Monthly_Statement= new ArrayList <>();

        AccountNumber++;
        NumberOfAccounts++;

    }



    public static void main(String[] arg){

        account client1 = new account("Haris","Rizwan","01/01/1990",9312229,5000);
        System.out.println(client1.getFullName());
        System.out.println(client1.getAge());
        account client2 = new account("umair","farooqi","01/01/1990",9312229,5000);
        System.out.println(account.getNumberOfAccounts());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println(client1.getBalance());
        client1.deposit(2000);
        System.out.println(client1.getBalance());
        client1.deposit(6000);
        client1.deposit(3987);
        client1.deposit(4536);
        client1.withdraw(220);
        client1.withdraw(1000);
        client1.withdraw(860);
        System.out.println("+++++++++++++++++++++++++++++");
        client1.getStatement();




    }


    public void deposit(double amount){
        LocalDate Date = LocalDate.now();
        DateTimeFormatter Fr = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        String DateFormated = Date.format(Fr);

        try {
            if (amount>0){
                setBalance(getBalance()+amount);
                Monthly_Statement.add(DateFormated+" "+amount+" "+"Deposited"+ " " + Double.toString(getBalance()));
                System.out.println("Your new balance is " + getBalance());

            }else {
                System.out.println("Please enter a correct amount ");
            }

        }catch (InvalidParameterException e){
            System.out.println("Please enter correct amount in numbers");

        }

    }


    public void withdraw(double amount){
        LocalDate Date = LocalDate.now();
        DateTimeFormatter Fr = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        String DateFormated = Date.format(Fr);
        try {
            if (getBalance()>0&&getBalance()>amount){
                 setBalance(getBalance()-amount);
                Monthly_Statement.add(DateFormated+" -"+amount+" "+"Withdrawn"+ " " + Double.toString(getBalance()));
                System.out.println("Your Balance is " + getBalance());
            }else {
                System.out.println("Insufficient Funds");
                System.out.println("Your Balance is " + getBalance());
            }
        }catch (InvalidParameterException e){
            System.out.println("Please enter correct amount in numbers");

        }

    }


    public String getFullName(){
        String Full_Name = getFirstName()+" "+getLastName();
        return Full_Name;
    }


    public int getAge() {
        int age = 0;
        try {
            String x = "01/01/1990";
            DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("d/MM/yyyy");
            LocalDate clientDob = LocalDate.parse(x,formatDate);
            LocalDate currentDate = LocalDate.now();
            if ((clientDob != null) && (currentDate != null)) {
                age = Period.between(clientDob, currentDate).getYears();

            } else {
                return 0;
            }

        }catch (Exception e){
            System.out.println(e);

        }

        return age;
    }


    public void getStatement(){

        Collections.reverse(Monthly_Statement);

        for (String entries : Monthly_Statement){
            System.out.println(entries);
        }

    }






}


