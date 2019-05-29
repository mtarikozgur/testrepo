package day35_wrapperclasses_arraylistintro;

public class Boxing {

	public static void main(String[] args) {
		
		// AUTOBOXING is the process of converting a primitive to an object
		
		Integer num1 = 1234;
		int n = 5;
		Integer num2 = n;

		// UNBOXING is the process of converting an object to a primitive
		
		Double d1 = new Double(34.2);
		double d2 = d1;
		
		long l1 = new Long(6000000); // unboxing
		Long l2 = new Long(345345345L); // no boxing
		long l3 = l2; // auto-unboxing
		Long l4 = l3; //auto-boxing
		
		Integer num3 = Integer.valueOf(345);
		
	}

}
