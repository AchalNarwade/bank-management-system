package app;

import bank.CurrentAccount;
import bank.Customer;
import bank.SavingAccount;

public class Main {
    public static void main(String[] args) {

        //create customers
        Customer c1 = new Customer("john Doe","9876543210","Delhi");
        Customer c2 = new Customer("Alice Smith","9123456780","Mumbai");

        //Create Accounts
        SavingAccount s1 = new SavingAccount(101,c1);
        CurrentAccount ca1 = new CurrentAccount(201,c2);

        //Operations on saving account
        System.out.println("SAVING ACCOUNT OPERATIONS:");
        s1.deposit(5000);
        s1.withdraw(2000);
        s1.withdraw(3000);
        s1.checkBalance();
        s1.printTransaction();

        System.out.println();

        //operations on CurrentAccount
        System.out.println("CURRENT ACCOUNT OPERATIONS:");
        ca1.deposit(4000);
        ca1.withdraw(3500);
        ca1.withdraw(2000);
        ca1.checkBalance();
        ca1.printTransaction();
    }
}