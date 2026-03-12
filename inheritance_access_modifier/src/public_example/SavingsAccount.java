package bank;

public class SavingsAccount extends BankAccount {
    public SavingsAccount() {
        this(1);
        System.out.println("Savings Account Created");
    }

    public SavingsAccount(int balance) {
        this(1, 1);
        System.out.println("Balance : " + balance);
    }

    public SavingsAccount(int balance, int annualInterestRate) {
        super();
        System.out.println("Balance : " + balance + " Annual Interest Rate: " + annualInterestRate);
    }
}
