package day35_wrapperclasses_arraylistintro;

import java.util.*;

public class ArrayListToStringAddSize {

	public static void main(String[] args) {

		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("English");
		languages.add("Turkish");
		languages.add("Spanish");
		languages.add("Japanese");
		
		System.out.println("Number of languages: " + languages.size());

		languages.add("Russian");
		
		System.out.println("Number of languages: " + languages.size());
		
		languages.remove(0);
		
		System.out.println("Number of languages: " + languages.size());
		
		System.out.println(languages.toString()); // Converts to string and formats, then prints to console
		
	}

	
	
}
