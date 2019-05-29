package day25_arrays_three;

public class PopulationArray {

	public static void main(String[] args) {

		int[] pop = new int[5];
		pop[0] = 5000;
		pop[1] = 10000;
		pop[2] = 7000;
		pop[3] = 5000;
		pop[4] = 5000;
		
		
		System.out.println(pop[0]);
		
		String[] cities = {"Miami", "London", "Rome"};
		
		System.out.println("Population of " + cities[0] + " is " + pop[0]);
		System.out.println("Population of " + cities[1] + " is " + pop[1]);
		System.out.println("Population of " + cities[2] + " is " + pop[2]);
		
		
	}

}
