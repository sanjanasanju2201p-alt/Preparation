package Preparation.OOPS.Bankproject;

public class Currentaccount extends Bankaccount {
    private double overdraftlimit;
Currentaccount(String name,String accnum,double bal,double odl){
    super(name, accnum, bal);
    overdraftlimit=odl;

}
@Override 
public void withdraw(double amount){
    if(amount<=0){
        System.out.println("invalid amount");
    }
    else if(amount>getbal()+overdraftlimit){
        System.out.println("the amount has exceed the overdraftlimit");
    }

    else{
            setbalance(getbal()-amount);
            System.out.println("withdrawn"+amount);
            System.out.println("balance"+getbal());
        }
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("overdraft limit"+overdraftlimit);
    }
    

}

    

