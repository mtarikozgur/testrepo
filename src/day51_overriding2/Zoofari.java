package day51_overriding2;

public class Zoofari extends Zoo {

	@Override
	public Cat keepInCage(String name) { // This method overrides, and can return Cat instead of Animal since Cat is a sub class of Animal
		
		System.out.println("New cat: " + name);
		Cat c1 = new Cat();
		return c1;
		
	}
	
}
