package day48_inheritance;

public class Person {

	String name;
	int age;
	char gender;
	
	public void eat(String food) {
		
		System.out.println("Eating " + food);
		
	}
	
	public void walk() {
		
		System.out.println(name + " is walking");
		
	}
	
}
