package day41_classesandmethods;

public class BankAccount {

	double balance;
	String accountHolder;
	String accountNumber;
	
	public void deposit(double amount) {
		
		System.out.println("Depositing " + amount + " to " + accountNumber);
		balance += amount;
		
	}
	
	public void withdraw(double amount) {
		
		System.out.println("Withdrawing " + amount + " from " + accountNumber);
		balance -= amount;
		
	}
	
	public void showBalance() {
		
		System.out.println("Holder: " + accountHolder);
		System.out.println("Number: " + accountNumber);
		System.out.println("Balance: " + balance);
		
	}
	
	public void charge(double price, String item) {
		
		if(balance >= price) {
			
			System.out.println("Buying " + item);
			balance -= price;
			
		} else {
			
			System.out.println("You can't buy that!");
			
		}
		
	}

}
