package day31_methods3;

import java.util.*;

public class GoogleSeach {

	public static void main(String[] args) {

		googleSearchResults("About 120,000,000 results (0.75 seconds)");
		googleSearchResults("About 16600000 results (0.73 seconds)");
		
	}
	
	public static void googleSearchResults(String result) {

		String[] words = result.split(" ");
		
		System.out.println("Results count: " + words[1]);
		System.out.println("Time in seconds: " + (words[3].substring(1)));

	}
	

}
