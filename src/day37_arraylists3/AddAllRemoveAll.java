package day37_arraylists3;
import java.util.*;
public class AddAllRemoveAll {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<>();
		l1.add("java");
		l1.add("python");
		
		List<String> l2 = new ArrayList<>();
		l2.add("c++");
		l2.add("c#");
		
		l1.addAll(l2); // Adds all elements of l2 to the end of l1
		
		System.out.println(l1);
		
		l1.removeAll(l2); // Removes all elements of l2 from l1
		
		System.out.println(l1);
		
	}

}
