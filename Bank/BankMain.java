package Bank;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create accounts
        Account acc1 = new Account("1001", "Alice", 5000);
        Account acc2 = new Account("1002", "Bob", 3000);

        // Add accounts to the bank
        bank.addAccount(acc1);
        bank.addAccount(acc2);

        // Display all accounts
        bank.displayAllAccounts();

        // Deposit and withdraw
        bank.depositToAccount("1001", 2000);
        bank.withdrawFromAccount("1002", 1000);

        // Remove one account
        bank.removeAccount("1002");

        // Display updated list
        bank.displayAllAccounts();
    }
}

