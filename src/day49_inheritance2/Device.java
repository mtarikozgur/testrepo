package day49_inheritance2;

public class Device {

	public String brand; // Visible to sub and non sub classes in the same or different packages.
	
	protected String model; // Visible to sub and non sub classes in the same package, but not visible to non sub classes in different packages.
	
	double price; // Visible to sub and non sub classes in the same package.
	
	private String country; // Not visible outside of the class it belongs to.
	
}
