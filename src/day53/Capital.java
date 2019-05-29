package day53;

public class Capital extends City {

	private long population;
	public int count = 200;
	
	public Capital(int id, String name, long population) {
		
		super(id, name); // We need this since City does not have a zero args constructor
		setPopulation(population);
		
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " population: " + population + " count: " + count; // Calls parent method, then returns a modified output
		
	}
	
	
	public static void buildARoad() {
		
		System.out.println("Building a capital road");
		
	}
	
	public void displayCount() {
		
		System.out.println("City count: " + super.count);
		System.out.println("Capital count: " + count);
		
	}
	
	public void setPopulation(long population) {
		
		this.population = population;
		
	}
	
	public long getPopulation() {
		
		return population;
		
	}
	
}
