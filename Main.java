package javaex1;


public class Main {

   
    public static void main(String[] args) {
    	
    	//FOR EXERCISE 1 Test Cases
    	//Test Case 1
        BankAccount acc1 = new SavingsAccount("Test0");
        System.out.println();
   
        //Test Case 2
        acc1.deposit(1000.125);
        System.out.println();

        //Test Case 3
        acc1.deposit(0);
        System.out.println();

        //Test Case 4
        acc1.deposit(-500);
        System.out.println();

        //Test Case 5
        acc1.withdraw(500);
        System.out.println();

        //Test Case 6:
        acc1.withdraw(1500);
        System.out.println();

        //Test Case 7
        acc1.withdraw(-100);
        System.out.println();

        //Test Case 8
        acc1.freezeAccount();
        acc1.deposit(11500);
        System.out.println();

        //Test Case 9
        acc1.withdraw(500);
        System.out.println();

        //Test Case 10
        acc1.unfreezeAccount();
        acc1.withdraw(100);
        System.out.println();
        
        
        
        //FOR EXERCISE 2 Test Cases
        //Test Case 1
        System.out.println("Transaction History:" + acc1.getTransactionHistory());
        System.out.println();
        
        
        //Test Case 2
        BankAccountManager accM1 = new BankAccountManager();
        
        
        //Test Case 3
        accM1.addAccount(acc1);
        System.out.println();
        
        //Test Case 4
        accM1.addAccount(new SavingsAccount("Test1"));
        System.out.println();
        
        //Test Case 5
        accM1.listAccounts();
        System.out.println();
        
    }
}