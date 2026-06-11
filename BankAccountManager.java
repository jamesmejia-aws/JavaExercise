package javaex1;

import java.util.HashMap;	
import java.util.Map;

public class BankAccountManager {
	private final Map<Integer, BankAccount> accounts;
	private int id;
	
	public BankAccountManager() {
        this.accounts = new HashMap<>();
        this.id = 0;
    }
	
	
    public void addAccount(BankAccount account) {
        if (id >= 100) {
            return;
        }
        accounts.put(id, account);
        System.out.println("Account added successfully with ID: " + id);
        id++;
    }
    
 
    public BankAccount getAccount(int accountId) {
        return accounts.get(accountId);
    }
    
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

}
