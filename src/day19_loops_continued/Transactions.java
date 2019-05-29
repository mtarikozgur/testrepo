package day19_loops_continued;


import java.util.*;


public class Transactions {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter balance amount:");
		
		double balance = s.nextDouble();
		double transaction;
		int n = 0;
		
		
		
		while(balance >= 0) {
			
			
			System.out.println("Enter transaction amount:");
			transaction = s.nextDouble();
			balance = balance + transaction;
			
			if(balance == 0) {
				System.out.println("Warning: account will be empty");	
				n++;
				System.out.println("Successful transactions: " + n);
			} else if(balance < 0){
				System.out.println("Warning: account will be empty");
			} else {
				n++;
				System.out.println("Successful transactions: " + n);
			}
			
			
			
			System.out.println("Balance amount: " + balance);
			
		}
		
		System.out.println("Insufficient funds");
		System.out.println("Successful transactions: " + n);
		
		
	}

}
