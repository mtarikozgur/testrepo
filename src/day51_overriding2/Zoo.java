package day51_overriding2;

public class Zoo {

	public Animal keepInCage(String name) {
		
		System.out.println("New animal: " + name);
		Animal a1 = new Animal();
		return a1;
		
	}
	
}
