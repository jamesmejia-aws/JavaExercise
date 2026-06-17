package javaex1;

/**
 * Interface for bank account management.
 */
public interface Bank {
  /**
* Adds a bank account to the manager.
*
* @param account the bank account to add
*/
  void addAccount(BankAccount account);
  /**
 * Gets a bank account by its ID.
 */
  
  BankAccount getAccount(int id);
}