package day37_arraylists3;
import java.util.*;
public class EqualsMethod {

	public static void main(String[] args) {

		List<String> friends1 = new ArrayList<>();
		List<String> friends2 = new ArrayList<>();
		
		friends1.add("Roman");
		friends1.add("Orhan");
		friends1.add("Elizabeth");
		
		friends2.add("Orhan");
		friends2.add("Roman");
		friends2.add("Elizabeth");
		
		System.out.println(friends1);
		System.out.println(friends2);
		
		if(friends1.equals(friends2)) System.out.println("Both Array Lists of friends are exactly the same");
		else System.out.println("The Array Lists do not match exactly");

		
	}

}
