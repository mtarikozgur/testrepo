package day53;
import java.util.*;
public class City {

	private int id;
	private String name;
	public int count = 100;
	
	public City(int id, String name) {
		
		super(); // Called automatically, so this is not needed
		this.id = id;
		this.name = name;
		
	}
	
	@Override
	public String toString() {
		
		return "id: " + id + " name: " + name + " count: " + count;
		
	}
	
	public void letsBuildARoad() {
		
		buildARoad();
		
	}
	
	@Override
	public int hashCode() {
		
		return id + name.length();
		
	}
	
	public static void buildARoad() {
		
		System.out.println("Building a city road");
		
	}
	
	public boolean equals(Object obj) {
		
		City anotherCity = (City) obj; // Taking an object and making it a City object
		return (this.id == anotherCity.id && this.name.equals(anotherCity.name));
		
	}

}
