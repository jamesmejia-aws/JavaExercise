package javaex1;

import exception.AccountFrozenException;
import exception.InsufficientFundsException;
import exception.InvalidAmountException;
import java.util.ArrayList;
import java.util.List;


/**
 * Represents a simple bank account that supports deposits, withdrawals
 * and maintains a history of transactions. 
 */
public class BankAccount {
  private double balance;
  private boolean isFrozen;
  private final List<TransactionClass> transactionHistory;

  /**
     * Initializes a new BankAccount with a zero balance, 
     * not frozen, and an empty transaction history.
     */
  public BankAccount() {
    this.balance = 0.0;
    this.isFrozen = false;
    this.transactionHistory = new ArrayList<>();
  }

  /**
  * Deposits a specified amount into the account.
  */
  public void deposit(double amount)
            throws InvalidAmountException, AccountFrozenException {

    if (isFrozen) {
      throw new AccountFrozenException("Account is FROZEN. Unable to transact.");
    }

    System.out.printf("Amount deposited: %.2f%n", amount);

    if (amount <= 0) {
      throw new InvalidAmountException("Invalid amount. Must be greater than 0");
    }

    balance += amount;
    transactionHistory.add(new TransactionClass("Deposit", amount));
    System.out.printf("Current balance: %.2f%n", balance);
  }
  /**
   * * Withdraws a specified amount from the account.
   * * 
   * * @throws InvalidAmountException     if the amount is not valid
   * * @throws AccountFrozenException     if the account is frozen
   * *  @throws InsufficientFundsException if there are insufficient funds
   *  */
  
  public void withdraw(double amount)
            throws InvalidAmountException, AccountFrozenException,
                   InsufficientFundsException {

    if (isFrozen) {
      throw new AccountFrozenException("Account is FROZEN. Unable to transact.");
    }

    System.out.printf("Amount withdrawn: %.2f%n", amount);

    if (amount <= 0) {
      throw new InvalidAmountException("Invalid amount. Must be greater than 0");
    }

    if (amount > balance) {
      throw new InsufficientFundsException("Insufficient balance.");
    }

    balance -= amount;
    transactionHistory.add(new TransactionClass("Withdraw", amount));
    System.out.printf("Current balance: %.2f%n", balance);
  }

   
  public double getBalance() {
    return balance;
  }

  /**
* Freezes the account, preventing any transactions until unfrozen.
 */
  public void freezeAccount() {
    isFrozen = true;
  }

  /**
   * Unfreezes the account, allowing transactions again.
   */
  public void unfreezeAccount() {
    isFrozen = false;
  }

    
  public boolean isFrozen() {
    return isFrozen;
  }
    

    
  @SuppressWarnings("unused")
private double roundTwo(double value) {
    return Math.round(value * 100.0) / 100.0;
  }
    
  public List<TransactionClass> getTransactionHistory() {
    return transactionHistory;
  }
}