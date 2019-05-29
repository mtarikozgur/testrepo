package day12_switch_statements;

public class SwitchScore {

	public static void main(String[] args) {

		int score = 3;
		
		switch(score) {
		case 1: 
			System.out.println("Score is 1");
			break; // Breaks out of the switch statement
		case 2:
			System.out.println("Score is 2");
			break;
		case 3:
			System.out.println("Score is 3");
			break;
		default: // This will run if none of the cases match the switch condition
			System.out.println("Score is not 1, 2, or 3");
		
	}
		
	}

}
