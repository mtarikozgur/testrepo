package day52_finalkeyword;
import java.util.*;
public class FinalList {

	public final static String COLOR = "black";
	
	// public --> access modifier
	// final and static --> non-access modifier
	
	public static void main(String[] args) {

		final ArrayList<String> COLORS = new ArrayList<>();
		
		COLORS.add("Red");
		COLORS.add("Green");
		COLORS.add("Yellow");
		COLORS.add("Blue");
		COLORS.add("Pink");
		
		System.out.println(COLORS.toString());
		
		COLORS.add(COLOR);
		
		
	}

}
