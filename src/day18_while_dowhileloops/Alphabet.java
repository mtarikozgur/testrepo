package day18_while_dowhileloops;

public class Alphabet {

	public static void main(String[] args) {

		char letter = 'a';
		
		while (letter <= 'z') {
			System.out.print(letter + " ");
			letter++;	
		}
		
		System.out.println();
		
		char capitals = 'A';
		
		while (capitals <= 'Z') {
			System.out.print(capitals + " ");
			capitals++;	
		}
		
		System.out.println();
		
		letter = 'z';
		
		while (letter >= 'a') {
			System.out.print(letter + " ");
			letter--;	
		}
		
		System.out.println();
		
		String letters = "";
		char myLetter = 'A';
		
		
		while(myLetter <= 'Z') {
			letters = letters + myLetter;
			System.out.println(letters);
			myLetter++;
		}
		
		
		
		
	}

}
