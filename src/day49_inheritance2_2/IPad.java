package day49_inheritance2_2;
import day49_inheritance2.Device;
public class IPad extends Device { //Subclass in different package as Device class

	public void readEBook(String title) {
		
		System.out.println("Reading a book " + title + " using " + brand + " ipad."); // Brand field from Device class works since it is public
		System.out.println("Model: " + model);
		// System.out.println("Price: " + price); Price is default, so it does not work.
	}
	
}
