import java.text.NumberFormat;
import java.util.Locale;

public class BankAccount {
	
	// defining account variables
	
	private String name;
	private int accNum;
	private double balance;
	
	// account constructor
	
	public BankAccount (String initName, int initId, double initBalance) {
		name = initName;
		accNum = initId;
		balance = initBalance;
	}

	// deposit method
	
	 public void deposit(double amount){
	  balance+=amount;
	 }
	 
	 // withdraw method
	 
	 public void withdraw(double amount) {
		 balance-=amount;
	 }
	
	 // get balance method
	 
	public double getBalance(){
		  return balance;
		} 
	
	// display account as a string

	public String toString() {
		String confirmed = "";
		NumberFormat fmt = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		confirmed = "\nName: " + name + "\nAccount Number: " + accNum + "\nBalance: " + fmt.format(balance);
		return confirmed;
		
	}
		
}
