package Preparation.OOPS.Bankproject;

public class Savingsaccount extends Bankaccount implements Transferable {
    
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
    @Override
    public void withdraw(double amount){
        if(amount>getbal()){
            System.out.println("insufficient balance");
        }
        else if(amount<=0){
            System.out.println("invalid amount");
        }
        else{
            setbalance(getbal()-amount);
        }
    }
    @Override
     public void transfer(double amount,String toaccount){
        if (amount>getbal()){
            System.out.println("insufficient balance");
        }
        else{
            setbalance(getbal()-amount);
            System.out.println(amount+"has been transfered to"+toaccount);
        }
        

    }
    @Override
    public void gettransactionhistory(){
        System.out.println("transaction history of:"+getname());
        System.out.println("Current balance"+getbal());
    }


    @Override 
     void displayInfo(){
        super.displayInfo();
        System.out.println("interest rate"+interestrate);
    }
        
    }
    

