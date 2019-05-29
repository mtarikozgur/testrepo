package day15_string_manipulation;

public class Contains {

	public static void main(String[] args) {
		
		String email = "test@gmail.com";
		System.out.println(email.contains("@"));
		
		String list = "potatoes, apples, milk, meat";
		
		if(list.contains("apples")) {
			System.out.println("Apples are there");
		} else {
			System.out.println("Apples not there");
		}
		
		
		boolean hasEggs = list.contains("eggs");

		if(hasEggs) {
			System.out.println("Eggs are there");
		} else {
			System.out.println("Eggs not there");
		}
		
		if(email.contains("@gmail")) {
			System.out.println("Gmail account");
		} else if(email.contains("@yahoo")) {
			System.out.println("Yahoo account");
		} else if(email.contains("@hotmail")) {
			System.out.println("Hotmail account");
		}
		
		String name = "Alex";
		
		if(name.contains("a")||name.contains("e")) {
			System.out.println("Has a/e");
		} else {
			System.out.println("Does not have a/e");
		}
		

	}

}
