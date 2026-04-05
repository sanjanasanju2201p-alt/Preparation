package Preparation.OOPS;

public class BankAccount {
    String accountholderName;
    double balance;
    String accountNumber;
    BankAccount() {   //default constructor
        accountholderName = "Unknown";
        accountNumber = "000000";
        balance = 0.0;
    }
    BankAccount(String name,String accNum,double bal){ //  parametrized constructor
        accountholderName = name;
        accountNumber = accNum;
        balance = bal;

    }
    BankAccount(BankAccount acc){
        accountholderName = acc.accountholderName;
        accountNumber = acc.accountNumber;
        balance = acc.balance;
    }
        

    
    
    void displayInfo(){
        System.out.println(accountholderName);
        System.out.println(balance);
        System.out.println(accountNumber);
    }

    public static void main(String[] args) {
        BankAccount acc1=new BankAccount();
        acc1.displayInfo();
        BankAccount acc2=new BankAccount("sanju","123ba",5000);
        acc2.displayInfo();
        BankAccount acc3=new BankAccount(acc2);
        acc3.displayInfo();
        acc2.balance=5000;
        System.out.println(acc2.balance);
        System.out.println(acc3.balance);
    }

    
}


