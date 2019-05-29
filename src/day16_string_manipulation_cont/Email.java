package day16_string_manipulation_cont;

import java.util.*;

public class Email {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		    String email = scan.next();
		    
		    
		    String firstName;
		    String lastName;
		    String domain;
		    String topDomain;
		    String firstLetter;
		    String firstLetter2;
		    
		    
		    
		    firstName = email.substring(0,email.indexOf("_"));
		    lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));
		    domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
		    topDomain = email.substring(email.indexOf(".")+1,email.length());
		  
		    firstLetter = firstName.substring(0,1).toUpperCase();
		    firstLetter2 = lastName.substring(0,1).toUpperCase();
		  
		  
		    firstName = firstLetter + firstName.substring(1,firstName.length());
		    lastName = firstLetter2 + lastName.substring(1,lastName.length());
		    
		    System.out.println("First name: " + firstName);
		    System.out.println("Last name: " + lastName);
		    System.out.println("Domain: " + domain);
		    System.out.println("Top-Level Domain: " + topDomain);

		    
		    
    
    
		
	}

}
