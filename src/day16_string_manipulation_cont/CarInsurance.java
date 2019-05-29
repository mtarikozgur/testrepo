package day16_string_manipulation_cont;

import java.util.*;

public class CarInsurance {

	public static void main(String[] args) {

		//DO NOT CHANGE
	    double premium = 0;
			int accidentsAmount = 0;
			int daysDrivenToWorkOrSchool = 0;
			int milesToWorkOrSchool = 0;
			String vehicleOwnership = "";
			String vehicleUsage = "";
			String continuousInsurance = "";
			String education = "";
			String name = "";
			String referenceNumber = "";
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Current premuim: " + premium);
			
			String license;
			String accident;
			int zipCode;
			int age;
			int yearsOfExperience;
			
			System.out.println("Welcome to the CountyFarm car insurance!");
	    
	    System.out.println("Enter your name");
	    name = scan.nextLine();
	    
	    System.out.println("Do you have a US driver license?");
	    license = scan.nextLine();
	   
	    
	    if(license.equalsIgnoreCase("no")) {
	      System.out.println("Invalid data!");
	      System.exit(0);
	    }
	    
	     System.out.println("Enter your zip code");
	     zipCode = scan.nextInt();
	     
	     if(zipCode == 20910 || zipCode == 20740) {
	       premium += 60;
	     } else if(zipCode == 22102 || zipCode == 22013) {
	       premium += 30;
	     } else {
	       premium += 50;
	     }
	    
	     
	     System.out.println("Current premuim: " + premium);
	  
	     System.out.println("Is this vehicle Owned, Financed, or Leased?");
	     vehicleOwnership = scan.nextLine();
	     
	     if(vehicleOwnership.equalsIgnoreCase("owned")) {
	       premium += 10;
	     } else {
	       premium += 20;
	     }
	  
	     System.out.println("Current premuim: " + premium);
	     
	     System.out.println("How is this vehicle primarily used?");
	     vehicleUsage = scan.nextLine();
	     
	     if(vehicleUsage.equalsIgnoreCase("business")) {
	       premium += 50;
	     } else if(vehicleUsage.equalsIgnoreCase("pleasure")){
	       premium += 10;
	     } else {
	       premium += 20;
	       
	       System.out.println("Current premuim: " + premium);
	       
	       System.out.println("Days Driven To Work And/Or School");
	       daysDrivenToWorkOrSchool = scan.nextInt();
	       premium += (5 * daysDrivenToWorkOrSchool);
	       
	       System.out.println("Current premuim: " + premium);
	       
	       System.out.println("Miles Driven To Work And/Or School");
	       milesToWorkOrSchool = scan.nextInt();
	       premium += milesToWorkOrSchool;
	     }
	     
	     System.out.println("Current premuim: " + premium);
	     
	     System.out.println("How old are you?");
	     age = scan.nextInt();
	     
	     if(age < 16) {
	       System.out.println("Invalid data!");
	       System.exit(0);
	     } else if(age >= 16 && age < 18) {
	       premium = premium * 20;
	     } else if(age >= 18 && age <= 21) {
	       premium = premium * 6;
	     } else if(age > 21 && age < 25) {
	       premium = premium * 2;
	     } 
	     
	     System.out.println("Current premuim: " + premium);
	     
	     System.out.println("How many years you've been driving?");
	     yearsOfExperience = scan.nextInt();
	     
	     if(yearsOfExperience <= 0 || (age - yearsOfExperience < 16)) {
	      System.out.println("Invalid data!");
	      System.exit(0);
	     }
	     
	     premium -= (5*yearsOfExperience);
	     
	     System.out.println("Current premuim: " + premium);
	     
	     System.out.println("Have you had any accidents in the last 5 years?");
	     accident = scan.nextLine();
	     
	     if(accident.equalsIgnoreCase("yes")){
	       System.out.println("How many?");
	       accidentsAmount = scan.nextInt();
	       premium += ((premium * 0.2)*accidentsAmount);
	     }
	     
	     System.out.println("Current premuim: " + premium);
	     
	     System.out.println("Have you had continuous insurance for the past 12 months?");
	     continuousInsurance = scan.nextLine();
	     
	     if(continuousInsurance.equalsIgnoreCase("no")){
	       premium = premium*2;
	     }
	     
	     System.out.println("Current premuim: " + premium);
	     
	     System.out.println("What is the highest level of education you have completed?");
	     education = scan.nextLine();
	     
	     if(education.equalsIgnoreCase("PhD") || education.equalsIgnoreCase("Bachelors") || education.equalsIgnoreCase("Masters")){
	       premium = premium - (premium * 0.05);
	     } else if(education.equalsIgnoreCase("Doctors")){
	       premium = premium - (premium * 0.1);
	     } else {
	       premium = premium + (premium * 0.05);
	     }
	     
	     System.out.println("Current premuim: " + premium);
	     
	     System.out.println();
	  
	      referenceNumber = "" + name.charAt(0) + name.charAt(1) + age + 
	      name.charAt(name.length()-2) + name.charAt(name.length()-1) +
	      zipCode + education;
	      
	      referenceNumber = referenceNumber.toUpperCase();
	  
	     System.out.println(name + ", here's your quote!");
	     System.out.println("Start Your Policy Today For: $" + premium);
	     System.out.println("Reference number: " + referenceNumber);
	  
		System.out.println("Education:" + education);

	}

}
