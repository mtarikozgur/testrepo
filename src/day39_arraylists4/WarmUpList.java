package day39_arraylists4;
import java.util.*;
public class WarmUpList {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Apple");
		list1.add("Pear");
		list1.add("Orange");
		list1.add("Kiwi");
		list1.add("Apple");
		
		int number = countOccurances(list1, "Apple");
		
		System.out.println(number);

	}

	public static int countOccurances(ArrayList<String> wordList, String theWord) {
		
		int count = 0;
		
		for(String word: wordList) {
			
			if(word.equals(theWord)) count++;
			
		}
		
		return count;
		
	}
	
}
