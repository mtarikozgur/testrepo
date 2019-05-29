package day48_inheritance;

public class Student extends Person{ // The extends keyword makes Student inherit all fields and methods from Person.
									 // Student does not inherit constructors.
	/* 
	String name;
	int age;
	char gender;
	
	public void eat(String food) {
		
		System.out.println("Eating " + food);
		
	}
	
	public void walk() {
		
		System.out.println(name + " is walking");
		
	} */
	
	int studentID;
	String studentClass;
	
	public void code(String lang) {
		
		System.out.println(name + " is coding " + lang);
		
	}
	
	public void attendClass() {
		
		System.out.println(name + " is attending " + studentClass);
		
	}
	
}
