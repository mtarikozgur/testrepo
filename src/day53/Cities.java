package day53;

public class Cities {

	public static void main(String[] args) {
		
		City istanbul = new City(444, "Istanbul");
		City anotherCity = new City(444, "Istanbul");
		
		if(istanbul.equals(anotherCity)) {
			
			System.out.println("Both are Istanbul");
			
		}
		
		Capital cap = new Capital(101, "Washington", 800_000L);
		System.out.println(cap.toString());
		
	}
	
}
