package javaex1;

/**
 * Main class that demonstrates the bank account test cases.
 */
public class Main {

    /**
     * Runs the test cases with separated output.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("Test0");

        System.out.println("=== Test Case 1: Create a savings account ===");
        System.out.println();

        System.out.println("=== Test Case 2: Deposit with valid amount ===");
        acc1.deposit(1000.125);
        System.out.println();

        System.out.println("=== Test Case 3: Deposit with zero amount ===");
        acc1.deposit(0);
        System.out.println();

        System.out.println("=== Test Case 4: Deposit with negative amount ===");
        acc1.deposit(-500);
        System.out.println();

        System.out.println("=== Test Case 5: Withdraw with sufficient funds ===");
        acc1.withdraw(500);
        System.out.println();

        System.out.println("=== Test Case 6: Withdraw with insufficient funds ===");
        acc1.withdraw(1500);
        System.out.println();

        System.out.println("=== Test Case 7: Withdraw with negative amount ===");
        acc1.withdraw(-100);
        System.out.println();

        System.out.println("=== Test Case 8: Deposit when account is frozen ===");
        acc1.freezeAccount();
        acc1.deposit(11500);
        System.out.println();

        System.out.println("=== Test Case 9: Withdraw when account is frozen ===");
        acc1.withdraw(500);
        System.out.println();

        System.out.println("=== Test Case 10: Unfreeze account and withdraw ===");
        acc1.unfreezeAccount();
        acc1.withdraw(100);
    }
}