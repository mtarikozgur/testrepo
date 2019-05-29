package day14_string_methods;

public class StringSize {

	public static void main(String[] args) {
		
		String str1 = "Good Morning";
		
	if(str1.equals("Good Morning")) System.out.println("Match");
	else System.out.println("No match");
	
	str1 = str1.toUpperCase();
	
	if(str1.toLowerCase().contentEquals("good morning")) { // Converts str1 to lower-case, then checks if str1 is equal to "good morning"
		System.out.println("Match");
	} else {
		System.out.println("No match");
	}

	String myName = "Bobby";
	
	System.out.println(myName.length()); // .length() returns the number of characters in the string
	
	String userName = "Hank";
	
	if(userName.length() <= 8) System.out.println(userName);
	else System.out.println("Must be 8 or less characters");
	
	
	String password = "hunter2";
	
	if(password.length() >= 6) System.out.println(password);
	else System.out.println("Must be 6 or more characters");
	
	}
	
	
	
}
