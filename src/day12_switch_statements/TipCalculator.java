package day12_switch_statements;

import java.util.*;

public class TipCalculator {

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);

	    int numberOfPeople, tipPercent;
	    double checkAmount, totalAmount, totalTip, totalPerPerson, tipPerPerson;
	    boolean isSplit;
	    String serviceQuality, split, ampersands;
	    
	    System.out.println("Split (type yes or no):");
	    split = scan.next();
	    
	    System.out.println("Number of people:");
	    numberOfPeople = scan.nextInt();
	    
	    System.out.println("Check amount:");
	    checkAmount = scan.nextDouble();
	    
	    System.out.println("Service Quality:");
	    serviceQuality = scan.next();
	    
	    if(split.equalsIgnoreCase("Yes")) {
	      isSplit = true;
	    } else {
	      isSplit = false;
	    }

	    
	    if(numberOfPeople == 0) numberOfPeople = 1;
	    
	    tipPercent = 0;
	    ampersands = "";
	    
	    serviceQuality = serviceQuality.toUpperCase();
	    
	    switch(serviceQuality) {
	      case "POOR":
	        tipPercent = 5;
	        break;
	      case "FAIR":
	        tipPercent = 10;
	        break;
	      case "GOOD":
	        tipPercent = 15;
	        break;
	      case "GREAT":
	        tipPercent = 20;
	        break;
	      case "EXCELLENT":
	        tipPercent = 25;
	        break;
	    }
	    
	    switch(numberOfPeople) {  
	      case 1:
	        ampersands = "&";
	        break;
	      case 2:
	        ampersands = "&&";
	        break;
	      case 3:
	        ampersands = "&&&";
	        break;
	      case 4:
	        ampersands = "&&&&";
	        break;
	      case 5:
	        ampersands = "&&&&&";
	        break;
	      case 6:
	        ampersands = "&&&&&&";
	        break;
	      case 7:
	        ampersands = "&&&&&&&";
	        break;
	      case 8:
	        ampersands = "&&&&&&&&";
	        break;
	      case 9:
	        ampersands = "&&&&&&&&&";
	        break;
	      default:
	    	ampersands = "&&&&&&&&&&";
	    }
	    
	    
	    
	    totalTip = checkAmount * (0.01*tipPercent);
	    totalAmount = checkAmount + totalTip;
	    
	    if(isSplit) {
	      totalPerPerson = totalAmount/numberOfPeople;
	      tipPerPerson = totalTip/numberOfPeople;
	    } else {
	      totalPerPerson = totalAmount;
	      tipPerPerson = totalTip;
	    }
	    
	    System.out.println();
	    
	    System.out.println("Number of people entered:" + ampersands);
	    System.out.println("Total to pay:" + totalAmount);
	    System.out.println("Total tip:" + totalTip);
	    
	    
	    
	    if(isSplit) {
	    System.out.println("Total per person:" + totalPerPerson);
	    System.out.println("Tip per person:" + tipPerPerson);
	    } else {
	    	System.out.println("Total to be paid by one person:" + totalPerPerson);
		    System.out.println("Tip to be paid by one person:" + tipPerPerson);
	    }


	}

}
