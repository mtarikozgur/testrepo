package day12_switch_statements;

public class OrLogicWithSwitch {

	public static void main(String[] args) {

		char grade = 'A';
		
		switch(grade) {
		case 'A':
		case 'B':
		case 'C':
		case 'D':
			System.out.println("Passed");
		case 'F':
			System.out.println("Failed");
		default:
			System.out.println("Invalid");
		
		}
		
		
	}

}
