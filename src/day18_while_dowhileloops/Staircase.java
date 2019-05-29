package day18_while_dowhileloops;

public class Staircase {

	public static void main(String[] args) {

		String stairs = "";
		int count = 1;
		
		while(count <= 15) {
			stairs = stairs + "*";
			System.out.println(stairs + count);
			count++;
		}
		
	}

}
