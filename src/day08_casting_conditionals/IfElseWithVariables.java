package day08_casting_conditionals;

public class IfElseWithVariables {

	public static void main(String[] args) {

		int temp = 65;
		
		if(temp >= 65) {
			System.out.println("It's nice out.");
		} else {
			System.out.println("Too cold.");
		}

		int teamAScore = 20;
		int teamBScore = 20;
			
		if(teamAScore > teamBScore) {
				System.out.println("Team A wins!");
		} else if(teamAScore < teamBScore) {
				System.out.println("Team B wins!");
		} else {
				System.out.println("It's a draw!");
		}
			
		
		
	}

}
