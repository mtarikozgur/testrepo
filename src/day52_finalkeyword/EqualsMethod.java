package day52_finalkeyword;

public class EqualsMethod {

	public static void main(String[] args) {

		Computer comp1 = new Computer("iMac", "silver"); 
		Computer comp2 = new Computer("iMac", "silver"); // comp1 and comp2 point to different objects
		Computer comp3 = comp2; // comp3 and comp2 point to the same object
		
		
		System.out.println(comp1 == comp2); // They point to different objects in memory
		System.out.println(comp1.equals(comp2)); // They contain matching data
		
		System.out.println(comp3 == comp2);
		System.out.println(comp3.equals(comp2));
		
	}

}
