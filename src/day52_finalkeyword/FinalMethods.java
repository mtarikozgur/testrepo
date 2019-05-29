package day52_finalkeyword;

public class FinalMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public final void method1() { // This method cannot be overriden
		
		System.out.println("Final method 1");
		
	}

}

class Sub extends FinalMethods {
	
	// public void method1() {} does not work
	
	
	
	
}
