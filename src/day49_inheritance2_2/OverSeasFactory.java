package day49_inheritance2_2;
import day49_inheritance2.Device;
public class OverSeasFactory { // Non subclass in different package as Device class

	public static void main(String[] args) {

		Device d = new Device(); // You must import day49_inheritance2.Device for this to compile.
		
		d.brand = "Samsung";
		
	//	d.model = "3200"; 
		
	//	d.price = 1000;
		
	//	d.country = "El Salvador";
		
	}

}
