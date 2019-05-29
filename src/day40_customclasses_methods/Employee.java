package day40_customclasses_methods;

public class Employee {

	String name;
	String jobTitle;
	double salary;
	
	public void work() {
		
		System.out.println(name + "is working...");
		
	}
	
	public void goToBreak() {
		
		System.out.println(name + "is going on a break...");
		
	}
	
	public void attendMeeting() {
		
		System.out.println(name + "is attending a meeting...");
		
	}
	
	public void introduce() {
		
		System.out.println("Name " + name + ", job title " + jobTitle + ", salary $" + salary);
		
	}
	
}
