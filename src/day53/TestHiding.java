package day53;

public class TestHiding {

	public static void main(String[] args) {
	City city1 = new City(345, "London");
	Capital cap1 = new Capital(433, "Paris", 32432432L);
	
	System.out.println(city1.count);
	System.out.println(cap1.count);
	
	System.out.println(city1.toString());
	System.out.println(cap1.toString());

	cap1.displayCount();
	
	City.buildARoad();
	Capital.buildARoad();
	
	City city2 = new City(33344, "Fairfax");
	Capital cap2 = new Capital(6544, "Richmond", 242424);
	
	city2.letsBuildARoad();
	cap2.letsBuildARoad();
	
	city2.buildARoad();
	cap2.buildARoad();
	
	
	}

}
