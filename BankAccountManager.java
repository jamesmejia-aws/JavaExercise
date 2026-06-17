package javaex1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Concrete class that implements Bank.
 */
public class BankAccountManager implements Bank {
	private final Map<Integer, BankAccount> accounts;
	private int id;
	
	
	/**
     * Creates a bank account manager.
     */
	public BankAccountManager() {
        accounts = new HashMap<>();
        id = 0;
    }
	
	/**
     * Adds an account to the map.
     *
     * @param account the account to add
     */
    @Override
    public void addAccount(BankAccount account) {
        if (id >= 100) {
            return;
        }
        accounts.put(id, account);
        System.out.println("Account added successfully with ID: " + id);
        id++;
    }
    
    /**
     * Gets an account by ID.
     *
     * @param id the account id
     * @return the bank account
     */
    @Override
    public BankAccount getAccount(int accountId) {
        return accounts.get(accountId);
    }
    
    /**
     * Displays all accounts.
     */
    public void listAccounts() {
        for (Map.Entry<Integer, BankAccount> entry : accounts.entrySet()) {
            int accountId = entry.getKey();
            BankAccount account = entry.getValue();

            String accountName = "Unknown";
            if (account instanceof SavingsAccount) {
                accountName = ((SavingsAccount) account).getOwnerName();
            }

            System.out.printf("Account ID: %d, Account Name: %s, Balance: %.2f%n",
                    accountId, accountName, account.getBalance());
        }
    }
    
    /**
     * Filters transactions at or above the given amount using lambda.
     *
     * @param amount the minimum amount
     * @param txList the transaction list
     * @return filtered transactions
     */
    public List<TransactionClass> filterTransactionsAtOrAbove(
            double amount, List<TransactionClass> txList) {

        System.out.println("Filtering transactions at or above " + amount + "...");
        return txList.stream()
                .filter(tx -> tx.getAmount() >= amount)
                .collect(Collectors.toList());
    }

    /**
     * Sorts transactions by amount in ascending order using lambda.
     *
     * @param txList the transaction list
     * @return sorted transactions
     */
    public List<TransactionClass> sortTransactionsByAmount(
            List<TransactionClass> txList) {

        System.out.println("Sorting transactions by amount...");
        return txList.stream()
                .sorted(Comparator.comparingDouble(TransactionClass::getAmount))
                .collect(Collectors.toList());
    }

}
