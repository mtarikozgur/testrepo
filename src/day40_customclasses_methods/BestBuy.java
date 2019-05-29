package day40_customclasses_methods;

public class BestBuy { 	// We are using our CellPhone class to create objects from it

	public static void main(String[] args) {

		CellPhone cell1 = new CellPhone(); // Creates a new object cell1 from CellPhone class
		System.out.println(cell1.brand); 
		System.out.println(cell1.color);
		System.out.println(cell1.screenSize);
		System.out.println(cell1.price);
		
		System.out.println();
		
		cell1.color = "Black"; // Changes the field "color" of object "cell1" from Red to Black
		
		System.out.println(cell1.color);

		System.out.println();
		
		CellPhone cell2 = new CellPhone();
		cell2.brand = "Apple";
		cell2.color = "White";
		cell2.screenSize = 13;
		cell2.price = 400.99;
		System.out.println(cell2.brand);
		System.out.println(cell2.color);
		System.out.println(cell2.screenSize);
		System.out.println(cell2.price);
		
		System.out.println();
		
		cell1.call(); // Calls method call() from cell1 object
		cell2.call();
		
		cell1.message();
		
	}

}
