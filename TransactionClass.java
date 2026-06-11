package javaex1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class TransactionClass {

	public final String type;
	public final double amount;
	private final LocalDateTime time_stamp;
	
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

}
