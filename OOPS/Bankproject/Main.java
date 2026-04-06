package Preparation.OOPS.Bankproject;

public class Main {
    public static void main(String[] args) {
    Bankaccount acc1=new Bankaccount("sanju", "12bbs", 100000);
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

}
}
