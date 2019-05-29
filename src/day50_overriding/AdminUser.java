package day50_overriding;

public class AdminUser extends SlackUser{ // 

	public AdminUser(String name) {
		
		super(name); // Calls the constructor from class SlackUser
		
	}
	
	@Override
	public void sendMessage(String message) {
		
		System.out.println("@adminChannel");
		System.out.println(getName() + " admin is sending a message: " + message);
		
	}
	
}
