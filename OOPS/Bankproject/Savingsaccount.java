package Preparation.OOPS.Bankproject;

public class Savingsaccount extends Bankaccount {
    
    private double interestrate;
   
    Savingsaccount(String name,String accnum,double bal,double interestrate){
        super(name, accnum, bal);
        this.interestrate=interestrate;
    }
    public void addinterest(){
        double interest=getbal()*interestrate/100;
        deposit(interest);
        System.out.println("interest is deposited rs"+interest);
    }
     void displayInfo(){
        super.displayInfo();
        System.out.println("interest rate"+interestrate);
    }
        
    }
    

