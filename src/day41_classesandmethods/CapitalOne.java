package day41_classesandmethods;

public class CapitalOne {

	public static void main(String[] args) {

		BankAccount acc1 = new BankAccount();
		acc1.accountHolder = "Bob";
		acc1.accountNumber = "12345";
		acc1.deposit(5000000.00);
		
		acc1.showBalance();
		
		acc1.charge(400.00, "Socks");
		
		acc1.showBalance();
		
		acc1.charge(40000000.00, "Island");
		
	}

}
