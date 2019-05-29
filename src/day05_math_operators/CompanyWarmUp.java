package day05_math_operators;

public class CompanyWarmUp {

	public static void main(String[] args) {
	
	String companyName = "Facebook";
	String address = "Silicon Valley, CA";
	int numberOfEmployees = 10000;
	int revenue = 4000000;
	boolean isTechCompany = true;
	
	System.out.println("The company name is " + companyName);
	System.out.println("The address is " + address);
	System.out.println("There are " + numberOfEmployees + " employees working at " + companyName);
	System.out.println("The annual revenue is " + revenue);
	System.out.println("Is " + companyName + " a tech company? " + isTechCompany);
	
	String aboutCompany = "The company name is " + companyName + ", the address is " + address + ", there are "
	+ numberOfEmployees + " employees working at " + companyName + ", the annual revenue is " + revenue
	+ ", and is " + companyName + " a tech company? " + isTechCompany;
	
	System.out.println(aboutCompany);
	
	}
	
}
