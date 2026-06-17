package javaex1;

import exception.AccountFrozenException;
import exception.InsufficientFundsException;
import exception.InvalidAmountException;
import java.util.List;

/**
 * Main class to test the BankAccount and BankAccountManager classes.
 */
public class Main {
  /** * Main method to run test cases for BankAccount and BankAccountManager.
 * * @param args command-line arguments (not used)
 */
  public static void main(String[] args) {

    // FOR EXERCISE 1 Test Cases
    // Test Case 1
    BankAccount acc1 = new SavingsAccount("Test0");
    System.out.println();

    // Test Case 2
    try {
      acc1.deposit(1000.125);
    } catch (InvalidAmountException | AccountFrozenException e) {
      System.out.println(e.getMessage());
    }
    System.out.println();

    // Test Case 3
    try {
      acc1.deposit(0);
    } catch (InvalidAmountException | AccountFrozenException e) {
      System.out.println(e.getMessage());
    }
    System.out.println();

    // Test Case 4
    try {
      acc1.deposit(-500);
    } catch (InvalidAmountException | AccountFrozenException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        // Test Case 5
        try {
            acc1.withdraw(500);
        } catch (InvalidAmountException | AccountFrozenException
                | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        // Test Case 6
        try {
            acc1.withdraw(1500);
        } catch (InvalidAmountException | AccountFrozenException
                | InsufficientFundsException e) {
            System.out.println(e.getMessage());
            System.out.printf("Current balance: %.2f%n", acc1.getBalance());
        }
        System.out.println();

        // Test Case 7
        try {
            acc1.withdraw(-100);
        } catch (InvalidAmountException | AccountFrozenException
                | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        // Test Case 8
        acc1.freezeAccount();
        try {
            acc1.deposit(11500);
        } catch (InvalidAmountException | AccountFrozenException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        // Test Case 9
        try {
            acc1.withdraw(500);
        } catch (InvalidAmountException | AccountFrozenException
                | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        // Test Case 10
        acc1.unfreezeAccount();
        try {
            acc1.withdraw(100);
        } catch (InvalidAmountException | AccountFrozenException
                | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        // FOR EXERCISE 2 Test Cases
        // Test Case 1
        System.out.println("Transaction History: " + acc1.getTransactionHistory());
        System.out.println();

        // Test Case 2
        Bank bank = new BankAccountManager();

        // Test Case 3
        bank.addAccount(acc1);
        System.out.println();

        // Test Case 4
        bank.addAccount(new SavingsAccount("Test1"));
        System.out.println();

        // Test Case 5
        ((BankAccountManager) bank).listAccounts();
        System.out.println();

        // FOR EXERCISE 3 Test Cases
        BankAccountManager accM1 = (BankAccountManager) bank;

        // Test Case 1
        try {
            acc1.deposit(-500);
        } catch (InvalidAmountException | AccountFrozenException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        // Test Case 2
        acc1.freezeAccount();
        try {
            acc1.deposit(11500);
        } catch (InvalidAmountException | AccountFrozenException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        acc1.unfreezeAccount();

        // Test Case 3
        try {
            acc1.withdraw(-100);
        } catch (InvalidAmountException | AccountFrozenException
                | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        // Test Case 4
        try {
            acc1.withdraw(1500);
        } catch (InvalidAmountException | AccountFrozenException
                | InsufficientFundsException e) {
            System.out.println(e.getMessage());
            System.out.printf("Current balance: %.2f%n", acc1.getBalance());
        }
        System.out.println();

        // Test Case 5
        acc1.freezeAccount();
        try {
            acc1.withdraw(500);
        } catch (InvalidAmountException | AccountFrozenException
                | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        acc1.unfreezeAccount();

        // Test Case 6
        List<TransactionClass> filtered =
                accM1.filterTransactionsAtOrAbove(
                        200, acc1.getTransactionHistory());
        System.out.println(filtered);
        System.out.println();

        // Test Case 7
        List<TransactionClass> sorted =
                accM1.sortTransactionsByAmount(acc1.getTransactionHistory());
        System.out.println(sorted);
    }
}