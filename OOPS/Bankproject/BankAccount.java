package Preparation.OOPS.Bankproject;

public abstract class Bankaccount {

    private String accountholdername;
    private String accountnum;
    private double balance;
    
    Bankaccount(String name, String accnum, double bal){
      accountholdername=name;
      accountnum=accnum;
      balance=bal;  
    }
    public String getname(){
        return accountholdername;
    }
    public String getaccnum(){
        return accountnum;
    }
    public double getbal(){
        return balance;
    }
    public void setbalance(double amount){
        balance=amount;
    }
    public void setname(String name){
        if(name!=null && !name.isEmpty()){
            accountholdername=name;
            
        }
        else{
            System.out.println("invalid name");
        }
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            
        }
        else{
            System.out.println("invalid amount");
        }
    }
    public void deposit(double amount,String Description){
        if(amount>0){
            balance+=amount;
            System.out.println("amount"+" "+amount+" "+"deposited" +"Reason"+" "+Description);
        }
        else{
            System.out.println("invalid amount");
        }
    }
    public void deposit(double amount,String currency,double conversionrate){
        if(amount>0){
            double converted_amount=amount*conversionrate;
            balance+=converted_amount;
            System.out.println("amount"+" "+amount+" "+"deposited" +" "+currency+" "+"in Rs"+converted_amount);
        }
        else{
            System.out.println("invalid amount");
        }
    }
    
    public abstract void withdraw(double amount);
    void displayInfo(){
        System.out.println("NAME:"+accountholdername);
        System.out.println("ACCOUNT NUMBER:"+accountnum);
        System.out.println("BALANCE:"+balance);

    }
}
