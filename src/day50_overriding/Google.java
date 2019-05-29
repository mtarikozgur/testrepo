package day50_overriding;

public class Google extends SearchEngine{

	@Override
	public int search(String word) {  // Method cannot be less visible than public, and must return type int.
									  // Parameter can be "word" instead of "item".
		
		System.out.println("Google Searching for: " + word);
		int resultsCount = word.length();
		return resultsCount;
		
	}
	
	@Override
	public void search(String item, String item2) { // Method can be public since original method is protected.
		
		System.out.println("Searching for two items: " + item + ", " + item2);
		int resultsCount = item.length() + item2.length();
		System.out.println("Total count: " + resultsCount);
		
	}
	
	String clickResult() {
		
		System.out.println("Clicking result");
		return "Result page";
		
	}
	
}
