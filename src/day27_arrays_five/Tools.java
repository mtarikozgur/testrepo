package day27_arrays_five;

public class Tools {

	public static void main(String[] args) {
		/* 
		 Java --> Programming Language
		 Selenium --> Test Automation
		 TestNG --> Unit Tests
		 JUnit --> Unit Tests
		 Cucumber --> BDD Style Testing
		 Git --> Version Control
		 Maven --> Building and execution for project
*/

		String[] tools = {"Java", "Selenium", "TestNG", "JUnit", "Cucumber", "Git", "Maven"};
		
		for(String tool: tools) {
			
			switch(tool) {
			
			case "Java":
				System.out.println("Programming Language");
				break;
			case "Selenium":
				System.out.println("Test Automation");
				break;
			case "TestNG":
				System.out.println("Unit Tests");
				break;
			case "JUnit":
				System.out.println("Unit Tests");
				break;
			case "Cucumber":
				System.out.println("BDD Style Testing");
				break;
			case "Git":
				System.out.println("Version Control");
				break;
			case "Maven":
				System.out.println("Building and execution for project");
				break;
			
			}
			
		}
		
	}

}
