package day50_overriding;

public class SlackChannel {

	public static void main(String[] args) {
		
		SlackUser su1 = new SlackUser("Nadir");
		AdminUser au1 = new AdminUser("Florian");
		
		su1.sendMessage("This Thursday we will do Jira");
		au1.sendMessage("Thank you");
		
		

	}

}
