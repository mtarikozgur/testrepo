package day47_staticimports;

public class AllBlocks {

	static int staticInt = 10;
	int nonStaticInt = 10;
	
	static {
		
		System.out.println("Static block: I run first and only once.");
		staticInt--;
		//nonStaticInt--; does not work because static blocks cannot access non-static members
		
	}
	
	{
		
		System.out.println("Init block: I run each time an object is created from this class, before all constructors.");
		nonStaticInt--;
		staticInt--;
		
	}
	
	public AllBlocks() {
		
		System.out.println("Constructor: I run each time an object is created from this class, after init blocks.");
		nonStaticInt--;
		staticInt--;
		
	}
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

}
