package bank;

public class BankAccount {
    public String bankName = "ABC Bank";

    public BankAccount() {
        System.out.println("Bank Account Created");
    }

    public BankAccount(String bankName) {
        System.out.println(bankName);
    }

    public void displayBankName() {
        System.out.println(bankName);
    }
}
