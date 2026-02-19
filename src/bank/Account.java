package bank;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {

    protected int accountNumber;
    protected double balance;
    protected Customer customer;
    protected List<Transaction> transactions;

    public Account(int accountNumber,Customer customer){
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = 0;
        this.transactions = new ArrayList<>();

    }
    public void deposit(double amount){
        balance += amount;
        //create transaction
        Transaction t = new Transaction("Deposit",amount,"19-feb-2026");
        transactions.add(t);
        System.out.println(amount + " deposited . Current balance: " + balance);
    }
    public void checkBalance(){
        System.out.println("Current balance: " + balance);
    }
    public void printTransaction(){
        System.out.println("Transactions for account: " + accountNumber);
        for(Transaction t: transactions){
            System.out.println(t);
        }
    }
    public abstract void withdraw(double amount);


}
