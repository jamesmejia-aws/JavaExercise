package javaex1;

/**
 * Concrete class that represents a savings account.
 */
public class SavingsAccount extends BankAccount {
	private final String ownerName;

	public SavingsAccount(String ownerName) {
		super();
		this.ownerName = ownerName;
		System.out.println("Account Owner: " + ownerName);
	}

	public String getOwnerName() {
		return ownerName;
	}
}