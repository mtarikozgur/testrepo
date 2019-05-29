package day15_string_manipulation;

public class IndexOf2 {

	public static void main(String[] args) {

			String list = "html-selenium-angular-jenkins-grid";
			int firstDash = list.indexOf("-");
			System.out.println("First dash: " + firstDash);
			
			int secondDash = list.indexOf("-", 5); // Starts search at index 5 
			System.out.println("Second dash: " + secondDash);
			
			int thirdDash = list.indexOf("-", secondDash + 1); // Starts search at index 5 
			System.out.println("Third dash:" + thirdDash);
			
			int lastDash = list.lastIndexOf("-"); // Finds the index of the last "-" character
			System.out.println("Last dash: " + lastDash);
		
	}

}
