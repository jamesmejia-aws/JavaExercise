package javaex1;


public class BankAccount {
    private double balance;
    private boolean isFrozen;

    
    public BankAccount() {
        this.balance = 0.0;
        this.isFrozen = false;
    }

    
    public void deposit(double amount) {
        if (isFrozen) {
            System.out.println("Account is FROZEN.");
            System.out.println("Unable to transact.");
            return;
        }

        System.out.println("Amount deposited: " + roundTwo(amount));

        if (amount <= 0) {
            System.out.println("Invalid amount. Must be greater than 0");
            return;
        }

        balance += amount;
        System.out.printf("Current balance: %.2f%n", balance);
    }

    
    public void withdraw(double amount) {
        if (isFrozen) {
            System.out.println("Account is FROZEN.");
            System.out.println("Unable to transact.");
            return;
        }

        System.out.println("Amount withdrawn: " + roundTwo(amount));

        if (amount <= 0) {
            System.out.println("Invalid amount. Must be greater than 0");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient funds.");
            System.out.printf("Current balance: %.2f%n", balance);
            return;
        }

        balance -= amount;
        System.out.printf("Current balance: %.2f%n", balance);
    }

   
    public double getBalance() {
        return balance;
    }

    public void freezeAccount() {
        isFrozen = true;
    }

    
    public void unfreezeAccount() {
        isFrozen = false;
    }

    
    public boolean isFrozen() {
        return isFrozen;
    }

    
    private double roundTwo(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}