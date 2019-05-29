package day48_inheritance;

public class Employee extends Person{

	String jobTitle;

	@Override
	public String toString() {
		return "Employee [jobTitle=" + jobTitle + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
}
