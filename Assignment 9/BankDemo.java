class BankAccount {
    final int accountNumber;
    String accountHolder;
    double balance;

    // Constructor
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(279, "Anusha", 5000.00);

        account.displayAccount();

        // Account number cannot be changed because it is final
        // account.accountNumber = 202;  // Compile-time error
    }
}
