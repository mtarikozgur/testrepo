package day52_finalkeyword;

public class FinalVariables {

	// Final fields must be initialized either on the same line they are declared, in the constructor, or the init block
	
	public final int MODEL_3_MAX_SPEED = 180; // Initializing a final field
	public final int ROADSTER_MAX_RANGE;
	public final int MODEL_X_PASSENGERS;
	
	public static final String ADMIN_USERNAME; // Static final fields must be initialized either here or in the static block
	
	static {
		
		ADMIN_USERNAME = "Murodil";
		
	}
	
	public FinalVariables() {
		
		ROADSTER_MAX_RANGE = 610; // Initializing a final field via constructor
		
	}
	
	{
		
		MODEL_X_PASSENGERS = 7;  // Initializing a final field via init block
		
	}
	
	public static void main(String[] args) {

		final int MAX_PASSENGERS_COUNT = 5; // This variable cannot be edited due to the "final" keyword
		
		FinalVariables finalVars1 = new FinalVariables();
		
		System.out.println("Max speed for roadster: " + finalVars1.MODEL_3_MAX_SPEED); // Non-static final fields need an object to be used.
		System.out.println("Max range for roadster: " + finalVars1.ROADSTER_MAX_RANGE);
		System.out.println("Max capacity for model X: " + finalVars1.MODEL_X_PASSENGERS);
		
		System.out.println("Admin: " + ADMIN_USERNAME); // Static final fields do not need an object to be used.
		
	}

}
