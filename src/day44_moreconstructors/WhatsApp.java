package day44_moreconstructors;

public class WhatsApp {

	private String toNumber;
	private String message;
	private boolean delivered;
	
	public WhatsApp() {
		
		System.out.println("No-Args constructor");
		
	}
	
	public WhatsApp(String toNumber) {
		
		this(toNumber, "[]"); // Calls the two-args constructor
		System.out.println("1 Args constructor");
		
	}
	
	public WhatsApp(String toNumber, String message) {
		
		this(); // Calls the no-args constructor, this statement must be first
		System.out.println("2 Args constructor");
		
	}
	
	public String getToNumber() {
		return toNumber;
	}
	
}
