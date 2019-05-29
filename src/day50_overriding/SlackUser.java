package day50_overriding;

public class SlackUser {

	private String name;
	
	public SlackUser(String name) {
		
		setName(name);
		
	}
	
	public void sendMessage(String message) {
		
		System.out.println("@channel");
		System.out.println(getName() + "is sending a message: " + message);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
