package Preparation.OOPS.Bankproject;

import Preparation.OOPS.BankAccount;

public class Main {
    public static void main(String[] args) {
    /*Bankaccount acc1=new Bankaccount("sanju", "12bbs", 100000);
    acc1.deposit(2000);
    acc1.displayInfo();
    acc1.withdraw(2000);
    acc1.displayInfo();
    acc1.withdraw(10002000);
    acc1.deposit(-100);
    acc1.setname(null);
    acc1.setname("sanjana");
    acc1.displayInfo();
    Bankaccount acc2=new Bankaccount("Shivakumar", "988889988", 1500);
    acc2.displayInfo();
    acc2.deposit(50000);
    acc2.displayInfo();
    acc2.withdraw(-1);
    acc2.displayInfo();
    Savingsaccount acc =new Savingsaccount("mallu", "2894398985", 80000, 7);
    acc.addinterest();
    acc.displayInfo();
    Currentaccount acc4=new Currentaccount("san", "28919374287", 20000, 50000);
    acc4.displayInfo();
    acc4.withdraw(70001);
    acc4.deposit(5,"dollar",90);
    acc4.deposit(50);
    acc4.deposit(100000,"salary");
    acc4.displayInfo();
    Bankaccount acc1=new Currentaccount("sanju", "12bbs", 100000.0,200000.0);
    acc1.withdraw(500000);*/
    Bankaccount acc []=new Bankaccount[3];
    acc[0]=new Bankaccount("sanjana","hnchd",3000);
    acc[1]=new Savingsaccount("sanju","dnj c",5000,2);
    acc[2]=new Currentaccount("sanju", "gsggbc", 3000, 50000);
    for (Bankaccount i : acc) {
    i.withdraw(1000.0); 
}


        
        


}
}
