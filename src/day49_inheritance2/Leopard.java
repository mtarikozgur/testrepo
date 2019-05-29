package day49_inheritance2;

public class Leopard extends Animal{

	public Leopard() {
		
		super();
		System.out.println("Leopard constructor");
		setType("Leopard");
		
	}
	
	public Leopard(String type) {
		
		super(type);
		System.out.println("Leopard 1 arg constructor");
		
	}
	
}
