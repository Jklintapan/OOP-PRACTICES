package Bank;

import java.util.ArrayList;

public class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₱" + amount + " to " + accountHolder + "'s account.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew ₱" + amount + " from " + accountHolder + "'s account.");
        } else {
            System.out.println("Invalid or insufficient balance for withdrawal.");
        }
    }

    // Display account info
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₱" + balance);
        System.out.println();
    }
}

// Class to manage a collection of accounts
class Bank {
    private ArrayList<Account> accounts;

    // Constructor
    public Bank() {
        accounts = new ArrayList<>();
    }

    // Add account
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added for: " + account.getAccountHolder());
    }

    // Remove account by account number
    public void removeAccount(String accountNumber) {
        boolean found = false;
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                accounts.remove(acc);
                System.out.println("Account removed: " + acc.getAccountHolder());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Account not found.");
        }
    }

    // Find account by account number
    public Account findAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    // Deposit money into an account
    public void depositToAccount(String accountNumber, double amount) {
        Account acc = findAccount(accountNumber);
        if (acc != null) {
            acc.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Withdraw money from an account
    public void withdrawFromAccount(String accountNumber, double amount) {
        Account acc = findAccount(accountNumber);
        if (acc != null) {
            acc.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Display all accounts
    public void displayAllAccounts() {
        System.out.println("\n=== Bank Accounts ===");
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            for (Account acc : accounts) {
                acc.displayInfo();
            }
        }
    }
 
    
}
