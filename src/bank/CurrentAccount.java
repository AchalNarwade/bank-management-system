package bank;

public class CurrentAccount extends Account{
    private static final double OVERDRAFT_LIMIT = 500;

    public CurrentAccount(int accountNumber , Customer customer){
        super(accountNumber, customer);
    }
    @Override
    public void withdraw(double amount) {
        if(balance - amount>= -OVERDRAFT_LIMIT){
            balance -= amount;
            transactions.add(new Transaction("Withdrawal", amount, "19-Feb-2026"));
            System.out.println(amount + " withdrawn. Current balance: " + balance);
        } else {
            System.out.println("Cannot withdraw. Minimum balance " + OVERDRAFT_LIMIT + " must be maintained.");
        }
    }
}
