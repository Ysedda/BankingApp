import java.util.*;


public class BankingApp {

	public static void main(String[] args) {
		
		String name;
		int accNum;
		double balance;
		double amount;
		final int max = 999999999;
		
		@SuppressWarnings("resource")
		Scanner createaccount = new Scanner(System.in);
		Random rand = new Random();
		
		accNum = rand.nextInt(max);
		
		System.out.println("Please enter your full name: ");
		name = createaccount.nextLine();
	
		System.out.println("Please enter initial balance: ");
		balance = createaccount.nextDouble();
		
		BankAccount acc1 = new BankAccount(name, accNum, balance);
		System.out.println(acc1.toString());
		System.out.println("\n");
		
			@SuppressWarnings("resource")
			Scanner operation = new Scanner(System.in);
			System.out.println("Welcome to your bank service, " + name + "!");
			System.out.println("-------------------------------------------");
			System.out.println("What operation do you wish to execute? ");
			System.out.println("-------------------------------------------");
			System.out.println("1 - Deposit");
			System.out.println("2 - Withdraw");
			System.out.println("3 - Check your balance");
			System.out.println("4 - Exit");
			int choice;
			
			do {
				System.out.println("*******************************************");
				System.out.println("Please select an option: ");
				choice = operation.nextInt();
				Scanner whatAmount = new Scanner(System.in);
				switch(choice) {
				
				
				case 1: 
					System.out.println("-------------------------------------------");
					System.out.println("What amount would you like to deposit?");
					amount= whatAmount.nextDouble();
					acc1.deposit(amount);
					System.out.println(amount + "€ have been added to your account");
					System.out.println("-------------------------------------------");
					System.out.println(acc1.toString());
					break;

				case 2: 
					System.out.println("-------------------------------------------");
					System.out.println("What amount would you like to withdraw?");
					amount= whatAmount.nextDouble();
					acc1.withdraw(amount);
					System.out.println((amount + "€ have been removed from your account"));
					System.out.println("-------------------------------------------");
					System.out.println(acc1.toString());
					break;
					
				case 3:
					System.out.println("-------------------------------------------");
					System.out.println(acc1.toString());
					break;
				case 4:
					System.out.println("Thank you for using our services!");
					return;
				default:
					System.out.println("This is not a correct option, please try again!");
					break;
				
				}}		while(choice > 0 && choice < 5);
		
	}
}		
		
				
	
	

