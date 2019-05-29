package day46_statickeyword;

public class Ebay {

	
	
	public static void main(String[] args) {

		Customer c1 = new Customer("Bob", "bob@gmail.com");
		Customer c2 = new Customer("Jack", "jack@gmail.com");
		Customer c3 = new Customer("Jill", "jill@gmail.com");
		
		System.out.println(c3.count); // Prints 3 because every time a Customer object is created the static variable "count" is increased by 1
		System.out.println(Customer.count); // You can call "count" without an object since it is static
		
		
		
	}

}
