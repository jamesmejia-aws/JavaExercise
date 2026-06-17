package javaex1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 * Class to represent a transaction in a bank account.
 */
public class TransactionClass {

  public final String type;
  public final double amount;
  private final LocalDateTime time_stamp;

  /**
* Constructs a TransactionClass with the specified type and amount.
*
* @param type   the type of transaction (e.g., "Deposit", "Withdrawal")
* @param amount the amount involved in the transaction
*/
  public TransactionClass(String type, double amount) {
    this.type = type;
    this.amount = amount;
    this.time_stamp = LocalDateTime.now();
  }
	
  @Override
   public String toString() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    return "Transaction[type=" + type
    		+ ", amount=" + amount
    		+ ", time_stamp=" + time_stamp.format(formatter) + "]";
  }

  public double getAmount() {
    return amount;
  }
}
