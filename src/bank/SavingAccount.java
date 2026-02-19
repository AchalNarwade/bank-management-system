package bank;

public class SavingAccount extends Account{
    private static final double MIN_BALANCE = 1000;

    public SavingAccount(int accountNumber, Customer customer) {
        super(accountNumber, customer);
    }

    @Override
    public void withdraw(double amount) {   // must exactly match signature
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            transactions.add(new Transaction("Withdrawal", amount, "19-Feb-2026"));
            System.out.println(amount + " withdrawn. Current balance: " + balance);
        } else {
            System.out.println("Cannot withdraw. Minimum balance " + MIN_BALANCE + " must be maintained.");
        }
    }
}
