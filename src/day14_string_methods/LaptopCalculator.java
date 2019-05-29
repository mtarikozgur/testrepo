package day14_string_methods;

import java.util.*;

public class LaptopCalculator {

	public static void main(String[] args) {


		 double price = 0;
		    double screenSize;
				String storageType, screenType, cpu;
				int ram = 0 ;
				int memorySize;
				Scanner scan = new Scanner(System.in);
		    
		    System.out.println("Select screen size:");
		    screenSize = scan.nextDouble();
		    
		    if(screenSize == 13.3) price = price + 200;
		    else if(screenSize == 15.0) price = price + 300;
		    else if(screenSize == 17.3) price = price + 400;
		    
		    System.out.println("Select CPU type:");
		    cpu = scan.next();
		    
		    if(cpu.equals("i3")) price = price + 150;
		    else if(cpu.equals("i5")) price = price + 250;
		    else if(cpu.equals("i7")) price = price + 350;
		    
		    System.out.println("Select RAM size:");
		    ram = scan.nextInt();
		    
		    price = price + ((ram/4)*50);
		    
		    System.out.println("Select storage type:");
		    storageType = scan.next();
		    
		    System.out.println("Enter memory size:");
		    memorySize = scan.nextInt();
		    
		    if(storageType.equals("HDD")) {
		       price = price + ((memorySize/500)*50);
		    }
		    else if(storageType.equals("SSD")) {
		       price = price + ((memorySize/500)*100);
		    }
		    
		    System.out.println("Enter screen resolution:");
		    screenType = scan.next();
		    
		    if(screenType.equals("FULLHD")) price = price + 100;
		    else if(screenType.equals("4K")) price = price + 200;
		    
		    System.out.println("Laptop price is: $" + price);

	}

}
